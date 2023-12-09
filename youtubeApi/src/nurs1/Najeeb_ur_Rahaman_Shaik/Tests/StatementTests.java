package nurs1.Najeeb_ur_Rahaman_Shaik.Tests;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.OutputVideoData;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.getApiKey;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.getVideoId;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.inputComments;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.inputDetails;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.outputCommentData;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.outputData;

public class StatementTests {
	
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
		assertEquals(true, inputComments.checkcomments(6));
	}
	
	@Test 
	public void testcheckcomments2(){
		assertEquals(true, inputComments.checkcomments(60));
	}

    @Test
    public void testgetvideoId1() throws MalformedURLException {
        // Mocking a URL for testing purposes
        URL URL = new URL("https://www.googleapis.com/youtube/v3/search?key=" + key + "&q=najeeb&type=video&part=snippet&maxResults=50");

        // Test case 1: Test when HTTP response is 200 (success)
        try {
            List<String> resultIds = getVideoId.videoids(new ArrayList<>(), 5, URL);
            assertNotNull(resultIds); // Check if the returned list is not null
            assertEquals(5, resultIds.size()); // Ensure the expected number of video IDs are retrieved
        } catch (IOException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testgetvideoId2() {
        // Test case 2: Test when HTTP response is not 200 (failure)
        try {
            // Providing a mocked HttpURLConnection that returns a 404 status code
            List<String> errorIds = getVideoId.videoids(new ArrayList<>(), 5, new URL("wrongURL"));
            assertTrue(errorIds.contains("Connection Error")); // Ensure the connection error message is present
        } catch (IOException e) {
            assertNotNull(e.getMessage()); // Ensure the exception message is not null
        }
    }
    
    @Test
    public void testSOutputVideoData() {
        try {
            // Test case 1: Execute the try block completely
            String query = "test_query";
            int results = 5;

            String result = OutputVideoData.output(query, results);
            assertNotNull(result); // Ensure the output is not null

            // Test case 2: Force an IOException in the try block
            String invalidQuery = "invalid_query";
            int invalidResults = -1; // Invalid number of results

            String invalidResult = OutputVideoData.output(invalidQuery, invalidResults);
            assertNotNull(invalidResult); // Ensure the output for the invalid case is not null

        } catch (MalformedURLException e) {
            fail("Malformed URL Exception occurred");
        }
    }
    
    @Test
    public void testSOutputCommentData() {
        try {
            // Test case 1: Execute the try block completely
            String query = "test_query";
            int results = 5;
            int comments = 20;

            String result = outputCommentData.output(query, results, comments);
            assertNotNull(result); // Ensure the output is not null

            // Test case 2: Force an IOException in the try block
            String invalidQuery = "invalid_query";
            int invalidResults = -1; // Invalid number of results
            int invalidComments = 0;

            String invalidResult = outputCommentData.output(invalidQuery, invalidResults, invalidComments);
            assertNotNull(invalidResult); // Ensure the output for the invalid case is not null

        } catch (MalformedURLException e) {
            fail("Malformed URL Exception occurred");
        }
    }
    
    @Test
    public void testOutputData() {
        try {
            // Set up a test URL
            URL testUrl = new URL("https://www.googleapis.com/youtube/v3/search?key" + key +"&q=sruthi&type=video&part=snippet&maxResults=2");

            // Call the OutputData method
            JSONObject result = outputData.OutputData(testUrl);

            // Assertions or checks to verify the result
            assertNotNull(result); // Ensure the result is not null (basic assertion)
        } catch (IOException e) {
            fail("IOException occurred");
        }
    }
    
	@Test //Test for the getKey method
	public void testtogetKey() throws MalformedURLException, IOException {
	    assertNotNull(getApiKey.getAPIkey());
	}
	
}



