package com.example.music_carnival.Page.MainActivity;

public class Carnival {
    private String id;
    private String artiste;
    private String title;
    private String fileLink;
    private int drawable;

    public Carnival(String id, String artiste, String title, String fileLink, int drawable) {
        this.id = id;
        this.artiste = artiste;
        this.title = title;
        this.fileLink = fileLink;
        this.drawable = drawable;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getGenre() {
        return title;
    }

    public void setGenre(String genre) {
        this.title = genre;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
