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

public class emp_adapter extends RecyclerView.Adapter<emp_adapter.ViewHolder> {
    private List<list> data;
    Activity activity;
    DbHelper db;

    public emp_adapter(Activity activity, List<list> data)
    {
        this.data = data;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater LI = activity.getLayoutInflater();
        View vw = LI.inflate(R.layout.emp_list, parent,false);
        return new ViewHolder(vw);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ViewHolder holder,
            @SuppressLint("RecyclerView") int position)

    {
        String pos = String.valueOf((position+1));

        //holder.imagetext.setText(pos);

        holder.name.setText(data.get(position).getName());
        holder.prefix.setText(data.get(position).getName().substring(0,1));
        holder.designation.setText(data.get(position).getDesignation());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity,Viewpage.class);

                i.putExtra("Employee_Code",data.get(position).getEmployee_code());
                System.out.println("values === : "+data.get(position).getEmployee_code());

                i.putExtra("Name",data.get(position).getName());
                i.putExtra("Team",data.get(position).getTeam());
                i.putExtra("Designation",data.get(position).getDesignation());
                i.putExtra("DOB",data.get(position).getDob());
                i.putExtra("Joining",data.get(position).getJoining());
                i.putExtra("Mobile",data.get(position).getMobile());
                i.putExtra("Firstapp",data.get(position).getFirstapp());


                i.putExtra("positonview",position);

                System.out.println("designation===="+data.get(position).getDesignation());

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
        TextView name,designation,prefix;

        public ViewHolder(View itemView)
        {
            super(itemView);
            this.name = itemView.findViewById(R.id.nametext);
            this.designation = itemView.findViewById(R.id.designationtext);
            this.prefix = itemView.findViewById(R.id.prefix);

        }
    }
}
