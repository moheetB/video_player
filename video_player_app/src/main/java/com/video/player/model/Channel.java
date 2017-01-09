package com.video.player.model;

import com.google.common.base.Preconditions;

import java.util.Observable;

/**
 * Created by Gaurav on 1/8/2017.
 */
final public class Channel extends Observable{
    String channelID;
    String name;
    String tags;
    int videoCount;
    String description;




    public Channel(String channelID, String name, String tags, int videoCount, String description) {

        Preconditions.checkNotNull(channelID, "Channel ID cannot be null");
        Preconditions.checkNotNull(name, "Channel Name cannot be null");

        this.channelID = channelID;
        this.name = name;
        this.tags = tags;
        this.videoCount = videoCount;
        this.description = description;
    }

    public String getChannelID() {
        return channelID;
    }

    public void setChannelID(String channelID) {
        this.channelID = channelID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(int videoCount) {
        this.videoCount = videoCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void updateChannel(final Channel channel){

    }

    public void deleteChannel(final Channel channel){

    }
}
