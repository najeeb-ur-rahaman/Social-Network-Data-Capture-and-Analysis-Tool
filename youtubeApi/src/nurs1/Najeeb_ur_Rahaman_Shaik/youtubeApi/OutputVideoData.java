package nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class OutputVideoData {
	
	// create a public variable to store video id's
	public static List<String> videoIds = new ArrayList<String>();
	
	// method to generate output file
	public static String output(String query, int results) throws MalformedURLException{
		
		try  {
			String key = getApiKey.getAPIkey(); // call getApiKey class to store key
		
			// URL to search videos related to search query
			URL search_url = new URL("https://www.googleapis.com/youtube/v3/search?key=" + key + "&q=" + query + "&type=video&part=snippet&maxResults=" + results);
			
			// call 'videoids' method from getVideoId class to collect video id's of related videos
			videoIds = getVideoId.videoids(videoIds, results, search_url);
			//System.out.println(videoIds);
			
			if(videoIds.isEmpty()) {
				return "The VideoId List is Empty Becasue the Search URL connection failed";
			}
			else {
				
			JSONObject json = new JSONObject(); // create a json object to store the video data
			
			// loop through the videoids list and call video  url by inserting video id as a parameter		
			for(int i=0; i<videoIds.size() ;i++) {
				String videoId = videoIds.get(i);
				// call video_url by inserting video id's and load data into json object
				URL video_url = new URL("https://www.googleapis.com/youtube/v3/videos?part=snippet,statistics,contentDetails&id=" + videoId + "&key=" + key);
				JSONObject jsonObj = outputData.OutputData(video_url);		//call outputata method by passing video_url
				if (jsonObj.length() == 0) {
					return ("Json Object is empty");
				}
				else {
				json.put(videoId,jsonObj); // load video data into json object as video id and video data pair
				}
			}
			// Write json object into a file
		      try (FileWriter file = new FileWriter("D:/video_data.json")) {
		          file.write(json.toString());
		      	}
			return ("The File has been created. Go to 'D:/video_data.json'. To view the file");
		}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Something went wrong";
	}
}
