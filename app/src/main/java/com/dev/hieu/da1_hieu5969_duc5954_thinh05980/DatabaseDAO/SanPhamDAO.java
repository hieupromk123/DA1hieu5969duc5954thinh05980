package com.dev.hieu.da1_hieu5969_duc5954_thinh05980.DatabaseDAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Constant;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Database.DataManager;
import com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamDAO implements Constant {
    private DataManager databaseHelper;


    public SanPhamDAO(DataManager databaseHelper) {
        this.databaseHelper = databaseHelper;
    }

    public long insertSanPham(SanPham sanPham) {

        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_TENSP,sanPham.TenSanPham);
        contentValues.put(COLUMN_GIA, sanPham.Gia);
        contentValues.put(COLUMN_TENLOAI, sanPham.TenLoai);
        contentValues.put(COLUMN_TENNPP, sanPham.TenNhaPhanPhoi);

        // tao cau lenh insert

        long result = sqLiteDatabase.insert(TABLE_SANPHAM, null, contentValues);

        Log.e("insertSanPham", "insert : " + result);

        sqLiteDatabase.close();

        return result;
    }
    public List<SanPham> getAllSanPham() {

        List<SanPham> sanPhams = new ArrayList<>();

        String SELECT_ALL_SAN_PHAM = "SELECT * FROM " + TABLE_SANPHAM;

        Log.e("GetAllSanPham", SELECT_ALL_SAN_PHAM);

        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        Cursor cursor = sqLiteDatabase.rawQuery(SELECT_ALL_SAN_PHAM, null);

        if(cursor.moveToFirst()) {
            do {

                String tenSP = cursor.getString(cursor.getColumnIndex(COLUMN_TENSP));
                int gia = cursor.getInt(cursor.getColumnIndex(COLUMN_GIA));
                String tenLoai = cursor.getString(cursor.getColumnIndex(COLUMN_TENLOAI));
                String tenNPP = cursor.getString(cursor.getColumnIndex(COLUMN_TENNPP));
                String maSP = cursor.getString(cursor.getColumnIndex(COLUMN_MASP));

                SanPham sanPham = new SanPham();
                sanPham.setTenNhaPhanPhoi(tenSP);
                sanPham.setTenLoai(tenLoai);
                sanPham.setGia(gia);
                sanPham.setTenNhaPhanPhoi(tenNPP);
                sanPham.setMaSanPham(maSP);

                // them user vao List< User >
                sanPhams.add(sanPham);


            } while (cursor.moveToNext());
        }

        cursor.close();
        sqLiteDatabase.close();

        return sanPhams;

    }
}
