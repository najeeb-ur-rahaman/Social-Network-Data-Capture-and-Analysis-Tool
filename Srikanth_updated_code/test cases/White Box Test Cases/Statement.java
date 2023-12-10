package com.sv219.Srikanth_Voruganti;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.TestDataProvider;
import org.testng.annotations.TestFactory;

import java.util.ArrayList;
import java.util.List;

public class YouTubeVideoTest {

    private YouTube youtube;

    @BeforeClass
    public void setup() {
        // Initialize YouTube API client
        youtube = new YouTube.LifeCycle();
    }

    @AfterClass
    public void tearDown() {
        // Clean up YouTube API client
        youtube.close();
    }

    @Test
    public void testGetVideoInfo() {
        // Test case: Get video info for a valid video ID
        String videoId = "YOUR_VIDEO_ID_HERE";
        Video video = youtube.getVideo(videoId);
        assert video != null;
        assert video.getId() != null;
        assert video.getTitle() != null;
        assert video.getDuration() != null;
        assert video.getViewCount() != null;
        assert video.getLikeCount() != null;
        assert video.getDislikeCount() != null;
        assert video.getFavoriteCount() != null;
        assert video.getCommentCount() != null;
    }

    @Test
    public void testGetVideoInfo_InvalidVideoId() {
        // Test case: Get video info for an invalid video ID
        String videoId = "Invalid video ID";
        Video video = youtube.getVideo(videoId);
        assert video == null;
    }

    @Test
    public void testGetVideoInfo_VideoPrivate() {
        // Test case: Get video info for a private video
        String videoId = "YOUR_PRIVATE_VIDEO_ID_HERE";
        Video video = youtube.getVideo(videoId);
        assert video != null;
        assert video.getId() != null;
        assert video.getTitle() != null;
        assert video.getDuration() != null;
        assert video.getViewCount() != null;
        assert video.getLikeCount() != null;
        assert video.getDislikeCount() != null;
        assert video.getFavoriteCount() != null;
        assert video.getCommentCount() != null;
    }

    @Test
    public void testGetVideoInfo_VideoDeleted() {
        // Test case: Get video info for a deleted video
        String videoId = "YOUR_DELETED_VIDEO_ID_HERE";
        Video video = youtube.getVideo(videoId);
        assert video == null;
    }

    @Test
    public void testGetVideoInfo_ChannelId() {
        // Test case: Get video info for a channel ID
        String channelId = "YOUR_CHANNEL_ID_HERE";
        List<Video> videos = youtube.getVideos(channelId);
        assert videos != null;
        for (Video video : videos) {
            assert video != null;
            assert video.getId() != null;
            assert video.getTitle() != null;
            assert video.getDuration() != null;
            assert video.getViewCount() != null;
            assert video.getLikeCount() != null;
            assert video.getDislikeCount() != null;
            assert video.getFavoriteCount() != null;
            assert video.getCommentCount() != null;
        }
    }

    @Test
    public void testGetVideoInfo_ChannelId_Invalid() {
        // Test case: Get video info for an invalid channel ID
        String channelId = "Invalid channel ID";
        List<Video> videos = youtube.getVideos(channelId);
        assert videos == null;
    }

    @Test
    public void testGetVideoInfo_ChannelId_Private() {
        // Test case: Get video info for a private channel
        String channelId = "YOUR_PRIVATE_CHANNEL_ID_HERE";
        List<Video> videos = youtube.getVideos(channelId);
        assert videos != null;
        for (Video video : videos) {
            assert video != null;
            assert video.getId() != null;
            assert video.getTitle() != null;
            assert video.getDuration() != null;
            assert video.getViewCount() != null;
            assert video.getLikeCount() != null;
            assert video.getDislikeCount() != null;
            assert video.getFavoriteCount() != null;
            assert video.getCommentCount() != null;
        }
    }

    @Test
    public void testGetVideoInfo_ChannelId_Deleted() {
        // Test case: Get video info for a deleted channel
        String channelId = "YOUR_DELETED_CHANNEL_ID_HERE";
        List<Video> videos = youtube.getVideos(channelId);
        assert videos == null;
    }

    @DataProvider(name = "videoData")
    public Object[][] videoData() {
        return new Object[][] {
                { "YOUR_VIDEO_ID_HERE", "YOUR_CHANNEL_ID_HERE" },
                { "YOUR_VIDEO_ID_HERE", "YOUR_CHANNEL_ID_HERE" },
                { "YOUR_VIDEO_ID_HERE", "YOUR_CHANNEL_ID_HERE" }
        };
    }

    @Test(dataProvider = "videoData")
    public void testGetVideoInfo_MultipleVideos(String videoId, String channelId) {
        // Test case: Get video info for multiple videos
        List<Video> videos = youtube.getVideos(videoId, channelId);
        assert videos != null;
        for (Video video : videos) {
            assert video != null;
            assert video.getId() != null;
            assert video.getTitle() != null;
            assert video.getDuration() != null;
            assert video.getViewCount() != null;
            assert video.getLikeCount() != null;
            assert video.getDislikeCount() != null;
            assert video.getFavoriteCount() != null;
            assert video.getCommentCount() != null;
        }
    }
}
