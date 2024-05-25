package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WebApplication extends AppCompatActivity {

    ImageView imageView;
    CardView office,client;
    TextView job;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_application);

        job=findViewById(R.id.jobs);
        office=findViewById(R.id.officeproject);
        client=findViewById(R.id.clientproject);

        imageView=findViewById(R.id.back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WebApplication.this,TeamPage.class);
                startActivity(i);
            }
        });
        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WebApplication.this,Officeproject.class);
                startActivity(i);
            }
        });

        client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WebApplication.this,ClientProject.class);
                startActivity(i);
            }
        });

    }
}