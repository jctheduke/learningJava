package com.Jc;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Playlist playlist;
    private static Albums  albums ;
    private static ListIterator<Song> songs;


    public static void main(String[] args) {
        boolean quit = false;
        Scanner userInput = new Scanner(System.in);
        printInstruction();

        while(!quit){
            System.out.println("Please provide the input");
            switch (userInput.nextInt()){

                case 1:
                    addAlbum();
                    albums = playlist.getAlbums();
                    break;
                case 2:
                    albums.addSongtoAlbum();
                    break;
                case 3:
                    albums.printSongs();
                    break;
                case 4:
                    playlist.addSong();
                    songs = playlist.getPlaylist().listIterator();
                    break;
                case 5:
                    System.out.println("Name of the song you wannt to remove");
                    String songName = userInput.next();
                    playlist.removeSong(songName);
                    break;
                case 6:
                    if(songs.hasNext()) {
                        System.out.println(songs.previous().getTitle());
                        break;
                    }else{
                        System.out.println("No Songs in the playlist");
                    }
                    break;
                case 7:
                    if(songs.hasNext()){
                        songs.next();
                        if(songs.hasNext()){
                            System.out.println(songs.next().getTitle());
                        }else{
                            System.out.println("This is the last song in the playlist");
                        }
                    }else{
                        System.out.println("There are no more songs in the playlist");
                    }
                    break;
                case 8:
                    if(songs.hasPrevious()){
                        songs.previous();
                        if(songs.hasPrevious()){
                            System.out.println(songs.hasPrevious());

                        }
                    }else
                        System.out.println("There are no songs in the list");
                        break;

                case 10:
                    printInstruction();
                    break;
                case 11:
                    ListIterator<Song> songs = playlist.getPlaylist().listIterator();
                    break;
                default:
                    System.out.println("Give the correct choice");
                    break;
            }

        }
    }

    public static void printInstruction(){
        System.out.println(" 1: CreateNewAlbum\n" +
                "2: addSong to the album\n" +
                "3: get list of songs\n" +
                "4: addSong to the playlist\n" +
                "5: remove song from the playlist\n" +
                "6: repeat the current song\n" +
                "7: play next song\n" +
                "8: play previous song\n" +
                "9: quit the music player\n" +
                "10.Get Instrucitons again \n" +
                "11: update playlist");
    }

    public static void addAlbum(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the name of the new album ");
        albums.createAlbum(userInput.next());
    }

}
