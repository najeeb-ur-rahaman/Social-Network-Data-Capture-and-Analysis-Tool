package svj4.sanjay.Tests.WhiteBoxTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import edu.stanford.nlp.pipeline.CoreSentence;
import svj4.sanjay.javaFiles.CommentSentimentAnalysis;
import svj4.sanjay.javaFiles.CommentsAnalysis;
import svj4.sanjay.javaFiles.databaseConnection;
import svj4.sanjay.javaFiles.durationAnalysis;
import svj4.sanjay.javaFiles.fetchData;

class branchBasedTests {
	
	@BeforeEach
    public void setUp() {
        fetchData.videoTitles.clear();
        CommentSentimentAnalysis.negative = 0;
    	CommentSentimentAnalysis.positive = 0;
    	CommentSentimentAnalysis.veryPositive = 0;
    	CommentSentimentAnalysis.neutral = 0;
    }
	
	//CommentsAnalysis.java test suite
	//findHighestComments() method tests
	
	 @Test
	    public void testFindHighestComments1() {
	        // Test case 1: Both lists are empty
	        List<Double> videoValueInt = Arrays.asList();
	        List<String> videoTitles = Arrays.asList();

	        String result = CommentsAnalysis.findHighestComments(videoValueInt, videoTitles);

	        assertNull(result);
	    }
	 
	 @Test
	    public void testFindHighestComments2() {
	        // Test case 2: Non-empty lists with valid data
	        List<Double> videoValueInt = Arrays.asList(10.0, 15.5, 8.0, 12.3);
	        List<String> videoTitles = Arrays.asList("Video1", "Video2", "Video3", "Video4");

	        String result = CommentsAnalysis.findHighestComments(videoValueInt, videoTitles);

	        assertEquals("Video2", result);
	    }
	 
	 @Test
	    public void testFindHighestComments3() {
	        // Test case 3: Empty videoTitles list
	        List<Double> videoValueInt = Arrays.asList(10.0, 15.5, 8.0, 12.3);
	        List<String> videoTitles = Arrays.asList();

	        String result = CommentsAnalysis.findHighestComments(videoValueInt, videoTitles);

	        assertNull(result);
	    }
	 
	 @Test
	    public void testFindHighestComments4() {
	        // Test case 4: Empty videoValueInt list
	        List<Double> videoValueInt = Arrays.asList();
	        List<String> videoTitles = Arrays.asList("Video1", "Video2", "Video3", "Video4");

	        String result = CommentsAnalysis.findHighestComments(videoValueInt, videoTitles);

	        assertNull(result);
	    }
	 
