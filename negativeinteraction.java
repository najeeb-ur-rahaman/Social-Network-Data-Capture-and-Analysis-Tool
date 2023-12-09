package Final;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class negativeinteraction extends ApplicationFrame {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testingtestingtesting";
    private static final String JDBC_USER = "George";
    private static final String JDBC_PASSWORD = "George02!";

    public negativeinteraction(String title) {
        super(title);
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "SELECT DATE_FORMAT(timestamp_column, '%H:%i') AS time_interval, " +
                    "SUM(like_count) AS total_likes, " +
                    "SUM(dislike_count) AS total_dislikes, " +
                    "SUM(view_duration) AS total_view_duration " +
                    "FROM video_data " +
                    "GROUP BY time_interval";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String timeInterval = resultSet.getString("time_interval");
                        int totalLikes = resultSet.getInt("total_likes");
                        int totalDislikes = resultSet.getInt("total_dislikes");
                        int totalViewDuration = resultSet.getInt("total_view_duration");

                        // Calculate the dislike ratio
                        double dislikeRatio = (totalLikes + totalDislikes != 0) ?
                                (double) totalDislikes / (totalLikes + totalDislikes) : Double.POSITIVE_INFINITY;

                        dataset.addValue(dislikeRatio, "Dislike Ratio", timeInterval);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createLineChart(
                "Dislike Ratio Over Time Intervals",
                "Time Intervals",
                "Dislike Ratio",
                dataset
        );

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryMargin(0.25);

        return chart;
    }

    public static void main(String[] args) {
        negativeinteraction chart = new negativeinteraction("Dislike Ratio Over Time Intervals");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }
}
