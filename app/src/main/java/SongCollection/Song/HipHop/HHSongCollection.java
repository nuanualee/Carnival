package SongCollection.Song.HipHop;

import com.example.music_carnival.R;

public class HHSongCollection {

    public HHSong[] hhSongs = new HHSong[10];

    public HHSongCollection() {

    //hip hop
    HHSong superBass = new HHSong("txtSB",
            "Super Bass",
            "Nicki Minaj",
            "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Nicki%20Minaj-Super%20Bass(lyrics)%202011(NEW).mp3?alt=media&token=552d2c3b-1050-4cbe-bbf5-39d9094c9f39",
            3.23,
            R.drawable.superbass);
    HHSong walkMeHome = new HHSong("txtWMH",
            "Walk Me More",
            "P!nk",
            "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/P!nk%20-%20Walk%20Me%20Home%20(Lyrics).mp3?alt=media&token=e6cdeae7-32df-461d-a2aa-8c358ccfdc6e",
            2.57,
            R.drawable.hurt2bhuman);
    HHSong mothersDaughter = new HHSong("txtMD",
            "Mother's Daughter",
            "Miley Cyrus",
            "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20Mother's%20Daughter%20(Audio).mp3?alt=media&token=83984147-728b-4643-94bf-e4e1b82cbe53",
            3.40,
            R.drawable.mothersdaughter);
    HHSong glassOfHeart = new HHSong("txtHOG",
            "Heart Of Glass",
            "Miley Cyrus",
            "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20Heart%20Of%20Glass%20(Live%20from%20the%20iHeart%20Festival).mp3?alt=media&token=b9c129ff-4958-463f-8265-13478a821602",
            3.35,
            R.drawable.heartofglass);

    HHSong sunflower = new HHSong("txtSunflower",
            "Sunflower",
            "Post Malone & Swae Lee",
            "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Sunflower%20-%20Post%20Malone%20feat%20Swae%20Lee%20(Spider-Man%20Into%20The%20Spider-Verse)%20SOUNDTRACK.mp3?alt=media&token=2d5bd6d8-9edf-40d9-9205-7b7508f80252",
            2.38,
            R.drawable.n_sunflower);

    HHSong seeYouAgain = new HHSong("txtSYA",
            "See You Again",
            "Wiz Khalifa & Charlie Puth",
            "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/See%20You%20Again%20(feat.%20Charlie%20Puth).mp3?alt=media&token=bb314af3-c758-4a75-ba8f-4b9e74d722df",
            3.49,
            R.drawable.n_seeyouagain);

    HHSong circles = new HHSong("txtCircles",
            "Circles",
            "Post Malone",
            "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Post%20Malone%20-%20Circles%20(Official%20Audio).mp3?alt=media&token=2ae3d648-ac4d-4880-8fec-3a45e9dfa597",
            3.35,
            R.drawable.n_hollywoodbleeding);

    HHSong oneDance  = new HHSong("txtOneDance",
            "One Dance",
            "Drake, Wizkid & Kayla",
            "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/One%20Dance-Drake%20(feat.%20Wizkid%20%26%20Kyla).mp3?alt=media&token=6573ceb4-3ad5-4579-b3ee-bc6bfa7e3052",
            2.55,
            R.drawable.n_onedancec);

    HHSong roxanne = new HHSong("txtROXANNE",
            "ROXANNE",
            "Arizona Zervas",
            "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/ROXANNE.mp3?alt=media&token=6f8e9411-8938-4d51-b782-fbf667a8e9ce",
            2.42,
            R.drawable.n_roxanne);

    HHSong peaches = new HHSong("txtPeaches",
            "Peaches",
            "Justine Bieber, Daniel Caesar & Giveon ",
            "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Peaches.mp3?alt=media&token=cd1575dc-2c70-4de9-81b4-288fb2404e48",
            3.18,
            R.drawable.n_peaches);

        hhSongs[0] = superBass;
        hhSongs[1] = walkMeHome;
        hhSongs[2] = mothersDaughter;
        hhSongs[3] = glassOfHeart;
        hhSongs[4] = sunflower;
        hhSongs[5] = seeYouAgain;
        hhSongs[6] = circles;
        hhSongs[7] = oneDance;
        hhSongs[8] = roxanne;
        hhSongs[9] = peaches;


}

    public HHSong getCurrentSong(int currentSongID) {
        return hhSongs[currentSongID];
    }


    //create method
    public int searchSongById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < hhSongs.length; i++) { //song.length = 3 items
            HHSong tempSong = hhSongs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }


    //WEEK 11: now we will create two more functions

    public int getNextSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex >= hhSongs.length - 1) { //checking song minus one
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
