package visualising_posts;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class visualising_posts {
    public static void main(String[] args) {
        Map<String, Integer> videoViews = readDataFromFile("makeup_data.txt");

        SwingUtilities.invokeLater(() -> {
            MakeupVideoChart example = new MakeupVideoChart("Makeup Video Views", videoViews);
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }

    private static Map<String, Integer> readDataFromFile(String filePath) {
        Map<String, Integer> videoViews = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String videoName = parts[0].trim();
                    int views = Integer.parseInt(parts[1].trim());
                    videoViews.put(videoName, views);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return videoViews;
    }
}

class MakeupVideoChart extends JFrame {
    public MakeupVideoChart(String title, Map<String, Integer> videoViews) {
        super(title);

        CategoryDataset dataset = createDataset(videoViews);
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(600, 400));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset(Map<String, Integer> videoViews) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Map.Entry<String, Integer> entry : videoViews.entrySet()) {
            dataset.addValue(entry.getValue(), "Views", entry.getKey());
        }

        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {
        return ChartFactory.createBarChart(
                "Makeup Video Views",
                "Video Names",
                "Views",
                dataset
        );
    }
}