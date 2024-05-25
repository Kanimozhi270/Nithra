package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Officeproject extends AppCompatActivity {

    ImageView imageView;
    TextView job,matrimony,diyastore,nithrabook,jathagam,schoolins,homam,rescue,nithramobi,bharathclg,calandertoday,calanderblog,namtamil,samayal,alagukurippu,health,jokes,leader,ponmozhi,selfemployment,tamilkathaigal,vedukathai,tour,temple,thirukural,proverb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officeproject);

        job=findViewById(R.id.jobs);
        matrimony=findViewById(R.id.matrimony);
        diyastore=findViewById(R.id.diyastore);
        nithrabook=findViewById(R.id.nithrabooks);
        jathagam=findViewById(R.id.jathagam);
        schoolins=findViewById(R.id.schoolinspection);
        homam=findViewById(R.id.diyahomam);
        rescue=findViewById(R.id.rescue);
        nithramobi=findViewById(R.id.nithramobi);
        bharathclg=findViewById(R.id.Bharathcollege);

        calandertoday=findViewById(R.id.calandertoday);
        calanderblog=findViewById(R.id.calanderblog);
        namtamil=findViewById(R.id.namtamil);

        samayal=findViewById(R.id.namtamilsamaiyal);
        alagukurippu=findViewById(R.id.namtamilalagu);
        health=findViewById(R.id.namtamilhealth);
        jokes=findViewById(R.id.namtamiljokes);
        leader=findViewById(R.id.namtamilleader);
        ponmozhi=findViewById(R.id.namtamilponmozhi);
        selfemployment=findViewById(R.id.namtamilself);
        tamilkathaigal=findViewById(R.id.namtamilkathaigal);
        vedukathai=findViewById(R.id.namtamilvedukathaigal);
        tour=findViewById(R.id.namtamiltours);
        temple=findViewById(R.id.namtamiltemple);
        thirukural=findViewById(R.id.namtamilthirukural);
        proverb=findViewById(R.id.namtamilproverb);



        imageView=findViewById(R.id.back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Officeproject.this,WebApplication.class);
                startActivity(i);
            }
        });
        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithrajobs.com/"));
                startActivity(i);
            }
        });
        matrimony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithramatrimony.net/"));
                startActivity(i);
            }
        });
        diyastore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://diyastore.in/"));
                startActivity(i);
            }
        });
        nithrabook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithrabooks.com/"));
                startActivity(i);
            }
        });
        jathagam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/jathagam/"));
                startActivity(i);
            }
        });
        schoolins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithraschoolconnect.com/"));
                startActivity(i);
            }
        });
        homam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://diyahomam.in/index.php"));
                startActivity(i);
            }
        });
        rescue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.in/rescue-mission/index"));
                startActivity(i);
            }
        });
        nithramobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/"));
                startActivity(i);
            }
        });
        bharathclg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://bharath.ac.in/aboutus.php"));
                startActivity(i);
            }
        });
        calandertoday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://tamilcalendar.today/"));
                startActivity(i);
            }
        });
        calanderblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://tamilcalendar.today/blog/"));
                startActivity(i);
            }
        });
        namtamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/"));
                startActivity(i);
            }
        });

        samayal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/samayal/"));
                startActivity(i);
            }
        });
        alagukurippu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/alugu_kuripugal/index.php"));
                startActivity(i);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/health_tips/index.php"));
                startActivity(i);
            }
        });
        jokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/jokes/index.php"));
                startActivity(i);
            }
        });
        leader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/leader_history/index.php"));
                startActivity(i);
            }
        });
        ponmozhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/pon_mozhigal/index.php"));
                startActivity(i);
            }
        });
        selfemployment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse(" https://nithra.mobi/namtamil/self_employment/index.php"));
                startActivity(i);
            }
        });
       tamilkathaigal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/tamil_kathaikal/index.php"));
                startActivity(i);
            }
        });
        vedukathai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/tamil_vidukathaigal/index.php"));
                startActivity(i);
            }
        });
        tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/Tamilnadu_Tours/index.php"));
                startActivity(i);
            }
        });
        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse(" https://nithra.mobi/namtamil/temple_history/index.php"));
                startActivity(i);
            }
        });
        thirukural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/thirukural/index.php"));
                startActivity(i);
            }
        });
        proverb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://nithra.mobi/namtamil/proverbs/index.php"));
                startActivity(i);
            }
        });

    }
}