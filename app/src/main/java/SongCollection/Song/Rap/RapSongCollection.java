package SongCollection.Song.Rap;

import com.example.music_carnival.R;

import SongCollection.Song.All.Song;
import SongCollection.Song.JPop.JPSong;

public class RapSongCollection {
    public RapSong[] rapSongs = new RapSong[4];

    public RapSongCollection() {
        //rap
        RapSong sickoMode = new RapSong("txtSM",
                "SICKO MODE",
                "Travis Scott",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Travis%20Scott%20-%20SICKO%20MODE%20(Audio).mp3?alt=media&token=66e54f0b-1897-4250-a9d9-2086aea3ccaa",
                5.21,
                R.drawable.sickomode);
        RapSong ourTimeTogether = new RapSong("txtOTT",
                "Our Time Together",
                "Ivan B & Marie Elizabeth",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Ivan%20B%20-%20Our%20Time%20Together%20(ft.%20Marie%20Elizabeth)%20(Prod.%20Kevin%20Peterson).mp3?alt=media&token=4c26ff54-50a7-40c4-9c37-3ab42305f1e3",
                4.35,
                R.drawable.ourtimetogether);
        RapSong seventhDay = new RapSong("txtSD",
                "7th Day",
                "Token",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/7th%20Day.mp3?alt=media&token=c7e2c32c-b52d-4a71-b371-7d084a0f46b2",
                4.06,
                R.drawable.seventhday);
        RapSong comingInHot = new RapSong("txtCIH",
                "Coming In Hot",
                "Andy Mineo",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Lecrae%20%26%20Andy%20Mineo%20-%20Coming%20In%20Hot.mp3?alt=media&token=90e06af7-ecfd-43bf-80a3-8d50da952ed0",
                3.34,
                R.drawable.cominginhot);

        rapSongs[0] = sickoMode;
        rapSongs[1] = ourTimeTogether;
        rapSongs[2] = seventhDay;
        rapSongs[3] = comingInHot;

    }

    public RapSong getCurrentSong(int currentSongID) {
        return rapSongs[currentSongID];
    }


    //create method
    public int searchSongById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < rapSongs.length; i++) { //song.length = 3 items
            RapSong tempSong = rapSongs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }


    //WEEK 11: now we will create two more functions

    public int getNextSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex >= rapSongs.length - 1) { //checking song minus one
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
