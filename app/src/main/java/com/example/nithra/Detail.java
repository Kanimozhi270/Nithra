package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Detail extends AppCompatActivity {
    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    public static List<list> data;

    public  static SQLiteDatabase sqldb;
    DbHelper db;
    String name,designation;
            int currentpos;
     TextView toolbar;
     ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        toolbar = findViewById(R.id.toolbar);
        imageView = findViewById(R.id.back);
        recyclerView = findViewById(R.id.recyclerview_detail);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        db = new DbHelper(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(Detail.this));
        data = new ArrayList<>();

        Intent i = getIntent();
        name = i.getStringExtra("Team");

        currentpos = i.getIntExtra("positonview", 0);

        data = db.getName(this, i.getStringExtra("Team"));

        toolbar.setText(i.getStringExtra("Team"));

        adapter = new emp_adapter(this,data);
        recyclerView.setAdapter(adapter);



    }
}