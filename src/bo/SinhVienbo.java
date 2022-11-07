/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.SinhVienbean;
import dao.SinhViendao;
import java.util.ArrayList;

/**
 *
 * @author DUC
 */
public class SinhVienbo {
    ArrayList<SinhVienbean> ds;
    SinhViendao svdao = new SinhViendao();
    public void getds() {
        ds = svdao.getdsSinhVien();
    }
    
    public SinhVienbean ktdn(String MaSV, String MatKhau) {
        return svdao.ktdn(MaSV, MatKhau);
    }
    
    public ArrayList<SinhVienbean> timkiem(String search){
       getds();
       ArrayList<SinhVienbean> dsTimKiem = new ArrayList<SinhVienbean>();
       for (SinhVienbean sv:ds) {
           if (sv.getMaSV().toLowerCase().trim().contains(search.toLowerCase().trim()) 
             ||sv.getHoTen().toLowerCase().trim().contains(search.toLowerCase().trim())
              ){
               dsTimKiem.add(sv);
           }
       }
       
       return dsTimKiem;
    }
}
