package com.example.music_carnival.Page.PhotoCategory;

import SongCollection.Song.All.Song;

public class Category {

    String iconTitle;
    int iconImg;

    public Category(String iconTitle, int iconImg) {
        this.iconTitle = iconTitle;
        this.iconImg = iconImg;
    }

    public String getIconTitle() {
        return iconTitle;
    }

    public void setIconTitle(String iconTitle) {
        this.iconTitle = iconTitle;
    }

    public int getIconImg() {
        return iconImg;
    }

    public void setIconImg(int iconImg) {
        this.iconImg = iconImg;
    }
}
