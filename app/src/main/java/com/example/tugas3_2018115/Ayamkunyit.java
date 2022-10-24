package com.example.tugas3_2018115;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ayamkunyit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayamkunyit);
    }
    public void ayamkunyit(View view) {
    }
    public void ayamkecap(View view) {
        Intent a = new Intent(Ayamkunyit.this, Ayamkecap.class);
        startActivity(a);
    }

    public void ayamgeprek(View view) {
        Intent a = new Intent(Ayamkunyit.this, MainActivity.class);
        startActivity(a);
    }
}