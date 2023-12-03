package youtubeAnalysis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.jfree.chart.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;


public class durationAnalysis extends JFrame {	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		ResultSet results = databaseConnection.databaseConnectionMethod("duration");		
		
		//Fetching and storing data from database
		fetchData.fetchDataMethod(results);	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					durationAnalysis frame = new durationAnalysis();
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
	public durationAnalysis() {
		setResizable(false);
		setTitle("Duration Analysis");
		
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
		
		//Creating data set for the line chart
		
		DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
		for(int i=0; i<fetchData.videoTitles.size();i++) {						
			dataSet.addValue(fetchData.videoValueInt.get(i),fetchData.videoValue.get(i),fetchData.videoTitles.get(i));		
			}
		
	
		//Creating the bar chart
		
		JFreeChart barChart = ChartFactory.createStackedBarChart3D("Bar Graph of video's Duration", "Videos", "Duration (in minutes)", dataSet,PlotOrientation.VERTICAL, true, true, false);
		
		CategoryPlot plot1 = barChart.getCategoryPlot();		 
		plot1.setBackgroundPaint(Color.WHITE);
		plot1.setRangeGridlinePaint(Color.black);	
		
		BarRenderer barrenderer = (BarRenderer) plot1.getRenderer();		
		Color clr = new Color(250, 255 ,51);
		barrenderer.setSeriesPaint(0,clr);
		
		//Creating the panel to display the bar graph
		ChartPanel chartPanel1 = new ChartPanel(barChart);	
		chartPanel1.setVisible(true);		
		panel.add(chartPanel1,BorderLayout.CENTER);		
	}

}
