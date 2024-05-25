package com.example.nithra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ViewPager extends AppCompatActivity {

    int id1, currentpos;

    ImageView imageView;
    Button btn1,btn2;
    public static List<Photopojo> photo;
    ViewPager2 viewPager2;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        imageView=findViewById(R.id.back);
        btn1 = findViewById(R.id.previous);
        btn2 = findViewById(R.id.next);

        viewPager2 = findViewById(R.id.viewpager);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentpos > 0) {
                    currentpos--;
                    viewPager2.setCurrentItem(currentpos);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentpos < photo.size() - 1) {
                    currentpos++;
                    viewPager2.setCurrentItem(currentpos);
                }
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ViewPager.this,Photos.class);
                startActivity(i);
            }
        });


        Intent intent = getIntent();
        photo = (List<Photopojo>) intent.getSerializableExtra("list_key");
        currentpos = intent.getIntExtra("position", 0);
        System.out.println("currentPostion ="+currentpos);

        if (photo != null) {
            for (Photopojo data : photo) {
                System.out.println("photo = " + data);
            }
        }
        adapter = new MyAdapter(this, photo);


        viewPager2.setAdapter(adapter);
        //  viewpagermtd(viewPager2);
        viewPager2.setCurrentItem(currentpos, false);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);

            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
/*
        private void viewpagermtd (ViewPager2 viewPager2){
            try {
                Field recyclerViewField = ViewPager2.class.getDeclaredField("mRecyclerView");
                recyclerViewField.setAccessible(true);
                RecyclerView recyclerView = (RecyclerView) recyclerViewField.get(viewPager2);
                Field touchSlopField = RecyclerView.class.getDeclaredField("mTouchSlop");
                touchSlopField.setAccessible(true);
                int touchSlop = (int) touchSlopField.get(recyclerView);
                touchSlopField.set(recyclerView, touchSlop * 8);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
*/
    }
}