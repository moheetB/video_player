package com.video.player.dao;

import com.video.player.exception.ConnectionException;
import com.video.player.model.Category;

/**
 * Created by moheetB on 1/8/17.
 */
public class CategoryDao extends DAO {
    public CategoryDao() throws ConnectionException {
    }

    public void save (Category category) {
        // write the statements to insert in table according the channel attributes
    }

    public void update(Category category) {
        // write the statements to update according to id
        // update blah blah where id = channel.id
    }

    public void delete(Category category) {
        // write the statements to delete according to id
        // delete from blah blah where id = channel.id
    }
}
