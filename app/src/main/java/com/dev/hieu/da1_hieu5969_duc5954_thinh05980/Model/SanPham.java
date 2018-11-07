package com.dev.hieu.da1_hieu5969_duc5954_thinh05980.Model;

public class SanPham {
    public String TenSanPham;
    public String TenNhaPhanPhoi;
    public int Gia;
    public String TenLoai;
    public String MaSanPham;

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        MaSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public String getTenNhaPhanPhoi() {
        return TenNhaPhanPhoi;
    }

    public void setTenNhaPhanPhoi(String tenNhaPhanPhoi) {
        TenNhaPhanPhoi = tenNhaPhanPhoi;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String tenLoai) {
        TenLoai = tenLoai;
    }

    public SanPham(String tenSanPham, String tenNhaPhanPhoi, int gia, String tenLoai) {

        TenSanPham = tenSanPham;
        TenNhaPhanPhoi = tenNhaPhanPhoi;
        Gia = gia;
        TenLoai = tenLoai;
        TenSanPham = tenSanPham;
    }
    public SanPham(){}
}
