package com.example.keegan.conferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String test = "Test being ran through Android Studio's VCS rather than SourceTree";
        String otherConflict = "new conflic";
    }
}
