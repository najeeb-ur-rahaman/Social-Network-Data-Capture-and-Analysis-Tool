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

public class LikeGraph extends JFrame {

    public LikeGraph(String title) {
        super(title);

        XYSeries series = readDataFromJSON("C:\\Users\\gwils\\OneDrive\\Desktop\\filter data 2.json");
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createTimeSeriesChart(
                "Like Trend Over Time",
                "Date",
                "Number of Likes",
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

    private XYSeries readDataFromJSON(String filePath) {
        XYSeries series = new XYSeries("Like Trend");

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(filePath));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray filters = (JSONArray) jsonObject.get("filters");

            for (Object filterObj : filters) {
                JSONObject filter = (JSONObject) filterObj;
                String dateString = (String) filter.get("publishedAt");
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
                long numberOfLikes = (Long) filter.get("likeCount");
                series.add(date.getTime(), numberOfLikes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return series;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LikeGraph example = new LikeGraph("Like Trend Graph");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
