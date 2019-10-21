package com.example.uts_h1101171045;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity (View view){
        Intent intent = new Intent(this,aktivitas.class);
        startActivity(intent);
    }

    public void service(View view){
        Intent intent = new Intent(this,servis.class);
        startActivity(intent);
    }

    public void content(View view){
        Intent intent = new Intent(this,konten.class);
        startActivity(intent);
    }

    public void broadcast(View view){
        Intent intent = new Intent(this,broadcast.class);
        startActivity(intent);
    }

    public void intent(View view){
        Intent intent = new Intent(this,intent.class);
        startActivity(intent);
    }
}
