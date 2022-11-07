/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.LopHocbean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

/**
 *
 * @author DUC
 */
public class KetNoi {
    public static Connection cn;
    public void KetNoi() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("xong b1");
            cn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-9J4G90P\\SQLEXPRESS:1433;databaseName=HuynhTrongDuc;user=sa; password=123456");
            System.out.println("Ok b2");
            System.out.println("Eo co b3 dau");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    public static void main(String[] args) {
//        try {
//            KetNoi kn = new KetNoi();
//            kn.KetNoi();
//            SinhViendao svdao = new SinhViendao();
//            ArrayList<LopHocbean> lh = svdao.thongke();
//            
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
