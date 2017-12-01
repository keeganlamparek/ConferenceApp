package layout;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.keegan.conferenceapp.KentFloorSelectorActivity;
import com.example.keegan.conferenceapp.MainActivity;
import com.example.keegan.conferenceapp.R;
import com.example.keegan.conferenceapp.Schedule;
import com.example.keegan.conferenceapp.ScheduleActivity;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ScheduleFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ScheduleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScheduleFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private List<String> listOfDays;


    private OnFragmentInteractionListener mListener;

    public ScheduleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScheduleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScheduleFragment newInstance(String param1, String param2) {
        ScheduleFragment fragment = new ScheduleFragment();
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
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        buildSchedules();
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this.getActivity() , R.layout.list_item_layout, listOfDays);
        ListView listOfDays = (ListView) view.findViewById(R.id.fragmentScheduleList);
        listOfDays.setAdapter(mAdapter);
        listOfDays.setOnItemClickListener(mMessageClickedHandler);


        Button mainMapsButton = (Button) view.findViewById(R.id.mapsButton);
        mainMapsButton.setOnClickListener(new View.OnClickListener()
                                          {
                                              public void onClick(View v){
                                                  Intent toMapSelector = new Intent(getContext(), KentFloorSelectorActivity.class);
                                                  startActivity(toMapSelector);
                                              }
                                          }
        );

        return view;
    }

    private AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            // Do something in response to the click
            Intent i = new Intent(getContext(), ScheduleActivity.class);
            String passDay = "";

            passDay = listOfDays.get(position).toString();

            i.putExtra("day",passDay);

            startActivity(i);



        }
    };

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
