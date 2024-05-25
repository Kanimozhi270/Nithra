package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Photos extends AppCompatActivity {

    ImageView imageView;

    RecyclerView recyclerView;
    PhotoAdapter adapter;
    public static List<Photopojo> photo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);

        imageView=findViewById(R.id.back);
        recyclerView = findViewById(R.id.photo_recyclerview);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Photos.this,TeamPage.class);
                startActivity(i);
            }
        });

        photo = new ArrayList<>();

        // Add data to the list
        photo.add(new Photopojo(R.drawable.img));
        photo.add(new Photopojo(R.drawable.androidteam1));
        photo.add(new Photopojo(R.drawable.androidteam2));
        photo.add(new Photopojo(R.drawable.android3));
        photo.add(new Photopojo(R.drawable.android4));
        photo.add(new Photopojo(R.drawable.android5));
        photo.add(new Photopojo(R.drawable.android6));
        photo.add(new Photopojo(R.drawable.android7));
        photo.add(new Photopojo(R.drawable.android8));
        photo.add(new Photopojo(R.drawable.android9));

        /*photo.add(new Photopojo(R.drawable.img_11));
        photo.add(new Photopojo(R.drawable.img_12));
        photo.add(new Photopojo(R.drawable.img_13));
        photo.add(new Photopojo(R.drawable.img_14));
        photo.add(new Photopojo(R.drawable.img_15));
        photo.add(new Photopojo(R.drawable.img_16));
        photo.add(new Photopojo(R.drawable.img_2));
        photo.add(new Photopojo(R.drawable.img_3));
        photo.add(new Photopojo(R.drawable.img_5));
        photo.add(new Photopojo(R.drawable.img_6));
        photo.add(new Photopojo(R.drawable.img_7));
        photo.add(new Photopojo(R.drawable.img_8));
        photo.add(new Photopojo(R.drawable.img_9));*/

        for (Photopojo data : photo) {

        }
        adapter = new PhotoAdapter(this,photo);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

}







