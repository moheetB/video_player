package com.video.player.controller;

import com.video.player.auxiliary.GUID;
import com.video.player.exception.CreationException;
import com.video.player.exception.UpdateException;
import com.video.player.model.Playlist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Gaurav on 1/8/2017.
 */
final public class PlaylistController {

    private static final GUID GUID_CREATOR = GUID.getInstance();
    private static final DateFormat sdf = new SimpleDateFormat("MM/DD/yyyy HH:mm:ss");

    private Playlist playlist;


    public PlaylistController(Playlist playlist) {
        this.playlist = playlist;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Playlist createPlaylist(final String playlistName) throws CreationException{
        final String playlistID = GUID_CREATOR.getGUID();
        final Date date = new Date();

        try{
            final Playlist playlist = new Playlist(playlistID, playlistName, date);
            return playlist;
        } catch (IllegalArgumentException iAException){
            throw new CreationException(iAException.getMessage());
        }
    }

    public void updatePlaylist(final Playlist playlist) throws UpdateException{
        try{
            playlist.updatePlaylist(playlist);
        } catch (IllegalArgumentException iAException){
            throw new UpdateException(iAException.getMessage());
        }
    }



    public void addSongs(final Playlist playlist, final List<String> songList) throws UpdateException{
        try{
            playlist.addSongs(playlist, songList);
        } catch (IllegalArgumentException iAException){
            throw new UpdateException(iAException.getMessage());
        }
    }
}
