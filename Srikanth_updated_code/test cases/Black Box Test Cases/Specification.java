package com.sv219.Srikanth_Voruganti;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class YouTubeApiTest {
    @Mock
    private YouTubeApi youtubeApi;

    @Test
    public void testGetVideoInfo() {
        // Set up mock API response
        String videoId = "dQw4w9WgXcQ";
        String jsonResponse = "{\"items\": [{\"id\": \"" + videoId + "\", \"snippet\": {\"title\": \"Test Video\", \"description\": \"This is a test video\", \"thumbnails\": [{\"url\": \"https://i.ytimg.com/vi/" + videoId + "/hqdefault.jpg\"}], \"channelTitle\": \"Test Channel\"}}]}";
        YouTubeApi.VideoResponse videoResponse = new YouTubeApi.VideoResponse(jsonResponse);

        // Set up mock API client
        YouTubeApiClient apiClient = new YouTubeApiClient(youtubeApi);

        // Test getVideoInfo() method
        VideoInfo videoInfo = apiClient.getVideoInfo(videoId);

        // Verify results
        assertEquals(videoId, videoInfo.getVideoId());
        assertEquals("Test Video", videoInfo.getTitle());
        assertEquals("This is a test video", videoInfo.getDescription());
        assertEquals("https://i.ytimg.com/vi/" + videoId + "/hqdefault.jpg", videoInfo.getThumbnailUrl());
        assertEquals("Test Channel", videoInfo.getChannelTitle());
    }

    @Test
    public void testGetVideoList() {
        // Set up mock API response
        String jsonResponse = "{\"items\": [{\"id\": \"dQw4w9WgXcQ\", \"snippet\": {\"title\": \"Test Video 1\", \"description\": \"This is a test video 1\", \"thumbnails\": [{\"url\": \"https://i.ytimg.com/vi/dQw4w9WgXcQ/hqdefault.jpg\"}], \"channelTitle\": \"Test Channel 1\"}}, {\"id\": \"YE7Vzl4S648\", \"snippet\": {\"title\": \"Test Video 2\", \"description\": \"This is a test video 2\", \"thumbnails\": [{\"url\": \"https://i.ytimg.com/vi/YE7Vzl4S648/hqdefault.jpg\"}], \"channelTitle\": \"Test Channel 2\"}}]}";
        YouTubeApi.VideoResponse videoResponse = new YouTubeApi.VideoResponse(jsonResponse);

        // Set up mock API client
        YouTubeApiClient apiClient = new YouTubeApiClient(youtubeApi);

        // Test getVideoList() method
        List<VideoInfo> videoList = apiClient.getVideoList();

        // Verify results
        assertEquals(2, videoList.size());
        assertEquals("dQw4w9WgXcQ", videoList.get(0).getVideoId());
        assertEquals("Test Video 1", videoList.get(0).getTitle());
        assertEquals("This is a test video 1", videoList.get(0).getDescription());
        assertEquals("https://i.ytimg.com/vi/dQw4w9WgXcQ/hqdefault.jpg", videoList.get(0).getThumbnailUrl());
        assertEquals("Test Channel 1", videoList.get(0).getChannelTitle());
        assertEquals("YE7Vzl4S648", videoList.get(1).getVideoId());
        assertEquals("Test Video 2", videoList.get(1).getTitle());
        assertEquals("This is a test video 2", videoList.get(1).getDescription());
        assertEquals("https://i.ytimg.com/vi/YE7Vzl4S648/hqdefault.jpg", videoList.get(1).getThumbnailUrl());
        assertEquals("Test Channel 2", videoList.get(1).getChannelTitle());
    }
}
