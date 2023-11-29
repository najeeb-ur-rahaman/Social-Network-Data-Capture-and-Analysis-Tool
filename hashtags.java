package hastags;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class hashtags {
    public static void main(String[] args) {
        // Specify the path to your file containing hashtags
        String filePath = "C:\\Users\\gwils\\OneDrive\\Desktop\\hashtags.txt";

        // Create a map to store hashtag counts
        Map<String, Integer> hashtagCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Assuming each hashtag is on a new line in the file
                String hashtag = line.trim();
                hashtagCounts.put(hashtag, hashtagCounts.getOrDefault(hashtag, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the counts
        for (Map.Entry<String, Integer> entry : hashtagCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
