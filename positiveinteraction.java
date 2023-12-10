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
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class positiveinteraction {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testingtestingtesting";
    private static final String JDBC_USER = "George";
    private static final String JDBC_PASSWORD = "George02!";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }
    private static void createAndShowGui() {
        JFrame frame = new JFrame("Video with Most Likes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(1200, 800));
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "SELECT title, like_count FROM video_data ORDER BY like_count DESC LIMIT 5";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String title = resultSet.getString("title");
                        int likeCount = resultSet.getInt("like_count");

                        dataset.addValue(likeCount, "Likes", title);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataset;
    }
    private static JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Top 5 Videos with Most Likes",
                "Videos",
                "Likes",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryMargin(0.5);
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setItemMargin(0.1);
        return chart;
    }
    //mutated version 
    public static CategoryDataset createMutatedDataset() {
        DefaultCategoryDataset mutatedDataset = new DefaultCategoryDataset();
        try (Connection mutatedConnection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String mutatedQuery = "SELECT title, like_count FROM video_data ORDER BY like_count DESC LIMIT 5";
            try (PreparedStatement mutatedStatement = mutatedConnection.prepareStatement(mutatedQuery)) {
                try (ResultSet mutatedResultSet = mutatedStatement.executeQuery()) {
                    while (mutatedResultSet.next()) {
                        String mutatedTitle = mutatedResultSet.getString("title");
                        int mutatedLikeCount = mutatedResultSet.getInt("like_count");

                        mutatedDataset.addValue(mutatedLikeCount, "Mutated Likes", mutatedTitle);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mutatedDataset;
    }
}
