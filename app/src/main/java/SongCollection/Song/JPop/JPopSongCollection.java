package SongCollection.Song.JPop;

import com.example.music_carnival.R;

import SongCollection.Song.JPop.JPSong;

public class JPopSongCollection {

    public JPSong[] jpSongs = new JPSong[10];

    public JPopSongCollection() {

        //j-pop
        JPSong napori = new JPSong("txtNapori",
                "napori",
                "Vaundy",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/napori.mp3?alt=media&token=acaf899a-e20a-48de-92e4-d9ae99f1f394",
                3.40,
                R.drawable.napori);
        JPSong toriko = new JPSong("txtToriko",
                "Toriko",
                "Nissy",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Nissy%20-%20%E3%83%88%E3%83%AA%E3%82%B3%20(toriko)(Prisoner)%20(Color%20Coded%20Lyrics%20KanRomEng).mp3?alt=media&token=e8bc68bf-dd22-46f8-b065-ed46c24b3830",
                3.87,
                R.drawable.relaxandchill);
        JPSong standByMeYou = new JPSong("txtStand",
                "Stand By me, stand by you.",
                "HIRAIDAI",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/%E5%B9%B3%E4%BA%95%20%E5%A4%A7%20Stand%20by%20me%2C%20Stand%20by%20you.Lyric%20Video.mp3?alt=media&token=09517a97-d2ea-4c7d-9bb2-3d29c5924fd9",
                3.22,
                R.drawable.standbymeyou);
        JPSong dryFlower = new JPSong("txtDry",
                "Dry Flower",
                "Yuuri",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/%E5%84%AA%E9%87%8C%20%E3%83%89%E3%83%A9%E3%82%A4%E3%83%95%E3%83%A9%E3%83%AF%E3%83%BC%20Official%20Music%20Video%20-%E3%83%87%E3%82%A3%E3%83%AC%E3%82%AF%E3%82%BF%E3%83%BC%E3%82%BA%E3%82%AB%E3%83%83%E3%83%88ver.-.mp3?alt=media&token=24fa163e-3e11-42ae-a77e-f5b965646ea4",
                4.76,
                R.drawable.dryflower);

        JPSong viewOfLife = new JPSong("txtVOL",
                "View of Life",
                "Tokyo Incidents",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/View%20of%20Life.mp3?alt=media&token=c0c87ccc-c512-47a9-8f1d-59b75d178902",
                2.56,
                R.drawable.n_viewoflife);

        JPSong konomama = new JPSong("txtKono",
                "konomama",
                "DOBERMAN INFINITY",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/doberman-infinitykonomamaofficial-music-video_EQOne4fE.mp3?alt=media&token=db5745ba-0b30-403e-9471-a4ef025ecf0d",
                3.35,
                R.drawable.n_konomama);


        JPSong summer = new JPSong("txtSummer",
                "Summer Samasama",
                "7ORDER",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Summer%20Samasama.mp3?alt=media&token=387e5ff5-4377-44e2-b78c-8a762b78fd34",
                3.09,
                R.drawable.n_summersamasama);


        JPSong benefits= new JPSong("txtBenefits",
                "Benefits",
                "Vaundy",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Vaundy%20benefits%20%E5%92%8C%E8%A8%B3%E6%96%B0%E6%9B%B2.mp3?alt=media&token=210f8eab-b8b9-47c8-bcc0-8f5a4b7b2e65",
                4.10,
                R.drawable.n_benefits);


        JPSong taketen = new JPSong("txtTaketen",
                "Taketen",
                "GReeeeN",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/%5B%E0%B9%81%E0%B8%9B%E0%B8%A5%E0%B9%84%E0%B8%97%E0%B8%A2%5D%20Taketen%20-%20%E3%81%9F%E3%81%91%E3%81%A6%E3%82%93GReeeeN.mp3?alt=media&token=d56561e0-fef8-4879-83d3-9400232b0cb1",
                3.52,
                R.drawable.n_taketen);


        JPSong perfectWorld = new JPSong("txtPerfect",
                "Perfect World",
                "TWICE",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/TWICE%20Perfect%20World%20Lyrics%20(Color%20Coded%20Lyrics%20EngRomKan).mp3?alt=media&token=3225de9b-abc6-4d63-a545-dca58f52c7df",
                3.41,
                R.drawable.n_perfectworld);


        jpSongs[0] = napori;
        jpSongs[1] = toriko;
        jpSongs[2] = standByMeYou;
        jpSongs[3] = dryFlower;
        jpSongs[4] = viewOfLife;
        jpSongs[5] = konomama;
        jpSongs[6] = summer;
        jpSongs[7] = summer;
        jpSongs[8] = taketen;
        jpSongs[9] = perfectWorld;
    }

    public JPSong getCurrentSong(int currentSongID) {
        return jpSongs[currentSongID];
    }


    //create method
    public int searchSongById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < jpSongs.length; i++) { //song.length = 3 items
            JPSong tempSong = jpSongs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }


    //WEEK 11: now we will create two more functions

    public int getNextSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex >= jpSongs.length - 1) { //checking song minus one
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
