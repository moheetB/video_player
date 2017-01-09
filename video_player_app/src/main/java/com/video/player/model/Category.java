package com.video.player.model;

import com.google.common.base.Preconditions;

import java.util.Observable;

/**
 * Created by Gaurav on 1/8/2017.
 */
final public class Category extends Observable{
    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String categoryID;
    String name;


    public Category(String categoryID, String name) {
        Preconditions.checkNotNull(categoryID, "Category ID cannot be null");
        Preconditions.checkNotNull(name, "Category Name cannot be null");
        this.categoryID = categoryID;
        this.name = name;
    }


    public void updateCategory(final Category category){

    }

    public void deleteCategory(final Category category){

    }

}
