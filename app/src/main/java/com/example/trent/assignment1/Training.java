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
Button adventure2;
TextView level;
static int Counter = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        lvlIncrease = findViewById(R.id.levelup);
        level = findViewById(R.id.level);

       //Load counter value.
        SharedPreferences lvl = this.getSharedPreferences("myLvl", Context.MODE_PRIVATE);
        Counter = lvl.getInt("Counter", 0);

        //shows counter value.
        level.setText(Integer.toString(Counter));



        //checks counter value to see if is greater than 4, if it is, the "lvlIncrease" button will become unusable.
        lvlIncrease.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
            if(Counter > 4)
            {
                lvlIncrease.setEnabled(false);
            }
            //is it is not greater than 4, then the button will add +1 to the counter, save it, then show the new counter value.
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

        //decreases the counter by -1, and also checks the "enable" function too. new value is then saved, and shown to user.
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

    //the button starts off as 'true', though if the value of "counter" becomes 0, then the button will become unusable.
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


    //sends the user to "Home" screen.
    public void sendBack(View view)
    {
        Intent intent = new Intent (this, Home_screen.class);
        startActivity(intent);
    }
}



