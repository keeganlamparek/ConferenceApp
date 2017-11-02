package com.example.keegan.conferenceapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by matt.sebek on 10/31/2017.
 */

/*public class WelcomeScreen extends DialogFragment {

    View view;

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(gerActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();

        builder.setView(inflater.inflate(R.layout.welcome_screen, null));
        return builder.create();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup view, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.welcome_screen, view, false);
    }

    public void onClick(View view) {
        dismiss();
    }

    public void showDialog() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        CustomDialogFragment newFragment = new CustomDialogFragment();

        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        transaction.add(android.R.id.content, newFragment)
                .addToBackStack(null).commit();
    }
}
}*/
