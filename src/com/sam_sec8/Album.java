package com.sam_sec8;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String artist, String name) {
        this.artist = artist;
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title))
                return checkedSong;
        }
        return null;
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size()) && !onPlaylist(trackNumber, playList)) {
            playList.add(this.songs.get(index));
//            System.out.println("Added to playlist");
            return true;
        }
//        System.out.println("This album does not have a track " + trackNumber + " or it's already in the playlist");
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        if (song != null && !onPlaylist(title, playList)) {
//            System.out.println("Added to playlist");
            playList.add(song);
            return true;
        }
//        System.out.println("This album does not have a track '" + title + "' or it's already in the playlist");
        return false;
    }

    private boolean onPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        return playList.contains(this.songs.get(index));
    }

    private boolean onPlaylist(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        if (song != null) {
            for (Song s : playList) {
               if( s.getTitle().equals(song.getTitle())) {
                   return true;
               }
            }
            return false;
        }
        return false;

    }



}
