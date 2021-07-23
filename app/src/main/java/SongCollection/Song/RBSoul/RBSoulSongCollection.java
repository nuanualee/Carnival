package SongCollection.Song.RBSoul;

import com.example.music_carnival.R;

import SongCollection.Song.All.Song;
import SongCollection.Song.Rap.RapSong;

public class RBSoulSongCollection {

    public RBSoulSong[] rbSoulSongs = new RBSoulSong[10];

    public RBSoulSongCollection() {


        //r&b soul
        RBSoulSong malibu = new RBSoulSong("txtMalibu",
                "Malibu",
                "Miley Cyrus",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20Malibu.mp3?alt=media&token=90df0bb5-8fba-42ee-9f92-7daca0115407",
                3.48,
                R.drawable.younger_now);
        RBSoulSong lightsUp = new RBSoulSong("txtLU",
                "Lights Up",
                "Harry Styles",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Harry%20Styles%20-%20Lights%20Up%20(Audio).mp3?alt=media&token=623375b3-d806-47bb-ae5b-77fb7e38e936",
                2.52,
                R.drawable.harrystyles);
        RBSoulSong justGiveMeAReason = new RBSoulSong("txtJGMAR",
                "Just Give Me A Reason",
                "P!nk & Nate Ruess",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/P!nk%20-%20Just%20Give%20Me%20A%20Reason%20(Official%20Lyric%20Video).mp3?alt=media&token=a80ef544-0993-42e5-8c9f-60d52eaa7e8b",
                3.87,
                R.drawable.truthaboutlove);
        RBSoulSong leaveTheDoorOpen = new RBSoulSong("txtLTDO",
                "Leave The Door Open",
                "P!nk & Nate Ruess",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Bruno%20Mars%2C%20Anderson%20.Paak%20-%20Leave%20The%20Door%20Open%20(Lyrics).mp3?alt=media&token=30255434-245e-4d62-a93c-510578a14f5a",
                4.02,
                R.drawable.leavethedooropen);

        RBSoulSong wastingTime = new RBSoulSong("txtWasting",
                "Wasting Time",
                "Brent Faiyaz & Drake",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Brent%20Faiyaz%2C%20Drake%20-%20Wasting%20Time%20(Lyrics).mp3?alt=media&token=43cd0533-aa88-4e47-b05c-f7989c2b9166",
                4.59,
                R.drawable.n_wastingtime);

        RBSoulSong tragic = new RBSoulSong("",
                "Tragic",
                "Jazmine Sullivan",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Jazmine%20Sullivan%20-%20Tragic%20(Lyrics).mp3?alt=media&token=75225c69-4ca2-4804-a6d6-29b9e00b4e6b",
                3.29,
                R.drawable.n_tragic);

        RBSoulSong outtaTime = new RBSoulSong("",
                "Outta Time",
                "Bryson Tiller & Drake",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Bryson%20Tiller%20-%20Outta%20Time%20(Lyrics)%20ft.%20Drake.mp3?alt=media&token=774d09af-f6a2-4be2-9e7c-38d9ef0439b1",
                3.19,
                R.drawable.n_outtatime);

        RBSoulSong notAnotherLoveSong = new RBSoulSong("",
                "Not Another Love Song",
                "Ella Mai",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Ella%20MaiNot%20Another%20Love%20Song%20(Official%20Audio).mp3?alt=media&token=4eddf626-f753-491b-b9f2-4827bcdc1697",
                3.39,
                R.drawable.n_notanotherlovesong);

        RBSoulSong byYourself = new RBSoulSong("",
                "By Yourself",
                "Ty Dolla $ign, Bryson Tiller, \n" +
                        "Jhene Aiko & Mustard\n",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Ty%20Dolla%20%24ign%20-%20By%20Yourself%20(feat.%20Jhen%C3%A9%20Aiko%20%26%20Mustard)%20%5BLyric%20Video%5D.mp3?alt=media&token=e166e08e-8ef1-4451-ba57-037fab19c37f",
                2.29,
                R.drawable.n_byyourself);

        RBSoulSong myAffection = new RBSoulSong("",
                "My Affection",
                "Summer Walker & \n" +
                        "PARTYNEXTDOOR",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Summer%20Walker%20-%20My%20Affection%20ft.%20PARTYNEXTDOOR%20(Lyrics).mp3?alt=media&token=f2bd9484-c6af-4ef6-9f40-c92d641be345",
                3.34,
                R.drawable.n_myaffection);



        rbSoulSongs[0] = malibu;
        rbSoulSongs[1] = lightsUp;
        rbSoulSongs[2] = justGiveMeAReason;
        rbSoulSongs[3] = leaveTheDoorOpen;
        rbSoulSongs[4] = wastingTime;
        rbSoulSongs[5] = tragic;
        rbSoulSongs[6] = outtaTime;
        rbSoulSongs[7] = notAnotherLoveSong;
        rbSoulSongs[8] = byYourself;
        rbSoulSongs[9] = myAffection;

    }

    public RBSoulSong getCurrentSong(int currentSongID) {
        return rbSoulSongs[currentSongID];
    }


    //create method
    public int searchSongById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < rbSoulSongs.length; i++) { //song.length = 3 items
            RBSoulSong tempSong = rbSoulSongs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }


    //WEEK 11: now we will create two more functions

    public int getNextSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex >= rbSoulSongs.length - 1) { //checking song minus one
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
