package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adventure4 extends AppCompatActivity {

    TextView attackPhrase;
    Button winner4;
    Button Adventure3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure4);

        //When "showButton" is pressed:
        Button showButton = findViewById(R.id.btnAttack4);
        showButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view)
            {
                TextView attackPhrase = findViewById(R.id.attackPhrase5);
                attackPhrase.setVisibility(View.VISIBLE);

                //textview becomes visible.
                Button winner = findViewById(R.id.winner4);
                winner.setVisibility(View.VISIBLE);
            }
        });
    }

    //When the function is called, sends user to "ItemDrop4" screen.
    public void sendBack4(View view)
    {
        Intent intent = new Intent (this, ItemDrop4.class);
        startActivity(intent);
    }
}
