package com.puck.puzkez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    //Nama : Adhitya Rizqy Pratama
    //Nim : 10117134
    //Kelas : AKB

    //Tanggal pengerjaan 8 mei 2020

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        int SPLASH_SCREEN_TIME = 1000; //1 Detik

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, SliderPage.class);
                SplashScreen.this.startActivity(intent);
                SplashScreen.this.finish();
            }
        }, SPLASH_SCREEN_TIME);

    }
}
