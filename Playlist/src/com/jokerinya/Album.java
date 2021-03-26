package com.jokerinya;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> albumSongs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.albumSongs = new ArrayList<Song>();
    }
    public Song addSongToAlbum(String name, double duration){
        Song song = querySong(name); // null or song object
        if (song==null){
            song = new Song(name, duration);
            this.albumSongs.add(song);
            System.out.println(song.toString() + " has been added to "+ this.albumName + " album.");
        } else {
            System.out.println(song.toString() + " has already on " + this.albumName + " album.");
        }
        return song;
    }
    public Song querySong(String name){
        for (Song song : albumSongs){
            if (song.getTitle().equals(name)){ // there is song
                return song;
            }
        }
        return null;
    }


// Getters
    public String getName() {
        return albumName;
    }

    public ArrayList<Song> getSongs() {
        return albumSongs;
    }


}
