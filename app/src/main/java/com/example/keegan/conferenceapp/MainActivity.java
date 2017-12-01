package com.example.keegan.conferenceapp;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, HomeFragment.OnFragmentInteractionListener, ScheduleFragment.OnFragmentInteractionListener{

    private List<String> listOfDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        startWelcomeScreen();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_main, new HomeFragment());
        transaction.commit();
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


       /* buildSchedules();
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, R.layout.list_item_layout, listOfDays);
        ListView listOfDays = (ListView) findViewById(R.id.daysListView);
        listOfDays.setAdapter(mAdapter);
        listOfDays.setOnItemClickListener(mMessageClickedHandler);


        Button mainMapsButton = (Button)findViewById(R.id.mainMapsButton);
        mainMapsButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
              Intent toMapSelector = new Intent(MainActivity.this, KentFloorSelectorActivity.class);
                startActivity(toMapSelector);
            }

        }
        );*/


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the HomeFragment/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment = null;
        int id = item.getItemId();
        Class fragmentClass = null;

        switch (id){
            case R.id.schedule_menu:
                fragmentClass = ScheduleFragment.class;
                break;
            case R.id.home_menu:
                fragmentClass = HomeFragment.class;
                break;
        }

        try{

            fragment =  (Fragment) fragmentClass.newInstance();

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_main, fragment).commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            // Do something in response to the click
            Intent i = new Intent(MainActivity.this, ScheduleActivity.class);
            String passDay = "";

            passDay = listOfDays.get(position).toString();

            i.putExtra("day",passDay);

            startActivity(i);



        }
    };

    private void  buildSchedules(){


        // Build Days
        GregorianCalendar day1 = new GregorianCalendar(2017, 10, 12);
        GregorianCalendar day2 = new GregorianCalendar(2017, 10, 13);

        // Build start/end time arguments for Timeblock class
        GregorianCalendar startTime1 = new GregorianCalendar(2017, 10, 12);
        GregorianCalendar startTime2 = new GregorianCalendar(2017, 10, 13);

        Schedule schedule1 = new Schedule(day1);
        Schedule schedule2 = new Schedule(day2);

        listOfDays = new ArrayList<String>();
        listOfDays.add(schedule1.toString());
        listOfDays.add(schedule2.toString());
    }


    private void startWelcomeScreen() {

        Intent startWelcomeScreen = new Intent(this, WelcomeScreen.class);
        WelcomeScreen welcome = new WelcomeScreen();

        if (!welcome.hasRun()){
            startActivity(startWelcomeScreen);

        }
    }

    @Override
    public void onFragmentInteraction(Uri uri){


    }


}

