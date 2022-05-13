package com.practice.newtrial;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Updates extends Fragment {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_updates, container, false);
        WebView wb = view.findViewById(R.id.webUpdates);
        wb.loadUrl("https://krishworks.com/updates/");
        WebSettings settings = wb.getSettings();
        settings.setJavaScriptEnabled(true);
        return view;
    }
}