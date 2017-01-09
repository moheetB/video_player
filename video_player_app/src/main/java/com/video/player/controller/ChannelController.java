package com.video.player.controller;

import com.video.player.auxiliary.GUID;
import com.video.player.exception.ConnectionException;
import com.video.player.exception.CreationException;
import com.video.player.exception.UpdateException;
import com.video.player.model.Channel;

/**
 * Created by moheetB on 1/8/17.
 */
final public class ChannelController {

    private static final GUID GUID_CREATER = GUID.getInstance();

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

    public Channel createChannel(final String channelName) throws CreationException, ConnectionException {

        final String channelId = GUID_CREATER.getGUID();
        try {
            final Channel channel = new Channel(channelId, channelName);
            return channel;
        } catch (IllegalArgumentException iAException) {

            // the following exception message should be extracted as a String Contant.
            throw new CreationException(iAException.getMessage());
        } catch (ConnectionException cException) {
            throw cException;
        } finally {
            // free resources
        }
    }

    public void updateChannel(final Channel channel) throws UpdateException{
        try{
            channel.updateChannel(channel);
        }catch (IllegalArgumentException iAException){
            //throw new UpdateException(iAException.getMessage());
        } finally {

        }
    }
}
