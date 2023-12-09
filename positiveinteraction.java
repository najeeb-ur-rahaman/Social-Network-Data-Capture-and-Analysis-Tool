package sprint2;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class positiveinteraction extends JFrame {

    public positiveinteraction(String title) {
        super(title);
        XYSeries shortSeries = readDataFromJSON("C:\\Users\\gwils\\OneDrive\\Desktop\\filter data 2.json", 5);
        XYSeries longSeries = readDataFromJSON("C:\\Users\\gwils\\OneDrive\\Desktop\\filter data 2.json", Double.MAX_VALUE);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(shortSeries);
        dataset.addSeries(longSeries);
        JFreeChart chart = ChartFactory.createTimeSeriesChart(
                "Positive Interaction Trend for Short and Long Posts",
                "Date",
                "Number of Likes",  // Update y-axis label
                dataset,
                false,
                true,
                false
        );
        XYPlot plot = (XYPlot) chart.getPlot();
        DateAxis dateAxis = (DateAxis) plot.getDomainAxis();
        dateAxis.setDateFormatOverride(new SimpleDateFormat("yyyy-MM-dd"));
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }

    private XYSeries readDataFromJSON(String filePath, double durationThreshold) {
        XYSeries series = new XYSeries(durationThreshold == Double.MAX_VALUE ? "Long Posts" : "Short Posts");
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(filePath));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray filters = (JSONArray) jsonObject.get("filters");
            for (Object filterObj : filters) {
                JSONObject filter = (JSONObject) filterObj;
                String dateString = (String) filter.get("publishedAt");
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
                long numberOfLikes = (Long) filter.get("likeCount");  // Update to likeCount
                String durationString = (String) filter.get("duration");
                double duration = getDurationInSeconds(durationString);
                if ((durationThreshold == Double.MAX_VALUE && duration > durationThreshold) ||
                        (durationThreshold != Double.MAX_VALUE && duration <= durationThreshold)) {
                    series.add(date.getTime(), numberOfLikes);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return series;
    }

    private double getDurationInSeconds(String durationString) {
        String[] tokens = durationString.split("PT");
        int minutes = tokens[1].contains("M") ? Integer.parseInt(tokens[1].split("M")[0]) : 0;
        int seconds = tokens[1].contains("S") ? Integer.parseInt(tokens[1].split("S")[0]) : 0;
        return minutes * 60 + seconds;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            positiveinteraction example = new positiveinteraction("Positive Interaction Trend for Short and Long Posts");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
