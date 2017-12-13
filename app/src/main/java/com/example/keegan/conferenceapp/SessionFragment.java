package com.example.keegan.conferenceapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SessionFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SessionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SessionFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SessionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SessionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SessionFragment newInstance(String param1, String param2) {
        SessionFragment fragment = new SessionFragment();
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

        View view = inflater.inflate(R.layout.fragment_session, container, false);
        String[] event1_track = new String[2];
        event1_track[0] = "Coding";
        event1_track[1] = "Presentation";

        String[] event1_presenters = new String[2];
        event1_presenters[0] = "Wallace";
        event1_presenters[1] = "Dan";

        Event testEvent1 = new Event(1, "Building Software", "This is a test for event", "This presentation will look into how to build software that will last.  When making software, always build with longeviy and ease of use in mind.  This presentation should make anyone's code last far longer than what it would originaly.  More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.More Text.", event1_track, event1_presenters, "Kent", "Hubbel", "2017", "Presenting", "Group presenting now");

        final TextView event_title = (TextView) view.findViewById(R.id.event_title);
        event_title.setText(testEvent1.get_event_title());

        final TextView session_long_description = (TextView) view.findViewById(R.id.event_long_description);
        session_long_description.setText(testEvent1.get_event_long_description());

        final TextView event_tracks = (TextView) view.findViewById(R.id.event_track_description);
        event_tracks.setText(testEvent1.get_event_tracks());

        final TextView event_presenters = (TextView) view.findViewById(R.id.presenters);
        event_presenters.setText(testEvent1.get_event_presenters());

        final TextView event_buildingName = (TextView) view.findViewById(R.id.event_buildingName);
        event_buildingName.setText(testEvent1.get_event_buildingName());

        final TextView event_roomName = (TextView) view.findViewById(R.id.event_roomName);
        event_roomName.setText(testEvent1.get_event_roomName());

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