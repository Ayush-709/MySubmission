package com.practice.newtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Setting extends AppCompatActivity {
    Button btn;
    TextView gallery, contact;
    WebView wb;
    String url="https://krishworks.com/gallery/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        btn = findViewById(R.id.closeBtn);
        gallery = findViewById(R.id.gallery);
        contact= findViewById(R.id.contact);
        wb = findViewById(R.id.webView);
        loadSite(url);
        btn.setOnClickListener(v -> {
            startActivity(new Intent(Setting.this, HomeActivity.class));
            finishAffinity();
        });

        gallery.setOnClickListener(v -> {
            gallery.setBackgroundResource(R.drawable.side_bar_bg);
            contact.setBackgroundColor(Color.TRANSPARENT);
            gallery.setTextColor(Color.parseColor("#FFAD33"));
            contact.setTextColor(Color.parseColor("#002633"));
            loadSite("https://krishworks.com/gallery/");
        });

        contact.setOnClickListener(v -> {
            contact.setBackgroundResource(R.drawable.side_bar_bg);
            gallery.setBackgroundColor(Color.TRANSPARENT);
            contact.setTextColor(Color.parseColor("#FFAD33"));
            gallery.setTextColor(Color.parseColor("#002633"));
            loadSite("https://krishworks.com/contact/");
        });

    }

    @SuppressLint("SetJavaScriptEnabled")
    public void loadSite(String url){
        wb.loadUrl(url);
        WebSettings settings = wb.getSettings();
        settings.setJavaScriptEnabled(true);

    }
}