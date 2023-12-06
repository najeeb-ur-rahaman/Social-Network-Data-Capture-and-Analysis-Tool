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

import org.junit.Test;

import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.commentDetails;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.videoDetails;

public class videoDetailsTests {
	
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
	
	@Test //Test for the input method
	public void testinputString() {
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
		
	    URL url = new URL("https://www.googleapis.com/youtube/v3/search?key=" + key + "&q=najeeb&type=video&part=snippet&maxResults=50");
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
	
	@Test //Test for output Data method
	public void testJsonNotNull() throws MalformedURLException {
		String key = getAPIkey();
		URL url2 = new URL("https://www.googleapis.com/youtube/v3/videos?part=snippet,statistics,contentDetails&id=Hwi9dsFBuhg&key=" + key);
		try {
			assertNotNull(videoDetails.outputData(url2));
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
	
	@Test //Test for the output method
	public void testOutputStringcomments() throws IOException {
		try {
			assertEquals("The File has been created. Go to 'D:/comment_data.json'. To view the file",commentDetails.output("najeeb", 4, 20));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test //Test for the input method
	public void testinputStringcomments() throws IOException {
		try {
			assertEquals("The File has been created. Go to 'D:/comment_data.json'. To view the file",commentDetails.input());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
