package com.example.nithra;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DeptAdapter extends RecyclerView.Adapter<DeptAdapter.ViewHolder> {

    private List<list> data;
    Activity activity;
    DbHelper db;

    public DeptAdapter(Activity activity, List<list> data)
    {
        this.data = data;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater LI = activity.getLayoutInflater();
        View vw = LI.inflate(R.layout.dept_list, parent,false);
        return new ViewHolder(vw);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ViewHolder holder,
            @SuppressLint("RecyclerView") int position)

    {
        String pos = String.valueOf((position+1));
        int posValue = Integer.parseInt(pos);  // Convert the string to an integer
        String number = String.format("%02d", posValue);

        holder.imagetext.setText(number);
       // holder.topic_name.setText(data.get(position).getTeam());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity,Detail.class);

                i.putExtra("Team",data.get(position).getTeam());
                i.putExtra("positonview",position);

                System.out.println("team===="+data.get(position).getTeam());

                activity.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }
    class ViewHolder
            extends RecyclerView.ViewHolder {
        TextView topic_name,imagetext;
        public ViewHolder(View itemView)
        {
            super(itemView);
            //this.topic_name = itemView.findViewById(R.id.deptlist);
            this.imagetext = itemView.findViewById(R.id.imgtext);

        }
    }
}

