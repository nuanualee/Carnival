package com.example.music_carnival.AddDone;

import com.example.music_carnival.R;

public class DoneCollection {

    //all of pfps
    private final Done[] done = new Done[12];

    public DoneCollection() {
        Done btnCat = new Done(R.drawable.pfp_cat,"btnCat");
        Done btnBear = new Done(R.drawable.pfp_bear,"btnBear");
        Done btnFox = new Done(R.drawable.pfp_fox,"btnFox");
        Done btnElephant= new Done(R.drawable.pfp_elephant,"btnElephant");
        Done btnGoat = new Done(R.drawable.pfp_goat,"btnGoat");
        Done btnSeal = new Done(R.drawable.pfp_seal,"btnSeal");
        Done btnPug =  new Done(R.drawable.pfp_pug,"btnPug");
        Done btnAlpaca = new Done(R.drawable.pfp_alpaca,"btnAlpaca");
        Done btnMonkey = new Done(R.drawable.pfp_monkey,"btnMonkey");
        Done btnFrog = new Done(R.drawable.pfp_frog,"btnFrog");
        Done btnFawn = new Done(R.drawable.pfp_fawn,"btnFawn");
        Done btnGiraffe = new Done(R.drawable.pfp_giraffe,"btnGiraffe");



        done[0] = btnCat;
        done[1] = btnBear;
        done[2] = btnFox;
        done[3] = btnElephant;
        done[4] = btnGoat;
        done[5] = btnSeal;
        done[6] = btnPug;
        done[7] = btnAlpaca;
        done[8] = btnMonkey;
        done[9] = btnFrog;
        done[10] = btnFawn;
        done [11] = btnGiraffe;
    }

    public Done getCurrentAnimal(int currentAnimalID){
        return done [currentAnimalID];
    }



    //method
    public int searchAnimalById(String id) {

        for (int i = 0; i < done.length; i++) {
            Done tempPic = done[i];
            if (tempPic.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
