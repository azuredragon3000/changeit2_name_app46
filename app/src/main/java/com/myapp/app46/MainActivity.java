package com.myapp.app46;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.myapp.mylibrary.ads.AdsInterstitial;

public class MainActivity extends AppCompatActivity {

    AdsInterstitial adsInterstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = findViewById(R.id.bt);
        bt.setOnClickListener(v->{

            startActivity(new Intent(this,BTYMainActivity.class));
            adsInterstitial = new AdsInterstitial(
                    "07CC7E40850ABA2DF210A2D2564CAD76",
                    "ca-app-pub-8404443559572571/2384071942",
                    this);
        });
    }
}