package SongCollection.Song.AlternativeIndie;

import com.example.music_carnival.R;

public class AltIndieSongCollection {
    public AltIndieSong[] altIndieSongs = new AltIndieSong[10];

    public AltIndieSongCollection() {

        //alternative
        AltIndieSong shyAway = new AltIndieSong("txtSA",
                "Shy Away",
                "Twenty One Pilots",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Twenty%20One%20Pilots%20-%20Shy%20Away%20(Lyric%20Video).mp3?alt=media&token=7164dd22-46f1-4376-8194-409213a57b78",
                3.87,
                R.drawable.shyaway);
        AltIndieSong peopleHelpThePeople = new AltIndieSong("txtPHTP",
                "People Help The People",
                "Cherry Ghost",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Cherry%20Ghost%20-%20People%20help%20the%20people%20%5BLyrics%5D.mp3?alt=media&token=99cf3a4a-922f-4d50-8920-b4231e864f64",
                3.87,
                R.drawable.peoplehelpthepeople);
        AltIndieSong heartbreakAnniversary = new AltIndieSong("txtHB",
                "Heartbreak Anniversary",
                "Giveon",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Giveon%20-%20Heartbreak%20Anniversary%20(Lyrics).mp3?alt=media&token=825f6502-ac5c-4acf-bb86-965847579a24",
                3.87,
                R.drawable.heartbreakann);
        AltIndieSong magic24k = new AltIndieSong("txtMagic",
                "24k Magic",
                "Bruno Mars",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Bruno%20Mars%20-%2024K%20Magic%20(Lyrics).mp3?alt=media&token=b9a97761-38d3-41e1-a877-53062309b972",
                3.77,
                R.drawable.magic24k);

        AltIndieSong goodGrief = new AltIndieSong("txtGG",
                "Good Grief",
                "Bastille",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Bastille%20-%20Good%20Grief%20(Lyrics).mp3?alt=media&token=6aaaf3ac-98f3-4a47-923e-87cd5e3b0460",
                3.30,
                R.drawable.n_goodgrief);

        AltIndieSong broken = new AltIndieSong("txtBroken",
                "Broken",
                "lovelytheband",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Broken%20-%20Lovelytheband.mp3?alt=media&token=4ae4f3c3-8c2a-48b3-ae07-728f1f275bc4",
                3.19,
                R.drawable.n_broken);

        AltIndieSong someoneNew = new AltIndieSong("txtSomeone",
                "Someone New",
                "Hozier",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Hozier%20-%20Someone%20New%20(Lyrics).mp3?alt=media&token=205292a6-fe75-4909-8edd-95b80b76d9d3",
                3.42,
                R.drawable.n_someonenew);

        AltIndieSong moralOfTheStory = new AltIndieSong("txtMOFTS",
                "Moral Of The Story",
                "Ashe & Niall Horan",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Ashe%20feat.%20Niall%20Horan%20-%20Moral%20of%20the%20Story%20(lyrics).mp3?alt=media&token=1eb2c8b0-9e91-4282-892a-69feef65146a",
                3.19,
                R.drawable.n_moralofthestory);

        AltIndieSong mountainSound = new AltIndieSong("txtMountain",
                "Mountain Sound",
                "Of Monsters And Men",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Of%20Monsters%20And%20Men%20-%20Mountain%20Sound%20(Official%20Lyric%20Video).mp3?alt=media&token=2b2c9e87-9be7-4d47-b08e-23950119fa23",
                3.31,
                R.drawable.n_mountainsound);

        AltIndieSong hoHey = new AltIndieSong("txtHoHey",
                "Ho Hey",
                "The Lumineers",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Ho%20Hey%20The%20Lumineers%20(Lyrics%20HD%20).mp3?alt=media&token=485446eb-d3c0-4cfc-b524-390e16feb255",
                2.39,
                R.drawable.n_hohey);




        altIndieSongs[0] = shyAway;
        altIndieSongs[1] = peopleHelpThePeople;
        altIndieSongs[2] = heartbreakAnniversary;
        altIndieSongs[3] = magic24k;
        altIndieSongs[4] = goodGrief;
        altIndieSongs[5] = broken;
        altIndieSongs[6] = someoneNew;
        altIndieSongs[7] = moralOfTheStory;
        altIndieSongs[8] = mountainSound;
        altIndieSongs[9] = hoHey;


    }

    public AltIndieSong getCurrentSong(int currentSongID) {
        return altIndieSongs[currentSongID];
    }


    //create method
    public int searchSongById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < altIndieSongs.length; i++) { //song.length = 3 items
            AltIndieSong tempSong = altIndieSongs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }


    //WEEK 11: now we will create two more functions

    public int getNextSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex >= altIndieSongs.length - 1) { //checking song minus one
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
