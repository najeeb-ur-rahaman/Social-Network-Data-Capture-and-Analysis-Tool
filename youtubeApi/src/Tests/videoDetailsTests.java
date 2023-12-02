package Tests;

import static org.junit.Assert.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import youtubeApi.videoDetails;

public class videoDetailsTests {
	

	@Test
	public void testOutputString() {
		try {
			assertEquals("The File has been created",videoDetails.inputAndoutput("najeeb", 4));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testVideoIdsNotNull() throws MalformedURLException {
		List<String> videoIds = new ArrayList<String>();
	    URL url = new URL("https://www.googleapis.com/youtube/v3/search?key=AIzaSyAYvenm2DLFO9BU2lm9HEtjvR3BxJiX7cw&q=sruthi&type=video&part=snippet&maxResults=50");
		try {
			assertNotNull(videoDetails.videoids(videoIds, 10, url));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test (expected = IOException.class)
	public void testIoexceptionVideoid() throws IOException {
		List<String> videoIds = new ArrayList<String>();
	    URL url = new URL("https://www.googleapis.com/youtube/v3/search?&q=sruthi&type=video&part=snippet&maxResults=50");
		videoDetails.videoids(videoIds, 10, url);
	}
	
	@Test 
	public void testJsonNotNull() throws MalformedURLException {
		URL url2 = new URL("https://www.googleapis.com/youtube/v3/videos?part=snippet,statistics,contentDetails&id=Hwi9dsFBuhg&key=AIzaSyAYvenm2DLFO9BU2lm9HEtjvR3BxJiX7cw");
		try {
			assertNotNull(videoDetails.videoData(url2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test (expected = IOException.class)
	public void testIoexceptionVideoData() throws IOException {
		List<String> videoIds = new ArrayList<String>();
	    URL url = new URL("https://www.googleapis.com/youtube/v3/videos?part=snippet,statistics,contentDetails&id=Hwi9dsFBuhg&");
		videoDetails.videoids(videoIds, 10, url);
	}
	
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
