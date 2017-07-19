package com.colang.testapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.colang.testapp.R;
import com.colang.testapp.model.Video;

import java.util.ArrayList;
import java.util.List;


public class VideoFragmentAdapter extends RecyclerView.Adapter<VideoFragmentAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Video> videos;

    public VideoFragmentAdapter(Context context, ArrayList<Video> videos) {
        this.context = context;
        this.videos = videos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_fragment_row_layout,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.titleTextview.setText(this.videos.get(position).getTitle());
        holder.timeTextview.setText(this.videos.get(position).getTime());

        Glide.with(context)
                .load(this.videos.get(position).getImage())
                .error(R.mipmap.ic_launcher)
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return videos.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView titleTextview;
        private TextView timeTextview;
        private TextView descriptionTextview;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageview);
            titleTextview = (TextView) itemView.findViewById(R.id.tvHeading);
            timeTextview = (TextView) itemView.findViewById(R.id.tvTime);
            descriptionTextview = (TextView) itemView.findViewById(R.id.tvDescription);
        }
    }
}
