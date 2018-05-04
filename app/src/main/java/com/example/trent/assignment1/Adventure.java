package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Adventure extends AppCompatActivity
{

    //Variables being declared.
   Button Adventure1, Adventure2, Adventure3, Adventure4, Adventure5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);

        //an if statement that checks the counter to see if it is equal to, or greater than the value of 2.
        if(Training.Counter >= 2)
        {
            //if the value is greate than 2, the button becomes visible.
            Button adventure2 = findViewById(R.id.Adventure2);
            adventure2.setVisibility(View.VISIBLE);
        }
        else
        {
            //Otherwise, it is invisible.
            Button adventure2 = findViewById(R.id.Adventure2);
            adventure2.setVisibility(View.INVISIBLE);
        }

        //an if statement that checks the counter to see if it is equal to, or greater than the value of 3.
        if(Training.Counter >= 3)
        {
            //if the value is greate than 3, the button becomes visible.
            Button adventure3 = findViewById(R.id.Adventure3);
            adventure3.setVisibility(View.VISIBLE);
        }
        else
        {
            //Otherwise, it is invisible.
            Button adventure3 = findViewById(R.id.Adventure3);
            adventure3.setVisibility(View.INVISIBLE);
        }

        //an if statement that checks the counter to see if it is equal to, or greater than the value of 4.
        if(Training.Counter >= 4)
        {
            //if the value is greate than 4, the button becomes visible.
            Button adventure4 = findViewById(R.id.Adventure4);
            adventure4.setVisibility(View.VISIBLE);
        }
        else
        {
            //Otherwise, it is invisible.
            Button adventure4 = findViewById(R.id.Adventure4);
            adventure4.setVisibility(View.INVISIBLE);
        }

        //an if statement that checks the counter to see if it is equal to, or greater than the value of 4.
        if(Training.Counter >= 5)
        {
            //if the value is greate than 5, the button becomes visible.
            Button adventure5 = findViewById(R.id.Adventure5);
            adventure5.setVisibility(View.VISIBLE);
        }
        else
        {
            //Otherwise, it is invisible.
            Button adventure5 = findViewById(R.id.Adventure5);
            adventure5.setVisibility(View.INVISIBLE);
        }

    }

//Bellow are the destinations that the above buttons take the user once they become visible.
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
