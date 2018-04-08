package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adventure5 extends AppCompatActivity {

    TextView attackPhrase;
    Button winner5;
    Button Adventure3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure5);

        Button showButton = findViewById(R.id.btnAttack5);
        showButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view)
            {
                TextView attackPhrase = findViewById(R.id.attackPhrase5);
                attackPhrase.setVisibility(View.VISIBLE);

                Button winner = findViewById(R.id.winner5);
                winner.setVisibility(View.VISIBLE);
            }
        });
    }

    public void sendBack5(View view)
    {
        Intent intent = new Intent (this, Adventure.class);
        startActivity(intent);
    }
}
