package com.example.keegan.conferenceapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TimeBlockFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TimeBlockFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TimeBlockFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private List timeBlocks = new ArrayList<TimeBlock>();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TimeBlockFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TimeBlockFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TimeBlockFragment newInstance(String param1, String param2) {
        TimeBlockFragment fragment = new TimeBlockFragment();
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
        View view = inflater.inflate(R.layout.fragment_time_block, container, false);

        createTimeBlocks();

        ListView timeBlockListView = (ListView) view.findViewById(R.id.timeBlockList);
        TimeBlockAdapter timeBlockAdapter = new TimeBlockAdapter(this.getActivity(), timeBlocks);

        timeBlockListView.setAdapter(timeBlockAdapter);

        timeBlockListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


        return view;
    }

    private void createTimeBlocks(){

        GregorianCalendar startTime1 = new GregorianCalendar(2017, 10, 13, 9, 0);
        GregorianCalendar endTime1 = new GregorianCalendar(2017, 10, 13, 10, 0);

        GregorianCalendar startTime2 = new GregorianCalendar(2017, 10, 13, 10, 15);
        GregorianCalendar endTime2 = new GregorianCalendar(2017, 10, 13, 11, 15);

        GregorianCalendar startTime3 = new GregorianCalendar(2017, 10, 13, 11, 30);
        GregorianCalendar endTime3 = new GregorianCalendar(2017, 10, 13, 12, 5);

        TimeBlock timeBlock1 = new TimeBlock(startTime1, endTime1);
        TimeBlock timeBlock2 = new TimeBlock(startTime2, endTime2);
        TimeBlock timeBlock3= new TimeBlock(startTime3, endTime3);

        timeBlocks.add(timeBlock1);
        timeBlocks.add(timeBlock2);
        timeBlocks.add(timeBlock3);


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
