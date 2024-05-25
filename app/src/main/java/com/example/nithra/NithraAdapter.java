package com.example.nithra;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NithraAdapter extends RecyclerView.Adapter<NithraAdapter.ViewHolder> {

    public static List<labs_pojo> MyDatas;

    Activity activity;

    public NithraAdapter(Activity activity,
                            List<labs_pojo> data)
    {
        this.MyDatas = data;
        this.activity = activity;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater LI = activity.getLayoutInflater();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nithra_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // labs_pojo currentItem = MyData.get(position);
        holder.imageView.setImageResource(MyDatas.get(position).getImage());
        String playStoreLink = MyDatas.get(position).getUrl();
        holder.textView.setText(MyDatas.get(position).getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(playStoreLink));
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return MyDatas.size();
    }

    class ViewHolder
            extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(View itemView)
        {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView1);
            textView = itemView.findViewById(R.id.appname);
        }
    }
}
