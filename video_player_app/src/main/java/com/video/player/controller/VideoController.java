package com.video.player.controller;

import com.video.player.auxiliary.GUID;
import com.video.player.exception.CreationException;
import com.video.player.exception.UpdateException;
import com.video.player.model.Video;

import java.util.Date;

/**
 * Created by Gaurav on 1/8/2017.
 */
final public class VideoController {
    private static final GUID GUID_CREATOR = GUID.getInstance();

    private Video video;


    public VideoController(Video video) {
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Video uploadVideo(final String videoName, final String channelID, final String tags) throws CreationException{
        final String videoID = GUID_CREATOR.getGUID();
        Date date = new Date();
        String uploadDate = String.valueOf(date);
        try{
            final Video video = new Video(videoID, videoName, uploadDate, channelID, 0, tags);
            return video;
        } catch (IllegalArgumentException iAException){
            throw new CreationException(iAException.getMessage());
        }
    }


    public void updateVideo(final Video video) throws UpdateException{
        try{
            video.updateVideo(video);
        } catch (IllegalArgumentException iAException){
            throw new UpdateException(iAException.getMessage());
        }
    }
}
