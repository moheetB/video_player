package com.video.player.dao;

import com.video.player.exception.ConnectionException;
import com.video.player.model.Channel;

/**
 * Created by Gaurav on 1/8/17.
 */
public class ChannelDao extends DAO {

    public ChannelDao() throws ConnectionException {

    }

    public void save (Channel channel) {
        // write the statements to insert in table according the channel attributes
    }

    public void update(Channel channel) {
        // write the statements to update according to id
        // update blah blah where id = channel.id
    }

    public void delete(Channel channel) {
        // write the statements to delete according to id
        // delete from blah blah where id = channel.id
    }
}
