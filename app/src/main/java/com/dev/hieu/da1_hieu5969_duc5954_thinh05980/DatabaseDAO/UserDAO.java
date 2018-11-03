package com.dev.hieu.da1_hieu5969_duc5954_thinh05980.DatabaseDAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Constant;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Database.DataManager;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Model.User;

public class UserDAO implements Constant {

    private DataManager dataManager;

    public UserDAO(DataManager dataManager) {
        this.dataManager = dataManager;
    }
    public void insertUser(User user) {

        SQLiteDatabase sqLiteDatabase = dataManager.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_USERNAME, user.getUsername());
        contentValues.put(COLUMN_PASSWORD, user.getPassword());
        contentValues.put(COLUMN_PHONE, user.getPhone());
        contentValues.put(COLUMN_NAME, user.getFullName());
        contentValues.put(COLUMN_GMAIL, user.getGmail());
        contentValues.put(COLUMN_ADDRESS, user.getAddress());

        // tao cau lenh insert

        long id = sqLiteDatabase.insert(TABLE_USER, null, contentValues);

        Log.e("insertUser", "insertUser : " + id);

        sqLiteDatabase.close();

    }
   
}
