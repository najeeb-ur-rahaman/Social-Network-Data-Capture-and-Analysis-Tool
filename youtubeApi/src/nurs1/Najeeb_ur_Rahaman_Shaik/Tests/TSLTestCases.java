package nurs1.Najeeb_ur_Rahaman_Shaik.Tests;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.json.JSONObject;
import org.junit.Test;

import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.inputDetails;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.outputCommentData;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.outputData;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.OutputVideoData;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.getApiKey;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.getVideoId;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.inputComments;

public class TSLTestCases {
	
	public static String key = getAPIkey();
	
	// Method to get API key from config.properties
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
	
	@Test //Test for the getvideoID method
	public void testgetvideoId1() throws MalformedURLException {
		List<String> videoIds = new ArrayList<String>();
		
	    URL url = new URL("https://www.googleapis.com/youtube/v3/search?key=" + key + "&q=najeeb&type=video&part=snippet&maxResults=50");
		try {
			assertNotNull(getVideoId.videoids(videoIds, 10, url));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	// Test to check if getVideoId method with wrong url
	@Test
	public void testgetVideoid2() throws IOException {
		List<String> videoIds = new ArrayList<String>();
		videoIds.add("Connection Error");
	    URL wrong_url = new URL("https://www.googleapis.com/youtube/v3/search?&q=najeeb&type=video&part=snippet&maxResults=50");
	    try {
		assertEquals(videoIds,getVideoId.videoids(videoIds, 10, wrong_url));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test //Test for the outputVideoData method
	public void testVideoDataoutput1() {
		try {
			assertEquals("The File has been created. Go to 'D:/video_data.json'. To view the file",OutputVideoData.output("najeeb", 4));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test //Test for the outputVideoData method
	public void testVideoDataoutput2() {
		try {
			assertEquals("The File has been created. Go to 'D:/video_data.json'. To view the file",OutputVideoData.output("najeeb", 10));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test //Test for the getKey method
	public void testtogetKey() throws MalformedURLException, IOException {
	    assertNotNull(getApiKey.getAPIkey());
	}
	
	@Test //Test for the outputCommentData method
	public void testCommentDataoutput1() {
		try {
			assertEquals("The File has been created. Go to 'D:/comment_data.json'. To view the file",outputCommentData.output("najeeb", 4, 20));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test //Test for the outputCommentData method
	public void testcommentDataoutput2() {
		try {
			assertEquals("The File has been created. Go to 'D:/comment_data.json'. To view the file",outputCommentData.output("najeeb", 10, 100));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test //Test for output Data method
	public void testoutputData1() throws MalformedURLException {
		String key = getAPIkey();
		URL url = new URL("https://www.googleapis.com/youtube/v3/videos?part=snippet,statistics,contentDetails&id=Hwi9dsFBuhg&key=" + key);
		try {
			assertNotNull(outputData.OutputData(url));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test // Test to check if output Data with wrong url
	public void testoutputData2() throws IOException {
    	JSONObject item1 = new JSONObject();
    	item1.put("error", "Something went wrong");
		URL wrong_url = new URL("https://www.googleapis.com/youtube/v3/videos?part=snippet,statistics,najeeb,contentDetails&id=Hwi9dsFBuhg&key=");
		JSONObject item = outputData.OutputData(wrong_url);
		String error = item.getString("error");
		assertEquals("Something went wrong",error);
	}
	
	//Tests to check results value
	@Test 
	public void testcheckresultsequalto0(){
		assertEquals(false, inputDetails.checkresults(0));
	}
	
	@Test 
	public void testcheckresultslessthan0(){
		assertEquals(false, inputDetails.checkresults(-1));
	}
	
	@Test 
	public void testcheckresultsgreaterthan10(){
		assertEquals(false, inputDetails.checkresults(12));
	}
	
	@Test 
	public void testcheckresults(){
		assertEquals(true, inputDetails.checkresults(6));
	}
	
	
	// Tests to check comments
	@Test 
	public void testcheckcommentsequalto0(){
		assertEquals(false, inputComments.checkcomments(0));
	}
	
	@Test 
	public void testcheckcommentslessthan0(){
		assertEquals(false, inputComments.checkcomments(-1));
	}
	
	@Test 
	public void testcheckcommentsgreaterthan100(){
		assertEquals(false, inputComments.checkcomments(120));
	}
	
	@Test 
	public void testcheckcomments(){
		assertEquals(true, inputComments.checkcomments(60));
	}
	
}
