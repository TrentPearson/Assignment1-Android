package com.example.trent.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //sends user to "Login" screen.
    public void sendToLogin(View view)
    {
        Intent intent = new Intent (this, Login.class);
        startActivity(intent);
    }

    //quites the application.
    public void sendToQuit(View view)
    {
        finish();
    }
}
