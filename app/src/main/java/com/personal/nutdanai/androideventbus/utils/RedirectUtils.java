package com.personal.nutdanai.androideventbus.utils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.personal.nutdanai.androideventbus.activities.SearchActivity;

public class RedirectUtils {

    public static void redirectSearch(AppCompatActivity activity) {
        Intent intent = new Intent(activity, SearchActivity.class);
        activity.startActivity(intent);
    }

}
