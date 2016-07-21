package com.jejunet.viewpagersample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_TEXT1 = "ARG_TEXT1";
    private static final String ARG_TEXT2 = "ARG_TEXT2";

    // TODO: Rename and change types of parameters
    private String text1;
    private String text2;


    public DetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param text1 Parameter 1.
     * @param text2 Parameter 2.
     * @return A new instance of fragment DetailFragment.
     */
    public static DetailFragment newInstance(String text1, String text2) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT1, text1);
        args.putString(ARG_TEXT2, text2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            text1 = getArguments().getString(ARG_TEXT1);
            text2 = getArguments().getString(ARG_TEXT2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_blank, container, false);
        TextView tv1 = (TextView) viewGroup.findViewById(R.id.first_text);
        tv1.setText(text1);
        TextView tv2 = (TextView) viewGroup.findViewById(R.id.second_text);
        tv2.setText(text2);

        return viewGroup;
    }

}
