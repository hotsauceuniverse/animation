package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button start;
    ImageView one, two, three, four;
    Animation left1, left2, left3, left4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);

        left1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left_slide);
        left2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left_slide2);
        left3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left_slide3);
        left4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left_slide4);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one.startAnimation(left1);
                two.startAnimation(left2);
                three.startAnimation(left3);
                four.startAnimation(left4);
            }
        });
    }
}