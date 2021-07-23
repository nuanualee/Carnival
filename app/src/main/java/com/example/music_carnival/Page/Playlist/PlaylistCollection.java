package com.example.music_carnival.Page.Playlist;

import com.example.music_carnival.R;

public class PlaylistCollection {

    private final Playl[] playl = new Playl[2];

    public PlaylistCollection(){
        Playl playlistOne = new Playl(

                R.drawable.pfp_frog,
                R.drawable.pfp_pug,
                R.drawable.pfp_giraffe,
                R.drawable.pfp_seal,
                R.drawable.pfp_monkey,

                "playlistCover1",
                R.drawable.clouds_in_heads,
                "playlistCover2",
                R.drawable.exploding_car,
                "playlistCover3",
                R.drawable.air_up_there,
                "playlistCover4",
                R.drawable.flowers,

                "CLOSURE",
                "IN MY HEAD",
                "AIR UP THERE",
                "ACCEPTANCE",

                "Alternative",
                "Closure",
                "Hip-hop",
                "R&B/Soul");


        Playl playlistTwo = new Playl(

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

        playl[0] = playlistOne;
        playl[1] = playlistTwo;

    }

    public Playl getCurrentPlaylist(int currentPlaylistID) {
        return playl [currentPlaylistID];
    }
}
