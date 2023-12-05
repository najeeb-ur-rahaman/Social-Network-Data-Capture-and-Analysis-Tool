package youtubeApi;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONObject;

public class commentDetails {
	
	private static final boolean False = false;
	private static final boolean True = true;

	static String key = videoDetails.getAPIkey();
	
	// method to generate output file
	public static String output(String query, int results, int comments) throws MalformedURLException{
		
		try  {
			List<String> videoIds = new ArrayList<String>();
			// URL to search videos related to search query
			URL search_url = new URL("https://www.googleapis.com/youtube/v3/search?key=" + key + "&q=" + query + "&type=video&part=snippet&maxResults=" + results);
			
			// call 'videoids' method from video Details class to collect video id's of related videos
			List<String> videoIds1 = videoDetails.videoids(videoIds, results, search_url);
			//System.out.println(videoIds);
			
			JSONObject json = new JSONObject(); // create a json object to store the video data
			
			// loop through the videoids list 			
			for(int i=0; i<videoIds1.size() ;i++) {
				String videoId = videoIds1.get(i);
				// call video_url by inserting video id's and load data into json object
				URL comment_url = new URL("https://www.googleapis.com/youtube/v3/commentThreads?part=snippet&videoId=" + videoId + "&maxResults=" + comments + "&key=" + key);
				JSONObject jsonObj = videoDetails.outputData(comment_url);		//call videodata method from videoDeatils class by passing video_url
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
	
	// Method to take user input
	public static String input() throws IOException{
		try (Scanner scan = videoDetails.scan) {
			int t = 0;
			String output = null;
			while( t == 0) {
				//create a variable to store user input comments
				System.out.print("Enter the number of comments you want the analysis on: ");
				int comments = scan.nextInt();
				if(checkcomments(comments)) {
					output = output(videoDetails.query, videoDetails.results,  comments);
					t = 1;
				}
			}
			return output;
		}
	}
}
