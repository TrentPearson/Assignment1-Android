package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItemDrop4 extends AppCompatActivity
{

    Button levelUP4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_drop4);

        //when this button is pressed, the user is ent to the "Training".
        levelUP4 = findViewById(R.id.levelUp4);
        levelUP4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (ItemDrop4.this, Training.class);
                startActivity(intent);
            }
        });
    }
}
