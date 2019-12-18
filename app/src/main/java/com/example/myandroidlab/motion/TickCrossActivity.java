package com.example.myandroidlab.motion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myandroidlab.R;

public class TickCrossActivity extends AppCompatActivity {

    private ImageView tickCross;
    private AnimatedVectorDrawable tickToCross;
    private AnimatedVectorDrawable crossToTick;
    private boolean tick = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tick_cross);
        tickCross = (ImageView) findViewById(R.id.tick_cross);
        tickToCross = (AnimatedVectorDrawable) getDrawable(R.drawable.avd_tick_to_cross);
        crossToTick = (AnimatedVectorDrawable) getDrawable(R.drawable.avd_cross_to_tick);
    }

    public void animate(View view) {
        AnimatedVectorDrawable drawable = tick ? tickToCross : crossToTick;
        tickCross.setImageDrawable(drawable);
        drawable.start();
        tick = !tick;
    }
}
