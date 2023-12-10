package com.sv219.Srikanth_Voruganti;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class YouTubeVideoTest {
    @Test
    public void testVideoInfo() {
        // Test 1: Video ID
        String videoID = "1234567890";
        YouTube = new YouTubeVideo(videoID);
        Assertions.assertEquals(videoID, video.getId());

        // Test 2: Published Date
        String publishedDate = "2022-01-01";
        video.setPublishedDate(publishedDate);
        Assertions.assertEquals(publishedDate, video.getPublishedDate());

        // Test 3: Channel ID
        String channelID = "UCH8H5XY6B86BIhC883Qw_T52A";
        video.setChannelId(channelID);
        Assertions.assertEquals(channelID, video.getChannelId());

        // Test 4: Title
        String title = "How to train your dragon";
        video.setTitle(title);
        Assertions.assertEquals(title, video.getTitle());

        // Test 5: Channel Title
        String channelTitle = "Movie Trailers";
        video.setChannelTitle(channelTitle);
        Assertions.assertEquals(channelTitle, video.getChannelTitle());

        // Test 6: Duration
        int duration = 120;
        video.setDuration(duration);
        Assertions.assertEquals(duration, video.getDuration());

        // Test 7: View Count
        int viewCount = 100000;
        video.setViewCountCount);
        Assertions.assertEquals(viewCount, video.getViewCount());

        // Test 8: Like Count
        int likeCount = 1000;
        video.setLikeCount(likeCount);
        Assertions.assertEquals(likeCount, video.getLikeCount());

        // Test 9: Dislike Count
        int dislikeCount = 100;
        video.setDislikeCount(dislikeCount);
        Assertions.assertEquals(dislikeCount, video.getDislikeCount());

        // Test 10: Favorite Count
        int favoriteCount = 1000;
        video.setFavoriteCount(favoriteCount);
        Assertions.assertEquals(favoriteCount, video.getFavoriteCount());

        // Test 11: Comment Count
        int commentCount = 500;
        video.setCommentCount(commentCount);
        Assertions.assertEquals(commentCount, video.getCommentCount());
    }
}

class YouTubeVideo {
    private String id;
    private String publishedDate;
    private String channelId;
    private String title;
    private String channelTitle;
    private int
    private int viewCount;
    private int likeCount;
    private int dislikeCount;
    private int favoriteCount;
    private int commentCount;

    public YouTubeVideo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

 void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannel {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getDislikeCount() {
likeCount;
    }

    public void setDislikeCount(int dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
