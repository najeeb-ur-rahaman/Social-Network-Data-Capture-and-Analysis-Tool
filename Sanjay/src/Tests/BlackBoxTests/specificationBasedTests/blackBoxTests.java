package Tests.BlackBoxTests.specificationBasedTests;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.sanjay.nlp.CommentSentimentAnalysis;
import edu.stanford.nlp.pipeline.CoreSentence;

import youtubeAnalysis.CommentsAnalysis;
import youtubeAnalysis.databaseConnection;
import youtubeAnalysis.durationAnalysis;
import youtubeAnalysis.fetchData;


class blackBoxTests {
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

	//Tests for CommentsAnalysis.java
	//findHighestComments() method tests
	@Test
    public void testFindHighestComments1() {
        // Test case 1: Non-empty lists
        List<Double> videoValueInt = Arrays.asList(100.0, 200.0, 150.0);
        List<String> videoTitles = Arrays.asList("Video A", "Video B", "Video C");
        assertEquals("Video B", CommentsAnalysis.findHighestComments(videoValueInt, videoTitles));
	}
	@Test
	public void testFindHighestComments2() {
        // Test case 2: Both lists are empty
        List<Double> emptyVideoValueInt = Arrays.asList();
        List<String> emptyVideoTitles = Arrays.asList();
        assertEquals(null, CommentsAnalysis.findHighestComments(emptyVideoValueInt, emptyVideoTitles));
	}

	@Test
	public void testFindHighestComments3() {
        // Test case 3: Single-element lists
        List<Double> singleElementVideoValueInt = Arrays.asList(42.0);
        List<String> singleElementVideoTitles = Arrays.asList("Video Z");
        assertEquals("Video Z", CommentsAnalysis.findHighestComments(singleElementVideoValueInt, singleElementVideoTitles));
	}
	
	@Test
	public void testFindHighestComments4() {
		// Test case 4: videoValueInt is empty
        List<Double> emptyVideoValueInt = Arrays.asList();
        List<String> nonEmptyVideoTitles = Arrays.asList("Video X", "Video Y", "Video Z");
        assertEquals(null, CommentsAnalysis.findHighestComments(emptyVideoValueInt, nonEmptyVideoTitles));
	}
	
	@Test
	public void testFindHighestComments5() {
		// Test case 5: videoTitles is empty
        List<Double> nonEmptyVideoValueInt = Arrays.asList(100.0, 200.0, 150.0);
        List<String> emptyVideoTitles = Arrays.asList();
        assertEquals(null, CommentsAnalysis.findHighestComments(nonEmptyVideoValueInt, emptyVideoTitles));
	}
	
	//analyseCommentsBarGraph() method tests
	@Test
    public void testAnalyseCommentsBarGraph1() {
        // Test case 1: Valid dataset provided
        DefaultCategoryDataset validDataSet = new DefaultCategoryDataset();
        validDataSet.addValue(10, "Category1", "Video1");
        validDataSet.addValue(15, "Category1", "Video2");
        validDataSet.addValue(20, "Category1", "Video3");
        CommentsAnalysis ca = new CommentsAnalysis();
        assertEquals("Graph generated successfully!", ca.analyseCommentsBarGraph(validDataSet));
 }
	@Test
	public void testAnalyseCommentsBarGraph2() {
		 // Test case 2: Empty dataset provided
      //  DefaultCategoryDataset emptyDataSet = null;
        DefaultCategoryDataset emptyDataSet = new DefaultCategoryDataset();
        CommentsAnalysis ca = new CommentsAnalysis();
        assertEquals("Empty dataset", ca.analyseCommentsBarGraph(emptyDataSet));
	}
	
	//Tests for CommentsAnalysis.java
	//findLongestVideo() method tests
	
	@Test
    public void testFindLongestVideo1() {
        // Test case 1: Valid input with non-empty list
        List<Double> videoValueInt1 = Arrays.asList(10.0, 15.5, 20.0, 18.5);
        assertEquals(20.0, durationAnalysis.findLongestVideo(videoValueInt1));
	}
	
