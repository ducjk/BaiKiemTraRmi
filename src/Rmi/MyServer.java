/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmi;

import dao.KetNoi;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author DUC
 */
public class MyServer {
    public static void main(String[] args) {
        try{
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            LocateRegistry.createRegistry(1099);
            TinhToan tt= new TinhToan();
         //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
            
         //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
            Naming.bind("rmi://localhost/TinhToan",tt);
            System.out.print("Da cho may khach goi den:");
        }catch(Exception tt){ 
            tt.printStackTrace();    
        }
  }
}
