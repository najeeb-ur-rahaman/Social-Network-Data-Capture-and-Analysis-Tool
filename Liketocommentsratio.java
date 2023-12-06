package sprint2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;

public class Liketocommentsratio {

    public static void main(String[] args) {
        // Provide the path to your JSON file on the desktop
        String filePath = "C:\\Users\\gwils\\OneDrive\\Desktop\\filter data 2.json";

        try {
            calculateAndPrintRatioForEachVideo(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void calculateAndPrintRatioForEachVideo(String filePath) throws IOException {
        // Read JSON file into a string
        String jsonString = readJsonFile(filePath);

        // Remove leading and trailing whitespaces and newlines for consistent parsing
        jsonString = jsonString.trim();

        // Extract the "filters" array
        int filtersIndex = jsonString.indexOf("\"filters\": [");
        int startIndex = jsonString.indexOf("{", filtersIndex);
        int endIndex = jsonString.lastIndexOf("}");
        String filtersArrayString = jsonString.substring(startIndex, endIndex + 1);

        // Split the array into individual video objects
        String[] videoObjects = filtersArrayString.split("\\},\\s*\\{");

        // Create a DecimalFormat to format the ratio to two significant figures
        DecimalFormat ratioFormat = new DecimalFormat("#.##");

        // Iterate through each video in the array
        for (int i = 0; i < videoObjects.length; i++) {
            String videoObjectString = videoObjects[i];

            // Extract likes and comments counts from the current video
            int likes = extractFieldValue(videoObjectString, "likeCount");
            int comments = extractFieldValue(videoObjectString, "commentCount");

            // Get the video title
            String title = extractFieldValueString(videoObjectString, "title");

            // Calculate the ratio
            double ratio = (comments != 0) ? (double) likes / comments : Double.POSITIVE_INFINITY;

            // Format the ratio to two significant figures
            String formattedRatio = ratioFormat.format(ratio);

            // Print the result with the video title and formatted ratio
            System.out.println("Video: \"" + title + "\" - Likes to Comment Ratio: " + formattedRatio);
        }
    }

    private static String readJsonFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readString(path);
    }

    private static int extractFieldValue(String videoObjectString, String fieldName) {
        int fieldIndex = videoObjectString.indexOf("\"" + fieldName + "\":");
        int valueIndex = videoObjectString.indexOf("\"", fieldIndex + fieldName.length() + 3);
        int endIndex = videoObjectString.indexOf("\"", valueIndex + 1);
        String valueString = videoObjectString.substring(valueIndex + 1, endIndex);
        return Integer.parseInt(valueString);
    }

    private static String extractFieldValueString(String videoObjectString, String fieldName) {
        int fieldIndex = videoObjectString.indexOf("\"" + fieldName + "\":");
        int valueIndex = videoObjectString.indexOf("\"", fieldIndex + fieldName.length() + 3);
        int endIndex = videoObjectString.indexOf("\"", valueIndex + 1);
        return videoObjectString.substring(valueIndex + 1, endIndex);
    }
}
