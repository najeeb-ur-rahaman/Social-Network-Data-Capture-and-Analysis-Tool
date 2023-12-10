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
        chartPanel.setPreferredSize(new java.awt.Dimension(1200, 800));
        setContentPane(chartPanel);
    }
    public static CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "SELECT id, title, like_count, dislike_count FROM video_data";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String videoTitle = resultSet.getString("title");
                        int totalLikes = resultSet.getInt("like_count");
                        int totalDislikes = resultSet.getInt("dislike_count");
                        System.out.println("Title: " + videoTitle + ", Likes: " + totalLikes + ", Dislikes: " + totalDislikes);

                        double dislikeRatio = (totalLikes + totalDislikes != 0) ?
                                (double) totalDislikes / (totalLikes + totalDislikes) : Double.POSITIVE_INFINITY;

                        dataset.addValue(dislikeRatio, "Dislike Ratio", videoTitle);
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
                "Dislike Ratio per Video",
                "Videos",
                "Dislike Ratio",
                dataset
        );
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryMargin(0.8);
        return chart;
    }

    public static void main(String[] args) {
        negativeinteraction chart = new negativeinteraction("Dislike Ratio Per Video");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }
    public static CategoryDataset MutatedcreateDataset() {
        DefaultCategoryDataset mutatedCategoryDataset = new DefaultCategoryDataset();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "SELECT id, title, like_count, dislike_count FROM video_data";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String videoTitle = resultSet.getString("title");
                        int totalLikes = resultSet.getInt("like_count");
                        int totalDislikes = resultSet.getInt("dislike_count");
                        System.out.println("Title: " + videoTitle + ", Likes: " + totalLikes + ", Dislikes: " + totalDislikes);
                        double dislikeRatio = (totalLikes + totalDislikes != 0) ?
                                (double) totalLikes / (totalLikes + totalDislikes) : Double.POSITIVE_INFINITY;
                        mutatedCategoryDataset.addValue(dislikeRatio, "Dislike Ratio", videoTitle);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mutatedCategoryDataset;
    }

}
