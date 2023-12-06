package nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class videoDetails {
	
	private static final boolean True = true;
	private static final boolean False = false;
	
	public static String query;
	public static int results;
	public static Scanner scan = new Scanner(System.in);

	// create a public variable to store video id's
	public static List<String> videoIds = new ArrayList<String>();
	
	// Method to get API key from config.properties file
	public static String getAPIkey() {
		String key = null;
        try (InputStream input = new FileInputStream("resources/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            key = prop.getProperty("key");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		return key;
	}

	// method to gather video data using video id's
	public static JSONObject outputData(URL video_url) throws IOException {
		// TODO Auto-generated method stub
		URLConnection conn = video_url.openConnection();
		conn.connect();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuilder sb = new StringBuilder();
		
		String lines;
		while ((lines = br.readLine()) != null) {
			sb.append(lines + "\n");
		}
		
		br.close();
		
		// json object to store API response
		JSONObject jsonObj = new JSONObject(sb.toString());
		return jsonObj; //json object of video data
	}


	// method to collect video id's from the search result
	public static List<String> videoids(List<String> videoIds,int results, URL search_url) throws IOException {
		// TODO Auto-generated method stub
		
		URLConnection conn = search_url.openConnection();
		conn.connect();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuilder sb = new StringBuilder();
		
		String lines;
		while ((lines = br.readLine()) != null) {
			sb.append(lines + "\n");
		}
		
		br.close();
		
		//json object to store API response
		JSONObject jsonObj = new JSONObject(sb.toString());
		JSONArray items = jsonObj.getJSONArray("items");
		
		// loop through the response to collect video id's
		for (int i = 0; i < results; i++) {
			
			JSONObject id = items.getJSONObject(i).getJSONObject("id");
			String videoId = id.getString("videoId");
			videoIds.add(videoId);
		}
		return videoIds; // returns video id's
		
	}
	
	// method to generate output file
	public static String output(String query, int results) throws MalformedURLException{
		
		try  {
			String key = getAPIkey();
		
			// URL to search videos related to search query
			URL search_url = new URL("https://www.googleapis.com/youtube/v3/search?key=" + key + "&q=" + query + "&type=video&part=snippet&maxResults=" + results);
			
			// call 'videoids' method to collect video id's of related videos
			videoIds = videoids(videoIds, results, search_url);
			//System.out.println(videoIds);
			
			JSONObject json = new JSONObject(); // create a json object to store the video data
			
			// loop through the videoids list 			
			for(int i=0; i<videoIds.size() ;i++) {
				String videoId = videoIds.get(i);
				// call video_url by inserting video id's and load data into json object
				URL video_url = new URL("https://www.googleapis.com/youtube/v3/videos?part=snippet,statistics,contentDetails&id=" + videoId + "&key=" + key);
				JSONObject jsonObj = outputData(video_url);		//call videodata method by passing video_url
				json.put(videoId,jsonObj); // load video data into json object as video id and video data pair
			}
			
			// Write json object into a file
		      try (FileWriter file = new FileWriter("D:/video_data.json")) {
		          file.write(json.toString());
		      }

		} catch (MalformedURLException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ("The File has been created. Go to 'D:/video_data.json'. To view the file");
	}
	
	// Method to check if entered input is valid
	public static boolean checkresults(int r) {
		if(r > 10) {
			System.out.println("The results cannot be greater than 10. Please input a number less than or equal to 10");
			return False;
		}
		else if(r == 0 || r < 0){
			System.out.println("The results cannot be 0 or less than 0. Please input a number greater than 0");
			return False;
		}
		else {
		return True;
		}
	}
	
	// Method to take user input
	public static String input() throws MalformedURLException{
			//create a variable to store user input text
		System.out.print("Enter text to search: "); 
		query = scan.nextLine();
		String output = null;
		//create a variable to store user input results
		int t = 0;
		while( t == 0) {
			System.out.print("Enter the number of results you want: ");
			results = scan.nextInt();
			if(checkresults(results)) {
				output = output(query, results);
				t = 1;
			}
		}
		return output;
	}

	// Main method
	public static void main(String[] args) throws IOException{
		String end = input();
		System.out.println(end);
		String end_comments = commentDetails.input();
		System.out.println(end_comments);
	}
}
