package com.example.trent.assignment1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.util.logging.Level;

public class Training extends AppCompatActivity {


Button lvlIncrease;
Button lvlDecrease;
TextView level;
int LEVEL = 0;
int Counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        lvlIncrease = findViewById(R.id.levelup);
        level = findViewById(R.id.level);

       //Load counter
        SharedPreferences lvl = this.getSharedPreferences("myLvl", Context.MODE_PRIVATE);
        Counter = lvl.getInt("Counter", 0);

        level.setText(Integer.toString(Counter));

        lvlIncrease.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
            if(Counter > 4)
            {
                lvlIncrease.setEnabled(false);
            }
            else
            {
                Counter += 1;

                SharedPreferences Lvl = getSharedPreferences("myLvl", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = Lvl.edit();
                editor.putInt("Counter", Counter);
                editor.commit();

                level.setText(Integer.toString(Counter));


            }
            }
        });

        lvlDecrease = findViewById(R.id.levelDown);

        lvlDecrease.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                    Counter -= 1;
                    enable();

                    SharedPreferences Lvl = getSharedPreferences("myLvl", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = Lvl.edit();
                    editor.putInt("Counter", Counter);
                    editor.commit();

                    level.setText(Integer.toString(Counter));

            }
        });
    }

    public void enable()
    {
        lvlDecrease.setEnabled(true);

        if(Counter == 0)
        {
            lvlDecrease.setEnabled(false);
        }
        else
        {
            lvlDecrease.setEnabled(true);
        }
    }


    public void sendBack(View view)
    {
        Intent intent = new Intent (this, Home_screen.class);
        startActivity(intent);
    }

    public void Adventure2Visible()
    {
        if (Counter >= 2)
        {
            Button adventure2 = findViewById(R.id.Adventure2);
            adventure2.setVisibility(View.VISIBLE);
        }
        else
        {
            Button adventure2 = findViewById(R.id.Adventure2);
            adventure2.setVisibility(View.INVISIBLE);
        }
    }
}



