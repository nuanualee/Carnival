package SongCollection.Song.Contemporary;

import com.example.music_carnival.R;

public class ContempSongCollection {
    public ContempSong[] contempSongs = new ContempSong[10];

    public ContempSongCollection() {

        //contemp
        ContempSong ifTheWorldWasEnding = new ContempSong("txtITWWE",
                "If The World Was Ending",
                "JP Saxe & Julia Micheals",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Jp%20Saxe%20-%20If%20The%20World%20Was%20Ending%20(Lyrics)%20Ft.%20Julia%20Michaels.mp3?alt=media&token=e0c33556-1089-4ebb-81ec-913afc0e8ba9",
                3.48,
                R.drawable.iftheworldwasending);

        ContempSong contempAngelsLikeYou = new ContempSong("txtCTALY",
                "Plastic Hearts",
                "Miley Cyrus",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20Angels%20Like%20You%20(Audio).mp3?alt=media&token=8aa1b5c5-2845-4be6-a0ea-2c419eb26bc2",
                3.27,
                R.drawable.plastichearts);

        ContempSong adoreYou = new ContempSong("txtAdore",
                "Adore You",
                "Harry Styles",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Harry%20Styles%20-%20Adore%20You%20(Official%20Audio).mp3?alt=media&token=242502d9-e2ac-4acf-90a8-8c0898d68a7c",
                3.45,
                R.drawable.harrystyles);
        ContempSong youSay = new ContempSong("txtYS",
                "You Say",
                "Lauren Daigle",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Lauren%20Daigle%20-%20You%20Say%20(Lyrics).mp3?alt=media&token=9a48ed23-0eb5-4470-bb44-1ffe6860dbee",
                4.58,
                R.drawable.yousay);

        ContempSong someoneYouLoved = new ContempSong("txtSYL",
                "Someone You Loved",
                "Lewis Capaldi",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Lewis%20Capaldi%20-%20Someone%20You%20Loved%20(Lyrics).mp3?alt=media&token=025a9259-72c9-4868-8990-f90e7cd7f5ba",
                3.03,
                R.drawable.n_someoneyouloved);

        ContempSong sucker = new ContempSong("txtSucker",
                "Sucker",
                "Jonas Brother",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Jonas%20Brothers%20-%20Sucker%20(Lyrics).mp3?alt=media&token=56cd4805-bca2-4cb0-8627-134c0c9650b0",
                3.02,
                R.drawable.n_sucker);

        ContempSong circles = new ContempSong("txtCircles",
                "Circles",
                "Post Malone",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Post%20Malone%20-%20Circles%20(Official%20Audio).mp3?alt=media&token=2ae3d648-ac4d-4880-8fec-3a45e9dfa597",
                3.33,
                R.drawable.n_hollywoodbleeding);

        ContempSong loseYouToLoveMe = new ContempSong("txtLYTLM",
                "Lose You To Love Me",
                "Selena Gomez",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Selena%20Gomez%20-%20Lose%20You%20To%20Love%20Me%20(Lyrics).mp3?alt=media&token=ef292487-f775-4362-80d9-2af85643b779",
                3.19,
                R.drawable.n_loseyoutoloveme);

        ContempSong lover = new ContempSong("txtLover",
                "Lover",
                "Taylor Swift",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Taylor%20Swift%20-%20Lover%20(Lyrics).mp3?alt=media&token=4b4dacf3-c6f6-4925-b5b2-82c33cf9fccc",
                3.42,
                R.drawable.n_lover);


        ContempSong beautifulPeople = new ContempSong("txtBP",
                "Beautiful People",
                "Ed Sheeran & Khalid",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Ed%20Sheeran%2C%20KhalidBeautiful%20People%20(Lyrics).mp3?alt=media&token=896544b9-4f3f-4578-b58e-d25d6dec0a30",
                3.30,
                R.drawable.n_beautifulpeople);




        contempSongs[0] = ifTheWorldWasEnding;
        contempSongs[1] = contempAngelsLikeYou;
        contempSongs[2] = adoreYou;
        contempSongs[3] = youSay;
        contempSongs[4] = someoneYouLoved;
        contempSongs[5] = sucker;
        contempSongs[6] = circles;
        contempSongs[7] = loseYouToLoveMe;
        contempSongs[8] = lover;
        contempSongs[9] = beautifulPeople;
    }

    public ContempSong getCurrentSong(int currentSongID) {
        return contempSongs[currentSongID];
    }


    //create method
    public int searchSongById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < contempSongs.length; i++) { //song.length = 3 items
            ContempSong tempSong = contempSongs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }


    //WEEK 11: now we will create two more functions

    public int getNextSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex >= contempSongs.length - 1) { //checking song minus one
            return currentSongIndex;
        } else {
            return currentSongIndex + 1; //returning back the number eg. 2. Which is our next song
        }
    }

    public int getPrevSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex <= 0) { //checking song = 0
            return currentSongIndex;
        } else {
            return currentSongIndex - 1; // now 0 is passed into CSI.
        }

    }
}
