package com.example.keegan.conferenceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;

public class KentFloorSelectorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kent_floor_selector);

        Button firstFloorButton = (Button) findViewById(R.id.firstFloorButton);
        firstFloorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent toFirstFloorMap = new Intent(KentFloorSelectorActivity.this, KentFirstFloorActivity.class);
                startActivity(toFirstFloorMap);
            }
        }
        );


        Button secondFloorButton = (Button) findViewById(R.id.secondFloorButton);
        secondFloorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
            Intent toSecondFloorMap = new Intent(KentFloorSelectorActivity.this, KentSecondFloorActivity.class);
            startActivity(toSecondFloorMap);
                                                }
                                            }
        );
    }
}
