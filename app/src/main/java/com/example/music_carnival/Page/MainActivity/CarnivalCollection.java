package com.example.music_carnival.Page.MainActivity;

import com.example.music_carnival.R;

public class CarnivalCollection {

    public Carnival[] carnival = new Carnival[4];

    public CarnivalCollection(){
        Carnival nf = new Carnival("artistC1",
                "NF",
                "THE SEARCH",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/nf-the-search-lyrics_wNMNlZh6.mp3?alt=media&token=c4586d2d-8831-4a3c-a678-2c69f3083947",
                R.drawable.c_nf);


        Carnival taylorSwift = new Carnival("artistC2",
                "TAYLOR SWIFT",
                "MR. PERFECTLY FINE",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/taylor-swift-mr-perfectly-fine-taylors-version-from-the-vault-lyric-video_WkjJRAdD.mp3?alt=media&token=79ce7fc9-62de-4afb-81fb-f72e7fcaac20",
                R.drawable.c_taylorswift);

        Carnival clintonKane = new Carnival("artistC3",
                "CLINTON KANE",
                "CHICKEN TENDIES",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/clinton-kane-chicken-tendies-lyrics_hP5AIlGm.mp3?alt=media&token=c2f2be38-0433-4b8a-af2e-2cf9f2452e62",
                R.drawable.c_clintonkane);


        Carnival noahCyrus = new Carnival("artistC4",
                "NOAH CYRUS",
                "JULY",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/noah-cyrus-stay-together-official-video_pjD5b0Qg.mp3?alt=media&token=6c4e8a39-e577-4ec5-9de2-5f479c949938",
                R.drawable.c_noahcyrus);



        carnival[0] = nf;
        carnival[1] = taylorSwift;
        carnival[2] = clintonKane;
        carnival[3] = noahCyrus;
    }

    public Carnival getCurrentCarnival(int currentCarnivalID) {
        return carnival[currentCarnivalID];
    }


    //create method
    public int searchCarnivalById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < carnival.length; i++) { //song.length = 3 items
            Carnival tempCarnival = carnival[i];
            if (tempCarnival.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }
}
