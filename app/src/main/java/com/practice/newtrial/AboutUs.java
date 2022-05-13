package com.practice.newtrial;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AboutUs extends Fragment {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);
        WebView wb = view.findViewById(R.id.webAboutUs);
        wb.loadUrl("https://krishworks.com/about/");
        WebSettings settings = wb.getSettings();
        settings.setJavaScriptEnabled(true);
        return view;
    }
}