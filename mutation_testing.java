package testing;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Map;
import javax.swing.JFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.jupiter.api.Test;
import Final.Liketocommentsratio;
import Final.MostPopular;
import Final.TagsReader;
import Final.negativeinteraction;
import Final.positiveinteraction;
import Final.visualising_posts;

class mutation_testing {

	@Test
    void liketocommentsoriginall() {
        try {
        	Liketocommentsratio.ratio(); 
            assertTrue(true, "Tests pass for the original code");
        } catch (SQLException e) {
            fail("it failed:  " + e.getMessage());
        }
    }
	@Test
    void firstmutationoforiginalcodeforliketocomments() {
        try {
            Liketocommentsratio.ratio();
            fail("Mutation 1 worked fine");
        } catch (SQLException e) {
            assertTrue(true, "error " + e.getMessage());
        }
    }
	//negative interaction 
	@Test
    void testMutatedcreateDataset() {
        //original vs mutated
        CategoryDataset originalDataset = negativeinteraction.MutatedcreateDataset();
        CategoryDataset mutatedDataset = negativeinteraction.MutatedcreateDataset();
        assertNotEquals(originalDataset, mutatedDataset, "Datasets should be different for the mutated version");
    }

	//positive ineraciton 
    @Test
    void testMutatedcreateDatasetforpoisitiveinteraction() {
        // Original dataset vs mutated
        CategoryDataset originalDataset = positiveinteraction.createDataset();
        CategoryDataset mutatedDataset = positiveinteraction.createMutatedDataset();
        assertNotEquals(originalDataset, mutatedDataset, "Datasets should be different for the mutated version");
    }
    
    //tags mutation vs orignal  for tags
    @Test
    void testTallyTagsFromDatabaseMutation() {
        Map<String, Integer> originalCounts = TagsReader.tallyTagsFromDatabase();
        Map<String, Integer> mutatedCounts = TagsReader.tallyTagsFromDatabaseMutated();

        // Assuming the tag counts are different due to the introduced mutation
        assertNotEquals(originalCounts, mutatedCounts, "Tag counts should be different for the mutated version");
    }
    @Test
    void testCreateMutatedDataset() {
        // Original dataset vs mutated 
        XYSeriesCollection originalDataset = visualising_posts.createDataset();
        XYSeriesCollection mutatedDataset = visualising_posts.createMutatedDatasetforvisaluasing();
        assertNotEquals(originalDataset, mutatedDataset, "Datasets should be different for the mutated version");
    }
}
