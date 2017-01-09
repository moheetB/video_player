package com.video.player.controller;


import com.video.player.auxiliary.GUID;
import com.video.player.exception.CreationException;
import com.video.player.exception.DeleteException;
import com.video.player.exception.UpdateException;
import com.video.player.model.Channel;

/**
 * Created by Gaurav on 1/8/2017.
 */
final public class ChannelController {
    private static final GUID GUID_CREATOR = GUID.getInstance();

    private Channel channel;


    public ChannelController(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Channel createChannel(final String channelName, final String tags, final String description) throws CreationException{
        final String channelID = GUID_CREATOR.getGUID();

        try{
            final Channel channel = new Channel(channelID, channelName, tags, 0, description);
            return channel;
        } catch (IllegalArgumentException iAException){
            throw new CreationException(iAException.getMessage());
        }finally {
            //To do something
        }
    }

    public void updateChannel(final Channel channel) throws UpdateException{
        try{
            channel.updateChannel(channel);
        }catch (IllegalArgumentException iAException){
            throw new UpdateException(iAException.getMessage());
        } finally {
            //To do something
        }
    }

    public void deleteChannel(final Channel channel) throws DeleteException{
        try{
            channel.deleteChannel(channel);
        } catch (IllegalArgumentException iAException){
            throw new DeleteException(iAException.getMessage());
        } finally {
            //To do something
        }
    }
}
