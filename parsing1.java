import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonFilter {
    public static void main(String[] args) {
        // Specify the path to your JSON file
        String jsonFilePath = ""C:\Users\SRIKANTH\Downloads\video_data.json"";

        try {
            // Initialize ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON file into a JsonNode
            JsonNode rootNode = objectMapper.readTree(new File("C:\Users\SRIKANTH\Downloads\filter data.json"));

            // Extract and print specific fields
            String publishDate = rootNode.path("PUBLISHEDATE").asText();
            String channelId = rootNode.path("CHANNELID").asText();
            String title = rootNode.path("TITLE").asText();
            String channelTitle = rootNode.path("CHANNELTITLE").asText();
            String duration = rootNode.path("DURATION").asText();
            long viewCount = rootNode.path("viewCount").asLong();
            long likeCount = rootNode.path("likeCount").asLong();
            long dislikeCount = rootNode.path("dislikeCount").asLong();
            long favoriteCount = rootNode.path("favoriteCount").asLong();
            long commentCount = rootNode.path("commentCount").asLong();

            // Print the filtered fields
            System.out.println("Publish Date: " + publishDate);
            System.out.println("Channel ID: " + channelId);
            System.out.println("Title: " + title);
            System.out.println("Channel Title: " + channelTitle);
            System.out.println("Duration: " + duration);
            System.out.println("View Count: " + viewCount);
            System.out.println("Like Count: " + likeCount);
            System.out.println("Dislike Count: " + dislikeCount);
            System.out.println("Favorite Count: " + favoriteCount);
            System.out.println("Comment Count: " + commentCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
