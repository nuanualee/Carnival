package SongCollection.Song.KPop;

import com.example.music_carnival.R;

import SongCollection.Song.All.Song;
import SongCollection.Song.Contemporary.ContempSong;

public class KPopSongCollection {

    public KPopSong[] kPopSongs = new KPopSong[10];

    public KPopSongCollection() {


        //k-pop
        KPopSong butter = new KPopSong("txtButter",
                "Butter",
                "BTS",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/BTS%20Butter%20Lyrics%20(Color%20Coded%20Lyrics).mp3?alt=media&token=6befa52a-b96e-4090-ae87-83e292830c89",
                2.76,
                R.drawable.butter);
        KPopSong howYouLikeThat = new KPopSong("txtHYLT",
                "How You Like That",
                "Blackpink",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/BLACKPINK%20-%20'How%20You%20Like%20That'%20(Official%20Audio).mp3?alt=media&token=5c14f3ed-6003-465b-8274-65be3f4c46bb",
                3.02,
                R.drawable.howyoulikethat);
        KPopSong loveScenario = new KPopSong("txtLS",
                "Love Scenario",
                "iKON",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/iKON%20(%EC%95%84%EC%9D%B4%EC%BD%98)%20-%20Love%20Scenario%20(%EC%82%AC%EB%9E%91%EC%9D%84%20%ED%96%88%EB%8B%A4)%20(Color%20Coded%20Lyrics%20EngRomHan).mp3?alt=media&token=f65b5047-4469-4452-b2b7-80e0d199b119",
                3.49,
                R.drawable.lovescenario);
        KPopSong monster = new KPopSong("txtM",
                "Monster",
                "EXO",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Monster.mp3?alt=media&token=8c709435-cea9-456b-a6c4-12aafa955cc2",
                3.69,
                R.drawable.monster);


        KPopSong lovesickGirls = new KPopSong("txtLGirls",
                "Lovesick Girls",
                "Blackpink",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/BLACKPINK%20Lovesick%20Girls%20Lyrics%20(Color%20Coded%20Lyrics).mp3?alt=media&token=2ed4cca8-5dd9-43fe-b2be-8fd8e3d986a6",
                3.11,
                R.drawable.howyoulikethat);

        KPopSong maria = new KPopSong("txtMaria",
                "Maria",
                "Hwasa",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Hwasa%20Maria%20Lyrics%20(%ED%99%94%EC%82%AC%20%EB%A7%88%EB%A6%AC%EC%95%84%20%EA%B0%80%EC%82%AC)%20%5BColor%20Coded%20LyricsHanRomEng%5D.mp3?alt=media&token=ba241e8b-5d57-4075-b327-21b2d4008294",
                3.19,
                R.drawable.howyoulikethat);

        KPopSong leftAndRight = new KPopSong("txtLandR",
                "Left And Right",
                "Seventeen",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/SEVENTEEN%20%26quotLeft%20%26amp%20Right%26quot%20(Color%20Coded%20Lyrics%20EngRomHan)%EC%84%B8%EB%B8%90%ED%8B%B4%20Left%20%26amp%20Right%20%EA%B0%80%EC%82%AC.mp3?alt=media&token=f0506407-fa6b-40f6-96f2-77a5637a32cb",
                3.23,
                R.drawable.howyoulikethat);

        KPopSong lifeGoesOn = new KPopSong("txtLGO",
                "Life Goes On",
                "BTS",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/BTS%20Life%20Goes%20On%20Lyrics%20(%EB%B0%A9%ED%83%84%EC%86%8C%EB%85%84%EB%8B%A8%20Life%20Goes%20On%20%EA%B0%80%EC%82%AC)%20%5BColor%20Coded%20LyricsHanRomEng%5D.mp3?alt=media&token=2afbf3a7-7a70-42eb-8e96-46a239b105dc",
                3.27,
                R.drawable.n_lifegoeson);

        KPopSong fancy = new KPopSong("txtFancy",
                "Fancy",
                "Twice",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/TWICE%20(%ED%8A%B8%EC%99%80%EC%9D%B4%EC%8A%A4)%20FANCY%20(Color%20Coded%20Lyrics%20EngRomHan%EA%B0%80%EC%82%AC).mp3?alt=media&token=aa681c54-f0cf-47b6-bbc6-878d1127fa8e",
                3.36,
                R.drawable.howyoulikethat);

        KPopSong filmOut = new KPopSong("txtFilmOut",
                "Film Out",
                "BTS",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/BTS%20Film%20out%20Lyrics%20(%EB%B0%A9%ED%83%84%EC%86%8C%EB%85%84%EB%8B%A8%E9%98%B2%E5%BC%BE%E5%B0%91%E5%B9%B4%E5%9B%A3%20Film%20out%20%E6%97%A5%E6%9C%AC%E8%AA%9E%E5%AD%97%E5%B9%95%20%EA%B0%80%EC%82%AC)%20%5BColor%20Coded%20LyricsKanRomEng%5D.mp3?alt=media&token=68fb797f-a0e7-42a9-b6f8-600ddde73726",
                3.39,
                R.drawable.n_filmout);




        kPopSongs[0] = butter;
        kPopSongs[1] = howYouLikeThat;
        kPopSongs[2] = loveScenario;
        kPopSongs[3] = monster;
        kPopSongs[4] = lovesickGirls;
        kPopSongs[5] = maria;
        kPopSongs[6] = leftAndRight;
        kPopSongs[7] = lifeGoesOn;
        kPopSongs[8] = fancy;
        kPopSongs[9] = filmOut;
    }

    public KPopSong getCurrentSong(int currentSongID) {
        return kPopSongs[currentSongID];
    }


    //create method
    public int searchSongById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < kPopSongs.length; i++) { //song.length = 3 items
            KPopSong tempSong = kPopSongs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }


    //WEEK 11: now we will create two more functions

    public int getNextSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex >= kPopSongs.length - 1) { //checking song minus one
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
