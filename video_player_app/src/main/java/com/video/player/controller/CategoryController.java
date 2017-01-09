package com.video.player.controller;

import com.video.player.auxiliary.GUID;
import com.video.player.exception.CreationException;
import com.video.player.exception.DeleteException;
import com.video.player.exception.UpdateException;
import com.video.player.model.Category;

/**
 * Created by Gaurav on 1/8/2017.
 */
final public class CategoryController {
    private static final GUID GUID_CREATOR = GUID.getInstance();

    private Category category;


    public CategoryController(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category createCategory(final String categoryName) throws CreationException{
        final String categoryID = GUID_CREATOR.getGUID();

        try{
            final Category category = new Category(categoryID, categoryName);
            return category;
        } catch (IllegalArgumentException iAException){
            throw new CreationException(iAException.getMessage());
        } finally{
            //To do Something
        }
    }

    public void updateCategory(final Category category) throws UpdateException{

        try{
            category.updateCategory(category);
        } catch (IllegalArgumentException iAException){
            throw new UpdateException(iAException.getMessage());
        } finally {
            //To do Something
        }
    }

    public void deleteCategory(final Category category) throws DeleteException {
        try{
            category.deleteCategory(category);
        } catch (IllegalArgumentException iAException){
            //throw new DeleteException(iAException.getMessage());
        } finally{
            //To do Something
        }
    }
}
