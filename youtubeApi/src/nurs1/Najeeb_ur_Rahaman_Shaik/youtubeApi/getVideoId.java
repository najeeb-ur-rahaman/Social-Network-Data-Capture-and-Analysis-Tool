package nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class getVideoId {

	// method to collect video id's from the search result
	public static List<String> videoids(List<String> videoIds,int results, URL search_url) throws IOException {
		// TODO Auto-generated method stub
		
        HttpURLConnection http = (HttpURLConnection)search_url.openConnection(); 
		http.connect(); //connect to the search url
		
        int statusCode = http.getResponseCode(); // variable to store response code
        if (statusCode == 200) { //check Http response code and proceed if its 200
		
        	// Reader to store the response
			BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
			StringBuilder sb = new StringBuilder();
			
			String lines;
			while ((lines = br.readLine()) != null) {
				sb.append(lines + "\n");
			}
			
			br.close();
			
			//json object to store API response
			JSONObject jsonObj = new JSONObject(sb.toString());
			JSONArray items = jsonObj.getJSONArray("items"); // store only required items
			
			// loop through the response to collect video id's
			for (int i = 0; i < results; i++) {
				
				JSONObject id = items.getJSONObject(i).getJSONObject("id");
				String videoId = id.getString("videoId");
				videoIds.add(videoId); // add all the video ids in the videoId list
			}
        }
        else {
        	System.out.println("Connection Error"); // print when connection fails
        }
		return videoIds; // returns video id's
	}
}
