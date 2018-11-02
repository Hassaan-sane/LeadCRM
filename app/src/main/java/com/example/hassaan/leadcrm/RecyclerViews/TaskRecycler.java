package com.example.hassaan.leadcrm.RecyclerViews;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hassaan.leadcrm.Activities.DetailTaskActivity;
import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.Repo.TaskRepo;
import com.example.hassaan.leadcrm.TableClasses.Task;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TaskRecycler extends RecyclerView.Adapter<TaskRecycler.ViewHolder> {

    private List<Task> tasks;
    private Context context;

    public TaskRecycler(List<Task> tasks, Context context) {
        this.tasks = tasks;
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
    public void onBindViewHolder(@NonNull final TaskRecycler.ViewHolder viewHolder, final int i) {
        viewHolder.tv_name_taskrecycler.setText(tasks.get(i).getSubject());
//        viewHolder.tv_priority_taskrecycler.setText(tasks.get(i).getStatusID());
        viewHolder.tv_dot_taskrecycler.setTextColor(Color.RED);
//        viewHolder.tv_day_taskrecycler.setText(tasks.get(i).getDueDate().toString());
//        viewHolder.cb_checkBox_taskrecycler.setChecked(false);
//        viewHolder.iv_image_leadrecycler.setImageIcon(list.get(i));
        if(tasks.get(i).getStatusID()==4)
        {
            viewHolder.cb_checkBox_taskrecycler.setChecked(true);
        }
        else{
            viewHolder.cb_checkBox_taskrecycler.setChecked(false);
        }

        viewHolder.cb_checkBox_taskrecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TaskRepo taskRepo = new TaskRepo();
                Task task = new Task();

                if(viewHolder.cb_checkBox_taskrecycler.isChecked()){
                    Toast.makeText(context, tasks.get(i).getSubject() + " is Completed", Toast.LENGTH_SHORT).show();

                    task.setID(tasks.get(i).getID());
                    task.setOwnerName(tasks.get(i).getOwnerName());
                    task.setSubject(tasks.get(i).getSubject());
                    task.setDueDate(Calendar.getInstance().getTime());
                    task.setPriorityID(tasks.get(i).getPriorityID());
                    task.setStatusID(4);

                    taskRepo.updateTask(task);
                }
                if(!viewHolder.cb_checkBox_taskrecycler.isChecked()){
                    task.setID(tasks.get(i).getID());
                    task.setOwnerName(tasks.get(i).getOwnerName());
                    task.setSubject(tasks.get(i).getSubject());
                    task.setDueDate(Calendar.getInstance().getTime());
                    task.setPriorityID(tasks.get(i).getPriorityID());
                    task.setStatusID(1);

                    taskRepo.updateTask(task);
                }
            }
        });
//        viewHolder.cb_checkBox_taskrecycler.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//
//            }
//        });

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ""+i, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, DetailTaskActivity.class);
                intent.putExtra("TaskPosition",i);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tasks.size();
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