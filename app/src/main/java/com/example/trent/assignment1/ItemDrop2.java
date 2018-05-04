package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItemDrop2 extends AppCompatActivity
{

    Button levelUP2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_drop2);

        //when this button is pressed, the user is ent to the "Training".
        levelUP2 = findViewById(R.id.levelUp2);
        levelUP2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (ItemDrop2.this, Training.class);
                startActivity(intent);
            }
        });
    }
}
