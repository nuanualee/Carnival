package SongCollection.Song.NewIn;

import com.example.music_carnival.R;

public class NewInSongCollection {
    public NewInSong[] newInSongs = new NewInSong[10];

    public NewInSongCollection() {
        //rap
        NewInSong traitor = new NewInSong("firstCD",
                "favourite crime",
                "Olivia Rodrigo",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Olivia%20Rodrigo%20-%20favorite%20crime%20(Lyric%20Video).mp3?alt=media&token=fe195d7d-d172-4285-ab00-b36b9f933cd1",
                2.33,
                R.drawable.in_sour);

        NewInSong chlorine = new NewInSong("secondCD",
                "Chlorine",
                "Twenty one Pilots",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Twenty%20One%20Pilots%20-%20Chlorine%20(Lyrics).mp3?alt=media&token=a0252110-a109-47c9-b543-d0dc86e0fbdf",
                5.24,
                R.drawable.in_chlorine);

        NewInSong stay = new NewInSong("thirdCD",
                "Stay",
                "The Kid LAROI & Justin Bieber",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/The%20Kid%20LAROI%20%26%20Justin%20Bieber%20-%20Stay%20(Lyrics).mp3?alt=media&token=cc10ca9e-f94b-4572-aa0a-47d461740d5d",
                2.22,
                R.drawable.in_stay);

        NewInSong talkOfThisTown = new NewInSong("fourthCD",
                "Talk Of This Town",
                "Lady Antebellum",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Lady%20A%20-%20Talk%20Of%20This%20Town%20(Lyric%20Video).mp3?alt=media&token=aec62c3b-f157-4957-9495-3c25017173a5",
                3.50,
                R.drawable.in_talkofthistown);

        NewInSong kissMeMore = new NewInSong("fifthCD",
                "Kiss Me More",
                "Doja Cat & SZA",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Doja%20Cat%20-%20Kiss%20Me%20More%20(Lyrics)%20ft.%20SZA.mp3?alt=media&token=76882993-63bf-4b69-aa1e-949b7cf339a4",
                3.28,
                R.drawable.kissmemor);

        NewInSong permissionToDance = new NewInSong("sixthCD",
                "Permission to Dance",
                "BTS",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/BTS%20-%20Permission%20to%20Dance%20Lyrics%20(Color%20Coded%20Lyrics).mp3?alt=media&token=1a7d88e5-fa04-4dbd-8084-6e4ee25f3cfb",
                3.37,
                R.drawable.in_permissiontodance);

        NewInSong peopleWatching = new NewInSong("seventhCD",
                "People Watching",
                "Conan Gray",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Conan%20Gray%20-%20People%20Watching%20(Lyrics).mp3?alt=media&token=c8e0d39d-ae56-4237-88e9-aa059d7cec17",
                2.38,
                R.drawable.in_peoplewatching);

        NewInSong cureForMe = new NewInSong("eighthCD",
                "Cure For Me",
                "Aurora",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/AURORA%20-%20Cure%20for%20Me%20(Lyrics).mp3?alt=media&token=b24248df-63cb-4c9f-ad86-94d765421425",
                3.19,
                R.drawable.in_cureform);

        NewInSong badHabits = new NewInSong("ninthCD",
                "Bad Habits",
                "Ed Sheeran",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Ed%20Sheeran%20-%20Bad%20Habits%20(Lyrics).mp3?alt=media&token=b3861f64-be7a-400b-bbae-22786856eb08",
                3.52,
                R.drawable.in_badhabits);

        NewInSong eighteen = new NewInSong("tenthCD",
                "18",
                "Jeremy Zucker",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Jeremy%20Zucker%20-%2018%20(Lyrics).mp3?alt=media&token=e8c89ebb-d3b3-49ad-96f9-c9231e6e0142",
                2.29,
                R.drawable.in_eighteen);


        newInSongs[0] = traitor;
        newInSongs[1] = chlorine;
        newInSongs[2] = stay;
        newInSongs[3] = talkOfThisTown;
        newInSongs[4] = kissMeMore;
        newInSongs[5] = permissionToDance;
        newInSongs[6] = peopleWatching;
        newInSongs[7] = cureForMe;
        newInSongs[8] = badHabits;
        newInSongs[9] = eighteen;


    }

    public NewInSong getCurrentSong(int currentSongID) {
        return newInSongs[currentSongID];
    }


    //create method
    public int searchSongById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < newInSongs.length; i++) { //song.length = 3 items
            NewInSong tempSong = newInSongs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }


    //WEEK 11: now we will create two more functions

    public int getNextSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex >= newInSongs.length - 1) { //checking song minus one
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
