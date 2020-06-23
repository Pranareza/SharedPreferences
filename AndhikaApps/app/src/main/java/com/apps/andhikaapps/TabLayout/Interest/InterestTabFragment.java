package com.apps.andhikaapps.TabLayout.Interest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.andhikaapps.Adapter.InterestAdapter;
import com.apps.andhikaapps.Model.ModelInterest;
import com.apps.andhikaapps.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InterestTabFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

/*
    Developed by Andhika Putra Bagaskara - 10117167 - IF5
    08 may 2020
 */
public class InterestTabFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InterestTabFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InterestFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InterestTabFragment newInstance(String param1, String param2) {
        InterestTabFragment fragment = new InterestTabFragment();
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
        final View tab = inflater.inflate(R.layout.fragment_tab_interest, container, false);

        final RecyclerView recyclerView = tab.findViewById(R.id.recycler_view_interest);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity().getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<ModelInterest> ArrayInterest = InterestData.prepareData();
        InterestAdapter interestAdapter = new InterestAdapter(getActivity().getApplicationContext(), ArrayInterest);
        recyclerView.setAdapter(interestAdapter);
        return tab;
    }
}
