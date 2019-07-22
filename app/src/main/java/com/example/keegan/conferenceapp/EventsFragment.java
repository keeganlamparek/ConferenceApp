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
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link EventsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link EventsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private List<String> listOfEventNames;
    private List<Event> listOfEventsSelected = new ArrayList<Event>();

    private OnFragmentInteractionListener mListener;

    public EventsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EventsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EventsFragment newInstance(String param1, String param2) {
        EventsFragment fragment = new EventsFragment();
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
        View view = inflater.inflate(R.layout.fragment_events, container, false);
        createEvents();


        final ListView listOfEvents = (ListView) view.findViewById(R.id.listViewEvents);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this.getActivity(), R.layout.list_item_layout, R.id.listItem, listOfEventNames);
        listOfEvents.setAdapter(mAdapter);

        listOfEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int passSessionID = 1;

                for(int j = 0; j < listOfEventsSelected.size(); j++){
                    if(listOfEventsSelected.get(j).get_event_title().equals(listOfEventNames.get(i))){
                        passSessionID = listOfEventsSelected.get(j).getSessionID();
                    }
                }

                Bundle bundle = new Bundle();
                bundle.putInt("sessionID", passSessionID);

                Fragment fragment = new SessionFragment();
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

    private void createEvents(){

        listOfEventNames = new ArrayList<String>();
        listOfEventsSelected = new ArrayList<Event>();
        int timeBlockID = getArguments().getInt("timeBlockID");

        String[] event1_track = new String[2];
        event1_track[0] = "Coding";
        event1_track[1] = "Presentation";

        String[] event1_presenters = new String[2];
        event1_presenters[0] = "Wallace";
        event1_presenters[1] = "Dan";

        Event testEvent1 = new Event(1, "Building Software", "This is a test for event", "This presentation will look into how to build software that will last.  When making software, always build with longeviy and ease of use in mind.  This presentation should make anyone's code last far longer than what it would originally.", event1_track, event1_presenters, "Kent", "Hubbel", "2017", "Presenting", "Group presenting now", 1);

        String[] event2_track = new String[] {"Financial Assistance"};
        String[] event2_presenters = new String[] {"Amanda Foskett"};
        Event testEvent2 = new Event(2, "Borrower Based Year Loan Processing", "Borrower Based Year Loan Processing", "How are you as an institution working around the limitations or set up for autopackaging and getting your students awarded? Are the limitations of the software preventing you from awarding students on a BBY schedule even though it might be beneficial to them? What are some of the creative solutions people are employing to get around this and is there a fix coming from Ellucian soon??", event2_track, event2_presenters, "Kent", "Student Senate", "2017", "Final", "", 1);

        String[] event3_track = new String[] {"Technical Track"};
        String[] event3_presenters = new String[] {"Shelly Lowery"};
        Event testEvent3 = new Event(3, "Get Help, Discover Resources, and Network with eCommunities", "Get Help, Discover Resources, and Network with eCommunities", "Join us to learn about the roles of eCommunities captains, users, and the community as a whole. Find out how to get answers and connect with others using the same technologies. And discover Port Hub, which includes eCommunities, Support Center, eSearch, Education Services, Download Center, and much more.", event3_track, event3_presenters, "Kent", "Principal Black Box", "2017", "Final", " ", 2);

        String[] event4_track = new String[] {"Technical Track"};
        String[] event4_presenters = new String[] {"Marcia Gullickson"};
        Event testEvent4 = new Event(4, "IT/System Admin Roundtable", "IT/System Admin Roundtable", "Attend this roundtable session to discuss various issues and challenges related to system administration in working with Colleague and their interconnected systems. Are you interfacing with more software as a service solutions? Bring your top challenges to discuss how your colleagues at other campuses are meeting these demands.", event4_track, event4_presenters, "Kent", "Student Senate", "2017", "Final", "Final", 3);

        String[] event5_track = new String[] {"Enrollment"};
        String[] event5_presenters = new String[] {"Laurie Bowers"};
        Event testEvent5 = new Event(5, "CRM/Recruit Roundtable", "CRM/Recruit Roundtable", "Whether you are using Ellucian Recruit or another CRM, come join the discussion about the challenges that we all face using a CRM on campus. Facilitator – Laurie Bowers, Applications Systems Analyst, Simpson College", event5_track, event5_presenters, "Kent", "Carse", "2017", "Final", "Final", 4);

        String[] event6_track = new String[] {"Human Resources and Payroll"};
        String[] event6_presenters = new String[] {"Mimi Bartley-Nancarrow"};
        Event testEvent6 = new Event(6, "HR Roundtable", "HR Roundtable", "We invite you to join colleagues for a roundtable discussion. Come network with those who share similar interests and responsibilities and discuss topics of particular interest to you. This session is designed to encourage you to exchange experiences and insights with colleagues.", event6_track, event6_presenters, "Kent", "Hubbel", "2017", "Final", "Final", 4);


        listOfEventsSelected.add(testEvent1);
        listOfEventsSelected.add(testEvent2);
        listOfEventsSelected.add(testEvent3);
        listOfEventsSelected.add(testEvent4);
        listOfEventsSelected.add(testEvent5);
        listOfEventsSelected.add(testEvent6);

        for(int i = 0; i < listOfEventsSelected.size(); i++){

            if(listOfEventsSelected.get(i).getTimeBlockID() == timeBlockID){
                listOfEventNames.add(listOfEventsSelected.get(i).get_event_title());
            }

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
