package nurs1.Najeeb_ur_Rahaman_Shaik.youtubeApi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class getApiKey {
	
	// Method to get API key from config.properties file
	// If you don't have config.properties file then follow the steps below the code
	
	public static String getAPIkey() {
		String key = null;
        try (InputStream input = new FileInputStream("resources/config.properties")) { //read from the file

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and store it in a variable
            key = prop.getProperty("key");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		return key; //return the key
	}

}
// Create a folder named resources under the project folder
// create a file named properties.config
// create a key value pair, key as a variable "key" and value should be the access key generated in the Google youtube API project