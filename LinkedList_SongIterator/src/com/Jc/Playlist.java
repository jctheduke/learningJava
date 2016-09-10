package com.Jc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by priyaranjanjc on  ${date}.
 */
public class Playlist {
    //This is the playlist
    private LinkedList<Song> playlist;
    private Albums albums;
    private ArrayList<Album> albumList;

    public Playlist() {
        this.playlist = new LinkedList<Song>();
        this.albums = new Albums();
    }

    public Albums getAlbums() {
        return albums;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void addSong(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Name of the album");
        String albumName = userInput.next();
        System.out.println("name of the song");
        String songName = userInput.next();
        Song song = albums.getSong(albumName,songName);
        if(song != null){
            playlist.add(song);
        }
    }

    public int searchSong(String title){
        int i =0;
        ListIterator<Song> songs = playlist.listIterator();
        while(songs.hasNext()){
            Song currentSong = songs.next();
            if(currentSong.getTitle().equals(title))
                return i;
            else i++;
        }
        return -1;
    }

    public void removeSong(String title){
        int songIndex = searchSong(title);
        if(songIndex != -1){
            playlist.remove(songIndex);
        }
        else
            System.out.println("Song not in the playlist");
    }
}
