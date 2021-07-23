package com.example.music_carnival.ProfileAct;

import com.example.music_carnival.R;

public class ProfileActCollection {

    private final Pro[] pro = new Pro[12];

    public ProfileActCollection() {
        Pro btnCat = new Pro(R.drawable.pfp_cat,"btnCat");
        Pro btnBear = new Pro(R.drawable.pfp_bear,"btnBear");
        Pro btnFox = new Pro(R.drawable.pfp_fox,"btnFox");
        Pro btnElephant= new Pro(R.drawable.pfp_elephant,"btnElephant");
        Pro btnGoat = new Pro(R.drawable.pfp_goat,"btnGoat");
        Pro btnSeal = new Pro(R.drawable.pfp_seal,"btnSeal");
        Pro btnPug =  new Pro(R.drawable.pfp_pug,"btnPug");
        Pro btnAlpaca = new Pro(R.drawable.pfp_alpaca,"btnAlpaca");
        Pro btnMonkey = new Pro(R.drawable.pfp_monkey,"btnMonkey");
        Pro btnFrog = new Pro(R.drawable.pfp_frog,"btnFrog");
        Pro btnFawn = new Pro(R.drawable.pfp_fawn,"btnFawn");
        Pro btnGiraffe = new Pro(R.drawable.pfp_giraffe,"btnGiraffe");



        pro[0] = btnCat;
        pro[1] = btnBear;
        pro[2] = btnFox;
        pro[3] = btnElephant;
        pro[4] = btnGoat;
        pro[5] = btnSeal;
        pro[6] = btnPug;
        pro[7] = btnAlpaca;
        pro[8] = btnMonkey;
        pro[9] = btnFrog;
        pro[10] = btnFawn;
        pro[11] = btnGiraffe;




    }

    public int searchAnimalById(String id) {

        for (int i = 0; i < pro.length; i++) {
            Pro tempBtn = pro[i];
            if (tempBtn.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
