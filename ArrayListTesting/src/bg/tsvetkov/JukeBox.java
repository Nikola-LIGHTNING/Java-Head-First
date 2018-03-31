package bg.tsvetkov;

import java.util.*;
import java.io.*;

public class JukeBox {
    ArrayList<Song> songList = new ArrayList<Song>();
    public static void main(String[] args) {
        new JukeBox().go();        
    }
    
    public void go() {
        readFile();
        System.out.println(songList);
        
        ArtistComparator artistCompare = new ArtistComparator();
        Collections.sort(songList, artistCompare);
        System.out.println(songList);
                
        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);
        
        System.out.println(songSet);    
    }
    
    private void readFile() {
        File file = new File("SongListMore.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null) {
                newSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void newSong(String line) {
        String[] token = line.split("/");
        Song song = new Song(token[0], token[1], token[2], token[3]);
        songList.add(song);
    }
    
    class ArtistComparator implements Comparator<Song> {
    @Override
    public int compare(Song one, Song two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}
}
