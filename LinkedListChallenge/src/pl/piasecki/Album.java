package pl.piasecki;

import java.util.ArrayList;

/**
 * Created by Patrick on 25 kwi 2018
 */
public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public void addSong(String title, int duration){
        Song song = new Song(title, duration);
        songs.add(song);
    }

    public String getName() {
        return name;
    }

    public Song getSong(String title){
        if (findSong(title)>=0){
            return songs.get(findSong(title));
        } else {
            return null;
        }
    }

    private int findSong(String title){
        for (int i=0; i<songs.size();i++){
            if (songs.get(i).getTitle().equals(title)){
                return i;
            }
        }
        return -1;
    }
}
