package com.jokerinya;

import java.util.ArrayList;
import java.util.List;


public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public Song findSong(String name){
            for (Song song : songs ){
                if (song.getTitle().equals(name)){
                    return song;
                }
            }
            return null;
        }

        public Song findSong(int index){
            if((index >=0) && (index <= this.songs.size())){
                return this.songs.get(index);
            }
            return null;
        }

        public boolean addSong(String title, double duration){
            Song song = findSong(title);
            if (song==null){
                this.songs.add(new Song(title,duration));
                return true;
            }
            return false;
        }
    }


    public boolean addSong(String title, double duration) {
        return this.songList.addSong(title, duration);
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        int index = trackNumber -1;
        Song song = this.songList.findSong(index);
        if(song!=null) {
            playList.add(song);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = this.songList.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }



















}
