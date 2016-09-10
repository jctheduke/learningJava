package com.Jc;

import java.util.ArrayList;

/**
 * Created by priyaranjanjc on 9/8/2016.
 */
public class Album {
    // Album contains name of the album and songs present the album.\
    // Methods containt a way to add songs to the album,search for songs.
    String name;
    ArrayList<Song> songsInAlbum;

    public Album(String name) {
        this.name = name;
        this.songsInAlbum = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public boolean addsong(String title, double duration){
        if(seachSong(title) == -1) {
            songsInAlbum.add(new Song(title, duration));
            return true;
        }
        else{
            System.out.println("Song already present in the album list");
            return false;
        }
    }

    private int seachSong(String title){
        for(int i = 0 ; i < songsInAlbum.size() ; i++){
            if(songsInAlbum.get(i).getTitle().equals(title))
                return i;
        }
        return -1;
    }

    public Song getSong(String title){
        int index =seachSong(title);
        if(index > -1)
            return songsInAlbum.get(index);
        else{
            System.out.println("Song is not present in the album");
            return null;
        }
    }

    public void listSongs(){
        for(Song song :songsInAlbum){
            System.out.println("AlbumName --"+getName());
            System.out.println(song.getTitle()+" --> "+song.getDuration());
        }
    }
}
