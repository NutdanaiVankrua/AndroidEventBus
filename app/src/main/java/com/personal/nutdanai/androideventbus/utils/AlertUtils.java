package com.personal.nutdanai.androideventbus.utils;


import android.support.design.widget.Snackbar;
import android.view.View;

public class AlertUtils {

    public static void showSnackBar(View view, String message) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        snackbar.show();
    }

}
