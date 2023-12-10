package com.sv219.Srikanth_Voruganti;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTesting {
  public static void main(String[] args) throws IOException {
    FileReader fileReader = new FileReader("video_data.json");
    List<String[]> data = new ArrayList<>();
    String[] line;
    while ((line = fileReader.readLine()) != null) {
      String[] fields = line.split(",");
      data.add(fields);
    }
    fileReader.close();

    Random random = new Random();
    int numTests = 10;
    for (int i = 0; i < numTests; i++) {
      int index = random.nextInt(data.size());
      String[] row = data.get(index);
      String id = row[0];
      String publishedDate = row[1];
      String channelId = row[2];
      String title = row[3];
      String channelTitle = row[4];
      int duration = Integer.parseInt(row[5]);
      int viewCount = Integer.parseInt(row[6]);
      int likeCount = Integer.parseInt(row[7]);
      int dislikeCount = Integer.parseInt(row[8]);
      int favoriteCount = Integer.parseInt(row[9]);
      int commentCount = Integer.parseInt(row[10]);

      // Perform random testing based on the data
      if (random.nextBoolean()) {
        // Test 1: Check if the video duration is within a certain range
        if (duration < 60 || duration > 3600) {
          System.out.println("Video duration is not within the acceptable range: " + duration);
        }
      }

      if (random.nextBoolean()) {
        // Test 2: Check if the view count is within a certain range
        if (viewCount < 1000 || viewCount > 1000000) {
          System.out.println("View count is not within the acceptable range: " + viewCount);
        }
      }

      if (random.nextBoolean()) {
        // Test 3: Check if the like count is within a certain range
        if (likeCount < 10 || likeCount > 10000) {
          System.out.println("Like count is not within the acceptable range: " + likeCount);
        }
      }

      if (random.nextBoolean()) {
        // Test 4: Check if the dislike count is within a certain range
        if (dislikeCount < 0 || dislikeCount > 10000) {
         out.println("Dislike count is not within the acceptable range: " + dislikeCount);
        }
      }

      if (random.nextBoolean()) {
        // Test 5: Check if the favorite count is within a certain range
        if (favoriteCount < 0 || favoriteCount > 10000) {
          System.out.println("Favorite count is not within the acceptable range: " + favoriteCount);
        }
      }

      if (random.nextBoolean()) {
        // Test 6: Check if the comment count is within a certain range
        if (commentCount < 0 || commentCount > 10000) {
          System.out.println("Comment count is not within the acceptable range: " + commentCount);
        }
      }
    }
  }
}
