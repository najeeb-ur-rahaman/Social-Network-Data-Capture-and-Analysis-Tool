package svj4.sanjay.Tests.WhiteBoxTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import edu.stanford.nlp.pipeline.CoreSentence;
import svj4.sanjay.javaFiles.CommentSentimentAnalysis;
import svj4.sanjay.javaFiles.CommentsAnalysis;
import svj4.sanjay.javaFiles.databaseConnection;
import svj4.sanjay.javaFiles.durationAnalysis;
import svj4.sanjay.javaFiles.fetchData;

class mutationBasedTests {

	@Mock
	private ResultSet resultSet;
    @SuppressWarnings("deprecation")
	@BeforeEach
    public void setUp() {
        // Reset variables before each test
    	CommentSentimentAnalysis.negative = 0;
    	CommentSentimentAnalysis.positive = 0;
    	CommentSentimentAnalysis.veryPositive = 0;
    	CommentSentimentAnalysis.neutral = 0;
    	
    	MockitoAnnotations.initMocks(this);
    }
	//CommentAnalysis.java test suite
	//findHighestComments() method tests
	 @Test
	    public void testFindHighestComments1() {
	        // Test case 1: Empty input lists
	        List<Double> videoValueInt = Collections.emptyList();
	        List<String> videoTitles = Collections.emptyList();

	        String result = CommentsAnalysis.findHighestComments(videoValueInt, videoTitles);

	        assertNull(result);
	    }
	 
	 @Test
	    public void testFindHighestComments2() {
	        // Test case 2: Valid input with multiple videos
	        List<Double> videoValueInt = Arrays.asList(10.0, 15.5, 12.2);
	        List<String> videoTitles = Arrays.asList("Video1", "Video2", "Video3");

	        String result = CommentsAnalysis.findHighestComments(videoValueInt, videoTitles);

	        assertEquals("Video2", result);
	    }
	 
	 @Test
	    public void testFindHighestComments3() {
	        // Test case 3: Single video with valid comments
	        List<Double> videoValueInt = Collections.singletonList(20.0);
	        List<String> videoTitles = Collections.singletonList("SingleVideo");

	        String result = CommentsAnalysis.findHighestComments(videoValueInt, videoTitles);

	        assertEquals("SingleVideo", result);
	 } 
	 
	 //testAnalyseCommentsBarGraph() method tests
	 @Test
	    public void testAnalyseCommentsBarGraph1() {
	        // Test case 1: Empty dataset
	        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

	        CommentsAnalysis ca = new CommentsAnalysis();
	        String result = ca.analyseCommentsBarGraph(dataSet);

	        assertEquals("Empty dataset", result);
	    }
	 
	 @Test
	    public void testAnalyseCommentsBarGraph2() {
	        // Test case 2: Non-empty dataset
	        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
	        dataSet.addValue(10, "Videos", "Video1");
	        dataSet.addValue(15, "Videos", "Video2");

	        CommentsAnalysis ca = new CommentsAnalysis();
	        String result = ca.analyseCommentsBarGraph(dataSet);

	        assertEquals("Graph generated successfully!", result);
	    }
	 
	 	//durationAnalysis.java test suite
		//findLongestVideo() method tests
	 
	 @Test
	    public void testFindLongestVideo1() {
	        // Test case 1: Empty list
	        List<Double> videoValueInt = Arrays.asList();

	        double result = durationAnalysis.findLongestVideo(videoValueInt);

	        assertEquals(0.0, result); 
	    }
	 
	 @Test
	    public void testFindLongestVideo2() {
	        // Test case 2: Valid list with non-zero values
	        List<Double> videoValueInt = Arrays.asList(100.0, 200.0, 150.0, 300.0);

	        double result = durationAnalysis.findLongestVideo(videoValueInt);

	        assertEquals(300.0, result); 
	    }
	 
	 //analyseDurationBarGraph() method tests
	 
	 @Test
	    public void testAnalyseDurationBarGraph1() {
	        // Test case 1: Empty dataset
	        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
	        durationAnalysis da = new durationAnalysis();
	        String result = da.analyseDurationBarGraph(dataSet);

	        assertEquals("Empty dataset", result);
	    }
	 	 
	 @Test
	    public void testAnalyseDurationBarGraph2() {
	        // Test case 2: Valid dataset with data
	        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
	        dataSet.addValue(100, "Videos", "Video1");
	        dataSet.addValue(150, "Videos", "Video2");
	        durationAnalysis da = new durationAnalysis();
	        String result = da.analyseDurationBarGraph(dataSet);

	        assertEquals("Graph generated successfully!", result);
	 	}
	 
	 	//databaseConnection.java test suite
		//databaseConnectionMethod() method tests
	 //This test will throw an SQL exception because I'm trying to connect to a table that is not in the database, but it's handled
	 @Test
	    public void testDatabaseConnectionMethod1() {
	        // Test case 1: Invalid table name
	        String tableName = "asd";
	        ResultSet result;
			try {
				result = databaseConnection.databaseConnectionMethod(tableName);
				assertNull(result);
			} catch (SQLException e) {
			}    
	    }
	 
	   @Test
	    public void testDatabaseConnectionMethod2() throws SQLException {
	        // Test case 2: Valid table name
	        String tableName = "comments";
	        ResultSet result = databaseConnection.databaseConnectionMethod(tableName);
	        assertNotNull(result);
	    }
	   
	   	//fetchData.java test suite
	 	//fetchDataMethod() method tests
	   
