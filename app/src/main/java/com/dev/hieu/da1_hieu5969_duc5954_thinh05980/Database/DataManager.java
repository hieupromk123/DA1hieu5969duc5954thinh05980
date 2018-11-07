package com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Constant;

public class DataManager extends SQLiteOpenHelper implements Constant {

    public DataManager(Context context) {
        super(context, "PCManganer", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USER);
        db.execSQL(CREATE_SANPHAM);
        db.execSQL(CREATE_TABLE_BILL);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SANPHAM);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BILL);
        onCreate(db);

    }
}
