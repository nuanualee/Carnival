package com.example.music_carnival.AddDone;

public class Done {

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


    public Done( int drawable, String id) {
        this.drawable = drawable;
        this.id = id;
    }
}
