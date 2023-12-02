package youtubeApi;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class videoDetails {
	
	private static final boolean True = true;
	private static final boolean False = false;


	// method to gather video data using video id's
	public static JSONObject videoData(URL video_url) throws IOException {
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
		
		JSONObject jsonObj = new JSONObject(sb.toString());
		JSONArray items = jsonObj.getJSONArray("items");
		
		// loop through the results to collect video id's
		for (int i = 0; i < results; i++) {
			
			JSONObject id = items.getJSONObject(i).getJSONObject("id");
			String videoId = id.getString("videoId");
			videoIds.add(videoId);
		}
		return videoIds; // returns video id's
		
	}
	
	public static String output(String query, int results) throws MalformedURLException{
		
		try  {
				List<String> videoIds = new ArrayList<String>();
			
				URL search_url = new URL("https://www.googleapis.com/youtube/v3/search?key=AIzaSyAYvenm2DLFO9BU2lm9HEtjvR3BxJiX7cw&q=" + query + "&type=video&part=snippet&maxResults=" + results);
				
				// call 'videoids' method to collect video id's of related videos
				videoIds = videoids(videoIds, results, search_url);
				//System.out.println(videoIds);
				
				JSONObject json = new JSONObject(); // create a json object to store the video data
				
				// loop through the videoids list 			
				for(int i=0; i<videoIds.size() ;i++) {
					String videoId = videoIds.get(i);
					// call video_url by inserting video id's and load data into json object
					URL video_url = new URL("https://www.googleapis.com/youtube/v3/videos?part=snippet,statistics,contentDetails&id=" + videoId + "&key=AIzaSyAYvenm2DLFO9BU2lm9HEtjvR3BxJiX7cw");
					JSONObject jsonObj = videoData(video_url);		//call videodata method by passing video_url
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
	
	public static String input() throws MalformedURLException{
		try (Scanner scan = new Scanner(System.in)) {
			//create a variable to store user input text
			System.out.print("Enter text to search: "); 
			String query = scan.nextLine();
			String output = null;
			//create a variable to store user input results
			int t = 0;
			while( t == 0) {
				System.out.print("Enter the number of results you want: ");
				int results = scan.nextInt();
				if(checkresults(results)) {
					output = output(query, results);
					t = 1;
				}
			}
			return output;
		}
	}

	public static void main(String[] args) throws MalformedURLException{
		String end = input();
		System.out.println(end);
	}
}
