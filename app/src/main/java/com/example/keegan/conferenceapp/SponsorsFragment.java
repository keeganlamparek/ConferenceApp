package com.example.keegan.conferenceapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SponsorsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SponsorsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SponsorsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SponsorsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SponsorsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SponsorsFragment newInstance(String param1, String param2) {
        SponsorsFragment fragment = new SponsorsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_sponsors, container, false);

        android.support.v7.widget.AppCompatImageView ferrilli = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsorferrilli);
        android.support.v7.widget.AppCompatImageView courseLeaf = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsorcourseleaf);
        android.support.v7.widget.AppCompatImageView portalGuar = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsorportalguard);
        android.support.v7.widget.AppCompatImageView softDocs = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsorsoftdocs);
        android.support.v7.widget.AppCompatImageView asrAnalytics = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsorasranalytics);
        android.support.v7.widget.AppCompatImageView nationalStudentClearing = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsornationalstudentclearinghouse);
        android.support.v7.widget.AppCompatImageView aciUniversal = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsoraciuniversalpayments);
        android.support.v7.widget.AppCompatImageView entrinsik = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsorentrinsik);
        android.support.v7.widget.AppCompatImageView trimDataCorp = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsortrimdatacorp);
        android.support.v7.widget.AppCompatImageView targetX = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsortarget);
        android.support.v7.widget.AppCompatImageView ellucian = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsorellucian);
        android.support.v7.widget.AppCompatImageView shamrockSolutions = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsorshamrocksolutions);
        android.support.v7.widget.AppCompatImageView axiomElite = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsoraxiomelite);
        android.support.v7.widget.AppCompatImageView jadu = (android.support.v7.widget.AppCompatImageView) view.findViewById(R.id.sponsorjadu);

        ferrilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchToBrowser = new Intent();

                switchToBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ferrilli.com/"));
                startActivity(switchToBrowser);
            }
        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
