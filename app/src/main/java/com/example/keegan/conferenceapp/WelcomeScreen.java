package com.example.keegan.conferenceapp;


import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.content.Intent;




/**
 * Created by matt.sebek on 10/31/2017.
 */

import android.app.Activity;




public class WelcomeScreen extends Activity {

    /** Duration of wait **/
    final int SPLASH_DISPLAY_LENGTH = 5000;
    private static boolean firstRun = false;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.welcome_screen);

        /* New Handler to start the MainActivity
         * and close this WelcomeScreen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the MainActivity. */
                firstRun = true;
                Intent mainIntent = new Intent(WelcomeScreen.this, MainActivity.class);
                WelcomeScreen.this.startActivity(mainIntent);
                WelcomeScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    public boolean hasRun() {
        return firstRun;
    }


}