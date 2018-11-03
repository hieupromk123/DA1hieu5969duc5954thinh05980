package com.dev.hieu.da1_hieu5969_duc5954_thinh05980;

public interface Constant {
    /*Bang User*/
    // Ten Bang
    String TABLE_USER = "User";

    // Ten Cot
    String COLUMN_USERNAME = "Username";
    String COLUMN_PASSWORD = "Password";
    String COLUMN_PHONE = "Phone";
    String COLUMN_NAME = "FullName";
    String COLUMN_GMAIL = "Gmail";
    String COLUMN_ADDRESS = "Address";

    // Cau lenh tao bang
    String CREATE_TABLE_USER = "CREATE TABLE " + TABLE_USER + "(" +

            COLUMN_USERNAME + " NVARCHAR(50) PRIMARY KEY," +

            COLUMN_PASSWORD + " NVARCHAR(30)," +

            COLUMN_PHONE + " NVARCHAR," +

            COLUMN_NAME + " NVARCHAR," +
            COLUMN_GMAIL + " NVARCHAR," +
            COLUMN_ADDRESS + " NVARCHAR" +

            ")";

    String TABLE_BILL = "Bill";

    // Ten Cot
    String COLUMN_SOLUONG = "SoLuong";
    String COLUMN_MAHOADON = "MaHoaDon";
    String COLUMN_MASP = "MaSanPham";

    String CREATE_TABLE_BILL = "CREATE TABLE " + TABLE_BILL + "(" +

            COLUMN_SOLUONG + " NVARCHAR(50) PRIMARY KEY," +

            COLUMN_MAHOADON + " NVARCHAR(30)," +

            COLUMN_MASP + " NVARCHAR FOREIGN KEY" +


            ")";



    String TABLE_SANPHAM ="SanPham";

    String COLUMN_TENSP = "TenSP";
    String COLUMN_GIA = "Gia";
    String COLUMN_TENLOAI = "TenLoai";
    String COLUMN_TENNPP = "TenNPP";

    String CREATE_SANPHAM = "CREATE TABLE " + TABLE_SANPHAM + "(" +



            COLUMN_TENSP + " NVARCHAR," +

            COLUMN_GIA + " NVARCHAR," +
            COLUMN_TENLOAI + " NVARCHAR," +
            COLUMN_TENNPP + " NVARCHAR" +

            ")";



}

