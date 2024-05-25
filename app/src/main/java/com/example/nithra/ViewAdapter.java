package com.example.nithra;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder> {
    private List<list> data;
    Activity activity;
    DbHelper db;

    public ViewAdapter (Activity activity, List<list> data)
    {
        this.data = data;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater LI = activity.getLayoutInflater();
        View vw = LI.inflate(R.layout.view_list, parent,false);
        return new ViewHolder(vw);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ViewHolder holder,
            @SuppressLint("RecyclerView") int position)

    {
        holder.employee_code.setText(data.get(position).getEmployee_code());
        holder.prefix.setText(data.get(position).getName().substring(0,1));

    }


    @Override
    public int getItemCount()
    {
        return data.size();
    }

    class ViewHolder
            extends RecyclerView.ViewHolder {
        TextView employee_code,emp_name,team,designation,dob,joining,mobile,prefix,firstapp;

        public ViewHolder(View itemView)
        {
            super(itemView);
            this.employee_code = itemView.findViewById(R.id.emp_code);
            this.emp_name = itemView.findViewById(R.id.name);
            this.team = itemView.findViewById(R.id.team);
            this.designation = itemView.findViewById(R.id.designation);
            this.dob = itemView.findViewById(R.id.dob);
            this.joining = itemView.findViewById(R.id.joining);
            this.mobile = itemView.findViewById(R.id.mobile);
            this.firstapp = itemView.findViewById(R.id.ffirstapp);
            this.prefix = itemView.findViewById(R.id.prefix);

        }
    }
}
