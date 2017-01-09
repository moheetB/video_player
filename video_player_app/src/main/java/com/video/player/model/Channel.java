package com.video.player.model;

import java.util.Observable;
import com.google.common.base.Preconditions;


/**
 * Created by moheetB on 1/8/17.
 */
final public class Channel extends Observable {

    String channelId;
    String name;

    public Channel(String channelId, String channelName) {

        Preconditions.checkNotNull(channelId, "Channel ID cant be null");
        Preconditions.checkNotNull(name, "Channel Name cant be null");

        this.channelId = channelId;
        this.name = channelName;
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

    public void updateChannel(final Channel channel){

    }

    public void deleteChannel(final Channel channel){

    }
}
