package com.video.player.dao;

import com.video.player.exception.ConnectionException;
import com.video.player.model.Video;

/**
 * Created by moheetB on 1/8/17.
 */
public class VideoDao extends DAO {
    public VideoDao() throws ConnectionException {
    }

    public void save (Video video) {
        // write the statements to insert in table according the channel attributes
    }

    public void update(Video video) {
        // write the statements to update according to id
        // update blah blah where id = channel.id
    }

    public void delete(Video video) {
        // write the statements to delete according to id
        // delete from blah blah where id = channel.id
    }
}
