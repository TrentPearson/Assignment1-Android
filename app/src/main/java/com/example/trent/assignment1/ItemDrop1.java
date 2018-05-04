package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemDrop1 extends AppCompatActivity
{

    Button levelUp1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_drop1);

        //when this button is pressed, the user is ent to the "Training".
        levelUp1 = findViewById(R.id.levelUp1);
        levelUp1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (ItemDrop1.this, Training.class);
                startActivity(intent);
            }
        });
    }
}
