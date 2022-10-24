package com.example.tugas3_2018115;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ayamkecap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayamkecap);
    }
    public void ayamkunyit(View view) {
        Intent a = new Intent(Ayamkecap.this, Ayamkunyit.class);
        startActivity(a);
    }
    public void ayamkecap(View view) {
    }

    public void ayamgeprek(View view) {
        Intent a = new Intent(Ayamkecap.this, MainActivity.class);
        startActivity(a);
    }
}