package com.timbuchalka;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songList.addSong(title, duration);
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song song = this.songList.findSong(trackNumber);
        if (song != null){
            playList.add(song);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList{
        private List<Song> songs = new ArrayList<Song>();

        public boolean addSong(String title, double duration){
            if (findSong(title) == null){
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        public Song findSong(String title){
            for (Song song: this.songs){
                if (song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber -1;
            if((index >=0) && (index <= this.songs.size())) {
                return songs.get(index);
            }
            return null;
        }

    }



















}
