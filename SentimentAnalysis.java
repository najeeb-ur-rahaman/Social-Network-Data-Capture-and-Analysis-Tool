import edu.stanford.nlp.simple.Document;
import edu.stanford.nlp.simple.Sentence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SentimentAnalysis {

    public static void main(String[] args) {
        String jsonFilePath = "\"C:\\Users\\gwils\\OneDrive\\Desktop\\video_data.json\"";

        try {
            LikesData likesData = readLikesData(jsonFilePath);
            if (likesData != null) {
                for (String like : likesData.getLikes()) {
                    String sentiment = analyzeSentiment(like);
                    System.out.println("Sentiment: " + sentiment + " - " + like);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static LikesData readLikesData(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(filePath), LikesData.class);
    }
    private static String analyzeSentiment(String text) {
        Document doc = new Document(text);

        if (!doc.sentences().isEmpty()) {
            Sentence sentence = doc.sentences().get(0);

            int sentimentValue = sentence.sentiment().ordinal();

            switch (sentimentValue) {
                case 0:
                    return "Very Negative";
                case 1:
                    return "Negative";
                case 2:
                    return "Neutral";
                case 3:
                    return "Positive";
                case 4:
                    return "Very Positive";
                default:
                    return "Unknown";
            }
        }

        return "Unknown";
    }
}