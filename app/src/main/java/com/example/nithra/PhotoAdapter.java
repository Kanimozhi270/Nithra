package com.example.nithra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {

    public static List<Photopojo> photo;

    Activity activity;

    public PhotoAdapter(Activity activity,
                       List<Photopojo> data)
    {
        this.photo = data;
        this.activity = activity;
    }
    @NonNull
    @Override
    public PhotoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater LI = activity.getLayoutInflater();
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_list, parent, false);
            return new PhotoAdapter.ViewHolder(view);
        }

    @Override
    public void onBindViewHolder(@NonNull PhotoAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(photo.get(position).getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity,ViewPager.class);
                intent.putExtra("list_key",(Serializable) photo);
                intent.putExtra("position",holder.getAdapterPosition());




                activity.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount()
    {
        return photo.size();
    }

    class ViewHolder
            extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(View itemView)
        {
            super(itemView);
            imageView = itemView.findViewById(R.id.memories);
        }
    }
}