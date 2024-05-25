package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AndroidApps extends AppCompatActivity {

    ImageView imageView;
    CardView cardView1,cardView2,cardView3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_apps);

        cardView1=findViewById(R.id.tamillabs);
        cardView2=findViewById(R.id.nithraapps);
        cardView3=findViewById(R.id.nithra);

        imageView=findViewById(R.id.back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AndroidApps.this, TeamPage.class);
                startActivity(i);
            }
        });
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AndroidApps.this,NithraTamilLabs.class);
                startActivity(i);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AndroidApps.this,NithraApps.class);
                startActivity(i);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AndroidApps.this,Nithra.class);
                startActivity(i);
            }
        });
    }
}