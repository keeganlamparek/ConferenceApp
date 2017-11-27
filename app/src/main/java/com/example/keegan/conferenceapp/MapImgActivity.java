package com.example.keegan.conferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MapImgActivity extends AppCompatActivity {

    //Toolbar mToolbar;
    ImageView map;
    int position;
    int[] mapArray = {R.drawable.kent_first_floor, R.drawable.kent_second_floor};


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_img);

        //mToolbar = (Toolbar) findViewById(R.id.toolbar);
        map = (ImageView) findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            position = bundle.getInt("mapArray");
            map.setImageResource(mapArray[position]);

        }
    }
}
