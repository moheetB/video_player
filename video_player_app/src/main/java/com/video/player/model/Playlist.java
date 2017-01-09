package com.video.player.model;

import java.util.Date;
import java.util.Observable;
import java.util.List;

/**
 * Created by moheetB on 1/8/17.
 */
final public class Playlist extends Observable {

    String playlistId;
    String name;
    Date createTime;

    public Playlist(String playlistId, String name, Date createTime) {
        this.playlistId = playlistId;
        this.name = name;
        this.createTime = createTime;
    }

    public String getPlaylistId() {
        return playlistId;
    }

    public String getName() {
        return name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setPlaylistId(String playlistId) {
        this.playlistId = playlistId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void updatePlaylist(Playlist playlistID) {

    }

    public void addSongs(Playlist playlist, List<String> songList) {
    }
}
