/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmi;

import Frm.FrmDuc1;
import Frm.FrmHienThi;

/**
 *
 * @author DUC
 */
public class MyClient {
    public static void main(String[] args) {
    try{
        new FrmHienThi().setVisible(true);
    }catch(Exception tt) {
        tt.printStackTrace();
    }
}
}
