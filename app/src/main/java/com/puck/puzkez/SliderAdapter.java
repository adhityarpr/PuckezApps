package com.puck.puzkez;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    //Nama : Adhitya Rizqy Pratama
    //Nim : 10117134
    //Kelas : AKB

    //Tanggal pengerjaan 8 mei 2020

    Context context;
    LayoutInflater layoutInflater;


    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] imageView = {
            R.drawable.bmo1,
            R.drawable.cheburaskha3,
            R.drawable.brave2,
    };

    public String[] heading = {
            "WELCOME TO PUCKEZ APPS",
            "DON'T TOXIC",
            "JUST HAVE FUN"
    };

    public String[] slide_descs = {
            "Hi There, Welcome To My Apps. All in Here is About My Self. I Hope You Enjoy My Apps, Thanks.",
            "Don't toxic because toxic is not good for your body",
            "Having fun before having fun is prohibited"
    };

    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_slider_adapter, container,false);

        ImageView slideimageView = (ImageView) view.findViewById(R.id.imageView);
        TextView slideheading = (TextView) view.findViewById(R.id.heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideimageView.setImageResource(imageView[position]);
        slideheading.setText(heading[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);


        return view;

    };

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);
    }
}
