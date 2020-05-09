package com.apps.myselfapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //fill list screen

        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Fresh Food", "Diawali dengan makan yang cukup!!!",R.drawable.eat_icon));
        mList.add(new ScreenItem("Nice Code", "Setelah kenyang, mari kita mulai ngoding!!!",R.drawable.code_icon));
        mList.add(new ScreenItem("Sleep For Rest", "Selesai ngoding, alangkah baiknya kita tidur untuk istirahat!!!",R.drawable.sleep_icon));

        //setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);
    }
}
