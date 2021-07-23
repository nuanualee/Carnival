package com.example.music_carnival.Page.Moments.DanceWall;

public class VideoObject {

    //video url and description here
    public String videoURL,videoTitle, videoDescription, videoCreator;
    public int drawable;

    public VideoObject(String videoURL, String videoTitle, String videoDescription, String videoCreator, int drawable) {
        this.videoURL = videoURL;
        this.videoTitle = videoTitle;
        this.videoDescription = videoDescription;
        this.videoCreator = videoCreator;
        this.drawable = drawable;
    }


    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    public String getVideoCreator() {
        return videoCreator;
    }

    public void setVideoCreator(String videoCreator) {
        this.videoCreator = videoCreator;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
