package nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class outputCommentData {

	static String key = getApiKey.getAPIkey(); //call getApiKey class to get the key
	
	// method to generate output file
	public static String output(String query, int results, int comments) throws MalformedURLException{
		
		try  {
			//create an empty list to store variables
			List<String> videoIds = new ArrayList<String>();
			// URL to search videos related to search query
			URL search_url = new URL("https://www.googleapis.com/youtube/v3/search?key=" + key + "&q=" + query + "&type=video&part=snippet&maxResults=" + results);
			
			// call 'videoids' method from getVideoId class to collect video id's of related videos
			List<String> videoIds1 = getVideoId.videoids(videoIds, results, search_url);
			
			if(videoIds1.isEmpty()) {
				return "The VideoId List is Empty. Because the search url connection failed";
			}
			else {
				JSONObject json = new JSONObject(); // create a json object to store the video data
				
				// loop through the videoids list and call comment url by inserting video id as a parameter		
				for(int i=0; i<videoIds1.size() ;i++) {
					String videoId = videoIds1.get(i);
					// call comment_url by inserting video id's and load data into json object
					URL comment_url = new URL("https://www.googleapis.com/youtube/v3/commentThreads?part=snippet&videoId=" + videoId + "&maxResults=" + comments + "&key=" + key);
					JSONObject jsonObj = outputData.OutputData(comment_url);		//call outputdata method from outputData class by passing comment_url
					if (jsonObj.length() == 0) {
						return ("Json Object is empty");
					}
					else {
					json.put(videoId,jsonObj); // load video data into json object as video id and video data pair
					}
				}
				
				// Write json object into a file
			      try (FileWriter file = new FileWriter("D:/comment_data.json")) {
			          file.write(json.toString());
			      }
			return ("The File has been created. Go to 'D:/comment_data.json'. To view the file");
			}

		} catch (MalformedURLException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Something went wrong";
	}
}
