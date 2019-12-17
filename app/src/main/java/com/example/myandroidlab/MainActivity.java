package com.example.myandroidlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myandroidlab.ui.EclairActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openEclairsActivity(View view) {
        Intent intent = new Intent(MainActivity.this, EclairActivity.class);
        startActivity(intent);
    }

    public void openAnimationsActivity(View view) {
        Intent intent = new Intent(MainActivity.this, RippleActivity.class);
        startActivity(intent);
    }

    public void openSurfaceActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SurfaceActivity.class);
        startActivity(intent);
    }

    public void openMotionsActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MotionsActivity.class);
        startActivity(intent);
    }


}
