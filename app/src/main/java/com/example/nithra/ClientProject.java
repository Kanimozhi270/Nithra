package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ClientProject extends AppCompatActivity {

    ImageView imageView;
    TextView vanividhayalaya,vanicbsc,king24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_project);

        vanividhayalaya=findViewById(R.id.vanividhayalaya);
        vanicbsc=findViewById(R.id.vanicbsc);
        king24=findViewById(R.id.king24);

        imageView=findViewById(R.id.back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientProject.this,WebApplication.class);
                startActivity(i);
            }
        });

        vanividhayalaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vanividhyalaya.com/"));
                startActivity(i);
            }
        });
        vanicbsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("http://vanicbse.com/"));
                startActivity(i);
            }
        });
        king24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://king24x7.com/news/"));
                startActivity(i);
            }
        });
    }
}