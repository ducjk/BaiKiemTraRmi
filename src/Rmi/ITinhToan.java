/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmi;

/**
 *
 * @author DUC
 */

import bean.LopHocbean;
import bean.SinhVienbean;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ITinhToan extends Remote{
    
    public SinhVienbean KtDn(String SoTaiKhoan, String MatKhau) throws Exception;
    public ArrayList<SinhVienbean> timkiem(String search) throws Exception;
    public ArrayList<LopHocbean> thongke() throws Exception;
}

