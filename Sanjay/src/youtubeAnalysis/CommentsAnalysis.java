package youtubeAnalysis;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.BorderLayout;
import java.awt.Color;

public class CommentsAnalysis extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static List<String> videoTitles=new ArrayList<>();
	static List<String> videoComments=new ArrayList<>();
	static List<Integer> videoCommentsInt=new ArrayList<>();

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
		} 
		catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		//Connecting to database
		String databaseUrl="jdbc:sqlserver://LAPTOP-6IA90KVK;databaseName=youtubeApi;"
				+ "integratedSecurity=true;encrypt=true;trustServerCertificate=true";
		Connection myconn=DriverManager.getConnection(databaseUrl);
		Statement statement=myconn.createStatement();
		String myquery="SELECT * FROM comments";
		ResultSet results=statement.executeQuery(myquery);
		
		//Adding the rows to a variable to add into the dataset
		while(results.next())
		{				
			videoTitles.add(results.getString(1)); 
			videoComments.add(results.getString(2));
		}
		for(String myInt : videoComments) {
			videoCommentsInt.add(Integer.valueOf(myInt));
		}		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CommentsAnalysis frame = new CommentsAnalysis();
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
	public CommentsAnalysis() {
		setResizable(false);
		setTitle("Comments Analysis");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 766, 443);
		contentPane.add(panel);
		
		//Creating dataset to feed data to the bar chart
		DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
		
		for(int i=0; i<videoTitles.size();i++) {			
		dataSet.addValue(videoCommentsInt.get(i),videoComments.get(i),videoTitles.get(i));		
		}				
		
		//Creating the bar graph		
		JFreeChart barChart1 = ChartFactory.createBarChart("Bar Graph of number of comments", "Videos", "Views", dataSet,PlotOrientation.VERTICAL, true, true, false);
		
		CategoryPlot plot1 = barChart1.getCategoryPlot();
		plot1.setRangeGridlinePaint(Color.black);
		
		//Creating the panel to display the bar graph
		ChartPanel chartPanel1 = new ChartPanel(barChart1, true);		
		chartPanel1.setVisible(true);
		panel.add(chartPanel1,BorderLayout.CENTER);
		chartPanel1.setLayout(new BorderLayout(0, 0));		
		
	}
}
