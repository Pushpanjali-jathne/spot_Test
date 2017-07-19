package com.colang.testapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.colang.testapp.R;

/**
 * Created by akshay on 13/6/17.
 */
public class MilestoneFragment extends Fragment {

    private RecyclerView imageRecyclerview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.image_fragment_layout, container, false);
        imageRecyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        imageRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
