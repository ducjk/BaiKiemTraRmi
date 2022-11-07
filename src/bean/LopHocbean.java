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
public class LopHocbean implements Serializable {
    String MaLop, TenLop;

    public LopHocbean() {
    }

    public LopHocbean(String MaLop, String TenLop) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }
    
}
