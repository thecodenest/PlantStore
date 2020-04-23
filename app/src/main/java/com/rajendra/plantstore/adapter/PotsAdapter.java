package com.rajendra.plantstore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rajendra.plantstore.R;
import com.rajendra.plantstore.model.Pot;

import java.util.List;

public class PotsAdapter extends RecyclerView.Adapter<PotsAdapter.PotsViewHolder> {

    Context context;
    List<Pot> potList;

    public PotsAdapter(Context context, List<Pot> potList) {
        this.context = context;
        this.potList = potList;
    }

    @NonNull
    @Override
    public PotsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.pots_row_items, parent, false);
        return new PotsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PotsViewHolder holder, int position) {

        holder.potPrice.setText("₹ " + potList.get(position).getPrice());

        Glide.with(context).load(potList.get(position).getImageUrl()).into(holder.potImage);

    }

    @Override
    public int getItemCount() {
        return potList.size();
    }

    public static class PotsViewHolder extends RecyclerView.ViewHolder{

        ImageView potImage;
        TextView potPrice;

        public PotsViewHolder(@NonNull View itemView) {
            super(itemView);

            potImage = itemView.findViewById(R.id.pots_image);
            potPrice = itemView.findViewById(R.id.pots_price);


        }
    }
}
