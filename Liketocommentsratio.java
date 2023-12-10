package Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

public class Liketocommentsratio {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testingtestingtesting";
    private static final String JDBC_USER = "George";
    private static final String JDBC_PASSWORD = "George02!";

    public static void main(String[] args) {
        try {
            ratio();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void ratio() throws SQLException {
        DecimalFormat ratioFormat = new DecimalFormat("#.#");
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "SELECT id, title, like_count, comment_count FROM video_data";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String title = resultSet.getString("title");
                        int likes = resultSet.getInt("like_count");
                        int comments = resultSet.getInt("comment_count");
                        double ratio = (comments != 0) ? (double) likes / comments : Double.POSITIVE_INFINITY;
                        String formattedRatio = ratioFormat.format(ratio);
                        System.out.println("Video Title: " + title);
                        System.out.println("Ratio of likes to comments: " + formattedRatio);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
