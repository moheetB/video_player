package com.video.player.model;

import java.util.Observable;
import com.google.common.base.Preconditions;
import com.video.player.dao.ChannelDao;
import com.video.player.exception.ConnectionException;


/**
 * Created by moheetB on 1/8/17.
 */
final public class Channel extends Observable {

    private final ChannelDao channelDao = new ChannelDao();

    private String id;
    private String name;

    public Channel(String id, String channelName) throws ConnectionException {

        Preconditions.checkNotNull(id, "Channel ID cant be null");
        Preconditions.checkNotNull(channelName, "Channel Name cant be null");

        this.id = id;
        this.name = channelName;

        channelDao.save(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateChannel(final Channel channel){
        this.id = channel.id;
        this.name = channel.name;

        channelDao.update(this);
    }

    public void deleteChannel(final Channel channel) {
        channelDao.delete(this);
    }
}
