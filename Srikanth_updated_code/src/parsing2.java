package com.sv219_Srikanth_voruganti;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JsonFilter {
    public static void main(String[] args) {
        // Specify the path to your input JSON file
        String jsonFilePath = "C:\\Users\\SRIKANTH\\Downloads\\video_data.json";

        // Specify the path for the output JSON file
        String outputJsonFilePath = "C:\\Users\\SRIKANTH\\Downloads\\filtered_data.json";

        try {
            // Initialize ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON file into a JsonNode
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract and print specific fields
            String videoId = (String) video.get("id");
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

            // Create a new JSON object with the filtered data
            ObjectNode filteredData = objectMapper.createObjectNode();
            filteredData.put("ID", videoId);
            filteredData.put("PUBLISHEDATE", publishDate);
            filteredData.put("CHANNELID", channelId);
            filteredData.put("TITLE", title);
            filteredData.put("CHANNELTITLE", channelTitle);
            filteredData.put("DURATION", duration);
            filteredData.put("viewCount", viewCount);
            filteredData.put("likeCount", likeCount);
            filteredData.put("dislikeCount", dislikeCount);
            filteredData.put("favoriteCount", favoriteCount);
            filteredData.put("commentCount", commentCount);

            // Write the filtered data to a new JSON file
            objectMapper.writeValue(new File(outputJsonFilePath), filteredData);

            System.out.println("Filtered data has been written to: " + filtered_data.json");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
