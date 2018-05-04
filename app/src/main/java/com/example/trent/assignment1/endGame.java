package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class endGame extends AppCompatActivity
{
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);

        //when this button is pressed, the user is ent to the "Home" screen.
        btn4 = findViewById(R.id.EndGame);
        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (endGame.this, Home_screen.class);
                startActivity(intent);
            }
        });
    }
}
