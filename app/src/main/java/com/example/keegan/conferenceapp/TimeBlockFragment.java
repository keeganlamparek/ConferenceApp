package com.example.keegan.conferenceapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

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
    private List<TimeBlock> timeBlocks;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String day;
    private int[] timeBlockHolderID = new int[2];

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

        day = "";

        Bundle bundle = getArguments();
        if (bundle != null)
        {
            day = bundle.getString("day");
        }

        createTimeBlocks();

        TextView timeBlockDayText = (TextView) view.findViewById(R.id.dayOfTimeBlockText);
        ListView timeBlockListView = (ListView) view.findViewById(R.id.timeBlockList);
        TimeBlockAdapter timeBlockAdapter = new TimeBlockAdapter(this.getActivity(), timeBlocks);

        timeBlockDayText.setText(day);
        timeBlockListView.setAdapter(timeBlockAdapter);


        timeBlockListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int passTimeBlockID = 1;

                switch (timeBlockHolderID[i]){
                    case 1:
                        passTimeBlockID = 1;
                        break;
                    case 2:
                        passTimeBlockID = 2;
                        break;
                    case 3:
                        passTimeBlockID = 3;
                        break;
                    case 4:
                        passTimeBlockID = 4;
                        break;

                }

                Bundle bundle = new Bundle();
                bundle.putInt("timeBlockID", passTimeBlockID);

                Fragment fragment = new EventsFragment();
                fragment.setArguments(bundle);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content_main, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return view;
    }

    private void createTimeBlocks(){

        GregorianCalendar startTime1 = new GregorianCalendar(2017, 10, 13, 9, 0);
        GregorianCalendar endTime1 = new GregorianCalendar(2017, 10, 13, 10, 0);

        GregorianCalendar startTime2 = new GregorianCalendar(2017, 10, 13, 10, 15);
        GregorianCalendar endTime2 = new GregorianCalendar(2017, 10, 13, 11, 15);

        GregorianCalendar startTime3 = new GregorianCalendar(2017, 10, 13, 12, 0);
        GregorianCalendar endTime3 = new GregorianCalendar(2017, 10, 13, 12, 30);

        TimeBlock timeBlock1 = new TimeBlock(startTime1, endTime1, 1);
        TimeBlock timeBlock2 = new TimeBlock(startTime2, endTime2, 2);
        TimeBlock timeBlock3 = new TimeBlock(startTime1, endTime1, 3);
        TimeBlock timeBlock4 = new TimeBlock(startTime2, endTime2, 4);

        timeBlocks = new ArrayList<TimeBlock>();

        if (day.equals("October 12")){
            timeBlocks.add(timeBlock1);
            timeBlocks.add(timeBlock2);
            timeBlockHolderID[0] = timeBlock1.getTimeBlockID();
            timeBlockHolderID[1] = timeBlock2.getTimeBlockID();
        }
        else{
            timeBlocks.add(timeBlock3);
            timeBlocks.add(timeBlock4);
            timeBlockHolderID[0] = timeBlock3.getTimeBlockID();
            timeBlockHolderID[1] = timeBlock4.getTimeBlockID();
        }



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
