package com.practice.newtrial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


public class HomeActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ImageView settings;
    ViewPager viewPager;
    RelativeLayout rl;
    EditText pinView;
    String pass=new CheckPassCode().getPass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_acitivty);
        settings=findViewById(R.id.settings);
        rl= findViewById(R.id.passLayout);
        Log.v("pass",pass);
        settings.setOnClickListener(v ->{
            final AlertDialog.Builder alert = new AlertDialog.Builder(HomeActivity.this);
            View view = getLayoutInflater().inflate(R.layout.custom_dialog,null);
            pinView = view.findViewById(R.id.pinView);
            LinearLayout layout = view.findViewById(R.id.passLayout);
            alert.setView(view);

            final AlertDialog alertDialog = alert.create();
            alertDialog.setCancelable(false);
            alert.show();
            pinView.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if(s.toString().length()==6){
                        if(s.toString().trim().equals(pass)){
                            startActivity(new Intent(HomeActivity.this, Setting.class));
                        }else{
                            pinView.setText("");
                        }
                    }

                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });


        });


        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.vp);

        tabLayout.setupWithViewPager(viewPager);

        MyAdapter adapter =new MyAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFrag(new Home(), "Home");
        adapter.addFrag(new AboutUs(), "About Us");
        adapter.addFrag(new Updates(), "Updates");
        viewPager.setAdapter(adapter);
    }
}
