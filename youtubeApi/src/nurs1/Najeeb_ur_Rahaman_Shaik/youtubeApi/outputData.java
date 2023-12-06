package nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class outputData {
	
	// method to gather video data using video id's
	public static JSONObject OutputData(URL url) throws IOException {
		// TODO Auto-generated method stub
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.connect(); //call the URL
		
        int statusCode = http.getResponseCode();
        if (statusCode == 200) {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
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
        else {
        	JSONObject jsonObj = new JSONObject();
        	return jsonObj;
        }
	}

}
