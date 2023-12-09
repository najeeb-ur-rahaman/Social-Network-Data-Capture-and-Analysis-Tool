package nurs1.Najeeb_ur_Rahaman_Shaik.Tests;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.ArrayList;

import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.OutputVideoData;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.getApiKey;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.getVideoId;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.inputComments;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.inputDetails;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.outputCommentData;
import nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi.outputData;

public class BranchTests {
	
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
    public void testgetKey() {
        // Test with an existing config.properties file
        
        // Assuming the file "resources/config.properties" exists with a valid key
        String apiKey = getApiKey.getAPIkey();
        
        assertNotNull(apiKey, "API key should not be null");
        // Add assertions based on expected behavior with an existing config file
    }

    @Test
    public void testVideoId1() throws IOException {
        // Test for a successful HTTP response (status code 200)
    	URL URL = new URL("https://www.googleapis.com/youtube/v3/search?key=" + key + "&q=najeeb&type=video&part=snippet&maxResults=50");

        List<String> result = getVideoId.videoids(new ArrayList<>(), 5, URL); // Assuming 5 as the number of results
        
        assertTrue(result.size() > 0);
        // Add assertions based on expected behavior for a successful response
    }

    @Test
    public void testVideoId2() throws IOException {
        // Test for a connection error scenario
    	URL wrong_URL = new URL("https://www.googleapis.com/youtube/v3/search?keypart=snippet&maxResults=50");

        List<String> result = getVideoId.videoids(new ArrayList<>(), 5, wrong_URL); // Assuming 5 as the number of results
        
        assertTrue(result.contains("Connection Error"));
        // Add assertions based on expected behavior for a connection error
    }
    
    @Test
    public void testOutputVideoData() throws IOException {

        String result = OutputVideoData.output("test query", 5);

        assertEquals("The File has been created. Go to 'D:/video_data.json'. To view the file", result);
        // Add assertions based on expected behavior for an empty videoIds list
    }
    
	@Test //Test for the outputCommentData method
	public void testCommentDataoutput1() throws MalformedURLException {
		
		String result = outputCommentData.output("test query", 5, 50);
		
		assertEquals("The File has been created. Go to 'D:/comment_data.json'. To view the file",result);
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
	
	@Test
    public void testResultGreaterThan10() {
        // Test for input greater than 10

        int input = 15;
        boolean result = inputDetails.checkresults(input);

        assertFalse(result);
        // Add assertions based on the expected behavior for input > 10
    }

    @Test
    public void testResultEqualToZero() {
        // Test for input equal to 0

        int input = 0;
        boolean result = inputDetails.checkresults(input);

        assertFalse(result);
        // Add assertions based on the expected behavior for input == 0
    }

    @Test
    public void testResultLessThanZero() {
        // Test for input less than 0

        int input = -5;
        boolean result = inputDetails.checkresults(input);

        assertFalse(result);
        // Add assertions based on the expected behavior for input < 0
    }

    @Test
    public void testResultInRange() {
        // Test for input within the valid range (1 to 10)

        int input = 5;
        boolean result = inputDetails.checkresults(input);

        assertTrue(result);
        // Add assertions based on the expected behavior for input within range (1 to 10)
    }
    
    @Test
    public void testCommentsGreaterThan100() {
        // Test for input greater than 100

        int input = 150;
        boolean result = inputComments.checkcomments(input);

        assertFalse(result);
        // Add assertions based on the expected behavior for input > 100
    }

    @Test
    public void testCommentsEqualToZero() {
        // Test for input equal to 0

        int input = 0;
        boolean result = inputComments.checkcomments(input);

        assertFalse(result);
        // Add assertions based on the expected behavior for input == 0
    }

    @Test
    public void testCommentsLessThanZero() {
        // Test for input less than 0

        int input = -5;
        boolean result = inputComments.checkcomments(input);

        assertFalse(result);
        // Add assertions based on the expected behavior for input < 0
    }

    @Test
    public void testCommentsInRange() {
        // Test for input within the valid range (1 to 100)

        int input = 50;
        boolean result = inputComments.checkcomments(input);

        assertTrue(result);
        // Add assertions based on the expected behavior for input within range (1 to 100)
    }
}
