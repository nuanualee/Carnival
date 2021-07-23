package com.example.music_carnival.Genres;

public class Genre {
    private String id;
    private String title;
    private String artist;
    private int drawable;


    public String getId() {
        return id;
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public Genre(String id, String title, String artist, int drawable) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.drawable = drawable;
    }
}
