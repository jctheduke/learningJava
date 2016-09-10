package com.timbuchalka;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private songList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;

        this.songs = new songList();
    }


    private class songList{
        private ArrayList<Song> songs;

        public songList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean addToPlayList(int trackNumber,LinkedList<Song> playList){
            int index = trackNumber -1;
            if((index >0) && (index <= this.songs.size())) {
                this.songs.add(this.songs.get(index));
                return true;
            }
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }

        public boolean addToPlayList(String title, LinkedList<Song> playList) {
            Song checkedSong = findSong(title);
            if(checkedSong != null) {
                this.songs.add(checkedSong);
                return true;
            }
            System.out.println("The song " + title + " is not in this album");
            return false;
        }

        private Song findSong(String title) {
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }


    }

















}
