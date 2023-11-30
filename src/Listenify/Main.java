package Listenify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Album a1 = new Album("Arijit Singh");

        a1.addSongToAlbum("Kesariya",4.5);
        a1.addSongToAlbum("channa mereya",5.2);
        a1.addSongToAlbum("tum hi ho",3.5);
        a1.addSongToAlbum("khamoshiyaan",6.1);
        a1.addSongToAlbum("qaafiraana",7.2);


        Album a2 = new Album("Yo Yo honey Singh");

        a2.addSongToAlbum("Char bottle",3.4);
        a2.addSongToAlbum("Love dose",4.5);
        a2.addSongToAlbum("Blue eyes",4.5);
        a2.addSongToAlbum("High heels",6.2);
        a2.addSongToAlbum("Brown Song",4.1);


        List<Song> playList = new ArrayList<>();

        a1.addSongToPlayList(1,playList);
        a1.addSongToPlayList(3,playList);
        a1.addSongToPlayList(5,playList);

        a2.addSongToPlayList("High heels",playList);
        a2.addSongToPlayList("Char bottle",playList);
        a2.addSongToPlayList("Blue eyes",playList);

        int currentIndex = 0;
        System.out.println("Now playing "+playList.get(currentIndex).toString());

        printMenu();

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        boolean keepPlayingPlayList = true;

        while(keepPlayingPlayList){

            switch (choice){

                case 1:
                    if(currentIndex!=playList.size()-1)
                        currentIndex++;
                    else
                        currentIndex = 0;
                    System.out.println("Now Playing"+playList.get(currentIndex).toString());
                    break;
                case 2:
                    if(currentIndex!=0){
                        currentIndex--;
                    }
                    System.out.println("Now Playing"+playList.get(currentIndex).toString());
                    break;

                case 3:
                    System.out.println("Now Playing"+playList.get(currentIndex).toString());
                    break;
                case 4:
                    printPlayList(playList);
                    break;
                case 5:
                    Collections.shuffle(playList);
                    break;

                case 6:
                    printMenu();
                    break;
                case 7:
                    playList.remove(currentIndex);
                    break;
                case 8:
                    keepPlayingPlayList = false;
                    break;

            }

            System.out.println("Enter your choice");
            choice = sc.nextInt();

        }






    }

    public static void printPlayList(List<Song> playList){

        System.out.println("The playList songs are :");
        for(Song song:playList){
            System.out.println(song.toString());
        }
    }


    public static void printMenu(){

        System.out.println("Enter your choice");
        System.out.println("1. Play the next song");
        System.out.println("2. Play the previous song");
        System.out.println("3. Repeat the current song");
        System.out.println("4. Show PlayList");
        System.out.println("5. Shuffle the playlist");
        System.out.println("6. Print Menu");
        System.out.println("7. Delete the Song");
        System.out.println("8. Exit the playList");

    }


}