package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button askbutton;
        askbutton = (Button) findViewById(R.id.askbutton);

        final ImageView imageof = (ImageView) findViewById(R.id.imageof);

        final int[] magicarray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};


        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomnumbergenerator = new Random();
                int number = randomnumbergenerator.nextInt(5);

                imageof.setImageResource(magicarray[number]);




            }
        });



            }
        }


