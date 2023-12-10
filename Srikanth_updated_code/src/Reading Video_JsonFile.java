package com.sv219.Srikanth_Voruganti;
// Define a package for the JSON handling functionality
package com.example.jsonhandler;

// Import necessary packages
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Create a class to encapsulate the JSON reading functionality
public class JsonReader {

    // Method to read JSON file and return a JSONObject
    public static JSONObject readJsonFile(String filePath) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            // Parse the JSON file
            Object obj = jsonParser.parse(reader);

            // Return the parsed JSON object
            return (JSONObject) obj;
        }
    }
}

// Another package for the main application logic
package com.example.main;

// Import necessary packages
import com.example.jsonhandler.JsonReader;

// Create a class for the main application logic
public class MainApplication {

    // Example method to demonstrate the usage of the JSON reader
    public static void processJsonData(JSONObject jsonObject) {
        // Implement your logic to process the JSON data here
        System.out.println("Processing JSON data: " + jsonObject);
    }

    // Example usage in a non-main method
    public static void main(String[] args) {
        try {
            // Provide the path to your JSON file
            String filePath = "C:\Users\SRIKANTH\Downloads\video_data.json";

            // Read the JSON file using the JsonReader class
            JSONObject jsonData = JsonReader.readJsonFile(filePath);

            // Process the JSON data
            processJsonData(jsonData);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
