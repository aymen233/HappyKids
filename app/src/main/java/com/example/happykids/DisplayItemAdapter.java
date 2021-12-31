package com.example.happykids;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DisplayItemAdapter extends RecyclerView.Adapter<DisplayItemAdapter.MyViewHolder> {
    private ArrayList<DisplayItem> DItem;

    public DisplayItemAdapter(ArrayList<DisplayItem> DItem) {
        this.DItem = DItem;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_learn_color,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        DisplayItem Ditem = DItem.get(position);
        holder.name.setText(Ditem.getName());
        holder.description.setText(Ditem.getDescription());
        holder.img.setImageResource(Ditem.getImage());
    }

    @Override
    public int getItemCount() {
        return DItem.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,description;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            description= itemView.findViewById(R.id.description);
            img= itemView.findViewById(R.id.image);
        }
    }
}
