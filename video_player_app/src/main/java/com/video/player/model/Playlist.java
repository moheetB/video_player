package com.video.player.model;

import com.google.common.base.Preconditions;

import java.util.Date;
import java.util.List;
import java.util.Observable;

/**
 * Created by Gaurav on 1/8/2017.
 */
final public class Playlist extends Observable {

    String playlistID;
    String name;
    Date created;
    String description;




    public Playlist(String playlistID, String name, Date created, String description) {
        Preconditions.checkNotNull(playlistID, "Playlist ID cannot be null");
        Preconditions.checkNotNull(name, "Playlist Name cannot be null");
        this.playlistID = playlistID;
        this.name = name;
        this.created = created;
        this.description = description;
    }

    public String getPlaylistID() {
        return playlistID;
    }

    public void setPlaylistID(String playlistID) {
        this.playlistID = playlistID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void updatePlaylist(final Playlist playlist) {

    }

    public void addSongs(Playlist playlist, List<String> songList) {
    }

    public void deletePlaylist(final Playlist playlist){

    }
}
