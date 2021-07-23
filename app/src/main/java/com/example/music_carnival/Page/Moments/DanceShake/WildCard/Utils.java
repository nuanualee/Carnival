package com.example.music_carnival.Page.Moments.DanceShake.WildCard;

import android.content.Context;

public class Utils {

    public static float dipToPx(Context context, float dipValue) {
        float density = context.getResources().getDisplayMetrics().density;
        return dipValue * density;
    }
}