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
    
    //mutated
    public static Map<String, Integer> tallyTagsFromDatabaseMutated() {
        Map<String, Integer> tagCounts_mutated = new LinkedHashMap<>();

        try (Connection connection_mutated = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query_mutated = "SELECT tags FROM video_data";
            try (PreparedStatement statement_mutated = connection_mutated.prepareStatement(query_mutated)) {
                try (ResultSet resultSet_mutated = statement_mutated.executeQuery()) {
                    while (resultSet_mutated.next()) {
                        String tags_mutated = resultSet_mutated.getString("tags");
                        if (tags_mutated != null) {
                            String[] tagTokens_mutated = tags_mutated.split(";");  // Introduce mutation by changing the delimiter
                            for (String token_mutated : tagTokens_mutated) {
                                String tag_mutated = token_mutated.trim().replaceAll("\"", "");
                                tagCounts_mutated.put(tag_mutated, tagCounts_mutated.getOrDefault(tag_mutated, 0) + 1);
                            }
                        }
                    }
                }
            }

            System.out.println("Tag Counts (Mutated): " + tagCounts_mutated);
        } catch (SQLException e_mutated) {
            System.err.println("Error accessing the database (Mutated): " + e_mutated.getMessage());
        }

        return tagCounts_mutated;
	}
}
