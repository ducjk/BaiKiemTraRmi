/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author DUC
 */
public class SinhVienbean  implements Serializable {
    String MaSV;
    String HoTen;
    String DiaChi;
    boolean GioiTinh;
    String MatKhau;
    String MaLop;

    public SinhVienbean() {
    }

    public SinhVienbean(String MaSV, String HoTen, String DiaChi, boolean GioiTinh, String MatKhau, String MaLop) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.MatKhau = MatKhau;
        this.MaLop = MaLop;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }
    
}
