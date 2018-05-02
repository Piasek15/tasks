package pl.piasecki;

import java.util.ArrayList;

/**
 * Created by Patrick on 25 kwi 2018
 */
public class Albums {
    private ArrayList<Album> albums;

    public Albums() {
        this.albums = new ArrayList<Album>();
    }

    public void addAlbum(String name){
        if (findAlbum(name)<0){
            Album album = new Album(name);
            albums.add(album);
        } else {
            System.out.println("Album " + name + " already exists");
        }
    }

    public Album getAlbum(String name){
        if (findAlbum(name)>=0){
            return albums.get(findAlbum(name));
        } else {
            return null;
        }
    }

    private int findAlbum(String name){
        for (int i=0; i<albums.size();i++){
            if (albums.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
