package com.example.myandroidlab.motion.coordinatedmotion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myandroidlab.R;

public class CoordinatedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinated);
    }

    public void multipleElementsClick(View view) {
        startActivity(new Intent(this, MultipleElements.class));
    }

    public void multipleChaoticElementsClick(View view) {
        startActivity(new Intent(this, MultipleChaoticElements.class));
    }

    public void curvedMotionClick(View view) {
        startActivity(new Intent(this, CurveMotionList.class));
    }

    public void sizeChangeClick(View view) {
        startActivity(new Intent(this, SizeChange.class));
    }
}
