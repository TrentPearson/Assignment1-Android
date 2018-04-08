package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Adventure1 extends AppCompatActivity
{
    TextView attackPhrase;
    Button winner1;
    Button Adventure2;


    public void sendBack2(View view)
    {
        Intent intent = new Intent (this, Adventure.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure1);

        Button showButton = findViewById(R.id.btnAttack1);
        showButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view)
            {
                TextView attackPhrase = findViewById(R.id.attackPhrase);
                attackPhrase.setVisibility(View.VISIBLE);

                Button winner1 = findViewById(R.id.winner1);
                winner1.setVisibility(View.VISIBLE);
            }
        });
    }

}
