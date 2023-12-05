package Tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import youtubeApi.commentDetails;
import youtubeApi.videoDetails;

public class commentDetailsTests {
	static String key = videoDetailsTests.getAPIkey();
	
	@Test //Test for the output method
	public void testOutputString() {
		try {
			assertEquals("The File has been created. Go to 'D:/comment_data.json'. To view the file",commentDetails.output("najeeb", 4, 20));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test //Test for the input method
	public void testinputString() throws IOException {
		try {
			assertEquals("The File has been created. Go to 'D:/comment_data.json'. To view the file",commentDetails.input());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Tests to check comments
	@Test 
	public void testcheckcommentsequalto0(){
		assertEquals(false, commentDetails.checkcomments(0));
	}
	
	@Test 
	public void testcheckcommentslessthan0(){
		assertEquals(false, commentDetails.checkcomments(-1));
	}
	
	@Test 
	public void testcheckcommentsgreaterthan100(){
		assertEquals(false, commentDetails.checkcomments(120));
	}
	
	@Test 
	public void testcheckcomments(){
		assertEquals(true, commentDetails.checkcomments(6));
	}
	
	@Test 
	public void testcheckcomments2(){
		assertEquals(true, commentDetails.checkcomments(60));
	}
}
