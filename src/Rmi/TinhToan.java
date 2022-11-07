/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmi;

import bean.LopHocbean;
import bean.SinhVienbean;
import bo.SinhVienbo;
import dao.SinhViendao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author DUC
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan{
    public TinhToan() throws RemoteException{}
    
    SinhViendao svdao = new SinhViendao();
    SinhVienbo svbo = new SinhVienbo();
    @Override
    public SinhVienbean KtDn(String MaSV, String MatKhau) throws Exception {
        return svdao.ktdn(MaSV, MatKhau);
        
    }

    @Override
    public ArrayList<SinhVienbean> timkiem(String search) throws Exception {
        return svbo.timkiem(search);
    }

    @Override
    public ArrayList<LopHocbean> thongke() throws Exception {
        return svdao.thongke(); //To change body of generated methods, choose Tools | Templates.
    }
}
