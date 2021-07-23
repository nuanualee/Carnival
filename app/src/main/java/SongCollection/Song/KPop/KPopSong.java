package SongCollection.Song.KPop;

public class KPopSong {

    private String id; //e
    private String title;
    private String artiste;
    private String fileLink;
    private double songLength; //song length is a decimal hence DOUBLE
    private int drawable; // refers to the drawable in "DRAWABLE" - int


    //GETTER and SETTER, provides a mechanism to read instant, to write value to instant.
    //Only acceptable range values can be written.
    public String getId() {
        return id; //Setter,
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public int getDrawable() {
        return drawable;
    }


    //CONSTRUCTER, class is blueprint. To create blueprint, create class.
    public KPopSong(String id, String title, String artiste, String fileLink, double songLength, int drawable) {
        this.id = id;
        this.title = title;
        this.artiste = artiste;
        this.fileLink = fileLink;
        this.songLength = songLength;
        this.drawable = drawable;


    }
}
