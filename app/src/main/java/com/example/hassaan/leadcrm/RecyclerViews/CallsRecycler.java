package com.example.hassaan.leadcrm.RecyclerViews;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class CallsRecycler  extends RecyclerView.Adapter<CallsRecycler.ViewHolder> {

    private List<String> list = new ArrayList<String>();

    public CallsRecycler(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CallsRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_calls, viewGroup, false);

        return new CallsRecycler.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallsRecycler.ViewHolder viewHolder, int i) {
        viewHolder.tv_subject_callrecycler.setText("Zohaib Javed");
        viewHolder.tv_date_callrecycler.setText("Oct 17,2018");
        viewHolder.tv_time_callrecycler.setText("13:30");
        viewHolder.tv_duration_callrecycler.setText("00:15");
        viewHolder.tv_to_callrecycler.setText("From");
        viewHolder.tv_employeeName_callrecycler.setText("Zohaib Javed");
        viewHolder.tv_customerName_callrecycler.setText("Abdul Razzaq");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_subject_callrecycler,tv_date_callrecycler,tv_to_callrecycler,tv_duration_callrecycler,tv_time_callrecycler,tv_employeeName_callrecycler;
        TextView tv_customerName_callrecycler;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_subject_callrecycler = itemView.findViewById(R.id.tv_subject_callrecycler);
            tv_date_callrecycler = itemView.findViewById(R.id.tv_date_callrecycler);
            tv_time_callrecycler = itemView.findViewById(R.id.tv_time_callrecycler);
            tv_duration_callrecycler = itemView.findViewById(R.id.tv_duration_callrecycler);
            tv_to_callrecycler = itemView.findViewById(R.id.tv_to_callrecycler);
            tv_employeeName_callrecycler = itemView.findViewById(R.id.tv_employeeName_callrecycler);
            tv_customerName_callrecycler = itemView.findViewById(R.id.tv_customerName_callrecycler);
        }
    }
}
