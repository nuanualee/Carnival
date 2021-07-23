package com.example.music_carnival.ArtistCollection;

public class Artist {
    private String id;
    private String artiste;

    private String topSong1;
    private String topSong2;
    private String topSong3;

    private double songLength1;
    private double songLength2;
    private double songLength3;

    private double stream1;
    private double stream2;
    private double stream3;
    private int drawable;



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

    public String getTopSong1() {
        return topSong1;
    }

    public void setTopSong1(String topSong1) {
        this.topSong1 = topSong1;
    }

    public String getTopSong2() {
        return topSong2;
    }

    public void setTopSong2(String topSong2) {
        this.topSong2 = topSong2;
    }

    public String getTopSong3() {
        return topSong3;
    }

    public void setTopSong3(String topSong3) {
        this.topSong3 = topSong3;
    }

    public double getSongLength1() {
        return songLength1;
    }

    public void setSongLength1(double songLength1) {
        this.songLength1 = songLength1;
    }

    public double getSongLength2() {
        return songLength2;
    }

    public void setSongLength2(double songLength2) {
        this.songLength2 = songLength2;
    }

    public double getSongLength3() {
        return songLength3;
    }

    public void setSongLength3(double songLength3) {
        this.songLength3 = songLength3;
    }

    public double getStream1() {
        return stream1;
    }

    public void setStream1(double stream1) {
        this.stream1 = stream1;
    }

    public double getStream2() {
        return stream2;
    }

    public void setStream2(double stream2) {
        this.stream2 = stream2;
    }

    public double getStream3() {
        return stream3;
    }

    public void setStream3(double stream3) {
        this.stream3 = stream3;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public Artist(String id, String artiste, String topSong1, String topSong2, String topSong3, double songLength1, double songLength2, double songLength3, double stream1, double stream2, double stream3, int drawable) {
        this.id = id;
        this.artiste = artiste;
        this.topSong1 = topSong1;
        this.topSong2 = topSong2;
        this.topSong3 = topSong3;
        this.songLength1 = songLength1;
        this.songLength2 = songLength2;
        this.songLength3 = songLength3;
        this.stream1 = stream1;
        this.stream2 = stream2;
        this.stream3 = stream3;
        this.drawable = drawable;
    }



    }

