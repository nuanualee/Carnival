package com.example.music_carnival.AddProfile;

import com.example.music_carnival.R;

public class AddProfileCollection {

    private final AProfile[] aProfile = new AProfile[1];

    public AddProfileCollection() {
        AProfile buttonAdd = new AProfile(R.drawable.plus_icon, "btnAdd");


        aProfile[0] = buttonAdd;
    }

    public int searchButtonById(String id) {

        for (int i = 0; i < aProfile.length; i++) {
            AProfile tempBtn = aProfile[i];
            if (tempBtn.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}


