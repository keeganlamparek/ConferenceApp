package com.example.keegan.conferenceapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by matt.sebek on 11/14/2017.
 */

/*
    This class will display sponsors of the Meca conference
    This will be selectable from the navigation drawer
    --Will this class hold any information other than images?--
    --Maybe links to their websites from this page--
 */

public class SponsorActivity extends Activity implements View.OnClickListener {


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.sponsor_activity);

        android.support.v7.widget.AppCompatImageView ferrilli = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsorferrilli);
        android.support.v7.widget.AppCompatImageView courseLeaf = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsorcourseleaf);
      /*  android.support.v7.widget.AppCompatImageView portalGuar = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsorportalguard);
        android.support.v7.widget.AppCompatImageView softDocs = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsorsoftdocs);
        android.support.v7.widget.AppCompatImageView asrAnalytics = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsorasranalytics);
        android.support.v7.widget.AppCompatImageView nationalStudentClearing = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsornationalstudentclearinghouse);
        android.support.v7.widget.AppCompatImageView aciUniversal = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsoraciuniversalpayments);
        android.support.v7.widget.AppCompatImageView entrinsik = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsorentrinsik);
        android.support.v7.widget.AppCompatImageView trimDataCorp = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsortrimdatacorp);
        android.support.v7.widget.AppCompatImageView targetX = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsortarget);
        android.support.v7.widget.AppCompatImageView ellucian = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsorellucian);
        android.support.v7.widget.AppCompatImageView shamrockSolutions = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsorshamrocksolutions);
        android.support.v7.widget.AppCompatImageView axiomElite = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsoraxiomelite);
        android.support.v7.widget.AppCompatImageView jadu = (android.support.v7.widget.AppCompatImageView) findViewById(R.id.sponsorjadu);*/

        ferrilli.setOnClickListener((View.OnClickListener) this);

    }


    @Override
    public void onClick(View view) {
       Intent switchToBrowser = new Intent();
        switch (view.getId()){

            case R.id.sponsorferrilli:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ferrilli.com/"));
                break;
            case R.id.sponsorcourseleaf:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.leepfrog.com/courseleaf/"));
                break;
           /* case R.id.sponsorportalguard:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.portalguard.com/"));
                break;
            case R.id.sponsorsoftdocs:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.softdocs.com/"));
                break;
            case R.id.sponsorasranalytics:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asranalytics.com/"));
                break;
            case R.id.sponsornationalstudentclearinghouse:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.studentclearinghouse.org/"));
                break;
            case R.id.sponsoraciuniversalpayments:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aciworldwide.com/solutions/universal-payments"));
                break;
            case R.id.sponsorentrinsik:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://entrinsik.com/"));
                break;
            case R.id.sponsortrimdatacorp:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.trimdata.com/"));
                break;
            case R.id.sponsortarget:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.targetx.com/"));
                break;
            case R.id.sponsorellucian:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ellucian.com/"));
                break;
            case R.id.sponsorshamrocksolutions:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shamrocksolutionsllc.com/"));
                break;
            case R.id.sponsoraxiomelite:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.axiomhighered.com/product/"));
                break;
            case R.id.sponsorjadu:
                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jadu.net/"));
                break;*/
    }
    startActivity(switchToBrowser);
}





}
