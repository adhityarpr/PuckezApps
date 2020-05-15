package com.puck.puzkez;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DailyPage extends AppCompatActivity {

    //Nama : Adhitya Rizqy Pratama
    //Nim : 10117134
    //Kelas : AKB

    //Tanggal pengerjaan 16 mei 2020

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.wkae,R.drawable.game,R.drawable.diningroom,R.drawable.sleep};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_page);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.daily);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //inisialisasi variabel
        BottomNavigationView bottomNavigationView = findViewById(R.id.bot_nav);

        //Set Main Selected
        bottomNavigationView.setSelectedItemId(R.id.daily);

        //selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.daily:
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
