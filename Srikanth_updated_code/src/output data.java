package com.sv219.Srikanth_Voruganti;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SaveFilterDataToJson {

    public static void main(String[] args) {
        // Sample filter data
        Map<String, Object> filterData = new HashMap<>();
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


        // File path to save JSON data
        String filePath = "filterData.json";

        // Save filter data to JSON file
        saveFilterDataToJson(filterData, filePath);

        System.out.println("Filter data saved to: " + filePath);
    }

    private static void saveFilterDataToJson(Map<String, Object> filterData, String filePath) {
        try {
            // Create ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Write filter data to JSON file
            objectMapper.writeValue(new File(filePath), filterData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
