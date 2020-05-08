package com.apps.myselfapps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    private Object LayoutInflater;

    public  SlideAdapter(Context context) {

        this.context = context;

    }

    //Arrays
    public int[] slide_images = {

            R.drawable.eat_icon,
            R.drawable.sleep_icon,
            R.drawable.code_icon

    };

    public String[] slide_headings ={

            "EAT",
            "SLEEP",
            "CODE"

    };

    public String[] slide_desc = {

            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
                    "aliqua",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
                    "aliqua",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
                    "aliqua"


    };

    @Override
    public int getCount() {
        return  slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @SuppressLint("ServiceCast")
    public View instantiatItem(ViewGroup continaer, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, continaer, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_desc[position]);

        continaer.addView(view);

        return view;
    }

    public void  destroyItem(ViewGroup container, int position, Object object){

        container.removeView((RelativeLayout)object);
    }
}
