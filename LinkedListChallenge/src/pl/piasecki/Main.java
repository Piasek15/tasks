package pl.piasecki;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Albums albums = new Albums();
        albums.addAlbum("album1");
        albums.getAlbum("album1").addSong("song1", 111);
        albums.getAlbum("album1").addSong("song2", 222);
        albums.getAlbum("album1").addSong("song3", 333);
        albums.addAlbum("album2");
        albums.getAlbum("album2").addSong("song1", 111);
        albums.getAlbum("album2").addSong("song2", 222);

        LinkedList<Song> songs = new LinkedList<Song>();
        songs.add(albums.getAlbum("album1").getSong("song1"));
        songs.add(albums.getAlbum("album1").getSong("song2"));
        songs.add(albums.getAlbum("album1").getSong("song3"));
        songs.add(albums.getAlbum("album2").getSong("song1"));
        songs.add(albums.getAlbum("album2").getSong("song2"));

        playList(songs);

    }

    private static void playList(LinkedList songs){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean increasing = true;
        ListIterator<Song> listIterator = songs.listIterator();

        if (songs.isEmpty()){
            System.out.println("Play list is empty.");
        } else {
            Song song = listIterator.next();
            System.out.println("playing " + song.getTitle() + ", duration: " + song.getDuration());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    System.out.println("Closing play list.");
                    quit = true;
                    break;
                case 1:
                    if (!increasing){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        increasing = true;
                    }
                    if (listIterator.hasNext()){
                        Song song = listIterator.next();
                        System.out.println("playing " + song.getTitle() + ", duration: " + song.getDuration());
                    } else {
                        System.out.println("Reached the end of the play list");
                        //increasing = false;
                    }
                    break;
                case 2:
                    if (increasing){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        increasing = false;
                    }
                    if (listIterator.hasPrevious()){
                        Song song = listIterator.previous();
                        System.out.println("playing " + song.getTitle() + ", duration: " + song.getDuration());
                    } else {
                        System.out.println("You are in the start of the play list");
                        //increasing = true;
                    }
                    break;
                case 3:
                    if (increasing){
                        Song song = listIterator.previous();
                        System.out.println("playing " + song.getTitle() + ", duration: " + song.getDuration());
                        listIterator.next();
                    } else {
                        Song song = listIterator.next();
                        System.out.println("playing " + song.getTitle() + ", duration: " + song.getDuration());
                        listIterator.previous();
                    }
                    break;
                case 4:
                    if (!songs.isEmpty()){
                        listIterator.remove();
                        System.out.println("Current playing song removed");
                        if (listIterator.hasNext()){
                            Song song = listIterator.next();
                            System.out.println("playing " + song.getTitle() + ", duration: " + song.getDuration());
                        } else if(listIterator.hasPrevious()) {
                            Song song = listIterator.previous();
                            System.out.println("playing " + song.getTitle() + ", duration: " + song.getDuration());
                        }
                    }
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    printList(songs);
            }
        }
    }

    public static void printMenu(){
        System.out.println("Options menu: \n" +
                "PRESS\n" +
                "0 - close\n" +
                "1 - play next song\n" +
                "2 - play previous song\n" +
                "3 - replay song\n" +
                "4 - remove song form the play list\n" +
                "5 - show options menu\n" +
                "6 - print play list");
    }

    public static void printList(LinkedList<Song> songs){
        songs.forEach(song -> System.out.println(song.getTitle() + ": " +song.getDuration()));
    }


}
