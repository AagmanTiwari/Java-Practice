package Collections.LinkedListPlaylist;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlaylistMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Song> playlist = new LinkedList<>();

        int currentIndex = -1;
        int choice;

        do {
            System.out.println("\n--- Music Playlist Menu ---");
            System.out.println("1. Add Song at Beginning");
            System.out.println("2. Add Song at End");
            System.out.println("3. Remove Song by ID");
            System.out.println("4. Display All Songs");
            System.out.println("5. Display First and Last Song");
            System.out.println("6. Next Song");
            System.out.println("7. Previous Song");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                    System.out.print("Enter Song ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();

                    boolean duplicate = false;

                    for (Song song : playlist) {
                        if (song.songId == id) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Song ID already exists");
                    } else {
                        Song newSong = new Song(id, title, artist);

                        if (choice == 1) {
                            playlist.addFirst(newSong);
                        } else {
                            playlist.addLast(newSong);
                        }

                        currentIndex = -1;
                        System.out.println("Song added successfully");
                    }
                    break;

                case 3:
                    System.out.print("Enter Song ID to remove: ");
                    int removeId = sc.nextInt();

                    boolean removed = false;

                    ListIterator<Song> removeIterator = playlist.listIterator();

                    while (removeIterator.hasNext()) {
                        Song song = removeIterator.next();

                        if (song.songId == removeId) {
                            removeIterator.remove();
                            removed = true;
                            currentIndex = -1;

                            System.out.println("Song removed successfully");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Song ID not found");
                    }
                    break;

                case 4:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty");
                    } else {
                        System.out.println("--- All Songs ---");

                        for (Song song : playlist) {
                            song.displaySong();
                            System.out.println("-------------");
                        }
                    }
                    break;

                case 5:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty");
                    } else {
                        System.out.println("First Song:");
                        playlist.getFirst().displaySong();

                        System.out.println("Last Song:");
                        playlist.getLast().displaySong();
                    }
                    break;

                case 6:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty");
                    } else if (currentIndex == playlist.size() - 1) {
                        System.out.println("Already at last song");
                    } else {
                        currentIndex++;

                        ListIterator<Song> nextIterator = playlist.listIterator(currentIndex);

                        System.out.println("Now Playing:");
                        nextIterator.next().displaySong();
                    }
                    break;

                case 7:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty");
                    } else if (currentIndex == -1) {
                        System.out.println("Choose Next Song first");
                    } else if (currentIndex == 0) {
                        System.out.println("Already at first song");
                    } else {
                        ListIterator<Song> previousIterator = playlist.listIterator(currentIndex);

                        currentIndex--;

                        System.out.println("Now Playing:");
                        previousIterator.previous().displaySong();
                    }
                    break;

                case 8:
                    System.out.println("Exiting Music Playlist");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 8);

        sc.close();
    }
}
