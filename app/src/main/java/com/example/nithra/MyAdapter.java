package com.example.nithra;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.GyHolder> {

    List<Photopojo> list;
    Context context;
    int pos;

    public MyAdapter(Context context, List<Photopojo> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public GyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.activity_view_design, viewGroup, false);
        return new GyHolder(view);
    }

  @Override
  public void onBindViewHolder(@NonNull GyHolder myHolder, @SuppressLint("RecyclerView") int position) {
      pos = position;

      int imageResId = list.get(position).getImage();

      myHolder.imageView.setImageResource(imageResId);
    System.out.println("print_list==" + list.size());
}

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class GyHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public GyHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imgview);


        }

    }

}
