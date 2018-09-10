package com.grandma.beauty.secrets.grandmabeautysecrets.views.adapters;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.grandma.beauty.secrets.grandmabeautysecrets.R;
import com.grandma.beauty.secrets.grandmabeautysecrets.views.interfaces.RecyclerViewClickListener;

public class CustomListAdapter extends RecyclerView.Adapter<CustomListAdapter.CustomListViewHolder> {
    private String[] list;
    private RecyclerViewClickListener recyclerViewClickListener;


    public  class CustomListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView textView;

         CustomListViewHolder(View view ) {
            super(view);
            this.textView = view.findViewById(R.id.tvIssue);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            CustomListAdapter.this.recyclerViewClickListener.recyclerViewListClicked(view,this.getAdapterPosition());
        }
    }

    public CustomListAdapter(String[] list, RecyclerViewClickListener recyclerViewClickListener) {
        this.list = list;
        this.recyclerViewClickListener = recyclerViewClickListener;
    }

    @NonNull
    @Override
    public CustomListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row_item, parent, false);
        return new CustomListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomListViewHolder holder, int position) {
        holder.textView.setText(list[position]);
    }


    @Override
    public int getItemCount() {
        return list.length;
    }




}
