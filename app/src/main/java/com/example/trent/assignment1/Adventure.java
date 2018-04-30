package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Adventure extends AppCompatActivity
{

   Button Adventure1, Adventure2, Adventure3, Adventure4, Adventure5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);


        if(Training.Counter >= 2)
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


    public void sendBack(View view)
    {
        Intent intent = new Intent (this, Home_screen.class);
        startActivity(intent);
    }

    public void sendToAdventure1(View view)
    {
        Intent intent = new Intent (this, Adventure1.class);
        startActivity(intent);
    }

    public void sendToAdventure2(View view)
    {
        Intent intent = new Intent (this, Adventure2.class);
        startActivity(intent);
    }

    public void sendToAdventure3(View view)
    {
        Intent intent = new Intent (this, Adventure3.class);
        startActivity(intent);
    }

    public void sendToAdventure4(View view)
    {
        Intent intent = new Intent (this, Adventure4.class);
        startActivity(intent);
    }

    public void sendToAdventure5(View view)
    {
        Intent intent = new Intent (this, Adventure5.class);
        startActivity(intent);
    }
}
