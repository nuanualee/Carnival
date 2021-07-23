package com.example.music_carnival.UserMoment;

public class PicsAndID {
    private String id;
    private String username;
    private int drawable;





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }





    public PicsAndID(String id, String username, int drawable) {
        this.id = id;
        this.username = username;
        this.drawable = drawable;
    }
}
