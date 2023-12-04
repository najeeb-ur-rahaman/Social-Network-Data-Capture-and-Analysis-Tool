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

public class commentDetails {
	
	private static final boolean False = false;
	private static final boolean True = true;

	static String key = videoDetails.getAPIkey();
	public static List<String> videoIds = new ArrayList<String>();
	
	// method to generate output file
		public static String output(String query, int results, int comments) throws MalformedURLException{
			
			try  {
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
					URL comment_url = new URL("https://www.googleapis.com/youtube/v3/commentThreads?part=snippet&videoId=" + videoId + "&maxResults" + comments + "&key=" + key);
					JSONObject jsonObj = commentData(comment_url);		//call videodata method by passing video_url
					json.put(videoId,jsonObj); // load video data into json object as video id and video data pair
				}
				
				// Write json object into a file
			      try (FileWriter file = new FileWriter("D:/comment_data.json")) {
			          file.write(json.toString());
			      }

			} catch (MalformedURLException e) {
				throw e;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ("The File has been created. Go to 'D:/comment_data.json'. To view the file");
		}
	
		// method to collect and store the comments response
	public static JSONObject commentData(URL video_url) throws IOException {
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
	
	// method to check comments value
	public static boolean checkcomments(int c) {
		if ( c > 100){
			System.out.println("The comments cannot be greater than 100. Please input a number less than or equal to 100");
			return False;
		}
		else if(c == 0 || c < 0){
			System.out.println("The comments cannot be 0 or less than 0. Please input a number greater than 0");
			return False;
		}
		else {
		return True;
		}
	}
	
	// method to check results value
	public static boolean checkresults(int r) {
		if(r > 100) {
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
	public static String input() throws IOException{
		try (Scanner scan = new Scanner(System.in)) {
			//create a variable to store user input text
			System.out.print("Enter text to search: "); 
			String query = scan.nextLine();
			String output = null;
			//create a variable to store user input results
			int t = 0;
			System.out.print("Enter the number of results you want: ");
			int results = scan.nextInt();
			while( t == 0) {
				if(checkresults(results)) {
					System.out.print("Enter the number of comments you want the analysis on: ");
					int comments = scan.nextInt();
					if(checkcomments(comments)) {
						output = output(query, results,  comments);
						t = 1;
					}
					else {
						System.out.print("Enter the number of comments you want the analysis on: ");
						comments = scan.nextInt();
					}
				}
				else {
					System.out.print("Enter the number of results you want: ");
					results = scan.nextInt();
				}
			}
			return output;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String end_comments = input();
		System.out.println(end_comments);

	}

}
