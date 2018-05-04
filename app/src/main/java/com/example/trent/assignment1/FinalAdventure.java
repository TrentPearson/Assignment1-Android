package com.example.trent.assignment1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FinalAdventure extends AppCompatActivity
{

    TextView t1, t2, t3;
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_adventure);

        t1 = findViewById(R.id.motherMessage1);
        t2 = findViewById(R.id.motherMessage2);
        t3 = findViewById(R.id.motherMessage3);

    //When button is pressed;
        btn1 = findViewById(R.id.next);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //textview becomes visible.
                t2.setVisibility(View.VISIBLE);
                //button becomes invisible
                btn1.setVisibility(View.INVISIBLE);
            }
        });

        btn2 = findViewById(R.id.next1);
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //textview becomes visible.
                t3.setVisibility(View.VISIBLE);
                //button becomes invisible.
                btn2.setVisibility(View.INVISIBLE);
                //button becomes visible.
                btn3.setVisibility(View.VISIBLE);
            }
        });
    //when button is pressed, send user to "endGame" screen.
        btn3 = findViewById(R.id.next2);
        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (FinalAdventure.this, endGame.class);
                startActivity(intent);
            }
        });
    }
}
