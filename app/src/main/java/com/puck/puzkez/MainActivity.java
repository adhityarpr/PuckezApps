package com.puck.puzkez;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    //Nama : Adhitya Rizqy Pratama
    //Nim : 10117134
    //Kelas : AKB

    //Tanggal pengerjaan 15 mei 2020

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi variabel
        BottomNavigationView bottomNavigationView = findViewById(R.id.bot_nav);

        //Set Main Selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        //selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.daily:
                        startActivity(new Intent(getApplicationContext()
                                , DailyPage.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.gallery:
                        startActivity(new Intent(getApplicationContext()
                                , GalleryPage.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.musvid:
                        startActivity(new Intent(getApplicationContext()
                                , MusicVideoPage.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext()
                                , ProfilePage.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}
