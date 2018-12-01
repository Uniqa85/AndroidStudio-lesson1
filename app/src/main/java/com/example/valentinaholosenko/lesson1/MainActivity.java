package com.example.valentinaholosenko.lesson1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

import static android.graphics.Color.BLUE;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rnd = new Random();
        int color = Color.argb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        findViewById(android.R.id.content).setBackgroundColor(color);
    }

    @Override
    protected void onPause() {
        super.onPause();
        RelativeLayout relativeLayout = findViewById(R.id.mainLayout);
        relativeLayout.setBackgroundColor(Color.BLUE);
    }

    public void onButtonPress(View view) {
        Button button = findViewById(R.id.button);
        button.setBackgroundColor(Color.GREEN);


        int a = 0;
    }
}
