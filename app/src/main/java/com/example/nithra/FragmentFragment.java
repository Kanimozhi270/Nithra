/*
package com.example.nithra;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

import java.util.List;

public class FragmentFragment extends Fragment {

    ImageView imageView;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.image_view, container, false);
        imageView=view.findViewById(R.id.img);
        Bundle b = getArguments();
        assert b != null;

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            List<Photopojo> photo = (List<Photopojo>) bundle.getSerializable("list_key");

        }


       // webView.loadDataWithBaseURL ("" ,contentview,"text/html","utf-8",null);
        return view;
        imageView.setImageResource("",Bundle,"list_key",null);
    }
}
*/
