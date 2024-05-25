package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class NithraApps extends AppCompatActivity {
    ImageView imageView;
    RecyclerView recyclerView;
    NithraAdapter adapter;
    public static List<labs_pojo> MyDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nithra_apps);

        recyclerView = findViewById(R.id.recyclerview1);
        imageView=findViewById(R.id.back);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NithraApps.this,AndroidApps.class);
                startActivity(i);

            }
        });

        MyDatas = new ArrayList<>();

        // Add data to the list
        MyDatas.add(new labs_pojo(R.drawable.hindical23, "https://play.google.com/store/apps/details?id=hindicalender.panchang.horoscope.calendar", "2023 Calander"));
        MyDatas.add(new labs_pojo(R.drawable.tamil_calander, "https://play.google.com/store/apps/details?id=nithra.tamilcalender", "Tamil Calender 2023"));
        MyDatas.add(new labs_pojo(R.drawable.telugucal2023, "https://play.google.com/store/apps/details?id=nithra.telugu.calendar", "Telugu Calender 2023"));
        MyDatas.add(new labs_pojo(R.drawable.nithrajobtamil, "https://play.google.com/store/apps/details?id=nithra.jobs.career.placement", "Nithra Jobs Tamil"));
        MyDatas.add(new labs_pojo(R.drawable.enggrammer, "https://play.google.com/store/apps/details?id=com.nithra.bestenglishgrammar", "English Grammer"));
        MyDatas.add(new labs_pojo(R.drawable.nithrajobtelugu, "https://play.google.com/store/apps/details?id=nithra.jobs.andhra.telangana.career.placement", "Nithra Jobs Telugu"));
        MyDatas.add(new labs_pojo(R.drawable.kannadacalander, "https://play.google.com/store/apps/details?id=nithra.kannada.calendar.panchanga.horoscope.rashiphala", "Kannada Calender 2023"));
        MyDatas.add(new labs_pojo(R.drawable.matrimonytelugu, "https://play.google.com/store/apps/details?id=nithra.telugu.matrimony.marriage.vivaha.matching", "Nithra Matrimony telugu"));
        MyDatas.add(new labs_pojo(R.drawable.gkquiz, "https://play.google.com/store/apps/details?id=nithra.quiz", "GK Quiz"));
        MyDatas.add(new labs_pojo(R.drawable.dictionarye2t, "https://play.google.com/store/apps/details?id=com.bharathdictionary", "Enhlish to Tamil Dictionary"));
        MyDatas.add(new labs_pojo(R.drawable.resumebuilder, "https://play.google.com/store/apps/details?id=com.nithra.resume", "Resume Builder"));
        MyDatas.add(new labs_pojo(R.drawable.aptitude, "https://play.google.com/store/apps/details?id=nithra.math.aptitude", "Aptitude Test and Preparation"));
        MyDatas.add(new labs_pojo(R.drawable.matrimonytamil, "https://play.google.com/store/apps/details?id=nithra.tamil.marriage.matrimony.thirumanaporutham", "Nithra Matrimony Tamil"));
        MyDatas.add(new labs_pojo(R.drawable.logicalreasoning, "https://play.google.com/store/apps/details?id=nithra.math.logicalreasoning", "Logical Reasoning"));
        MyDatas.add(new labs_pojo(R.drawable.samaiyaltamil, "https://play.google.com/store/apps/details?id=nithra.samayalkurippu", "Samayal Tamil"));
        MyDatas.add(new labs_pojo(R.drawable.img_17, "https://play.google.com/store/apps/details?id=nithra.hindi.rashifal.horoscope.daily", "Rashifal 2023 in Hindi"));
        MyDatas.add(new labs_pojo(R.drawable.hindi2023, "https://play.google.com/store/apps/details?id=nithra.hindi.calendar", "Hindi Calender 2023"));
        MyDatas.add(new labs_pojo(R.drawable.solliadi, "https://play.google.com/store/apps/details?id=nithra.tamil.word.game.solliadi", "Tamil Word Game"));
        MyDatas.add(new labs_pojo(R.drawable.malayalamcal, "https://play.google.com/store/apps/details?id=nithra.malayalam.calendar", "Malayalam Calender 2023"));
        MyDatas.add(new labs_pojo(R.drawable.tnpsc, "https://play.google.com/store/apps/details?id=nithra.tnpsc", "TNPSC Tamil"));
        MyDatas.add(new labs_pojo(R.drawable.lettertemlate, "https://play.google.com/store/apps/details?id=nithra.offline.personal.official.letter.templates", "Letter Templates Offline"));
        MyDatas.add(new labs_pojo(R.drawable.vivahamatching, "https://play.google.com/store/apps/details?id=com.nithra.telugu.vivaha.matching", "Vivaha Matching Telugu"));
        MyDatas.add(new labs_pojo(R.drawable.learnhindifromeng, "https://play.google.com/store/apps/details?id=nithra.english.tamil.hindi.learning.practice", "Learn Hindi"));
        MyDatas.add(new labs_pojo(R.drawable.tamilwordsearch, "https://play.google.com/store/apps/details?id=nithra.tamil.letter.crossword.search", "Tamil Word Search"));
        MyDatas.add(new labs_pojo(R.drawable.vivasayam, "https://play.google.com/store/apps/details?id=nithra.tamil.vivasayam.agriculture.market", "Vivasayam"));
        MyDatas.add(new labs_pojo(R.drawable.rasiphalalu, "https://play.google.com/store/apps/details?id=nithra.telugu.dina.rasi.phalalu.horoscope", "Rasi Phalalu"));
        MyDatas.add(new labs_pojo(R.drawable.rasipalandaily, "https://play.google.com/store/apps/details?id=nithra.tamil.rasipalan.horoscope", "Rasipalangal daily"));
        MyDatas.add(new labs_pojo(R.drawable.policeexam, "https://play.google.com/store/apps/details?id=nithra.tn.police.exams", "TN Police Exam"));
        MyDatas.add(new labs_pojo(R.drawable.tnepbillcal, "https://play.google.com/store/apps/details?id=nithra.tneb.electricity.bill.calculator", "TNEP Bill Calculator"));
        MyDatas.add(new labs_pojo(R.drawable.namvedu, "https://play.google.com/store/apps/details?id=nithra.tamil.veedu.house.construction", "Nam Veedu"));
        MyDatas.add(new labs_pojo(R.drawable.tamilnaduhouse, "https://play.google.com/store/apps/details?id=nithra.tamilnadu.house.land.shop.rent", "Tamilnadu House Rantals"));
        MyDatas.add(new labs_pojo(R.drawable.resumeoffline, "https://play.google.com/store/apps/details?id=nithra.resume.maker.cv.builder.app", "Resume Builder Offline"));
        MyDatas.add(new labs_pojo(R.drawable.milkmanagement, "https://play.google.com/store/apps/details?id=nithra.milkmanagement", "Milk Management"));
        MyDatas.add(new labs_pojo(R.drawable.impress, "https://play.google.com/store/apps/details?id=com.impres.erp", "Impress Login"));
        MyDatas.add(new labs_pojo(R.drawable.tetexam, "https://play.google.com/store/apps/details?id=nithra.tamil.tet.exam", "TET Tamil"));
        MyDatas.add(new labs_pojo(R.drawable.uzhavanmaadu, "https://play.google.com/store/apps/details?id=nithra.tamil.madu.cattle.cow.breeding", "Uzhavan Maadu"));
        MyDatas.add(new labs_pojo(R.drawable.tamilsms, "https://play.google.com/store/apps/details?id=com.nithra.tamilsms", "Tamil SMS"));
        MyDatas.add(new labs_pojo(R.drawable.magalirmattum, "https://play.google.com/store/apps/details?id=nithra.tamil.womens.safety.mehendi.blouse.kolam.designs", "Magair Mattum"));
        MyDatas.add(new labs_pojo(R.drawable.sridiyastore, "https://play.google.com/store/apps/details?id=com.diyastores", "Sri Diya Stores"));

        MyDatas.add(new labs_pojo(R.drawable.tnpsceng, "https://play.google.com/store/apps/details?id=nithra.tnpsc", "TNPSC English"));
        MyDatas.add(new labs_pojo(R.drawable.resumecv, "https://play.google.com/store/apps/details?id=com.nithra.nithraresume", "Resume Builder"));
        MyDatas.add(new labs_pojo(R.drawable.books, "https://play.google.com/store/apps/details?id=com.nithrabooks", "Nithra Books"));
        MyDatas.add(new labs_pojo(R.drawable.gurupeyarchi2023, "https://play.google.com/store/apps/details?id=nithra.gurupeyarchi.ragukethupeyarchi.sanipeyarchi.palangal", "Sani Payarchi Palangal"));
        MyDatas.add(new labs_pojo(R.drawable.smarttool, "https://play.google.com/store/apps/details?id=nithra.smart.tools.kit.all.utility.pack", "Smart All Tools"));
        MyDatas.add(new labs_pojo(R.drawable.thiruvanamalai, "https://play.google.com/store/apps/details?id=nithra.tiruvannamalai.girivalam", "Namma ooru Tiruvannamalai"));
        MyDatas.add(new labs_pojo(R.drawable.ifsc, "https://play.google.com/store/apps/details?id=nithra.bank.code.ifsc.micr.std.isd.pin.rto", "IFSC Code"));
        MyDatas.add(new labs_pojo(R.drawable.noolu, "https://play.google.com/store/apps/details?id=com.noolu.yarn.live", "Noolu App"));
        MyDatas.add(new labs_pojo(R.drawable.steps, "https://play.google.com/store/apps/details?id=nithra.school.connect.homework.study.learn", "Nithra STEPS"));
        MyDatas.add(new labs_pojo(R.drawable.reminder, "https://play.google.com/store/apps/details?id=nithra.reminder.tasks.alarm", "Reminder"));
        MyDatas.add(new labs_pojo(R.drawable.bhrathpolytechnic, "https://play.google.com/store/apps/details?id=com.nithra.bharath", "Bharath Polytechnic"));

        // Access the data from the list
        for (labs_pojo data : MyDatas) {

        }
        adapter = new NithraAdapter(this,MyDatas);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //recyclerView.setLayoutManager(new GridLayoutManager(Nithra.this,5));
        recyclerView.setLayoutManager(new LinearLayoutManager(NithraApps.this));
        adapter = new NithraAdapter(this,MyDatas);
        recyclerView.setAdapter(adapter);


    }

}



