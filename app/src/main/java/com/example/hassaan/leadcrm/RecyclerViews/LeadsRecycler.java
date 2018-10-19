package com.example.hassaan.leadcrm.RecyclerViews;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hassaan.leadcrm.Activities.DetailLeadActivity;
import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class LeadsRecycler extends RecyclerView.Adapter<LeadsRecycler.ViewHolder> {

    private List<String> list = new ArrayList<String>();
    private Context context;

    public LeadsRecycler(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public LeadsRecycler(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public LeadsRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_leads, viewGroup, false);

        return new LeadsRecycler.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tv_name_leadrecycler.setText("Zohaib Javed");
        viewHolder.tv_email_leadrecycler.setText("My name is khan and I am not a terrorist");
       // viewHolder.iv_image_leadrecycler.setImageIcon(list.get(i));e
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailLeadActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_image_leadrecycler;
        TextView tv_name_leadrecycler,tv_email_leadrecycler;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_image_leadrecycler = itemView.findViewById(R.id.iv_image_leadrecycler);
            tv_name_leadrecycler = itemView.findViewById(R.id.tv_name_leadrecycler);
            tv_email_leadrecycler = itemView.findViewById(R.id.tv_email_leadrecycler);
        }
    }

}
