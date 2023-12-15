package com.example.projectdevmob;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBName = "register.db";

    // Simplified constructor
    public DBHelper(@Nullable Context context) {
        super(context, DBName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqliteDatabase) {
        // Create the 'users' table
        sqliteDatabase.execSQL("CREATE TABLE users (username TEXT PRIMARY KEY, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqliteDatabase, int oldVersion, int newVersion) {
        // Drop the 'users' table if it exists during an upgrade
        sqliteDatabase.execSQL("DROP TABLE IF EXISTS users");
        // Recreate the table after dropping
        onCreate(sqliteDatabase);
    }

    public boolean insertData(String username, String password) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("password", password);

        // Insert data into the 'users' table
        long result = myDB.insert("users", null, contentValues);

        if (result == -1) {
            return false; // Insert failed
        } else {
            return true; // Insert successful
        }
    }


    public boolean checkLogin(String username, String password) {
        SQLiteDatabase myDB = this.getReadableDatabase();
        Cursor cursor = myDB.rawQuery("SELECT * FROM users WHERE username = ? AND password = ?", new String[]{username, password});

        boolean loginSuccess = cursor.getCount() > 0;

        cursor.close();
        return loginSuccess;
    }




}



