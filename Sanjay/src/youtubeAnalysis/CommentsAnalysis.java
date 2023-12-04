package youtubeAnalysis;

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
import java.awt.BorderLayout;
import java.awt.Color;

public class CommentsAnalysis extends JFrame {

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
		ResultSet results = databaseConnection.databaseConnectionMethod("comments");
		
		//Fetching and storing data from database
		fetchData.fetchDataMethod(results);	
		
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
		
		//Background Panel
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 766, 443);
		contentPane.add(panel);
		
		//Creating dataset to feed data to the bar chart
		DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
		
		for(int i=0; i<fetchData.videoTitles.size();i++) {			
		dataSet.addValue(fetchData.videoValueInt.get(i),fetchData.videoValue.get(i),fetchData.videoTitles.get(i));		
		}				
		
		//Creating the bar graph		
		JFreeChart barChart1 = ChartFactory.createBarChart3D("Bar Graph of number of comments", "Videos", "Comments", dataSet,PlotOrientation.VERTICAL, true, true, false);
		
		CategoryPlot plot1 = barChart1.getCategoryPlot();		 
		plot1.setBackgroundPaint(Color.WHITE);
		plot1.setRangeGridlinePaint(Color.black);
		
		BarRenderer barrenderer = (BarRenderer) plot1.getRenderer();		
		Color clr = new Color(250, 255 ,51);
		barrenderer.setSeriesPaint(0,clr);
		
		//Creating the panel to display the bar graph
		ChartPanel chartPanel1 = new ChartPanel(barChart1, true);		
		chartPanel1.setVisible(true);
		panel.add(chartPanel1,BorderLayout.CENTER);
		chartPanel1.setLayout(new BorderLayout(0, 0));		
		
	}
}
