package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.jupiter.api.Test;

import Final.Liketocommentsratio;
import Final.MostPopular;
import Final.positiveinteraction;
import Final.visualising_posts;

class statement_testing {

    // Test case for the scenario where comments are not zero
    @Test
    void testRatioCalculationWithNonZeroComments() {
        int likes = 10;
        int comments = 5;
        double result = Liketocommentsratio.calculateRatio(likes, comments);
        assertEquals(2.0, result, 0.001);
    }
    @Test
    void testRatioCalculationWithZeroComments() {
        // Assume a specific scenario with zero comments
        int likes = 10;
        int comments = 0;
        double result = Liketocommentsratio.calculateRatio(likes, comments);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testWhileLoopExecution() {
        CategoryDataset dataset = MostPopular.createDataset();
        assertTrue(dataset.getRowCount() > 0, "no gaps in rows");
    }
    
    @Test
    public void testCreateDatasetNoException() {
        assertDoesNotThrow(() -> {
            XYSeriesCollection dataset = visualising_posts.createDataset();
            assertNotNull(dataset);
        });
    }  

    @Test
    void testWhileLoopExecutionforpositiveineteraction() {
        CategoryDataset dataset = positiveinteraction.createDataset();
        assertNotNull(dataset, "Dataset should not be emptyu");
        assertFalse(dataset.getRowCount() == 0, "not empty");
    }
}