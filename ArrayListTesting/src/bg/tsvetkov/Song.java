package bg.tsvetkov;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private String rating;
    private String bpm;
    
    public Song(String t, String a, String r, String bpm) {
        title = t;
        artist = a;
        rating = r;
        this.bpm = bpm;        
    }
    
    public String getTitle() {
        return title;
    }
     
    public String getArtist() {
        return title;
    }
    
    public String getRating() {
        return title;
    }
    
    public String getBPM() {
        return title;
    }
    
    @Override
    public String toString() {
        //System.out.println("Title: " + title);
        return title;
    }
    
    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.title);          
    }
    
    @Override
    public boolean equals(Object aSong) {
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle()); // strings have an overriden equals method        
    }
    
    @Override
    public int hashCode() {
        return title.hashCode(); // strings have an overriden hashCode method
    }
}
