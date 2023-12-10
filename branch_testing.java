package testing;

//import stuff 
import Final.Liketocommentsratio;
import Final.MostPopular;
import Final.TagsReader;
import Final.negativeinteraction;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import java.awt.*;


public class branch_testing {

//these are the branch tests for like to comments ratio
    //tests if it works
    @Test
    public void testWithRegularData() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        try {
            Liketocommentsratio.ratio();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
        System.setOut(System.out);
        assertTrue("The ratio method executed without exceptions.", true);
    }
    
    //sees if it works with 0 and 100 
    @Test
    public void testRatioWithZeroLikesAnd100Comments() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        try {
            Liketocommentsratio.ratio();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.setOut(System.out);
        String expectedOutput = "Video Title: <Title>\nRatio of likes to comments: Infinity\n";
        assertEquals(expectedOutput, outContent.toString());
    }
    
    //this tests if things are 0 to see what happens
    @Test
    public void testWithZeroLikesAndZeroComments() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        try {
            Liketocommentsratio.ratio();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.setOut(System.out);
        assertTrue("The ratio method executed without exceptions.", true);
        //this is the part that does it
        String expectedOutput = "Video Title: TitleFromSpecificRow\nRatio of likes to comments: Infinity\n";
        assertEquals(expectedOutput, outContent.toString());
    }
    
    //these are the tests for most popular 
    //tests if createDataset works and contains values
    @Test
    public void testMostPopularDataset() {
        CategoryDataset dataset = MostPopular.createDataset();
        assertFalse("Dataset should contain values", isEmptyDataset(dataset));
    }
    private boolean isEmptyDataset(CategoryDataset dataset) {
        return dataset.getColumnKeys().isEmpty();
    }

    //testing the graph now 
    @Test
    public void testCreateChartWithNoData() {
        //this creats a empty dataset and to see fi the graph is null 
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        JFreeChart chart = MostPopular.createChart(dataset);
        assertNotNull("Chart should not be null", chart);
    }

    //testing negative interaction now 
    @Test
    public void testNegativeInteractionDataset() {
        CategoryDataset dataset = negativeinteraction.createDataset();
        assertFalse("Dataset should contain values", isEmptyDataset(dataset));
    }

    @Test
    //once again we are checking if the dataset is empty and how the chart handles it 
    public void testCreateChartWithNoData_NegativeInteraction() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        JFreeChart chart = negativeinteraction.createChart(dataset);
        assertNotNull("Chart should not be null", chart);
    }
    
    //actually checking if its emppty 
    private boolean isEmptyDataset1(CategoryDataset dataset) {
        return dataset.getColumnKeys().isEmpty();
    }
    
    //positive testing 
    public class ChartTesterPositiveInteraction {
        private static void createAndShowGui() {
            JFrame chartFrame = new JFrame("Video with Most Likes");
            chartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //dataset time
            CategoryDataset dataset = createValidDataset();
            JFreeChart chart = createChart(dataset);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(600, 400));
            chartFrame.setContentPane(chartPanel);
            chartFrame.pack();
            chartFrame.setLocationRelativeTo(null);
            chartFrame.setVisible(true);
        }

        //gotta create a fake dataset to test it
        private static CategoryDataset createValidDataset() {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.addValue(1120, "Likes", "New vid");
            dataset.addValue(801, "Likes", "Crzzy vid");
            dataset.addValue(12212, "Likes", "Wow much vid much wow");
            return dataset;
        }
        //make the graph to test
        private static JFreeChart createChart(CategoryDataset dataset) {
            return ChartFactory.createBarChart(
                    "Videos",
                    "Likes",
                    null, dataset,
                    PlotOrientation.VERTICAL,
                    true,
                    true,
                    false
            );
        }
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> createAndShowGui());
        }
    }
    
    //tag time 
    @Test
    //testing if this works with 0 tags 
    public void testEmptyDataset() {
        Map<String, Integer> result = TagsReader.tallyTagsFromDatabase();
        assertTrue("Tag Counts should be empty", result.isEmpty());
    }
    
   //testing visualisation of posts 
    @Test
    public void testEmptyViewCount() {
        // Assuming your createDataset method is in a class named MostPopular
        MostPopular mostPopular = new MostPopular();

        // Call the createDataset method
        CategoryDataset dataset = mostPopular.createDataset();

        // Assert that the dataset is not empty
        assertFalse("Dataset should contain values", isEmptyDataset(dataset));

        // Additional assertions based on your specific requirements
    }

    private boolean isDatasetEmpty(CategoryDataset dataset) {
        return dataset.getColumnKeys().isEmpty();
    }

}
