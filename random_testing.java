package testing;

import org.junit.jupiter.api.Test;

import Final.MostPopular;
import Final.negativeinteraction;
import Final.positiveinteraction;
import Final.visualising_posts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class random_testing {

	 private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testingtestingtesting";
	 private static final String JDBC_USER = "George";
	 private static final String JDBC_PASSWORD = "George02!";
    @Test
    void randomtests_ratio() {
        for (int i = 0; i < 15; i++) {
		    randomtests_ratio();
		}
    }

    @Test
    void randomTestformostpopular() throws SQLException {
        int randomInput = new Random().nextInt(100);
        CategoryDataset dataset = MostPopular.createDataset();
        assertNotNull(dataset, "Dataset should not be null");
        assertTrue(dataset.getRowCount() >= 0, "Dataset should have a non-negative row count");
    }
    
    //this is for negative interaction we are comparing the random data with the original data nad if the random 
    //data is also positive and working it should also pass 
    @Test
    void randomTestForNegativeInteractionWithRandomValues() {
        CategoryDataset actualDataset = negativeinteraction.createDataset();
        CategoryDataset randomDataset = generateRandomDataset();
        assertNotNull(actualDataset, "the actual data should not be null");
        assertNotNull(randomDataset, "Random Dataset should not be null");
        assertTrue(actualDataset.getRowCount() >= 0, "no negatives");
        assertTrue(randomDataset.getRowCount() >= 0, "no negatives");
        for (int i = 0; i < actualDataset.getRowCount(); i++) {
            String videoTitle = (String) actualDataset.getColumnKey(i);
            double actualRatio = (double) actualDataset.getValue(0, i);
            double randomRatio = (double) randomDataset.getValue(0, i);
            System.out.println("Title: " + videoTitle + ", Actual Ratio: " + actualRatio + ", Random Ratio: " + randomRatio);
            if (actualRatio > 0 && randomRatio > 0) {
                assertTrue(true, "Test passes for video: " + videoTitle);
            } else {
                fail("Test fails for video: " + videoTitle);
            }
        }
    }

    //this generates teh randomness for the data 
    private CategoryDataset generateRandomDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            String videoTitle = "Video" + i;
            int totalLikes = random.nextInt(1250);
            int totalDislikes = random.nextInt(652);
            System.out.println("Title: " + videoTitle + ", Likes: " + totalLikes + ", Dislikes: " + totalDislikes);
            double dislikeRatio = (totalLikes + totalDislikes != 0) ?
                    (double) totalDislikes / (totalLikes + totalDislikes) : Double.POSITIVE_INFINITY;
            dataset.addValue(dislikeRatio, "Dislike Ratio", videoTitle);
        }

        return dataset;
    }
    
    //this is for positive interaction 
    @Test
    void randomTestForVisualisingPosts() {
        CategoryDataset actualDataset = positiveinteraction.createDataset();
        CategoryDataset randomDataset = generateRandomDatasetForVisualisingPosts();
        assertNotNull(actualDataset, "the actual data should not be null");
        assertNotNull(randomDataset, "the random data should also not be null");
        assertTrue(actualDataset.getRowCount() >= 0, "no negatives");
        assertTrue(randomDataset.getRowCount() >= 0, "no negatives");
        for (int i = 0; i < actualDataset.getRowCount(); i++) {
            String title = (String) actualDataset.getColumnKey(i);
            int actualLikes = (int) actualDataset.getValue(0, i);
            int randomLikes = (int) randomDataset.getValue(0, i);

            System.out.println("Title: " + title + ", Actual Likes: " + actualLikes + ", Random Likes: " + randomLikes);
            if (actualLikes >= 0 && randomLikes >= 0) {
                assertTrue(true, "Test passes for post: " + title);
            } else {
                fail("Test fails for post: " + title);
            }
        }
    }

    private CategoryDataset generateRandomDatasetForVisualisingPosts() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            String title = "Post" + i;
            int randomLikes = random.nextInt(1000);
            System.out.println("Title: " + title + ", Random Likes: " + randomLikes);
            dataset.addValue(randomLikes, "Likes", title);
        }

        return dataset;
    }
    
    @Test
    void randomTestForCreateDataset() {
        // Set up a mock implementation that generates random data
        MockDatabase mockDatabase = new MockDatabase();
        XYSeriesCollection actualDataset = visualising_posts.createDataset();
        XYSeriesCollection expectedDataset = mockDatabase.generateRandomDataset();
        assertNotNull(actualDataset, "Dataset should not be null");
        assertEquals(expectedDataset.getSeriesCount(), actualDataset.getSeriesCount(),
                "Number of series should match for the random test");
    }

    private static class MockDatabase {
        private static final int NUMBER_OF_VIDEOS = 10;
        public XYSeriesCollection generateRandomDataset() {
            XYSeriesCollection dataset = new XYSeriesCollection();
            Random random = new Random();

            for (int i = 0; i < NUMBER_OF_VIDEOS; i++) {
                int videoLength = random.nextInt(100);
                int totalViews = random.nextInt(1000);
                String videoTitle = "Video" + i;

                XYSeries series = new XYSeries(videoTitle);
                series.add(videoLength, totalViews);
                dataset.addSeries(series);
            }
            return dataset;
        }
    }
    
    @Test
    void randomTestForCreateDataset1() {
        MockDatabase mockDatabase = new MockDatabase();
        CategoryDataset actualDataset = MostPopular.createDataset();
        CategoryDataset expectedDataset = (CategoryDataset) mockDatabase.generateRandomDataset();
        assertNotNull(actualDataset, "Dataset should not be null");
        assertEquals(expectedDataset.getRowCount(), actualDataset.getRowCount(),
                "Number of rows should match for the random test");
    }
    private static class Mockdbformostpop {
        private static final int NUMBER_OF_VIDEOS = 10; // Adjust as needed

        public CategoryDataset generateRandomDataset() {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            Random random = new Random();
            for (int i = 0; i < NUMBER_OF_VIDEOS; i++) {
                String title = "Video" + i;
                int likeCount = random.nextInt(100);
                int viewCount = random.nextInt(1000);
                double likeToViewRatio = (viewCount != 0) ? (double) likeCount / viewCount : Double.POSITIVE_INFINITY;
                dataset.addValue(likeToViewRatio, "Like to View Ratio", title);
            }
            return dataset;
        }
    }
}
