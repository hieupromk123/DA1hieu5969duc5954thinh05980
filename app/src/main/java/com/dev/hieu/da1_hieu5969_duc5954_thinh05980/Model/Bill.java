package com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Model;

public class Bill {
    private int SoLuong;
    private String MaSanPham;
    private String MaHoaDon;

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        MaSanPham = maSanPham;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        MaHoaDon = maHoaDon;
    }

    public Bill(int soLuong, String maSanPham, String maHoaDon) {

        SoLuong = soLuong;
        MaSanPham = maSanPham;
        MaHoaDon = maHoaDon;
    }
}
