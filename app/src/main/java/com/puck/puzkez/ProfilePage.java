package com.puck.puzkez;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfilePage extends AppCompatActivity {

    //Nama : Adhitya Rizqy Pratama
    //Nim : 10117134
    //Kelas : AKB

    //Tanggal pengerjaan 14 mei 2020

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        ImageView imageView = findViewById(R.id.imgIG);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://instagram.com/_u/adhityarpr");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.instagram.android");
                try
                {
                    Toast.makeText(ProfilePage.this, "Instagram", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e)
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/_u/adhityarpr")));
                }
            }
        });

        //inisialisasi variabel
        BottomNavigationView bottomNavigationView = findViewById(R.id.bot_nav);

        //Set Main Selected
        bottomNavigationView.setSelectedItemId(R.id.profile);

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
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.musvid:
                        startActivity(new Intent(getApplicationContext()
                                , MusicVideoPage.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.profile:
                        return true;
                }
                return false;
            }
        });


    }



}
