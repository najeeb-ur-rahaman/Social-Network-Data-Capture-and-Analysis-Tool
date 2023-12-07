package com.sanjay.nlp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import youtubeAnalysis.databaseConnection;


public class CommentsSentimentAnalysis {
	static List<String> videoTitles=new ArrayList<>();
	static List<String> videoComments=new ArrayList<>();
	static List<String> videoViews=new ArrayList<>();
	static List<Double> videoViewsDouble=new ArrayList<>();
	static Double highestViews = 0.0;
	static String highestViewsComments="";
	static String highestVideoTitle="";	
	static int negative=0;
	static int positive=0;
	static int veryPositive=0;
	static int neutral=0;	
	
	
	public static void main(String[] args) throws SQLException {
		BasicConfigurator.configure();
		
		
		//Connecting to database
		ResultSet results = databaseConnection.databaseConnectionMethod("sentimentAnalysis");			
		
		//Storing the resultset in appropriate variables to perform operations on them
		while(results.next())
		{
			videoTitles.add(results.getString(1));
			videoComments.add(results.getString(2));
			videoViews.add(results.getString(3));
		}
		
		for(String myDouble : videoViews) {
			videoViewsDouble.add(Double.valueOf(myDouble));
		}	
		
		//Finding out which video has the highest views
		highestViews = videoViewsDouble.get(0);
		highestViewsVideo();		 		
		 System.out.println(highestVideoTitle+" "+highestViews+" "+highestViewsComments);

		//Fetching the pipeline for NLP functions
		StanfordCoreNLP coreNLP = Pipeline.fetchPipeline();
		
		CoreDocument cd = new CoreDocument(highestViewsComments);
		
		coreNLP.annotate(cd);
		
		List <CoreSentence> lines = cd.sentences();
		
		for(CoreSentence line : lines) {
			String sentiments = line.sentiment();			
			System.out.println(sentiments + " " + line);
			
			if(line.sentiment().contentEquals("Negative")==true) {
				negative++;
			}
			
			else if(line.sentiment().contentEquals("Positive")==true) {
				positive++;
			}
			
			else if(line.sentiment().contentEquals("Very positive")==true) {
				veryPositive++;
			}
			
			else if(line.sentiment().contentEquals("neutral")==true) {
				neutral++;
			}
		}
		
		System.out.println("Negative: "+negative + "Positive:"+positive + "Very positive: "+veryPositive+"Neutral: "+neutral);
		
	}
	
	//Function to find out which video has the highest views	
	public static String highestViewsVideo() {
		for(int i=0; i<videoTitles.size();i++) {			 
			 if(highestViews < videoViewsDouble.get(i)) {
				 highestViews = videoViewsDouble.get(i);
				 highestViewsComments = videoComments.get(i);
				 highestVideoTitle = videoTitles.get(i);
			 }		
		} 
		return "Highest views video: " +highestVideoTitle ;
	}
	
	public static String analyseComments() {
		
		
		
		return "";
	}

}
