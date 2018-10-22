package com.example.hassaan.leadcrm.RecyclerViews;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hassaan.leadcrm.Activities.DetailTaskActivity;
import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class TaskRecycler extends RecyclerView.Adapter<TaskRecycler.ViewHolder> {

            private List<String> list = new ArrayList<String>();
            private Context context;


    public TaskRecycler(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public TaskRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_tasks, viewGroup, false);
        return new TaskRecycler.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskRecycler.ViewHolder viewHolder, final int i) {
        viewHolder.tv_name_taskrecycler.setText("Zohaib Javed");
        viewHolder.tv_priority_taskrecycler.setText("High");
        viewHolder.tv_dot_taskrecycler.setTextColor(Color.RED);
        viewHolder.tv_day_taskrecycler.setText("Tommorow");
        viewHolder.cb_checkBox_taskrecycler.setChecked(false);
        // viewHolder.iv_image_leadrecycler.setImageIcon(list.get(i));



        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailTaskActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name_taskrecycler, tv_priority_taskrecycler, tv_dot_taskrecycler, tv_day_taskrecycler;
        CheckBox cb_checkBox_taskrecycler;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name_taskrecycler = itemView.findViewById(R.id.tv_name_taskrecycler);
            tv_priority_taskrecycler = itemView.findViewById(R.id.tv_priority_taskrecycler);
            tv_dot_taskrecycler = itemView.findViewById(R.id.tv_dotcolor_taskrecycler);
            tv_day_taskrecycler = itemView.findViewById(R.id.tv_day_taskrecycler);
            cb_checkBox_taskrecycler = itemView.findViewById(R.id.cb_checkBox_taskrecycler);
        }
    }
}