package com.dev.hieu.da1_hieu5969_duc5954_thinh05980.DatabaseDAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Constant;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Database.DataManager;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Model.User;

import java.util.ArrayList;
import java.util.List;

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
    public User getUserByUsername(String username){
        User user = null;
        SQLiteDatabase sqLiteDatabase = dataManager.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.query(TABLE_USER,
                new String[]{COLUMN_USERNAME, COLUMN_PASSWORD, COLUMN_PHONE, COLUMN_NAME,COLUMN_ADDRESS,COLUMN_GMAIL},
                COLUMN_USERNAME + "=?",new String[]{username},null,null,null);
        if (cursor != null && cursor.moveToFirst()) {

            String user_name = cursor.getString(cursor.getColumnIndex(COLUMN_USERNAME));
            String password = cursor.getString(cursor.getColumnIndex(COLUMN_PASSWORD));
            String phone = cursor.getString(cursor.getColumnIndex(COLUMN_PHONE));
            String address = cursor.getString(cursor.getColumnIndex(COLUMN_ADDRESS));
            String gmail = cursor.getString(cursor.getColumnIndex(COLUMN_GMAIL));
            String name = cursor.getString(cursor.getColumnIndex(COLUMN_NAME));

            user = new User();
            user.setUsername(user_name);
            user.setPassword(password);
            user.setFullName(name);
            user.setPhone(phone);
            user.setAddress(address);
            user.setGmail(gmail);
            cursor.close();
        }
        return user;
    }
    public List<User> getAllUsers() {


        List<User> userList = new ArrayList<>();

        String SELECT_ALL_USER = "SELECT * FROM " + TABLE_USER;

        Log.e("getAllUsers", SELECT_ALL_USER);

        SQLiteDatabase sqLiteDatabase = dataManager.getWritableDatabase();

        Cursor cursor = sqLiteDatabase.rawQuery(SELECT_ALL_USER, null);

        cursor.moveToFirst();

        do {

            String user_name = cursor.getString(cursor.getColumnIndex(COLUMN_USERNAME));
            String password = cursor.getString(cursor.getColumnIndex(COLUMN_PASSWORD));
            String phone = cursor.getString(cursor.getColumnIndex(COLUMN_PHONE));
            String address = cursor.getString(cursor.getColumnIndex(COLUMN_ADDRESS));
            String gmail = cursor.getString(cursor.getColumnIndex(COLUMN_GMAIL));
            String name = cursor.getString(cursor.getColumnIndex(COLUMN_NAME));

            User user = new User();
            user.setUsername(user_name);
            user.setPassword(password);
            user.setFullName(name);
            user.setPhone(phone);
            user.setAddress(address);
            user.setGmail(gmail);

            // them user vao List< User >
            userList.add(user);


        } while (cursor.moveToNext());

        cursor.close();
        sqLiteDatabase.close();

        return userList;
    }

}
