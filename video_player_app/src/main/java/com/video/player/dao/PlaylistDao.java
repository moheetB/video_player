package com.video.player.dao;

import com.video.player.exception.ConnectionException;
import com.video.player.model.Playlist;

/**
 * Created by moheetB on 1/8/17.
 */
public class PlaylistDao extends DAO {


    public PlaylistDao() throws ConnectionException {
    }

    public void save (Playlist playlist) {
        // write the statements to insert in table according the channel attributes
    }

    public void update(Playlist playlist) {
        // write the statements to update according to id
        // update blah blah where id = channel.id
    }

    public void delete(Playlist playlist) {
        // write the statements to delete according to id
        // delete from blah blah where id = channel.id
    }
}
