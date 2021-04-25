package com.example.databasesqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "biodata.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, factory null, DATABASE_VERSION);
    }

    @Override
    protected void onCreate(SQLiteDatabase db) {
        String sql = "Create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat null)";
        Log.d(tag:"Data', msg:" onCreate:
        "+sql");
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2)
}