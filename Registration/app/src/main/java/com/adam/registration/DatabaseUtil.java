package com.adam.registration;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseUtil extends SQLiteOpenHelper {
    private static final String dbName = "androidstudentapp.db";

    public DatabaseUtil(Context context) {
        super(context, dbName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE student (id INT PRIMARY KEY, name VARCHAR(20), " +
                "age INT, branch VARCHAR(10), dept VARCHAR(10))";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS student");
        onCreate(db);
    }

    public String registerStudent(String ID, String name, String age, String branch, String dept) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("id", ID);
        contentValues.put("name", name);
        contentValues.put("age", age);
        contentValues.put("branch", branch);
        contentValues.put("dept", dept);

        long result = db.insert("student", null, contentValues);

        if (result == -1) {
            return "Failed";
        } else {
            return "Student Registered Successfully";
        }
    }


}
