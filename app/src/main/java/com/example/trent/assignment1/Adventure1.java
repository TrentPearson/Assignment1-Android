package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Adventure1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure1);
    }
    public void sendBack(View view)
    {
        Intent intent = new Intent (this, Adventure.class);
        startActivity(intent);
    }
}
