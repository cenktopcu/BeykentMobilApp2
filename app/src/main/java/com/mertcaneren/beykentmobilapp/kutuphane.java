package com.mertcaneren.beykentmobilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kutuphane extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kutuphane);
    }

    public void akademisyenAna(View view){

        Intent ıntent = new Intent(getApplicationContext(),akademisyenAnaSayfa.class);
        startActivity(ıntent);
    }
}
