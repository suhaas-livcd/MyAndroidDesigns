package com.example.myandroidlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myandroidlab.motion.HeartFillActivity;
import com.example.myandroidlab.motion.InterpolationActivity;
import com.example.myandroidlab.motion.TickCrossActivity;
import com.example.myandroidlab.motion.TransisitionDemoActivity;
import com.example.myandroidlab.motion.TrimPathActivity;
import com.example.myandroidlab.motion.coordinatedmotion.CoordinatedActivity;

public class MotionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motions);
    }

    public void openMotionTrimPath(View view) {
        Intent intent = new Intent(MotionsActivity.this, TrimPathActivity.class);
        startActivity(intent);
    }

    public void openMotionCoordinated(View view) {
        Intent intent = new Intent(MotionsActivity.this, CoordinatedActivity.class);
        startActivity(intent);
    }

    public void openMotionHeartFill(View view) {
        Intent intent = new Intent(MotionsActivity.this, HeartFillActivity.class);
        startActivity(intent);
    }

    public void openMotionInterpolation(View view) {
        Intent intent = new Intent(MotionsActivity.this, InterpolationActivity.class);
        startActivity(intent);
    }

    public void openMotionTickCross(View view) {
        Intent intent = new Intent(MotionsActivity.this, TickCrossActivity.class);
        startActivity(intent);
    }

    public void openMotionTransistion(View view) {
        Intent intent = new Intent(MotionsActivity.this, TransisitionDemoActivity.class);
        startActivity(intent);
    }
}
