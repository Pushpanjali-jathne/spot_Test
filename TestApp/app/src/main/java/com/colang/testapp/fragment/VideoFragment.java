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
import com.colang.testapp.adapter.VideoFragmentAdapter;
import com.colang.testapp.model.Video;

import java.util.ArrayList;
import java.util.List;


public class VideoFragment extends Fragment {

    private RecyclerView imageRecyclerview;
    private ArrayList<Video> videos;
    private Video video;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.image_fragment_layout, container, false);
        imageRecyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        imageRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        video = new Video();
        videos=new ArrayList<Video>();

        video.setTime("18 HOURS AGO");
        video.setTitle("EMPTINESS FT. JUSTIN TIBLEKAR");
        video.setImage(R.mipmap.song);
        videos.add(video);

        video = new Video();
        video.setTime("20 HOURS AGO");
        video.setTitle( "I'M FALLING LOVE WITH YOU");
        video.setImage(R.mipmap.panda);
        videos.add(video);

        video = new Video();
        video.setTime("22 HOURS AGO");
        video.setTitle("BABY FT.JUSTIN BABER");
        video.setImage(R.mipmap.song);
        videos.add(video);

        video = new Video();
        video.setTime("18 HOURS AGO");
        video.setTitle("EMPTINESS FT. JUSTIN TIBLEKAR");
        video.setImage(R.mipmap.panda);
        videos.add(video);

        video = new Video();
        video.setTime("20 HOURS AGO");
        video.setTitle( "I'M FALLING LOVE WITH YOU");
        video.setImage(R.mipmap.song);
        videos.add(video);

        video = new Video();
        video.setTime("22 HOURS AGO");
        video.setTitle("BABY FT.JUSTIN BABER");
        video.setImage(R.mipmap.panda);
        videos.add(video);


        VideoFragmentAdapter fragmentAdapter = new VideoFragmentAdapter(getActivity(), videos);
        imageRecyclerview.setAdapter(fragmentAdapter);
    }


}
