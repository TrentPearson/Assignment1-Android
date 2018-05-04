package com.example.trent.assignment1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.text.TextUtils;



public class Login extends AppCompatActivity
{

//All variables.
Button login, register;
EditText text_user, text_pass;
String UserHolder, PassHolder;
Boolean EditTextEmptyHolder;
SQLiteDatabase sqLiteDatabaseObj;
DATABASE sqLiteHelper;
Cursor cursor;
String TempPassword = "NOT_FOUND";
public static final String User = "";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Find the variables via their id names.
        login = findViewById(R.id.login2);
        register = findViewById(R.id.Register);

        text_user = findViewById(R.id.text_username);
        text_pass = findViewById(R.id.text_pass);

        sqLiteHelper = new DATABASE(this);

        //when "login" button is pressed, these functions are activated.
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                checkEditTextStatus();
                loginFunction();
            }
        });

        //When "register" button is pressed, user is sent to "register" screen.
        register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                Intent intent = new Intent(Login.this, register.class);
                startActivity(intent);
            }
        });
    }

    public void loginFunction()
    {
        if(EditTextEmptyHolder)
        {
            sqLiteDatabaseObj = sqLiteHelper.getWritableDatabase();


            cursor = sqLiteDatabaseObj.query(DATABASE.TABLE_NAME, null, " " + DATABASE.Table_Column_1_User + "=?", new String[]{UserHolder}, null, null, null);

            while (cursor.moveToNext())
            {
                if (cursor.isFirst())
                {
                    cursor.moveToFirst();
                    TempPassword = cursor.getString(cursor.getColumnIndex(DATABASE.Table_Column_2_Password));
                    cursor.close();
                }
            }
            CheckFinalResult();
        }
        else
        {
            Toast.makeText(Login.this,"Please Enter UserName or Password.",Toast.LENGTH_LONG).show();
        }
    }


    public void checkEditTextStatus()
    {
        UserHolder = text_user.getText().toString();
        PassHolder = text_pass.getText().toString();

        if (TextUtils.isEmpty(UserHolder) || TextUtils.isEmpty(PassHolder)) {
            EditTextEmptyHolder = false;
        } else {
            EditTextEmptyHolder = true;
        }
    }
    public void CheckFinalResult()
    {
        if(TempPassword.equalsIgnoreCase(PassHolder))
        {
            Intent intent = new Intent(Login.this, Introduction.class);
            startActivity(intent);
        }
    }




    public void sendToHome(View view)
    {
        Intent intent = new Intent (this, Introduction.class);
        startActivity(intent);
    }
}
