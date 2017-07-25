package com.example.android.musictouch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nowPlayingTV = (TextView) findViewById(R.id.now_playing_tv);
        nowPlayingTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(intent);
            }
        });

        TextView albumsTV = (TextView) findViewById(R.id.albums_tv);
        albumsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Albums.class);
                startActivity(intent);
            }
        });

        TextView artistsTV = (TextView) findViewById(R.id.artists_tv);
        artistsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Artists.class);
                startActivity(intent);
            }
        });

        TextView discoverTV = (TextView) findViewById(R.id.discover_tv);
        discoverTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiscoverNewSongs.class);
                startActivity(intent);
            }
        });
        TextView allSongsTV = (TextView) findViewById(R.id.all_songs_tv);
        allSongsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllSongs.class);
                startActivity(intent);
            }
        });


    }
}
