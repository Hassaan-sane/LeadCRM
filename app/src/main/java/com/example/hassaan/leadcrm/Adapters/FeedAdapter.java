package com.example.hassaan.leadcrm.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder> {

    private List<String> list=new ArrayList<String>();

    public FeedAdapter(List<String> list){
        this.list=list;
    }

    @NonNull
    @Override
    public FeedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.feeds_baselayout,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_name.setText("Zohaib Javed");
        viewHolder.tv_time.setText("2h ago");
        viewHolder.tv_posted.setText("posted a status");
        viewHolder.tv_message.setText("My name is khan and I am not a terrorist");
        //viewHolder.tv_message.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_image;
        TextView tv_name,tv_posted,tv_time,tv_message;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_image=itemView.findViewById(R.id.iv_image_feeds);
            tv_name=itemView.findViewById(R.id.tv_name_feeds);
            tv_posted=itemView.findViewById(R.id.tv_posted_feeds);
            tv_time=itemView.findViewById(R.id.tv_time_feeds);
            tv_message=itemView.findViewById(R.id.tv_message_feeds);
        }
    }
}