	 //analyseCommentsBarGraph() method tests
	 
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
	        List<Double> videoValueInt = new ArrayList<>();
	        double result = durationAnalysis.findLongestVideo(videoValueInt);
	        assertEquals(0.0, result);
	    }
	 
	 @Test
	    public void testFindLongestVideo2() {
	        // Test case 2: Non-empty list
	        List<Double> videoValueInt = Arrays.asList(10.0, 15.5, 8.0, 12.5);
	        double result = durationAnalysis.findLongestVideo(videoValueInt);
	        assertEquals(15.5, result);
	    }
	 
	  @Test
	    public void testFindLongestVideo_NullList() {
	        // Test case 3: Null list
	        List<Double> videoValueInt = null;

	        double result = durationAnalysis.findLongestVideo(videoValueInt);

	        assertEquals(0.0, result);
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
	    public void testAnalyseDurationBarGraph_NonEmptyDataset() {
	        // Test case 1: Non-empty dataset
	        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
	        dataSet.addValue(10, "Category1", "Video1");
	        dataSet.addValue(15, "Category1", "Video2");
	        durationAnalysis da = new durationAnalysis();
	        String result = da.analyseDurationBarGraph(dataSet);

	        assertEquals("Graph generated successfully!", result);
	    }
	  
	  	//databaseConnection().java test suite
		//databaseConnectionMethod() method tests
	  
	  @Test
	    public void testDatabaseConnectionMethod1() throws SQLException {
	        // Test case 1: Successful connection
	        String tableName = "comments";  
	        ResultSet results = databaseConnection.databaseConnectionMethod(tableName);
	        assertNotNull(results); 
	    }
	  
	  //This test will throw an SQL exception because I'm trying to connect to a table that is not in the database, but it's handled
	  @Test
	    public void testDatabaseConnectionMethod2() {
	        // Test case 2: Invalid table name
	        String tableName = "asd";
	        ResultSet result;
			try {
				result = databaseConnection.databaseConnectionMethod(tableName);
				assertNull(result);
			} catch (SQLException e) {
			}    
	    }
	  
	  	//fetchData.java test suite
		//fetchDataMethod() method tests
	  @Test
	    public void testFetchDataMethod1() throws SQLException {
	        // Test case 1: ResultSet is valid
	        ResultSet resultSet = Mockito.mock(ResultSet.class);
	        Mockito.when(resultSet.next()).thenReturn(true, false);
	        Mockito.when(resultSet.getString(1)).thenReturn("Video1");
	        Mockito.when(resultSet.getString(2)).thenReturn("10.0");

	        List<String> result = fetchData.fetchDataMethod(resultSet);

	        assertNotNull(result);
	        assertEquals(List.of("Video1"), result);
	    }
	  
	  @Test
	    public void testFetchDataMethod2() throws SQLException {
	        // Test case 2: ResultSet is null
	        ResultSet resultSet = null;

	        List<String> result = fetchData.fetchDataMethod(resultSet);

	        assertNull(result);
	    }
	  
	  @Test
	    public void testFetchDataMethod3() throws SQLException {
	        // Test case 3: ResultSet is not null, but videoTitles is empty
	        ResultSet resultSet = Mockito.mock(ResultSet.class);
	        Mockito.when(resultSet.next()).thenReturn(false);

	        List<String> result = fetchData.fetchDataMethod(resultSet);

	        assertNull(result);
	    }
	  
	  	//CommentSentimentAnalysis.java test suite
		//storeResultSet() method tests
	  
	  	// Helper method to create a mock ResultSet with data
	    private ResultSet mockResultSetWithData() throws SQLException {
	        ResultSet resultSet = Mockito.mock(ResultSet.class);
	        Mockito.when(resultSet.next()).thenReturn(true, true, false);
	        Mockito.when(resultSet.getString(1)).thenReturn("Video1", "Video2");
	        Mockito.when(resultSet.getString(2)).thenReturn("Comment1", "Comment2");
	        Mockito.when(resultSet.getString(3)).thenReturn("100", "200");
	        return resultSet;
	    }
	    // Helper method to create a mock empty ResultSet
	    private ResultSet mockEmptyResultSet() throws SQLException {
	        ResultSet resultSet = Mockito.mock(ResultSet.class);
	        Mockito.when(resultSet.next()).thenReturn(false);
	        return resultSet;
	    }
	    
	    @Test
        public void teststoreResultSet1() throws SQLException {
	    	// Test case 1: Empty result set
            ResultSet resultSet = mockEmptyResultSet();          
            String result = CommentSentimentAnalysis.storeResultSet(resultSet);           
            assertNull(result);
        }
	    
	    @Test
        public void teststoreResultSet2() throws SQLException {
	    	// Test case 2: Empty result set
            ResultSet resultSet = mockResultSetWithData();
            String result = CommentSentimentAnalysis.storeResultSet(resultSet);
            assertEquals("Stored Successfully", result);
        }
	    
	    //sentimentAnalysisGraph() method tests
	    // Helper method to create a mock dataset with values
	    private DefaultPieDataset mockDataSetWithValues() {
	        DefaultPieDataset dataSet = new DefaultPieDataset();
	        dataSet.setValue("Negative", 10);
	        dataSet.setValue("Positive", 20);
	        dataSet.setValue("Very Positive", 5);
	        dataSet.setValue("Neutral", 15);
	        return dataSet;
	    }
	    @Test
        public void sentimentAnalysisGraph1() {  	
	    	// Test case 1: Empty data set
            DefaultPieDataset dataSet = new DefaultPieDataset(); 
            CommentSentimentAnalysis csa = new CommentSentimentAnalysis();
            String result = csa.sentimentAnalysisGraph(dataSet); 
            assertEquals("Empty dataset", result);
        }
	    @Test
        public void sentimentAnalysisGraph2() {
	    	// Test case 2: Empty data set
            DefaultPieDataset dataSet = mockDataSetWithValues();
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
	    


