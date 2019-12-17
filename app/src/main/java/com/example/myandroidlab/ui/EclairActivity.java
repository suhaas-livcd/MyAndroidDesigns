package com.example.myandroidlab.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myandroidlab.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class EclairActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eclair);
        ((CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout)).setTitle("Eclairs");

    }
}
