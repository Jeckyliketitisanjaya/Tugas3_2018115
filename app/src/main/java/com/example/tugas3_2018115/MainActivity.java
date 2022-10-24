package com.example.tugas3_2018115;

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

    public void ayamkunyit(View view) {
        Intent a = new Intent(MainActivity.this, Ayamkunyit.class);
        startActivity(a);
    }
    public void ayamkecap(View view) {
        Intent a = new Intent(MainActivity.this, Ayamkecap.class);
        startActivity(a);
    }

    public void ayamgeprek(View view) {
    }
}