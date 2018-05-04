package com.example.trent.assignment1;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FinalAdventure extends AppCompatActivity
{

    TextView t1, t2, t3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_adventure);

        t1 = findViewById(R.id.motherMessage1);
        t2 = findViewById(R.id.motherMessage2);
        t3 = findViewById(R.id.motherMessage3);




    }
}
