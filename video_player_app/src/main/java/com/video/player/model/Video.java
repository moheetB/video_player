package com.video.player.model;

import java.util.Observable;

/**
 * Created by moheetB on 1/8/17.
 */
final public class Video extends Observable {

    String videoId;
    String name;
    String upload_time;
    String channel_id;
    long view_count;
    String tags;

    public Video(
            String videoId,
            String name,
            String upload_time,
            String channel_id,
            long view_count,
            String tags) {

        this.videoId = videoId;
        this.name = name;
        this.upload_time = upload_time;
        this.channel_id = channel_id;
        this.view_count = view_count;
        this.tags = tags;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getName() {
        return name;
    }

    public String getUpload_time() {
        return upload_time;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public long getView_count() {
        return view_count;
    }

    public String getTags() {
        return tags;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUpload_time(String upload_time) {
        this.upload_time = upload_time;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public void setView_count(long view_count) {
        this.view_count = view_count;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void updateVideo(Video video) {

    }

    public void deleteVideo(Video video){

    }
}
