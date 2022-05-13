package com.practice.newtrial;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Home extends Fragment {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        WebView wb = view.findViewById(R.id.webHome);
        wb.loadUrl("https://krishworks.com/");
        WebSettings settings = wb.getSettings();
        settings.setJavaScriptEnabled(true);
        return view;
    }
}