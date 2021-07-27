package com.example.music_carnival.Page.Moments.MomentsPackage;

public class MyMoment {

    String userName;
    String userDetail;
    String songChose;
    String keyMoment;

    public MyMoment() {
    }

    public MyMoment(String userName, String userDetail, String songChose, String keyMoment) {
        this.userName = userName;
        this.userDetail = userDetail;
        this.songChose = songChose;
        this.keyMoment = keyMoment;
    }

    public String getKeyMoment() {
        return keyMoment;
    }

    public void setKeyMoment(String keyMoment) {
        this.keyMoment = keyMoment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(String userDetail) {
        this.userDetail = userDetail;
    }

    public String getSongChose() {
        return songChose;
    }

    public void setSongChose(String songChose) {
        this.songChose = songChose;
    }


}
