package Final;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import static org.junit.Assert.assertNotNull;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MostPopular {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testingtestingtesting";
    private static final String JDBC_USER = "George";
    private static final String JDBC_PASSWORD = "George02!";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }

    public static void createAndShowGui() {
        JFrame frame = new JFrame("Like-to-View Ratio Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        frame.setContentPane(chartPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "SELECT title, like_count, view_count FROM video_data";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String title = resultSet.getString("title");
                        int likeCount = resultSet.getInt("like_count");
                        int viewCount = resultSet.getInt("view_count");
                        double likeToViewRatio = (viewCount != 0) ? (double) likeCount / viewCount : Double.POSITIVE_INFINITY;
                        dataset.addValue(likeToViewRatio, "Like to View Ratio", title);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }

    public static JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Like to View Ratio Comparison",
                "Videos",
                "Ratio",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryMargin(0.25);

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setItemMargin(0.05);

        return chart;
    }
    //mutaded ver 
    public static CategoryDataset createMutatedDataset() {
        DefaultCategoryDataset mutatedCategoryDataset = new DefaultCategoryDataset();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "SELECT title, like_count, view_count FROM video_data";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String title = resultSet.getString("title");
                        title = null;
                        int likeCount = resultSet.getInt("like_count");
                        int viewCount = resultSet.getInt("view_count");
                        double likeToViewRatio = (viewCount != 0) ? (double) likeCount / viewCount : Double.POSITIVE_INFINITY;
                        mutatedCategoryDataset.addValue(likeToViewRatio, "Like to View Ratio", title);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mutatedCategoryDataset;
    }
    
}
