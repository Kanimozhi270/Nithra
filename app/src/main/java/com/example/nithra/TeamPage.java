package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TeamPage extends AppCompatActivity {

    CardView dept,android,ios,web,photo,branch;
    ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_page);

        imageView=findViewById(R.id.back);

        dept=findViewById(R.id.departments);
        photo=findViewById(R.id.photo);
        android=findViewById(R.id.android);
        ios=findViewById(R.id.ios);
        web=findViewById(R.id.webapplication);
        branch=findViewById(R.id.branch);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TeamPage.this,Company_about.class);
                startActivity(i);
            }
        });

        dept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TeamPage.this,Departments.class);
                startActivity(i);
            }
        });

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TeamPage.this,Photos.class);
                startActivity(i);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TeamPage.this,AndroidApps.class);
                startActivity(i);
            }
        });
        ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TeamPage.this,IosApps.class);
                startActivity(i);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TeamPage.this,WebApplication.class);
                startActivity(i);
            }
        });
        branch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TeamPage.this,Branch.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        finishAffinity();
        System.exit(0);
    }
}