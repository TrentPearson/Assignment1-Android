package com.example.trent.assignment1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class Training extends AppCompatActivity {

Button btn;
TextView level;
private int Counter = 0;
int CurrentNumber = 0;
int MaxClicks = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        btn = (Button) findViewById(R.id.levelup);
        level = (TextView) findViewById(R.id.level);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
            if(Counter > 4)
            {
                btn.setEnabled(false);
            }
            else
            {
                Counter++;
                level.setText(Integer.toString(Counter));
            }
            }
        });
    }


    public void sendBack(View view)
    {
        Intent intent = new Intent (this, Home_screen.class);
        startActivity(intent);
    }
}
