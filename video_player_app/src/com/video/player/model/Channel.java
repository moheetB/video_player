package com.video.player.model;

import java.util.Observable;

/**
 * Created by moheetB on 1/8/17.
 */
final public class Channel extends Observable {

    String channelId;
    String name;

    public Channel(String channelId, String name) {
        this.channelId = channelId;
        this.name = name;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getName() {
        return name;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
