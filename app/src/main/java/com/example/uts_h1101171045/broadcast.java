package com.example.uts_h1101171045;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class broadcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.broadcast);
    }
    public void synbrodcast (View view){
        Intent intent = new Intent(this,synbroadcast.class);
        startActivity(intent);
    }
    public void open (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id"));
        startActivity(browserIntent);
    }
}


