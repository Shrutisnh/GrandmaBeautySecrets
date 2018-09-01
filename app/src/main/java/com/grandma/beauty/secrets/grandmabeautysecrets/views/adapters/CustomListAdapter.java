package com.grandma.beauty.secrets.grandmabeautysecrets.views.adapters;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.presenter.HomeScreenPresenter;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.activities.HomeScreenActivity;

public class CustomListAdapter extends RecyclerView.Adapter<CustomListAdapter.CustomListViewHolder> {
    Context context;
    String[] list;



    public static class CustomListViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public CustomListViewHolder(View view) {
            super(view);
            this.textView = view.findViewById(R.id.tvIssue);
        }
    }


    public CustomListAdapter(Context context, String[] list) {
        this.context = context;
        this.list = list;

    }

    public class ItemClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            HomeScreenPresenter presenter=(HomeScreenPresenter)((HomeScreenActivity)context).getPresenter();
            presenter.setDisplayRemedyList(v.getId());

        }
    }

    @NonNull
    @Override
    public CustomListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row_item, parent, false);
        itemView.setOnClickListener(new ItemClickListener());
        return new CustomListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomListViewHolder holder, int position) {
        holder.textView.setText(list[position]);
    }


    @Override
    public int getItemCount() {
        return list.length;
    }




}
