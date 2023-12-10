package svj4.sanjay.javaFiles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.BasicConfigurator;
import org.jfree.chart.*;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class CommentSentimentAnalysis extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static List<String> videoTitles=new ArrayList<>();
	public static List<String> videoComments=new ArrayList<>();
	public static List<String> videoViews=new ArrayList<>();
	public static List<Double> videoViewsDouble=new ArrayList<>();
	static Double highestViews = 0.0;
	static String highestViewsComments="";
	static String highestVideoTitle="";	
	public static int negative=0;
	public static int positive=0;
	public static int veryPositive=0;
	public static int neutral=0;

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		BasicConfigurator.configure();
		//Connecting to database
				ResultSet results = databaseConnection.databaseConnectionMethod("sentimentAnalysis");			
				
				//Storing the resultset in appropriate variables to perform operations on them
				storeResultSet(results);
				
				//Finding out which video has the highest views				
				highestViewsVideo(videoViewsDouble);		 		
				
				//Fetching the pipeline for NLP functions
				StanfordCoreNLP coreNLP = Pipeline.fetchPipeline();
				
				CoreDocument cd = new CoreDocument(highestViewsComments);
				
				coreNLP.annotate(cd);
				
				List <CoreSentence> lines = cd.sentences();
				
				analyseComments(lines);
				
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CommentSentimentAnalysis frame = new CommentSentimentAnalysis();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CommentSentimentAnalysis() {
		//Creating a dataset to store and feed data to the bar chart
		DefaultPieDataset dataSet=new DefaultPieDataset();
		sentimentAnalysisGraph(dataSet);
	}
	
	public static String storeResultSet(ResultSet results) throws SQLException {
		
		while(results.next())
		{
			videoTitles.add(results.getString(1));
			videoComments.add(results.getString(2));
			videoViews.add(results.getString(3));
		}
		
		for(String myDouble : videoViews) {
		      videoViewsDouble.add(Double.valueOf(myDouble));    
		}
		if(videoTitles.isEmpty()==false) {
			return "Stored Successfully";
			}
			else {
				return null;
			}
	}
	
	public String sentimentAnalysisGraph(DefaultPieDataset dataSet) {
		setResizable(false);
		setTitle("Sentiment Analysis");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 766, 443);
		contentPane.add(panel);
	
		if(negative!=0) {
		dataSet.setValue("Negative", negative);
		}
		if(positive!=0) {
		dataSet.setValue("Positive", positive);
		}
		if(veryPositive!=0) {
		dataSet.setValue("Very Positive", veryPositive);
		}
		if(neutral!=0) {
		dataSet.setValue("Neutral", neutral);
		}
		
		//Creating the pie chart
		JFreeChart piechart = ChartFactory.createPieChart("Sentiment Analysis of comments of: "+highestVideoTitle, dataSet ,true, true, false);
		
		PiePlot plot = (PiePlot) piechart.getPlot();
		plot.setBackgroundPaint(Color.WHITE);
		
		//Creating the panel to display the bar graph
		ChartPanel chartPanel1 = new ChartPanel(piechart, true);		
		chartPanel1.setVisible(true);
		panel.add(chartPanel1,BorderLayout.CENTER);
		chartPanel1.setLayout(new BorderLayout(0, 0));
		
		if(dataSet.getItemCount()!=0) {
			return "Piechart generated successfully!";
			}
			else
			{
				return "Empty dataset";
			}
	}
	
	//Method to find out which video has the highest views	
		public static double highestViewsVideo(List <Double> videoViewsDouble) {
		
			highestViews = videoViewsDouble.get(0);
			for(int i=1; i<videoViewsDouble.size();i++) {
				 if(highestViews < videoViewsDouble.get(i)) {
					 highestViews = videoViewsDouble.get(i);
					 highestViewsComments = videoComments.get(i);
					 highestVideoTitle = videoTitles.get(i);
				 }		
			} 
			
			if(videoViewsDouble.isEmpty()==false) {
			return highestViews ;
			}
			else {
				return 0.0;
			}
		}
		
		//Method for analyzing comments
		public static String analyseComments(List <CoreSentence> lines) {
			String sentiments = "";
			for(CoreSentence line : lines) {					
				
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
				sentiments = line.sentiment();
				//return line.sentiment();
			}			
			if(sentiments.isEmpty()==false)
			{
				return sentiments;
			}
			else {
				return "Empty";
			}
		}
}
