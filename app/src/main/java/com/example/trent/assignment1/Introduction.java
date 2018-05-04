package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Introduction extends AppCompatActivity
{

    Button skip1, skip2, skip3;
    TextView mainCharIntro1, mainCharIntro2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        //pressing button causes textview and button to become invisible
        skip1 = findViewById(R.id.skip1);
        skip1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mainCharIntro1 = findViewById(R.id.mainCharIntro1);
                mainCharIntro1.setVisibility(View.INVISIBLE);

                skip1.setVisibility(View.INVISIBLE);
            }
        });

        //pressing button causes textview and button to become invisible
        skip2 = findViewById(R.id.skip2);
        skip2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mainCharIntro2 = findViewById(R.id.mainCharIntro2);
                mainCharIntro2.setVisibility(View.INVISIBLE);

                skip2.setVisibility(View.INVISIBLE);
            }
        });

        //pressing button send user to "home" screen.
        skip3 = findViewById(R.id.skip3);
        skip3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent (Introduction.this, Home_screen.class);
                startActivity(intent);
            }
        });
    }
}
