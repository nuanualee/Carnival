package com.example.music_carnival.AddDone;

import com.example.music_carnival.AddDone.AddDone;
import com.example.music_carnival.R;

public class AddDoneCollection {


    private final AddDone[] addDone = new AddDone[2];

    public AddDoneCollection() {
        AddDone buttonSave = new AddDone(R.drawable.orangesave_btn, "btn1");
        AddDone buttonCancel = new AddDone(R.drawable.cancel_btn, "btn2");


        addDone[0] = buttonSave;
        addDone[1] = buttonCancel;
    }

    public int searchSCByID(String id) {

        for (int i = 0; i < addDone.length; i++) {
            AddDone tempBtn = addDone[i];
            if (tempBtn.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}

