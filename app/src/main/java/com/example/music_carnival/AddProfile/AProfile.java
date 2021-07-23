package com.example.music_carnival.AddProfile;

//GETTER AND SETTER
public class AProfile {
    private final String id;

    public String getId() {
        return id;
    }
    public int getDrawable() {
        return drawable;
    }
    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
    private int drawable;


    public AProfile( int drawable, String id) {
        this.drawable = drawable;
        this.id = id;
    }
}