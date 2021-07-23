package com.example.music_carnival.ProfileAct;

public class Pro {

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


    public Pro( int drawable, String id) {
        this.drawable = drawable;
        this.id = id;
    }
}
