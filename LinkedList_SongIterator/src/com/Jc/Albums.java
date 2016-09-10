package com.Jc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by priyaranjanjc on  ${date}.
 */
public class Albums {
    // This class will contain all the albums.

    private ArrayList<Album> albumList;

    public Albums() {
        this.albumList = new ArrayList<Album>();
    }

    public ArrayList<Album> getAlbumList() {
        return albumList;
    }

    public int searchAlbum(String name){
        for(int i=0;i < albumList.size() ; i++){
            if(albumList.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    public boolean addAlbum(Album album){
        if(searchAlbum(album.getName()) > -1){
            albumList.add(album);
            return true;
        }
        else {
            System.out.println("album already present the albumList");
            return false;
        }
    }

    public void createAlbum(String name){
        if(searchAlbum(name)== -1){
            Scanner userInput = new Scanner(System.in);
            Album newAlbum = new Album(name);
            while (true){
                System.out.println("Do you wish to add songs to the album");
                if(userInput.nextBoolean()){
                    System.out.println("Name of the new song");
                    String title = userInput.next();
                    System.out.println("Duration of the song");
                    double duration = userInput.nextDouble();
                    newAlbum.addsong(title, duration);
                }
                else
                    break;

            }
            albumList.add(newAlbum);
        }
        System.out.println("Sorry album already present");
    }

    public void addSongtoAlbum(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the album do you this song to add");
        String albumName = userInput.next();
        int albumIndex = searchAlbum(albumName);
        if(albumIndex !=-1){
            System.out.println("Name of the new song");
            String title = userInput.next();
            System.out.println("Duration of the song");
            double duration = userInput.nextDouble();
            albumList.get(albumIndex).addsong(title,duration);
        }
        else
            System.out.println("Sorry album is not present in your album list");
    }

    public Song getSong(String albumName,String songName){
        int albumIndex = searchAlbum(albumName);
        if( albumIndex != -1){
           return albumList.get(albumIndex).getSong(songName);
        }
        else{
            System.out.println("Album not in the list");
            return null;
        }
    }
    public void printSongs(){
        for(Album album : albumList){
            album.listSongs();
            System.out.println("=================================================\n\n\n");
        }
    }

}
