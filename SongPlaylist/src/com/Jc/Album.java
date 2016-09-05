package com.Jc;

import java.util.ArrayList;

/**
 * Created by priyaranjanjc on 8/29/2016.
 */
public class Album {

    private ArrayList<Song> album;

    public Album(ArrayList<Song> album) {
        this.album = album;
    }

    public void addSong(Song newSong){
        this.album.add(newSong);
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

}
