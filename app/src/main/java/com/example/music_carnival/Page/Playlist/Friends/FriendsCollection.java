package com.example.music_carnival.Page.Playlist.Friends;

import com.example.music_carnival.R;

public class FriendsCollection {

    public Friends[] friends= new Friends[4];

    public FriendsCollection(){
        Friends viewFriendOne = new Friends(
                R.drawable.pfp_frog,
                "Alex",
                "friend1",

                R.drawable.pfp_fawn,
                R.drawable.pfp_seal,
                R.drawable.pfp_alpaca,
                R.drawable.pfp_monkey,
                R.drawable.pfp_bear,

                "playlistCover1",
                R.drawable.a_daydream,
                "playlistCover2",
                R.drawable.a_crowd,
                "playlistCover3",
                R.drawable.a_same_time,
                "playlistCover4",
                R.drawable.a_strangers,

                "DAYDREAM",
                "CROWD",
                "SAME TIME",
                "STRANGERS",

                "Indie",
                "J-Pop",
                "R&B/Soul",
                "Contemporary");



        Friends viewFriendTwo = new Friends(
                R.drawable.pfp_pug,
                "Miku",
                "friend2",

                R.drawable.pfp_cat,
                R.drawable.pfp_giraffe,
                R.drawable.pfp_monkey,
                R.drawable.pfp_elephant,
                R.drawable.pfp_goat,

                "playlistCover1",
                R.drawable.b_infinite,
                "playlistCover2",
                R.drawable.b_ok,
                "playlistCover3",
                R.drawable.b_clueless,
                "playlistCover4",
                R.drawable.b_create,

                "INFINITE",
                "OK? MAYBE",
                "YOU'RE CLUELE...",
                "A LIFE TO CRE...",

                "Contemporary",
                "Dance/Electronic",
                "Rap",
                "Pop");


        Friends viewFriendThree = new Friends(
                R.drawable.pfp_giraffe,
                "Haru",
                "friend3",

                R.drawable.pfp_bear,
                R.drawable.pfp_fox,
                R.drawable.pfp_seal,
                R.drawable.pfp_cat,
                R.drawable.pfp_fawn,

                "playlistCover1",
                R.drawable.c_everything,
                "playlistCover2",
                R.drawable.c_beauty,
                "playlistCover3",
                R.drawable.c_falling,
                "playlistCover4",
                R.drawable.c_blessed,

                "FOR EVERYTH...",
                "BEAUTY IN ALL",
                "FALLING AGAIN",
                "BLESSED",

                "J-Pop",
                "Pop",
                "Dance/Electronic",
                "K-Pop");


        Friends viewFriendFour = new Friends(
                R.drawable.pfp_seal,
                "Nin",
                "friend4",

                R.drawable.pfp_pug,
                R.drawable.pfp_giraffe,
                R.drawable.pfp_monkey,
                R.drawable.pfp_giraffe,
                R.drawable.pfp_elephant,

                "playlistCover1",
                R.drawable.d_one,
                "playlistCover2",
                R.drawable.d_two,
                "playlistCover3",
                R.drawable.d_three,
                "playlistCover4",
                R.drawable.d_four,

                ".FIRST",
                ".TWO",
                ".THREE",
                ".LAST",

                "K-Pop",
                "Contemporary",
                "R&B/Soul",
                "Dance/Electronic");
        friends[0] = viewFriendOne;
        friends[1] = viewFriendTwo;
        friends[2] = viewFriendThree;
        friends[3] = viewFriendFour;

    }

    public Friends getCurrentFriend (int currentFriendID){
        return friends [currentFriendID];
    }

    public int searchFriendById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < friends.length; i++) { //song.length = 3 items
            Friends tempFriends = friends[i];

            if (tempFriends.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }

}