	@Test
    public void testFindLongestVideo2() {
		// Test case 2: Valid input with a single-element list
        List<Double> singleElementList = Arrays.asList(42.0);
        assertEquals(42.0, durationAnalysis.findLongestVideo(singleElementList));
	}
	
	@Test
    public void testFindLongestVideo3() {
		// Test case 3: Valid input with an empty list
        List<Double> emptyList = Arrays.asList();
        assertEquals(0.0, durationAnalysis.findLongestVideo(emptyList));
	}
	
	@Test
    public void testFindLongestVideo4() {
		// Test case 4: Null input
        List<Double> nullList = null;
        assertEquals(0.0, durationAnalysis.findLongestVideo(nullList));
	}
	
	//analyseDurationBarGraph() method tests
	 @Test
	    public void testAnalyseDurationBarGraph1() {
		// Test case 1: Valid input with non-empty dataset
	        DefaultCategoryDataset validDataSet = new DefaultCategoryDataset();
	        validDataSet.addValue(10.0, "Category1", "Video1");
	        validDataSet.addValue(15.5, "Category1", "Video2");
	        validDataSet.addValue(20.0, "Category1", "Video3");
	        
	        durationAnalysis da = new durationAnalysis();
	        assertEquals("Graph generated successfully!", da.analyseDurationBarGraph(validDataSet));
	 }
	 @Test
	    public void testAnalyseDurationBarGraph2() {
		// Test case 2: Empty dataset provided
	        DefaultCategoryDataset emptyDataSet = new DefaultCategoryDataset();
	        durationAnalysis da = new durationAnalysis();
	        assertEquals("Empty dataset", da.analyseDurationBarGraph(emptyDataSet));
	 }
	 
	//Tests for databaseConnection.java
	//databaseConnectionMethod() method tests
	 
	 @Test
	    public void testDatabaseConnectionMethod1() {
	        // Test case 1: Connecting to a valid table
	        String tableName = "comments";
	        try {
	            ResultSet resultSet = databaseConnection.databaseConnectionMethod(tableName);
	            assertNotNull(resultSet);
	        } catch (SQLException e) {	 
	        	fail("Unexpected SQLException: " + e.getMessage());
	        }
	    }
	 
	  @Test
	    public void testDatabaseConnectionMethod2() {
	        // Test case 2: Connecting to an invalid table, it'll throw an exception but it is handled
	        String tableName = "abc";
	        try {
	            ResultSet resultSet = databaseConnection.databaseConnectionMethod(tableName);
	            assertEquals("es",resultSet);
	        } catch (SQLException e) {		        	
	        }
	  }
	  
		//Tests for fetchData.java
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
	        // Test case 2: Null ResultSet
	        List<String> result = fetchData.fetchDataMethod(null);

	        assertNull(result);
	  }
	  
	  @Test
	    public void testFetchDataMethod3() throws SQLException {
	        // Test case 3: Valid ResultSet with data
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
	  
	//Tests for CommentSentimentAnalysis.java
	//sentimentAnalysisGraph() method tests
	  
	  @Test
	    public void testSentimentAnalysisGraph1() {
	        // Test case 1: Empty dataset
	        DefaultPieDataset dataSet = new DefaultPieDataset();	      
	        CommentSentimentAnalysis csa = new CommentSentimentAnalysis();	       
	        assertEquals("Empty dataset", csa.sentimentAnalysisGraph(dataSet));
	    }
	  
	  @Test
	    public void testSentimentAnalysisGraph2() {
	        // Test case 2: Valid dataset with non-zero values
	        DefaultPieDataset dataSet = new DefaultPieDataset();
	        dataSet.setValue("Negative", 10);
	        dataSet.setValue("Positive", 20);
	        dataSet.setValue("Very Positive", 5);
	        dataSet.setValue("Neutral", 15);

	        CommentSentimentAnalysis csa = new CommentSentimentAnalysis();
	        String result = csa.sentimentAnalysisGraph(dataSet);

	        assertEquals("Piechart generated successfully!", result);
	    }

	  //analyseComments() method tests in sentimentAnalysisBlackBoxTest.java
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
		  
		  
		  //StoreResultSet() method tests

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
}
	  
	  



