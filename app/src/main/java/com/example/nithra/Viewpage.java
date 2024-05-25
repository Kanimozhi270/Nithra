package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
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

public class Viewpage extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    public static List<list> data;

    public  static SQLiteDatabase sqldb;
    DbHelper db;
   String name;
   String prefix;
    String team;
    String designation;
    String employee_code;
    String currentpos;
    String dob1;
    String joining;
    String mobile;
    String firstapp;


    TextView code,names,teams,designations,dob,joinings,mobiles,firstapps,prefix1;
    ImageView imageView;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_list);

        prefix1 = findViewById(R.id.prefix1);
        code=findViewById(R.id.emp_code);
        names=findViewById(R.id.name);
        teams=findViewById(R.id.team);
        designations=findViewById(R.id.designation);
        dob=findViewById(R.id.dob);
        joinings=findViewById(R.id.joining);
        mobiles=findViewById(R.id.mobile);
        firstapps=findViewById(R.id.ffirstapp);

        imageView = findViewById(R.id.back);
        recyclerView = findViewById(R.id.recyclerview_view);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        db = new DbHelper(this);
       // recyclerView.setLayoutManager(new LinearLayoutManager(Viewpage.this));
        data = new ArrayList<>();

        data = new ArrayList<>();


        Intent i = getIntent();
        employee_code = i.getStringExtra("Employee_Code");
        name = i.getStringExtra("Name");
        team = i.getStringExtra("Team");
        designation = i.getStringExtra("Designation");
        dob1 = i.getStringExtra("DOB");
        joining = i.getStringExtra("Joining");
        mobile = i.getStringExtra("Mobile");
        firstapp = i.getStringExtra("Firstapp");
        prefix = name.substring(0,1);


        System.out.println("desi======"+designation);

        code.setText(employee_code);
        names.setText(name);
        teams.setText(team);
        designations.setText(designation);
        dob.setText(dob1);
        joinings.setText(joining);
        mobiles.setText(mobile);
        firstapps.setText(firstapp);
        prefix1.setText(prefix);

    }
}