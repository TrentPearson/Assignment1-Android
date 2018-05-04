package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adventure2 extends AppCompatActivity {

    TextView attackPhrase2;
    Button winner2;
    Button Adventure2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure2);

        //When "showButton" is pressed:
        Button showButton = findViewById(R.id.btnAttack1);
        showButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view)
            {
                TextView attackPhrase = findViewById(R.id.attackPhrase2);
                attackPhrase.setVisibility(View.VISIBLE);

                //textview becomes visible.
                Button winner2 = findViewById(R.id.winner2);
                winner2.setVisibility(View.VISIBLE);
            }
        });
    }

    //When the function is called, sends user to "ItemDrop2" screen.
    public void sendBack3(View view)
    {
        Intent intent = new Intent (this, ItemDrop2.class);
        startActivity(intent);
    }
}
