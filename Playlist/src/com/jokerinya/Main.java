package com.jokerinya;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
//        create albums and add songs to them
        Album album1 = new Album("Perfect");
        Album album2 = new Album("Excellent");
        album1.addSongToAlbum("First", 3.44);
        album1.addSongToAlbum("Casablanca", 2.09);
        album1.addSongToAlbum("New Life", 3.20);
        album1.addSongToAlbum("Happy", 3.40);
        album2.addSongToAlbum("Children of The World", 4.50);
        album2.addSongToAlbum("Future Is Own", 5.10);
//        add albums to my albums
        addAlbumToMyAlbums(album1);
        addAlbumToMyAlbums(album2);
//        create playlist and songs to them
        Playlist myPlaylist = new Playlist("my");
        myPlaylist.addToPlaylist("First");
        myPlaylist.addToPlaylist("Happy");
        myPlaylist.addToPlaylist("Children of The World");
        myPlaylist.addToPlaylist("Future Is Own");
        myPlaylist.addToPlaylist("Don't Do That"); // wont add this song to the playlist

//        Playlist playing
        myPlaylist.play();





    }


    public static void addAlbumToMyAlbums(Album newAlbum){
        for(Album album : albums){
            if (album==newAlbum){
                System.out.println(album.getName() + " album is already on albums.");
                return;
            }
        }
        albums.add(newAlbum);
        System.out.println(newAlbum.getName() + " album has been added to my albums");
    }
//Query Songs in Albums ArrayList, returns it, if finds
    public static Song querySongInAlbums(String songName){
        for (Album album : albums){
            Song song = album.querySong(songName);
            if (song!=null){
                return song;
            }
        }
        return null;
    }
}
