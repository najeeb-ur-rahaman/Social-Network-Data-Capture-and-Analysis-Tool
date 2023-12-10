package testing;

import java.util.ArrayList;
import java.util.List;

public class TestCases {

    public static List<TestCase> getTestCases() {
        List<TestCase> testCases = new ArrayList<>();

        // Test Case 337
        testCases.add(new TestCase(
                "IDOne",
                "2023-12-01",
                "channelOne",
                "titleOne",
                "channelTittleOne",
                0,
                98765432,
                789012,
                1234,
                4,
                345
        ));

        // Test Case 338
        testCases.add(new TestCase(
                "IDOne",
                "2023-12-01",
                "channelOne",
                "titleOne",
                "channelTittleOne",
                0,
                98765432,
                789012,
                1234,
                4,
                1234
        ));

        // Test Case 339
        testCases.add(new TestCase(
                "IDOne",
                "2023-12-01",
                "channelOne",
                "titleOne",
                "channelTittleOne",
                0,
                98765432,
                789012,
                1234,
                4,
                456
        ));

        // Test Case 340
        testCases.add(new TestCase(
                "IDOne",
                "2023-12-01",
                "channelOne",
                "titleOne",
                "channelTittleOne",
                0,
                98765432,
                789012,
                1234,
                2,
                345
        ));

        // Test Case 341
        testCases.add(new TestCase(
                "IDOne",
                "2023-12-01",
                "channelOne",
                "titleOne",
                "channelTittleOne",
                0,
                98765432,
                789012,
                1234,
                2,
                1234
        ));

        // Test Case 342
        testCases.add(new TestCase(
                "IDOne",
                "2023-12-01",
                "channelOne",
                "titleOne",
                "channelTittleOne",
                0,
                98765432,
                789012,
                1234,
                2,
                456
        ));

        // Test Case 343
        testCases.add(new TestCase(
                "IDOne",
                "2023-12-01",
                "channelOne",
                "titleOne",
                "channelTittleOne",
                0,
                98765432,
                789012,
                567890,
                0,
                345
        ));

        // Test Case 344
        testCases.add(new TestCase(
                "IDOne",
                "2023-12-01",
                "channelOne",
                "titleOne",
                "channelTittleOne",
                0,
                98765432,
                789012,
                567890,
                0,
                1234
        ));

        // Test Case 345
        testCases.add(new TestCase(
                "IDOne",
                "2023-12-01",
                "channelOne",
                "titleOne",
                "channelTittleOne",
                0,
                98765432,
                789012,
                567890,
                0,
                456
        ));

        // Test Case 1
        testCases.add(new TestCase(
                "IDOne",
                "2023-12-01",
                "channelOne",
                "titleOne",
                "channelTittleOne",
                0,
                0,
                0,
                0,
                0,
                345
        ));
        
        testCases.add(new TestCase(
                "ID_ZeroLikes_100Comments",
                "2023-12-01",
                "channelZero",
                "titleZero",
                "channelTitleZero",
                0,
                0,
                0,
                100,
                0,
                100
        ));

        return testCases;
    }

    public static class TestCase {
        public String id;
        public String publishedAt;
        public String channelId;
        public String title;
        public String channelTitle;
        public int duration;
        public int viewCount;
        public int likeCount;
        public int dislikeCount;
        public int favoriteCount;
        public int commentCount;

        public TestCase(String id, String publishedAt, String channelId, String title, String channelTitle, int duration, int viewCount, int likeCount, int dislikeCount, int favoriteCount, int commentCount) {
            this.id = id;
            this.publishedAt = publishedAt;
            this.channelId = channelId;
            this.title = title;
            this.channelTitle = channelTitle;
            this.duration = duration;
            this.viewCount = viewCount;
            this.likeCount = likeCount;
            this.dislikeCount = dislikeCount;
            this.favoriteCount = favoriteCount;
            this.commentCount = commentCount;
        }
    }
}
