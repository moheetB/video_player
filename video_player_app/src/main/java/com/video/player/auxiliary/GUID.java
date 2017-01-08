package com.video.player.auxiliary;

/**
 * Created by moheetB on 1/8/17.
 */
final public class GUID {

    private static GUID instance = null;
    private GUID() {
        // Exists only to defeat instantiation.
    }

    public static GUID getInstance() {
        if(instance == null) {
            instance = new GUID();
        }
        return instance;
    }

    public String getGUID() {
        // this is a proxy method that assumes the implementation of getting guids
        // to be assigned to videos, channels, etc on their creation
        return null; //for now
    }

}
