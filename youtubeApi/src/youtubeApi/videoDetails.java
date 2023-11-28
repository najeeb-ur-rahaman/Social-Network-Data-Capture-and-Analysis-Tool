package youtubeApi;

import java.io.BufferedReader;
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

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		List<String> videoIds = new ArrayList<String>();
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter text to search: ");  
			String query= scan.nextLine();              //reads string  
			
			System.out.print("Enter the number of results you want");  
			int results= scan.nextInt();  
			
			URL search_url = new URL("https://www.googleapis.com/youtube/v3/search?key=AIzaSyAYvenm2DLFO9BU2lm9HEtjvR3BxJiX7cw&q=" + query + "&type=video&part=snippet&maxResults=" + results);
			
			videoIds = videoids(videoIds, query, results, search_url);
			System.out.println(videoIds);
		} catch (MalformedURLException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}


	private static List<String> videoids(List<String> videoIds, String query, int results, URL search_url) throws IOException {
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
		
		for (int i = 0; i < results; i++) {
			
			JSONObject id = items.getJSONObject(i).getJSONObject("id");
			String videoId = id.getString("videoId");
			videoIds.add(videoId);
		}
		return videoIds;
		
	}

}
