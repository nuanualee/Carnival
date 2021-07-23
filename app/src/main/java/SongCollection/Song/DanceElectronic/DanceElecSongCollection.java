package SongCollection.Song.DanceElectronic;

import com.example.music_carnival.R;

public class DanceElecSongCollection {
    public DanceElecSong[] danceElecSongs = new DanceElecSong[10];

    public DanceElecSongCollection() {

        //j-pop
        DanceElecSong whoDoYouLove = new DanceElecSong("txtWDYL",
                "Who Do You Love",
                "The Chainsmokers",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/The%20Chainsmokers%2C5%20Seconds%20Of%20Summer%20-%20Who%20Do%20You%20Love%20(Audio).mp3?alt=media&token=925a5f5b-9b66-4906-aaad-993f68d7b34d",
                3.46,
                R.drawable.whodoyoulove);
        DanceElecSong timber = new DanceElecSong("txtTimber",
                "Timber",
                "Pitbull & Kesha",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Pitbull%20-%20Timber%20(Audio)%20ft.%20Ke%24ha.mp3?alt=media&token=26f57d8a-f2da-4b46-905e-8719b362ed88",
                3.25,
                R.drawable.pbmeltdown);
        DanceElecSong weCantStop = new DanceElecSong("txtWCS",
                "We Can't Stop",
                "Sorry",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20We%20Can't%20Stop%20(Audio).mp3?alt=media&token=fad70633-18e7-4dcf-8416-1ce5f923bcae",
                3.53,
                R.drawable.bangerz);
        DanceElecSong sorry = new DanceElecSong("txtSorry",
                "Sorry",
                "Alan Walker",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Alan%20Walker%20%26%20IS%C3%81K%20-%20Sorry%20(Audio).mp3?alt=media&token=a5991a0f-bc43-41bd-9e10-e2a95ea76143",
                2.45,
                R.drawable.sorry);


        DanceElecSong allFallsDown = new DanceElecSong("txtAFD",
                "All Falls Down",
                "Alan Walker, Noah Cyrus &\n" +
                        "Digital Farm Animals \n",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Alan%20WalkerAll%20Falls%20Down%20(LyricsLyric%20Video)%20ft.%20Noah%20Cyrus%20%26%20Digital%20Farm%20Animals.mp3?alt=media&token=6e2910f8-ad27-4cc9-9552-06a6059374c3",
                3.26,
                R.drawable.n_allfallsdown);

        DanceElecSong allWeKnow = new DanceElecSong("txtAWK",
                "All We Know",
                "The Chainsmokers & Phoebe Ryan",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/The%20Chainsmokers%20ft.%20Phoebe%20RyanAll%20We%20Know%20-%20Lyrics.mp3?alt=media&token=7d6837d8-a9ba-4ce2-b7af-0a8ae3ff4317",
                3.16,
                R.drawable.n_allweknow);

        DanceElecSong layItAllOnMe = new DanceElecSong("txtLIAOM",
                "Lay It All On Me",
                "Rudimental & Ed Sheeran",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Rudimental%20Feat.%20Ed%20Sheeran%20Lay%20It%20All%20On%20Me%20%5BOfficial%20Audio%5D.mp3?alt=media&token=ab1963ef-56ce-440b-9278-ca614da83d83",
                4.03,
                R.drawable.n_layitallonme);

        DanceElecSong oneKiss = new DanceElecSong("txtOk",
                "One Kiss",
                "Calvin Harris & Dua Lipa",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Calvin%20Harris%2C%20Dua%20Lipa%20-%20One%20Kiss%20(Lyric%20Video).mp3?alt=media&token=910f4720-e1fc-46a1-ad1a-d41df95c8d11",
                3.32,
                R.drawable.n_onekiss);

        DanceElecSong allForLove = new DanceElecSong("txtAFL",
                "All For Love",
                "Tungevaag & Raaban",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Tungevaag%2C%20Raaban%20-%20All%20For%20Love.mp3?alt=media&token=db70329f-e831-4158-b8db-7d03901fae3d",
                3.01,
                R.drawable.n_allforlove);

        DanceElecSong allMyLove = new DanceElecSong("txtAML",
                "All My Love",
                "Cash Cash & Conor Maynard",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Cash%20Cash%20-%20All%20My%20Love%20feat.%20Conor%20Maynard%20(lyrics).mp3?alt=media&token=fa8897bc-c988-4a31-beff-a0dfeb92624f",
                3.12,
                R.drawable.n_allmylove);




        danceElecSongs[0] = whoDoYouLove;
        danceElecSongs[1] = timber;
        danceElecSongs[2] = weCantStop;
        danceElecSongs[3] = sorry;
        danceElecSongs[4] = allFallsDown;
        danceElecSongs[5] = allWeKnow;
        danceElecSongs[6] = layItAllOnMe;
        danceElecSongs[7] = oneKiss;
        danceElecSongs[8] = allForLove;
        danceElecSongs[9] = allMyLove;


    }

    public DanceElecSong getCurrentSong(int currentSongID) {
        return danceElecSongs[currentSongID];
    }


    //create method
    public int searchSongById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < danceElecSongs.length; i++) { //song.length = 3 items
            DanceElecSong tempSong = danceElecSongs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }


    //WEEK 11: now we will create two more functions

    public int getNextSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex >= danceElecSongs.length - 1) { //checking song minus one
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
