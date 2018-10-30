package com.example.hassaan.leadcrm.RecyclerViews;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hassaan.leadcrm.Activities.DetailAccountActivity;
import com.example.hassaan.leadcrm.R;
import com.example.hassaan.leadcrm.TableClasses.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountsRecycler extends RecyclerView.Adapter<AccountsRecycler.ViewHolder> {

    private List<Account> list = new ArrayList<>();
    private Context context;

    public AccountsRecycler(List<Account> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public AccountsRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_accounts, viewGroup, false);

        return new AccountsRecycler.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountsRecycler.ViewHolder viewHolder, final int i) {
        viewHolder.tv_name_accountrecycler.setText(list.get(i).getAccountName());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailAccountActivity.class);
                intent.putExtra("AccountPosition", i);
                context.startActivity(intent);
            }
        });
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

