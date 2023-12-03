package Tests;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.Test;

import youtubeApi.videoDetails;

public class videoDetailsTests {
	
	public static String key;
	
	// Method to get API key from config.properties
	public static void getAPIkey() {
        try (InputStream input = new FileInputStream("resources/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            key = prop.getProperty("key");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	@Test //Test for the input method
	public void testiutputString() {
		try {
			assertEquals("The File has been created. Go to 'D:/video_data.json'. To view the file",videoDetails.input());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test //Test for the output method
	public void testOutputString() {
		try {
			assertEquals("The File has been created. Go to 'D:/video_data.json'. To view the file",videoDetails.output("najeeb", 4));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test //Test for the video ID method
	public void testVideoIdsNotNull() throws MalformedURLException {
		List<String> videoIds = new ArrayList<String>();
		getAPIkey();
	    URL url = new URL("https://www.googleapis.com/youtube/v3/search?key=" + key + "&q=sruthi&type=video&part=snippet&maxResults=50");
		try {
			assertNotNull(videoDetails.videoids(videoIds, 10, url));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test //Test for the getKey method
	public void testtogetKey() throws MalformedURLException, IOException {
	    assertNotNull(videoDetails.getAPIkey());
	}
	
	@Test (expected = IOException.class) //Test for Search URL
	public void testIoexceptionVideoid() throws IOException {
		List<String> videoIds = new ArrayList<String>();
	    URL url = new URL("https://www.googleapis.com/youtube/v3/search?&q=sruthi&type=video&part=snippet&maxResults=50");
		videoDetails.videoids(videoIds, 10, url);
	}
	
	@Test //Test for Video Data method
	public void testJsonNotNull() throws MalformedURLException {
		getAPIkey();
		URL url2 = new URL("https://www.googleapis.com/youtube/v3/videos?part=snippet,statistics,contentDetails&id=Hwi9dsFBuhg&key=" + key);
		try {
			assertNotNull(videoDetails.videoData(url2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test (expected = IOException.class) //Test to check video URL
	public void testIoexceptionVideoData() throws IOException {
		List<String> videoIds = new ArrayList<String>();
	    URL url = new URL("https://www.googleapis.com/youtube/v3/videos?part=snippet,statistics,contentDetails&id=Hwi9dsFBuhg&");
		videoDetails.videoids(videoIds, 10, url);
	}
	
	//Tests to check results value
	@Test 
	public void testcheckresultsequalto0(){
		assertEquals(false, videoDetails.checkresults(0));
	}
	
	@Test 
	public void testcheckresultslessthan0(){
		assertEquals(false, videoDetails.checkresults(-1));
	}
	
	@Test 
	public void testcheckresultsgreaterthan10(){
		assertEquals(false, videoDetails.checkresults(12));
	}
	
	@Test 
	public void testcheckresults(){
		assertEquals(true, videoDetails.checkresults(6));
	}
}
