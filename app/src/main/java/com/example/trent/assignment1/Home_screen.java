package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home_screen extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void sendToAdventure(View view)
    {
        Intent intent = new Intent (this, Adventure.class);
        startActivity(intent);
    }

    public void sendToTraining(View view)
    {
        Intent intent = new Intent (this, Training.class);
        startActivity(intent);
    }
}
