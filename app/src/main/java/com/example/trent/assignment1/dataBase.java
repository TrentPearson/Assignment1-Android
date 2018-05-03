package com.example.trent.assignment1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



class DATABASE extends SQLiteOpenHelper
{
    static String DATABASE_NAME = "UserDataBase";
    public static final String TABLE_NAME = "UserTable";
    public static final String Table_Column_ID = "id";
    public static final String Table_Column_1_User = "user";
    public static final String Table_Column_2_Password = "password";

    public DATABASE (Context context)
    {
        super (context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase database)
    {
        String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" ("+Table_Column_1_User+" VARCHAR, "+Table_Column_2_Password+" VARCHAR)";
        database.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1)
    {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}
