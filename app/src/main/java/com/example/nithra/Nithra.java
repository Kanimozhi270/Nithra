package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Nithra extends AppCompatActivity {
    ImageView imageView;
    RecyclerView recyclerView;
    NithraAdapter adapter;

    public static List<labs_pojo> Datas;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nithra);

        imageView=findViewById(R.id.back);
        recyclerView=findViewById(R.id.recyclerview2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Nithra.this,AndroidApps.class);
                startActivity(i);

            }
        });

        Datas = new ArrayList<>();

        // Add data to the list
        Datas.add(new labs_pojo(R.drawable.kundlimilan, "https://play.google.com/store/apps/details?id=nithra.horoscope.marriage.vivah.matching","Kundli Milan"));
        Datas.add(new labs_pojo(R.drawable.telugubaby, "https://play.google.com/store/apps/details?id=nithra.telugu.baby.names", "Telugu Baby Names"));
        Datas.add(new labs_pojo(R.drawable.diwalicrackers, "https://play.google.com/store/apps/details?id=nithra.diwali.crackers.fireworks.celebrations", "Diwali Crackers"));
        Datas.add(new labs_pojo(R.drawable.hindigk, "https://play.google.com/store/apps/details?id=nithra.hindi.gk.quiz", "Hindi GK Quiz"));
        Datas.add(new labs_pojo(R.drawable.hindiwordsearch, "https://play.google.com/store/apps/details?id=nithra.hindi.letter.crossword.search", "Hindi Word Search"));
        Datas.add(new labs_pojo(R.drawable.inventions, "https://play.google.com/store/apps/details?id=nithra.inventions_inventors", "Inventiona and Inventors"));

        for (labs_pojo data : Datas) {

        }
        adapter = new NithraAdapter(this,Datas);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //recyclerView.setLayoutManager(new GridLayoutManager(Nithra.this,5));
        recyclerView.setLayoutManager(new LinearLayoutManager(Nithra.this));
        adapter = new NithraAdapter(this,Datas);
        recyclerView.setAdapter(adapter);


    }

}


