import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PopularPostsChart {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Popular Posts Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create chart panel
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(800, 600));
        frame.getContentPane().add(chartPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private static JFreeChart createChart(CategoryDataset dataset) {
        return ChartFactory.createBarChart(
                "Most Popular Posts by Likes",
                "Post ID",
                "Likes",
                dataset
        );
    }
    private static CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try (Scanner scanner = new Scanner(new File("\"C:\\Users\\gwils\\OneDrive\\Desktop\\video_data.json\""))) {
            StringBuilder jsonContent = new StringBuilder();

            // Read the entire JSON file into a StringBuilder
            while (scanner.hasNextLine()) {
                jsonContent.append(scanner.nextLine());
            }

            // Assuming the JSON structure includes post data with "postId" and "likes" properties
            String regex = "\"postId\"\\s*:\\s*\"(.*?)\".*?\"likes\"\\s*:\\s*(\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(jsonContent);

            while (matcher.find()) {
                String postId = matcher.group(1);
                int likes = Integer.parseInt(matcher.group(2));

                // Add data to the dataset
                dataset.addValue(likes, "Likes", postId);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return dataset;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(PopularPostsChart::createAndShowGUI);
    }
}
