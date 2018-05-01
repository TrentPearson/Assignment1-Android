package com.example.trent.assignment1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Button;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class dataBase extends SQLiteOpenHelper
{

    private static final String DATABASE_NAME = "DB";
    private static final int DATABASE_VERSION = 1;
    private final Context context;
    SQLiteDatabase db;

    private static final String DATABASE_PATH = "/data/data/com.example.trent.assignment1/databases/";

    public dataBase(Context context )
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        createDb();
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("Create table user(username text, password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1)
    {

    }

    public void createDb()
    {
        boolean dbExists = checkDbExists();

        if(dbExists)
        {
            this.getReadableDatabase();
            copyDatabase();
        }
    }

    private boolean checkDbExists()
    {
        SQLiteDatabase sqLiteDatabase = null;

        String path = DATABASE_PATH + DATABASE_NAME;
        sqLiteDatabase = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);

        if(sqLiteDatabase != null)
        {
            sqLiteDatabase.close();
            return true;
        }
        return  false;
    }

    private void copyDatabase()
    {
        try
        {
            InputStream inputStream = context.getAssets().open(DATABASE_NAME);

            String outFileName =DATABASE_PATH + DATABASE_NAME;

            OutputStream outputStream = new FileOutputStream(outFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
