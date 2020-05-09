package com.apps.myselfapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabIndicator;
    Button btnNext;
    int position = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        //Buat activity full screen

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        //hide the action bar
        getSupportActionBar().hide();

        //ini views
        btnNext = findViewById(R.id.btn_next);
        tabIndicator = (TabLayout) findViewById(R.id.tab_indicator);


        //fill list screen

        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Fresh Food", "Diawali dengan makan yang cukup!!!", R.drawable.eat_icon));
        mList.add(new ScreenItem("Nice Code", "Setelah kenyang, mari kita mulai ngoding!!!", R.drawable.code_icon));
        mList.add(new ScreenItem("Sleep For Rest", "Selesai ngoding, alangkah baiknya kita tidur untuk istirahat!!!", R.drawable.sleep_icon));

        //setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this, mList);
        screenPager.setAdapter(introViewPagerAdapter);

        //setup tablayout with viewpager
        tabIndicator.setupWithViewPager(screenPager);

        //next button click listener
    }
}

