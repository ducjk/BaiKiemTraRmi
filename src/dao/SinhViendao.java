/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.SinhVienbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DUC
 */
public class SinhViendao {
    public ArrayList<SinhVienbean> getdsSinhVien(){
        try {
            ArrayList<SinhVienbean> dsSV= new ArrayList<SinhVienbean>();
            String sql = "select * from SinhVien";
	    PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
	    ResultSet rs = cmd.executeQuery();
            while(rs.next()) {
                String MaSV = rs.getString("MaSV");
                String HoTen = rs.getString("HoTen");
                String DiaChi = rs.getString("DiaChi");
                boolean GT = rs.getBoolean("GioiTinh");
                String MatKhau =rs.getString("MatKhau");
                String MaLop = rs.getString("MaLop");
                dsSV.add(new SinhVienbean(MaSV, HoTen, DiaChi, GT, MatKhau, MaLop));
            }
            
            rs.close();
			   
            return dsSV;
	} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
	}
    }
    
    public SinhVienbean ktdn(String Masinhvien, String matkhau){
        try {
//			   b2: Lay du lieu ve
            String sql = "select * from SinhVien where MaSV = ? and MatKhau = ?";
	    PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
	    cmd.setString(1, Masinhvien);
            cmd.setString(2, matkhau);
            ResultSet rs = cmd.executeQuery();
            SinhVienbean sv = new SinhVienbean();
            if(rs.next()) {
                String MaSV = rs.getString("MaSV");
                String HoTen = rs.getString("HoTen");
                String DiaChi = rs.getString("DiaChi");
                boolean GT = rs.getBoolean("GioiTinh");
                String MatKhau =rs.getString("MatKhau");
                String MaLop = rs.getString("MaLop");
                sv = new SinhVienbean(MaSV, HoTen, DiaChi, GT, MatKhau, MaLop);
            }
            
            rs.close();
			   
            return sv;
	} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
	}
    }
}
