package com.example.hassaan.leadcrm.RecyclerViews;

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

public class ContactsRecycler extends RecyclerView.Adapter<ContactsRecycler.ViewHolder> {

    private List<String> list = new ArrayList<String>();

    public ContactsRecycler(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ContactsRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_contacts, viewGroup, false);

        return new ContactsRecycler.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsRecycler.ViewHolder viewHolder, int i) {
        viewHolder.tv_name_contactsrecycler.setText("Zohaib Javed");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name_contactsrecycler;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name_contactsrecycler = itemView.findViewById(R.id.tv_name_contactrecycler);
        }
    }

}
