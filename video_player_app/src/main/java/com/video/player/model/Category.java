package com.video.player.model;

import java.util.Observable;

/**
 * Created by moheetB on 1/8/17.
 */
final public class Category extends Observable {

    String categoryId;
    String name;

    public Category(String categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateCategory(final Category categoryID){

    }
}
