package Collections.LinkedListPlaylist;

public class Song {
    int songId;
    String songTitle;
    String artistName;

    Song(int songId, String songTitle, String artistName) {
        this.songId = songId;
        this.songTitle = songTitle;
        this.artistName = artistName;
    }

    void displaySong() {
        System.out.println("Song ID: " + songId);
        System.out.println("Title: " + songTitle);
        System.out.println("Artist: " + artistName);
    }
}
