package com.example.trent.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity
{

    Button Register;
    EditText Username, Password;
    String UserHolder, PassHolder;
    Boolean EditTextEmptyHolder;
    SQLiteDatabase sqLiteDatabaseObj;
    String SQLiteDataBaseQueryHolder ;
    DATABASE sqLiteHelper;
    Cursor cursor;
    String F_Result = "Not_Found";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Register = findViewById(R.id.Reg_button);

        Password = findViewById(R.id.Password);
        Username = findViewById(R.id.Username);

        sqLiteHelper = new DATABASE(this);

        Register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                SQLiteDatabaseBuild();
                SQLiteTableBuild();
                checkEditTextStatus();
                CheckingUserExists();
                EmptyEditText();

                Intent intent = new Intent(register.this, Login.class);
                startActivity(intent);

            }
        });

    }


    public void SQLiteDatabaseBuild()
    {
        sqLiteDatabaseObj = openOrCreateDatabase(DATABASE.DATABASE_NAME, Context.MODE_PRIVATE, null);
    }

    public void SQLiteTableBuild()
    {
        sqLiteDatabaseObj.execSQL("CREATE TABLE IF NOT EXISTS " + DATABASE.TABLE_NAME + "(" + DATABASE.Table_Column_ID + " PRIMARY KEY AUTOINCREMENT NOT NULL, " + DATABASE.Table_Column_1_User + " VARCHAR, " + DATABASE.Table_Column_2_Password + " VARCHAR);");
    }

    public void InsertData()
    {
        if(EditTextEmptyHolder)
        {
            SQLiteDataBaseQueryHolder = "INSERT INTO "+DATABASE.TABLE_NAME+" (user, password) VALUES('"+UserHolder+"','"+PassHolder+"');";
            sqLiteDatabaseObj.execSQL(SQLiteDataBaseQueryHolder);
            sqLiteDatabaseObj.close();
        }

    }

    public void EmptyEditText()
    {
        Username.getText().clear();
        Password.getText().clear();
    }


    public void checkEditTextStatus()
    {
        UserHolder = Username.getText().toString() ;
        PassHolder = Password.getText().toString();

        if(TextUtils.isEmpty(UserHolder) || TextUtils.isEmpty(PassHolder))
        {
            EditTextEmptyHolder = false;
        }
        else
        {
            EditTextEmptyHolder = true;
        }
    }

    public void CheckingUserExists()
    {
        sqLiteDatabaseObj = sqLiteHelper.getWritableDatabase();
        cursor = sqLiteDatabaseObj.query(DATABASE.TABLE_NAME, null, " " + DATABASE.Table_Column_1_User + "=?", new String[]{UserHolder}, null, null, null);
        while (cursor.moveToNext()) {

            if (cursor.isFirst()) {

                cursor.moveToFirst();

                // If Email is already exists then Result variable value set as Email Found.
                F_Result = "Username Found";

                // Closing cursor.
                cursor.close();
            }
        }
        CheckFinalResult();
    }

    public void CheckFinalResult()
    {
        if(F_Result.equalsIgnoreCase("Username Found"))
        {
            Toast.makeText(register.this,"Username Already Exists",Toast.LENGTH_LONG).show();
        }
        else
        {
            InsertData();
        }
        F_Result = "Not_Found" ;
    }
}
