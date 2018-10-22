package com.example.hassaan.leadcrm.RecyclerViews;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hassaan.leadcrm.Activities.AddNoteActivity;
import com.example.hassaan.leadcrm.R;

import java.util.ArrayList;
import java.util.List;

public class NoteRecycler extends RecyclerView.Adapter<NoteRecycler.ViewHolder> {

    private List<String> list = new ArrayList<String>();
    private Context context;

    public NoteRecycler(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_notes, viewGroup, false);
        return new NoteRecycler.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        viewHolder.tv_title_note.setText("SUBJECT NOTE");
        viewHolder.tv_date_note.setText("23-23-23");

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AddNoteActivity.class);
                intent.putExtra("Title",viewHolder.tv_title_note.getText());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title_note, tv_date_note;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title_note = itemView.findViewById(R.id.tv_title_note);
            tv_date_note = itemView.findViewById(R.id.tv_date_note);
        }
    }
}
