package com.Jc;

/**
 * Created by priyaranjanjc on 9/8/2016.
 */
public class Song {

    // This is the song class which has contains songs title and duration of song
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

}
