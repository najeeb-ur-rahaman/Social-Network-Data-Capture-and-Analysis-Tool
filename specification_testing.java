package testing;
import static org.junit.jupiter.api.Assertions.*;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import Final.Liketocommentsratio;
import Final.MostPopular;
import Final.TagsReader;
import Final.negativeinteraction;
import Final.positiveinteraction;
import Final.visualising_posts;

class specification_testing {

    @Test
    void testRatioCalculation() {
        int likes = 10;
        int comments = 5;
        double expectedRatio = (comments != 0) ? (double) likes / comments : Double.POSITIVE_INFINITY;
        double actualRatio = Liketocommentsratio.calculateRatio(likes, comments);
        assertEquals(expectedRatio, actualRatio, 0.1); 
    }

    
    @Test
    void testDatabaseConnection() {
        // Assuming these constants are defined somewhere
        String JDBC_URL = "yjdbc:mysql://localhost:3306/testingtestingtesting";
        String JDBC_USER = "George";
        String JDBC_PASSWORD = "George02!";

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            assertNotNull(connection, "Database connection should not be null");
        } catch (SQLException e) {
            fail("Failed to connect to the database: " + e.getMessage());
        }
    }
    
    @Test
    void testCreateDataset() {
        CategoryDataset dataset = MostPopular.createDataset();
        assertNotNull(dataset, "Dataset should not be null");
        assertTrue(dataset.getRowCount() >= 0, "Dataset should have a non-negative row count");

    }

    @Test
    void testDataRetrieval() {
        CategoryDataset dataset = negativeinteraction.createDataset();
        for (int i = 0; i < dataset.getRowCount(); i++) {
            String title = (String) dataset.getRowKey(i);
            assertNotNull(title, "Title should not be null for entry " + i);
        }
    }
    
    @Test
    void testingDatasetForPositiveInteraction() {
        CategoryDataset dataset = positiveinteraction.createDataset();
        assertNotNull(dataset, "Dataset should not be null");
        assertTrue(dataset.getRowCount() >= 0, "Dataset should have a non-negative row count");
    }

    public static Map<String, Integer> tallyTagsFromDatabase() {
        Map<String, Integer> databaseResult = retrieveDataFromDatabase();
        return processDataFromDatabase(databaseResult);
    }
    protected static Map<String, Integer> retrieveDataFromDatabase() {
        Map<String, Integer> databaseResult = new HashMap<>();
        databaseResult.put("tag1", 3);
        databaseResult.put("tag2", 5);
        return databaseResult;
    }
    protected static Map<String, Integer> processDataFromDatabase(Map<String, Integer> databaseResult) {
        return databaseResult;
    }

    @Test
    public void testCreateDataset1() {
        XYSeriesCollection dataset = visualising_posts.createDataset();
        assertNotNull(dataset);
        assertFalse(dataset.getSeries().isEmpty());
    }
}


