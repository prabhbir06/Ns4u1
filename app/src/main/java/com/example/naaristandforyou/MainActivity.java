package com.example.naaristandforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=findViewById(R.id.videoView);
        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.logo);
        videoView.setVideoURI(uri);
        videoView.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent (getApplicationContext(),Main2Activity.class);
                startActivity(intent);
                finish();
            }
        },4000);

    }
}
