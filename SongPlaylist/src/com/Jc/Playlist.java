package com.Jc;

import java.util.ListIterator;

/**
 * Created by priyaranjanjc on 8/29/2016.
 */
public class Playlist {

    ListIterator<Song> playlist;

    public Playlist(ListIterator<Song> playlist) {
        this.playlist = playlist;
    }

    public Song palysong(){
        if(this.playlist.hasNext()){
            return this.playlist.next();
        }
        else{
            System.out.println("Playlist is empty add few songs to enjoy the music");
            return null;
        }
    }

    public void addSong(Song newSong){
        this.playlist.add(newSong);
    }
    public void quit(){
      //

    }

    public Song skip(){
        if(this.playlist.hasNext()){
            return this.playlist.next();
        }
        else{
            System.out.println("There are no more songs quitting the playlist");
            quit();
            return null;
        }
    }

    public Song repeatSong(){
        this.playlist.
    }


}
