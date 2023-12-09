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

import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.OutputVideoData;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.getApiKey;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.getVideoId;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.inputComments;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.inputDetails;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.outputCommentData;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.outputData;

public class MutationTests {
	
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

    @Test
    public void testVideoIds1() throws MalformedURLException {
        // Mocking a URL for testing purposes
        URL URL = new URL("https://www.googleapis.com/youtube/v3/search?key=" + key + "&q=najeeb&type=video&part=snippet&maxResults=50");

        // Test case 1: Test when connection is successful and video IDs are retrieved
        List<String> resultIds = new ArrayList<>();
        try {
            getVideoId.videoids(resultIds, 5, URL);
            assertEquals(5, resultIds.size()); // Check if the expected number of video IDs is retrieved
            assertFalse(resultIds.contains("Connection Error")); // Ensure no connection error message is present
        } catch (IOException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
        
	@Test
    public void testVideoIds2() throws MalformedURLException {

        // Test case 2: Test when connection fails
        List<String> connectionErrorIds = new ArrayList<>();
        try {
            getVideoId.videoids(connectionErrorIds, 5, new URL("wrongURL")); // Providing an invalid URL
            assertTrue(connectionErrorIds.contains("Connection Error")); // Check for connection error message
        } catch (IOException e) {
            // Expecting an IOException due to the invalid URL provided above
            assertNotNull(e.getMessage()); // Ensure the exception message is not null
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
		JSONObject result = outputData.OutputData(wrong_url);
		assertEquals("Something went wrong",result.getString("error"));
	}
	
	@Test //Test for the getKey method
	public void testtogetKey() throws MalformedURLException, IOException {
	    assertNotNull(getApiKey.getAPIkey());
	}
	
	 @Test
	 public void testCheckResultsValidInput() {
        // Test case for checkresults method with valid input
        
        // Given (Input value within the valid range)
        int validInput = 5; // Assuming 5 as a valid result
        
        // When (Calling the checkresults method with valid input)
        boolean result = inputDetails.checkresults(validInput);
        
        // Then (Assert the expected behavior)
        assertEquals(true, result);
	    }

    @Test
    public void testCheckResultsInvalidInput1() {
        // Test case for checkresults method with invalid input
        
        // Given (Input value outside the valid range)
        int invalidInput = 15; // Assuming 15 as an invalid result
        
        // When (Calling the checkresults method with invalid input)
        boolean result = inputDetails.checkresults(invalidInput);
        
        // Then (Assert the expected behavior)
        assertEquals(false, result);
    }

    @Test
    public void testCheckResultsInvalidInput2() {
        // Test case for checkresults method with invalid input
        
        // Given (Input value outside the valid range)
        int invalidInput = -1; // Assuming 15 as an invalid result
        
        // When (Calling the checkresults method with invalid input)
        boolean result = inputDetails.checkresults(invalidInput);
        
        // Then (Assert the expected behavior)
        assertEquals(false, result);
    }
    
	 @Test
	    public void testCheckCommentsValidInput() {
	        // Test case for checkcomments method with valid input
	        
	        // Given (Input value within the valid range)
	        int validInput = 5; // Assuming 5 as a valid result
	        
	        // When (Calling the checkcomments method with valid input)
	        boolean result = inputComments.checkcomments(validInput);
	        
	        // Then (Assert the expected behavior)
	        assertEquals(true, result);
	    }
    
    @Test
    public void testCheckCommentsInvalidInput1() {
        // Test case for checkcomments method with invalid input
        
        // Given (Input value outside the valid range)
        int invalidInput = 150; // Assuming 15 as an invalid result
        
        // When (Calling the checkcomments method with invalid input)
        boolean result = inputComments.checkcomments(invalidInput);
        
        // Then (Assert the expected behavior)
        assertEquals(false, result);
    }

    @Test
    public void testCheckCommentsInvalidInput2() {
        // Test case for checkcomments method with invalid input
        
        // Given (Input value outside the valid range)
        int invalidInput = -1; // Assuming 15 as an invalid result
        
        // When (Calling the checkcomments method with invalid input)
        boolean result = inputComments.checkcomments(invalidInput);
        
        // Then (Assert the expected behavior)
        assertEquals(false, result);
    }
}


