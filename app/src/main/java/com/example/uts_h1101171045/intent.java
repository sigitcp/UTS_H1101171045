package com.example.uts_h1101171045;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent);
    }
    public void synintent (View view){
        Intent intent = new Intent(this,synintent.class);
        startActivity(intent);
    }
    public void open (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://android-beginner-lessons.blogspot.com/2015/10/android-mengenal-komponen-aplikasi.html"));
        startActivity(browserIntent);
    }
}


