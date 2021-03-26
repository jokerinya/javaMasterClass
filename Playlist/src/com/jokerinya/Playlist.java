package com.jokerinya;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private String name;
    private LinkedList<Song> playistSongs;

    public Playlist(String name) {
        this.name = name;
        this.playistSongs = new LinkedList<Song>();
    }

    private boolean addToPlaylist(Song song){
        ListIterator<Song> songListIterator = playistSongs.listIterator();
        while (songListIterator.hasNext()){
            if (songListIterator.next()==song){
                System.out.println("The song " + song.toString() + " has already on the " + this.name + " playlist.");
                return false;
            }
        }
        songListIterator.add(song);
        System.out.println(song.toString() + " has been added to " + this.name + " playlist.");
        return true;
    }

    public boolean addToPlaylist(String songName){
        Song song = Main.querySongInAlbums(songName);
        if (song==null){
            System.out.println("You should add " + songName + " song album to your albums first.");
            return false;
        }
        return this.addToPlaylist(song);
    }

    public void printPlaylist(){
        System.out.println("########" + this.name + "########");
        for (Song song : playistSongs){
            System.out.println("->" + song.toString());
        }
    }

    public void printMenu(){
        System.out.println("Press: \n\t0-Quit\n\t1-Forward\n\t" +
                "2-Backward\n\t3-Replay\n\t4-Remove Song\n\t5-Show Playlist\n\t6-Show Menu");
    }

    private void printSongOutput(Song song){
        System.out.println("Listening=> " + song.toString());
    }

    public void play(){
        System.out.println("=============Playlist Starts=============");
        printPlaylist();
        printMenu();
        if (this.playistSongs.isEmpty()) {
            System.out.println("There is no song on playlist.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playistSongs.listIterator();
        Song listeningSong = listIterator.next();
        printSongOutput(listeningSong);
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Playlist closed.");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        listeningSong = listIterator.next();
                        printSongOutput(listeningSong);
                    } else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        listeningSong = listIterator.previous();
                        printSongOutput(listeningSong);
                    } else {
                        System.out.println("At the start of the list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listeningSong = listIterator.previous();
                            goingForward = false;
                        } else {
                            System.out.println("At the start of the list.");
                        }
                    } else {
                        if (listIterator.hasNext()){
                            listeningSong = listIterator.next();
                            goingForward = true;
                        } else {
                            System.out.println("At the end of the list.");
                        }
                    }
                    printSongOutput(listeningSong);
                    break;
                case 4:
                    if (playistSongs.size()>0){
                        listIterator.remove();
                        System.out.println("The song removed.");
                        if (listIterator.hasNext()){
                            listeningSong = listIterator.next();
                            printSongOutput(listeningSong);
                        } else if (listIterator.hasPrevious()){
                            listeningSong = listIterator.previous();
                            printSongOutput(listeningSong);
                        }
                    } else {
                        System.out.println("There is no song in the list.");
                    }
                    break;
                case 5:
                    printPlaylist();
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }

    }

























//    Getters
    public String getName() {
        return name;
    }

    public LinkedList<Song> getPlayistSongs() {
        return playistSongs;
    }
}
