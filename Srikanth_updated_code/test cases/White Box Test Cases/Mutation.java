package com.sv219.Srikanth_Voruganti;
import org.junitupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class YouTubeDataTest {
    @Test
    public void testGetVideoInfo() {
        // Test 1: Valid ID
        YouTube youtube = new YouTube();
        Video video = youtube.getVideoInfo("dQw4wgXcQ");
        Assertions.assertEquals("dQw4w9WgXcQ", video.getId());
        Assertions.assertEquals(" Rickrolling with Rick Astley", video.getTitle());

        // Test 2: Invalid ID
        youtube = new YouTube();
        video = youtube.getVideoInfo("Invalid ID");
        Assertions.assertNull(video);

        // Test 3: Non-existent ID
        youtube = new YouTube();
        video = youtube.getVideoInfo("This video does not exist");
        Assertions.assertNull(video);
    }

    @Test
    public void testGetChannelInfo() {
        // Test 1: Valid Channel ID
        YouTubeube = new YouTube();
        Channel channel = youtube.getChannelInfo("UCH5Y54321");
        Assertions.assertEquals("UCH5Y54321", channel.getId());
        Assertions.assertEquals("Rick Astley", channel.getTitle());

        // Test 2: Invalid Channel ID
        youtube = new YouTube();
        channel = youtube.getChannelInfo("Invalid Channel ID");
        Assertions.assertNull(channel);

        // Test 3: Non-existent Channel ID
        youtube = new YouTube();
        channel = youtube.getChannelInfo("This channel does not exist");
        Assertions.assertNull(channel);
    }

    testGetVideoComments() {
        // Test 1: Valid ID
        YouTube youtube = new YouTube();
        List<Comment> comments = youtube.getVideoComments("dQw4w9WgXcQ");
        Assertions.assertEquals(100, comments.size());

        // Test 2: Invalid ID
        youtube = new YouTube();
        comments = youtube.getVideoComments("Invalid ID");
        Assertions.assertNull(comments);

        // Test 3: Non-existent ID
        youtube = new YouTube();
        comments = youtube.getVideoComments("This video does not exist");
        Assertions.assertNull(comments);
    }

    @Test
    public void testGetChannelSubscriptions() {
        // Test 1: Valid Channel ID
        YouTube youtube = new YouTube();
        List<Subscription> subscriptions = youtube.getChannelSubscriptions("UCH5Y54321");
        Assertions.assertEquals(100, subscriptions.size());

        // Test 2: Invalid Channel ID
        youtube = new YouTube();
        subscriptions = youtube.getChannelSubscriptions("Invalid Channel ID");
        Assertions.assertNull(subscriptions);

        // Test 3: Non-existent Channel ID
        youtube = new YouTube();
        subscriptionstube.getChannelSubscriptions("This channel does not exist");
        Assertions.assertNull(subscriptions);
    }

    @Test
    public void testGetVideoLikes() {
        // Test 1: Valid ID
        YouTube youtube = new YouTube();
        int likes = youtube.getVideoLikes("dQw4w9WgXcQ");
        Assertions.assertEquals(100, likes);

        // Test 2: Invalid ID
        youtube = new YouTube();
        likes = youtube.getVideoLikes("Invalid ID");
        Assertions.assertEquals(0, likes);

        // Test 3: Non-existent ID
        youtube = new YouTube();
        likes = youtube.Likes("This video does not exist");
        Assertions.assertEquals(0, likes);
    }

    @Test
    public void testGetVideoDislikes() {
        // Test 1: Valid ID
        YouTube youtube = new YouTube();
        int dislikes = youtube.getVideoDislikes("dQw4w9WgXcQ");
        Assertions.assertEquals(50, dislikes);

        // Test 2: Invalid ID
        youtube = new YouTube();
        dislikes = youtube.getVideoDislikes("Invalid ID");
        Assertions.assertEquals(0, dislikes);

        // Test 3: Non-existent ID
        youtube = new YouTube();
        dislikes = youtube.getVideoDislikes("This video does not exist");
        Assertions.assertEquals(0, dislikes);
    }

    @Test
    public void testGetVideoFavorites() {
        // Test 1: Valid ID
        YouTube youtube = new YouTube();
        int favorites = youtube.getVideoFavorites("dQw4w9WgXcQ");
        Assertions.assertEquals(50, favorites);

        // Test 2: Invalid ID
        youtube = new YouTube();
        favorites = youtube.getVideoFavorites("Invalid ID");
        Assertions.assertEquals(0,);

        // Test 3: Non-existent ID
        youtube = new YouTube();
        favorites = youtube.getVideoFavorites("This video does not exist");
        Assertions.assertEquals(0, favorites);
    }
}
