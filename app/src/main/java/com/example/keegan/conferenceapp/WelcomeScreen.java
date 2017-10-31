package com.example.keegan.conferenceapp;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;


/**
 * Created by matt.sebek on 10/31/2017.
 */

public class WelcomeScreen extends DialogFragment {

    public View onCreateView(LayoutInflater inflater, View view, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.welcome_screen, view, false);
    }


}
