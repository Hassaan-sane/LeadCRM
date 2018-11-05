package com.example.hassaan.leadcrm.RecyclerViews;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.TableClasses.Event;

import java.util.List;

public class EventRecycler extends RecyclerView.Adapter<EventRecycler.ViewHolder> {

    private List<Event> list;
    private Context context;

    public EventRecycler(List<Event> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_event, viewGroup, false);

        return new EventRecycler.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.event_recycle.setText(list.get(i).getEventName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView event_recycle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            event_recycle = itemView.findViewById(R.id.tv_name_eventrecycle);
        }
    }
}
