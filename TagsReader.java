import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagsReader {

    public static Map<String, Integer> tallyTagsFromFile(String filePath) {
        Map<String, Integer> tagCounts = new LinkedHashMap<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            StringBuilder jsonContent = new StringBuilder();
            while (scanner.hasNextLine()) {
                jsonContent.append(scanner.nextLine());
            }
            Pattern pattern = Pattern.compile("\"tags\"\\s*:\\s*\\[([^\\]]*)\\]");
            Matcher matcher = pattern.matcher(jsonContent);

            if (matcher.find()) {
                String tagsArray = matcher.group(1);

                String[] tagTokens = tagsArray.split(",");
                for (String token : tagTokens) {
                    String tag = token.trim().replaceAll("\"", "");
                    tagCounts.put(tag, tagCounts.getOrDefault(tag, 0) + 1);
                }

                System.out.println("Tag Counts: " + tagCounts);
            } else {
                System.out.println("No 'tags' array found in the JSON file.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
        }

        return tagCounts;
    }

    public static void main(String[] args) {
        String jsonFilePath = "C:\\Users\\gwils\\OneDrive\\Desktop\\video_data.json";
        Map<String, Integer> tagCounts = tallyTagsFromFile(jsonFilePath);
    }
}