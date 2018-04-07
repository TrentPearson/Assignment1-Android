package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Adventure1 extends AppCompatActivity
{
    TextView hiddenView;
    TextView attackPhrase;
    Button showButton;

    public void sendBack(View view)
    {
        Intent intent = new Intent (this, Adventure.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure1);

        showButton = findViewById(R.id.btnAttack1);
        showButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                hiddenView = findViewById(R.id.attackPhrase);
                attackPhrase.setVisibility(View.VISIBLE);
            }
        });
    }


}
