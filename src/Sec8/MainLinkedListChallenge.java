package Sec8;

import java.io.Console;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class MainLinkedListChallenge {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Deep Purple", "Stormbringer");

        album.addSong("Stormibringer", 4.6);
        album.addSong("Picareta", 3.5);
        album.addSong("Caneta Azul", 3.0);
        album.addSong("Meteoro da Paixao", 4.10);
        album.addSong("Vida que Segue", 5.1);
        album.addSong("Malicia", 3.25);

        albums.add(album);


        Album secondAlbum = new Album("Calipson", "Lua que Traiu");
        album.addSong("A Lua me Traiu", 4.6);
        album.addSong("Ola, coracao", 3.5);
        album.addSong("Partiu", 3.0);
        album.addSong("Viagem Maluca", 4.10);
        album.addSong("Desgraca", 5.1);
        album.addSong("Menina do suvaco cabeludo", 3.25);

        albums.add(secondAlbum);

        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(0).addToPlayList("Picareta", playList);
        albums.get(0).addToPlayList("Caneta Azul", playList);
        albums.get(0).addToPlayList("Malicia", playList);
//        albums.get(0).addToPlayList(1, playList);
//        albums.get(0).addToPlayList(19, playList); //doesnt exist
//        albums.get(0).addToPlayList("Malicia", playList); //already in
//        albums.get(0).addToPlayList(1, playList);//already in
        play(playList);


    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean foward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        System.out.println("Now playing " + listIterator.next().toString());
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Finishing...");
                    quit = true;
                    break;
                case 1:
                    if (!foward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        foward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("End of playlist");
                    }

                    break;
                case 2:
                    if (foward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        foward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("This is the first song of the playlist");
                    }
                    break;

                case 3:
                    if (foward) {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            foward = false;
                        } else {
                            listIterator.previous();
                            System.out.println("Now playing " + listIterator.next().toString());
                        }
                    } else {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            foward = true;
                        }else {
                            listIterator.next();
                            listIterator.next();
                            listIterator.previous();
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;

                case 4:
                    break;
            }
        }
    }


}
