package com.video.player.model;

import com.google.common.base.Preconditions;
import com.video.player.auxiliary.DAOConnection;
import com.video.player.exception.ConnectionException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Observable;

/**
 * Created by Gaurav on 1/8/2017.
 */
final public class Video extends Observable {


    String videoID;
    String name;
    String upload_date;
    String channelID;
    String tags;
    long view_count;
    String description;




    public Video(String videoID, String name, String upload_date, String channelID, long view_count, String tags, String description){
        Preconditions.checkNotNull(channelID, "Channel ID cannot be null");
        Preconditions.checkNotNull(videoID, "Video ID cannot be null");
        Preconditions.checkNotNull(name, "Video Name cannot be null");

        this.videoID = videoID;
        this.name = name;
        this.upload_date = upload_date;
        this.channelID = channelID;
        this.view_count = view_count;
        this.tags = tags;
        this.description = description;


    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpload_date() {
        return upload_date;
    }

    public void setUpload_date(String upload_date) {
        this.upload_date = upload_date;
    }

    public String getChannelID() {
        return channelID;
    }

    public void setChannelID(String channelID) {
        this.channelID = channelID;
    }

    public long getView_count() {
        return view_count;
    }

    public void setView_count(long view_count) {
        this.view_count = view_count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void updateVideo(Video video) {

    }


    public void deleteVideo(final Video video) {

    }
}