	   @Test
	    public void testFetchDataMethod1() throws SQLException {
	        // Test case 1: Valid ResultSet with no data
		  ResultSet resultSet = mock(ResultSet.class);
	        when(resultSet.next()).thenReturn(false);

	        List<String> result = fetchData.fetchDataMethod(resultSet);

	        assertNull(result);
	  }
	   
	   @Test
	    public void testFetchDataMethod2() throws SQLException {
	        // Test case 2: Valid ResultSet with data
	        ResultSet resultSet = mock(ResultSet.class);
	        when(resultSet.next()).thenReturn(true, true, false);
	        when(resultSet.getString(1)).thenReturn("Video1", "Video2");
	        when(resultSet.getString(2)).thenReturn("10.0", "15.5");

	        List<String> result = fetchData.fetchDataMethod(resultSet);

	        assertNotNull(result);
	        assertFalse(result.isEmpty());
	        assertTrue(result.contains("Video1"));
	        assertTrue(result.contains("Video2"));
	  }
 
	    //CommentSentimentAnalysis.java test suite
	 	//storeResultSet() method tests
	   
	   @Test
	    public void testStoreResultSet1() throws SQLException {   
		// Test case 1: Valid ResultSet with no data
	        Mockito.when(resultSet.next()).thenReturn(false);      
	        String result = CommentSentimentAnalysis.storeResultSet(resultSet);;		       
	        assertEquals(null, result);
	    }
	   
	   @Test
	    public void testStoreResultSet2() throws SQLException {
		// Test case 2: Valid ResultSet with valid data
	        Mockito.when(resultSet.next()).thenReturn(true, true, false);
	        Mockito.when(resultSet.getString(1)).thenReturn("title1", "title2");
	        Mockito.when(resultSet.getString(2)).thenReturn("comment1", "comment2");
	        Mockito.when(resultSet.getString(3)).thenReturn("100", "200");
	        
	        String result = CommentSentimentAnalysis.storeResultSet(resultSet);;
	       
	        assertEquals("Stored Successfully", result);
	    }
	   
	 //sentimentAnalysisGraph() method tests
	   // Helper method to create a valid DataSet for testing
	    private DefaultPieDataset createValidDataSet() {
	        DefaultPieDataset dataSet = new DefaultPieDataset();
	        dataSet.setValue("Negative", 5);
	        dataSet.setValue("Positive", 10);
	        dataSet.setValue("Very Positive", 8);
	        dataSet.setValue("Neutral", 3);
	        return dataSet;
	    }
	    
	    @Test
	    public void testSentimentAnalysisGraph1() {
	        // Test case 1: Empty DataSet
	        DefaultPieDataset dataSet = new DefaultPieDataset();
	        CommentSentimentAnalysis csa = new CommentSentimentAnalysis();
	        String result = csa.sentimentAnalysisGraph(dataSet);
	        assertEquals("Empty dataset", result);
	    }
	    
	    @Test
	    public void testSentimentAnalysisGraph2() {
	        // Test case 2: Valid DataSet
	        DefaultPieDataset dataSet = createValidDataSet();
	        CommentSentimentAnalysis csa = new CommentSentimentAnalysis();
	        String result = csa.sentimentAnalysisGraph(dataSet);

	        assertEquals("Piechart generated successfully!", result);
	    }
	    
	    //analyseComments() method tests
	    
	    // Helper method to create a CoreSentence instance
	    private CoreSentence createCoreSentence(String text, String sentiment) {
	        CoreSentence coreSentence = mock(CoreSentence.class);
	        when(coreSentence.sentiment()).thenReturn(sentiment);
	        return coreSentence;
	    }
	    
	    @Test
	    public void testAnalyseComments1() {
	        // Test case 1: Empty list
		  List<CoreSentence> lines = Arrays.asList();
	        assertEquals("Empty", CommentSentimentAnalysis.analyseComments(lines));
	  }
	    
	    @Test
	    public void testAnalyseComments2() {
	        // Test case 2: Valid list with negative sentiment values
	        List<CoreSentence> lines = Arrays.asList(
	                createCoreSentence("This is negative.", "Negative")	               
	        );

	        String result = CommentSentimentAnalysis.analyseComments(lines);
	        assertEquals("Negative", result);
	    }
	    
	    @Test
	    public void testAnalyseComments3() {
	        // Test case 3: Valid list with positive sentiment values
	        List<CoreSentence> lines = Arrays.asList(
	                createCoreSentence("This is positive.", "Positive")	               
	               //createCoreSentence("This is very positive.", "Very positive"),
	               //createCoreSentence("This is neutral.", "Neutral")
	        );

	        String result = CommentSentimentAnalysis.analyseComments(lines);
	        assertEquals("Positive", result);
	    }
	    
	    @Test
	    public void testAnalyseComments4() {
	        // Test case 4: Valid list with very positive sentiment values
	        List<CoreSentence> lines = Arrays.asList(         	               
	               createCoreSentence("This is very positive.", "Very positive")
	               //createCoreSentence("This is neutral.", "Neutral")
	        );

	        String result = CommentSentimentAnalysis.analyseComments(lines);
	        assertEquals("Very positive", result);
	    }
	 
	  @Test
	    public void testAnalyseComments5() {
	        // Test case 5: Valid list with very positive sentiment values
	        List<CoreSentence> lines = Arrays.asList(         	               	              
	               createCoreSentence("This is neutral.", "Neutral")
	        );

	        String result = CommentSentimentAnalysis.analyseComments(lines);
	        assertEquals("Neutral", result);
	    }
	   
}
