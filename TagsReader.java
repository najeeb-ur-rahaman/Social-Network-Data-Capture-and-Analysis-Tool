package Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

public class TagsReader {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testingtestingtesting";
    private static final String JDBC_USER = "George";
    private static final String JDBC_PASSWORD = "George02!";
    public static Map<String, Integer> tallyTagsFromDatabase() {
        Map<String, Integer> tagCounts = new LinkedHashMap<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "SELECT tags FROM video_data";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String tags = resultSet.getString("tags");
                        if (tags != null) {
                            String[] tagTokens = tags.split(",");
                            for (String token : tagTokens) {
                                String tag = token.trim().replaceAll("\"", "");
                                tagCounts.put(tag, tagCounts.getOrDefault(tag, 0) + 1);
                            }
                        }
                    }
                }
            }

            System.out.println("Tag Counts: " + tagCounts);
        } catch (SQLException e) {
            System.err.println("Error accessing the database: " + e.getMessage());
        }

        return tagCounts;
    }

    public static void main(String[] args) {
        Map<String, Integer> tagCounts = tallyTagsFromDatabase();
    }
}
