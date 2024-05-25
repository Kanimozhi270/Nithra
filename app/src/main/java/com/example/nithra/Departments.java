package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Departments extends AppCompatActivity {

    DbHelper db;
    private static RecyclerView recyclerView;
    public static List<list> data;

    public  static SQLiteDatabase sqldb;
    ImageView imageView;
    CardView cardView;

    DeptAdapter adapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        db = new DbHelper(this);
        data = new ArrayList<>();

        recyclerView = findViewById(R.id.dept_recyclerview);
        imageView = findViewById(R.id.back);
        recyclerView.setLayoutManager(new LinearLayoutManager(Departments.this));
        fetchData();
    }

    public void fetchData() {
        try {
            db.createDataBase();
            db.openDataBase();

            data = db.getData(this);
            System.out.println("data "+data.size());
            adapter = new DeptAdapter(this, data);
            recyclerView.setAdapter(adapter);

        } catch (Exception e) {
            e.printStackTrace();
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Departments.this, TeamPage.class);
                startActivity(i);
            }
        });

    }
}