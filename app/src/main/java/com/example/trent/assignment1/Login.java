package com.example.trent.assignment1;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class Login extends AppCompatActivity {
SQLiteOpenHelper db;


Button login, register;
EditText text_user, text_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

      /*  db = new dataBase(this);

        login = (Button) findViewById(R.id.login2);
        register = (Button) findViewById(R.id.Register);
        text_user = (EditText) findViewById(R.id.text_username);
        text_pass = (EditText) findViewById(R.id.text_pass);

        login.setOnClickListener(new View.onClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String s1 = text_user.getText().toString();
                String s2 = text_pass.getText().toString();

                if(s1.equals("")) || (s2.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(s2.equals())
                }
            }
        });*/

    }

    public void sendToHome(View view)
    {
        Intent intent = new Intent (this, Home_screen.class);
        startActivity(intent);
    }
}
