package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adventure3 extends AppCompatActivity {

    TextView attackPhrase3;
    Button winner3;
    Button Adventure3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure3);

        //When "showButton" is pressed:
        Button showButton = findViewById(R.id.btnAttack3);
        showButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view)
            {
                TextView attackPhrase = findViewById(R.id.attackPhrase3);
                attackPhrase.setVisibility(View.VISIBLE);

                //textview becomes visible.
                Button winner2 = findViewById(R.id.winner3);
                winner2.setVisibility(View.VISIBLE);
            }
        });
    }

    //When the function is called, sends user to "ItemDrop3" screen.
    public void sendBack4(View view)
    {
        Intent intent = new Intent (this, ItemDrop3.class);
        startActivity(intent);
    }
}
