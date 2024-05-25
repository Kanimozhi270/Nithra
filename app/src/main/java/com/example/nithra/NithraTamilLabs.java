package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NithraTamilLabs extends AppCompatActivity {

    ImageView imageView;

     RecyclerView recyclerView;
    NithraAdapter adapter;
    public static List<labs_pojo> MyData;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nithra_tamil_labs);

        imageView=findViewById(R.id.back);

        recyclerView = findViewById(R.id.recyclerview);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NithraTamilLabs.this,AndroidApps.class);
                startActivity(i);

            }
        });

               MyData = new ArrayList<>();

                // Add data to the list
                MyData.add(new labs_pojo(R.drawable.tamilbaby, "https://play.google.com/store/apps/details?id=nithra.babyname", "Tamil Baby Names"));
                MyData.add(new labs_pojo(R.drawable.tamilcrossword, "https://play.google.com/store/apps/details?id=nithra.tamilcrosswordpuzzle", "Tamil Crossword Game"));
                MyData.add(new labs_pojo(R.drawable.tamilquiz, "https://play.google.com/store/apps/details?id=nithra.tamil.gk.quiz.pothuarivu.vinadi.vina", "Tamil Quiz Game"));
                MyData.add(new labs_pojo(R.drawable.tamilnadumarket, "https://play.google.com/store/apps/details?id=nithra.tamilnadu.market.rates", "Tamilnadu Market rates"));
                MyData.add(new labs_pojo(R.drawable.sivapuranam, "https://play.google.com/store/apps/details?id=nithra.tamil.god.sivapuranam", "Sivapuranam"));
                MyData.add(new labs_pojo(R.drawable.learntamil, "https://play.google.com/store/apps/details?id=nithra.tamilkarka", "Learn Tamil easily"));
        MyData.add(new labs_pojo(R.drawable.tamilriddles, "https://play.google.com/store/apps/details?id=com.nithra.riddles", "Tamil Riddles"));
        MyData.add(new labs_pojo(R.drawable.leadershistory, "https://play.google.com/store/apps/details?id=nithra.tamil.leaders.celebrities.history", "Leaders History"));
        MyData.add(new labs_pojo(R.drawable.beautytips, "https://play.google.com/store/apps/details?id=nithra.tamil.beauty.tips", "Beauty Tips"));
        MyData.add(new labs_pojo(R.drawable.tamilstories, "https://play.google.com/store/apps/details?id=nithra.tamil.story", "Tamil Stories"));
        MyData.add(new labs_pojo(R.drawable.tamilnadutemple, "https://play.google.com/store/apps/details?id=nithra.temple.history_details", "Tamilnadu Temples"));
        MyData.add(new labs_pojo(R.drawable.thirukural, "https://play.google.com/store/apps/details?id=nithra.thirukkural", "Thirukkural"));
        MyData.add(new labs_pojo(R.drawable.selfemployment, "https://play.google.com/store/apps/details?id=nithra.selfemployment.suyathozhil", "Self-Employment"));
        MyData.add(new labs_pojo(R.drawable.mahabaratham, "https://play.google.com/store/apps/details?id=nithra.tamil.mahabharatham", "Mahabharatham"));
        MyData.add(new labs_pojo(R.drawable.tamiljokes, "https://play.google.com/store/apps/details?id=nithra.tamil.jokes", "Tamil jokes"));
        MyData.add(new labs_pojo(R.drawable.tamilnadutours, "https://play.google.com/store/apps/details?id=nithra.tamilnadu.tour.places", "Tamilnadu Tours"));
        MyData.add(new labs_pojo(R.drawable.kolangal, "https://play.google.com/store/apps/details?id=nithra.tamil.kolam.rangoli.designs", "Kolangal"));
        MyData.add(new labs_pojo(R.drawable.tamilnumeralogy, "https://play.google.com/store/apps/details?id=nithra.tamil.numerology.enkanitham.jothidam.calculator", "Tamil Numerology"));
        MyData.add(new labs_pojo(R.drawable.tamilpundialogue, "https://play.google.com/store/apps/details?id=nithra.punchdialogues", "Tamil Punch Dialogue"));
        MyData.add(new labs_pojo(R.drawable.ramayanam, "https://play.google.com/store/apps/details?id=nithra.ramayanam", "Ramayanam"));
        MyData.add(new labs_pojo(R.drawable.tamilquotes, "https://play.google.com/store/apps/details?id=nithra.tamil.quotes.ponmozhigal", "Tamil Quotes"));
        MyData.add(new labs_pojo(R.drawable.tamilproverb, "https://play.google.com/store/apps/details?id=com.nithra.tamilproverbs", "Tamil Proverbs"));
        MyData.add(new labs_pojo(R.drawable.jothidathedal, "https://play.google.com/store/apps/details?id=nithra.jothidam.kelvipathil", "Jothida Thedal"));
        MyData.add(new labs_pojo(R.drawable.kanavupalangal, "https://play.google.com/store/apps/details?id=nithra.tamil.kanavu.palangal", "Kanavu Palangal"));
        MyData.add(new labs_pojo(R.drawable.garudapuranam, "https://play.google.com/store/apps/details?id=nithra.tamil.garudapuranam", "Garuda Puranam"));
        MyData.add(new labs_pojo(R.drawable.vastushastram, "https://play.google.com/store/apps/details?id=nithra.tamil.home.vastu.shastra.tips", "Vastu shastram"));
        MyData.add(new labs_pojo(R.drawable.healthcare, "https://play.google.com/store/apps/details?id=nithra.tamil.healthtips", "Health Care Tips"));
        MyData.add(new labs_pojo(R.drawable.ayyappanhistory, "https://play.google.com/store/apps/details?id=nithra.tamil.god.iyyappan.history", "Ayyappan History"));
        MyData.add(new labs_pojo(R.drawable.aathichudi, "https://play.google.com/store/apps/details?id=nithra.tamil.aavaiyar.aathichudi", "Aathichudi"));
        MyData.add(new labs_pojo(R.drawable.vishnupuranam, "https://play.google.com/store/apps/details?id=nithra.vishnu.puranam.tamil", "Vishnu Puranam"));
        MyData.add(new labs_pojo(R.drawable.thiruppavai, "https://play.google.com/store/apps/details?id=nithra.tamil.andaal.thiruppavai", "Thiruppavai"));
        MyData.add(new labs_pojo(R.drawable.maram, "https://play.google.com/store/apps/details?id=nithra.tamil.maram.trees.plants.forest", "Maram"));
        MyData.add(new labs_pojo(R.drawable.navagrahahistory, "https://play.google.com/store/apps/details?id=nithra.tamil.navagraha.varalaru.valipadu", "Navagraga History"));
        MyData.add(new labs_pojo(R.drawable.tnroadrules, "https://play.google.com/store/search?q=TN%20Road%20Rules%20in%20nithra&c=apps", "TN Road Rules"));
        MyData.add(new labs_pojo(R.drawable.naayanmaargal, "https://play.google.com/store/apps/details?id=nithra.tamil.history.naayanmaarkal.varalaru", "Naayanmaargal Tamil"));
        MyData.add(new labs_pojo(R.drawable.pongal2023, "https://play.google.com/store/apps/details?id=nithra.tamil.pongal", "Tamil Pongal 2023"));
        MyData.add(new labs_pojo(R.drawable.gramadeivangal, "https://play.google.com/store/apps/details?id=nithra.tamil.village.god.gramathu.deivam.valipadu", "Grama Dheivangal"));
        MyData.add(new labs_pojo(R.drawable.thagavalkalanjiyam, "https://play.google.com/store/apps/details?id=nithra.tamil.thagavalkalanjiyam", "Thagaval Kalanjiyam"));
        MyData.add(new labs_pojo(R.drawable.e80s90shistory, "https://play.google.com/store/apps/details?id=nithra.tamil.old.games.lifestyle.history", "80s 90s History"));

                // Access the data from the list
        for (labs_pojo data : MyData) {

        }
        adapter = new NithraAdapter(this,MyData);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //recyclerView.setLayoutManager(new GridLayoutManager(Nithra.this,5));
        recyclerView.setLayoutManager(new LinearLayoutManager(NithraTamilLabs.this));
        adapter = new NithraAdapter(this,MyData);
        recyclerView.setAdapter(adapter);


    }

}

