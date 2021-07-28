package com.example.music_carnival.ArtistCollection;

import com.example.music_carnival.R;

public class ArtistCollection {

    private final Artist[] artist = new Artist[4];

    public ArtistCollection (){

        Artist harryStyles = new Artist("artistHarryStyles",
                "HARRY" +  "\nSTYLES",
                "Sign Of The Times",
                "Watermelon Sugar",
                "Adore You",
                5.41,
                2.53,
                3.27,
                4.6,
                4.4,
                4.0,
                R.drawable.artist_harrystyles);


        Artist mileyCyrus = new Artist("artistMileyCyrus",
                "MILEY" +  "\nCYRUS",
                "Party in the U.S.A",
                "Wrecking Ball",
                "We Can't Stop",
                3.22,
                3.41,
                3.51,
                1.6,
                1.5,
                1.5,
                R.drawable.artist_miley);


        Artist pink = new Artist("artistPink",
                "P!NK",
                "Don't Let Me Get Me",
                "Just Give Me A Reason",
                "All I Know So Far",
                3.31,
                4.03,
                4.62,
                2.6,
                2.0,
                1.8,
                R.drawable.artist_pink);




        Artist nissy = new Artist("txtNissy",
                "NISSY",
                "Relax & Chill",
                "Don't Let Me Go",
                "Toriko",
                5.22,
                3.19,
                3.51,
                1.6,
                1.5,
                1.3,
                R.drawable.artist_nissy);


        Artist vaundy = new Artist("txtVaundy2",
                "Vaundy",
                "Don't Let Me Get Me",
                "Just Give Me A Reason",
                "All I Know So Far",
                3.31,
                4.03,
                4.62,
                2.6,
                2.0,
                1.8,
                R.drawable.artist_pink);

        artist [0] = harryStyles;
        artist [1] = mileyCyrus;
        artist [2] = pink;
        artist [3] = nissy;

    }

    public Artist getCurrentArtist (int currentArtistID){
        return artist [currentArtistID];

    }

    //create method
    public int searchArtistById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < artist.length; i++) { //song.length = 3 items
            Artist tempArtist = artist[i];

            if (tempArtist.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }
}
