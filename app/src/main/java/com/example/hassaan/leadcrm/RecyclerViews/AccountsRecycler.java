package com.example.hassaan.leadcrm.RecyclerViews;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.TableClasses.Accounts;

import java.util.ArrayList;
import java.util.List;

public class AccountsRecycler extends RecyclerView.Adapter<AccountsRecycler.ViewHolder> {

    private List<String> list = new ArrayList<String>();

    public AccountsRecycler(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AccountsRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_accounts, viewGroup, false);

        return new AccountsRecycler.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountsRecycler.ViewHolder viewHolder, int i) {
        viewHolder.tv_name_accountrecycler.setText("Zohaib Javed");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name_accountrecycler;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name_accountrecycler = itemView.findViewById(R.id.tv_name_accountrecycler);
        }
    }

}

