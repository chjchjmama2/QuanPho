/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goiClass;

/**
 *
 * @author Quang Truong
 */
public class Monan {
    private String TenmonString;
    private String LoaitoString;
    private float GiaFloat;
    private int Soluongint;
    
    public void setTenmonString(String TenmonString) {
        this.TenmonString = TenmonString;
    }

    public void setGiaFloat(float GiaFloat) {
        this.GiaFloat = GiaFloat;
    }

    public void setSoluongint(int Soluongint) {
        this.Soluongint = Soluongint;
    }

    public String getTenmonString() {
        return TenmonString;
    }

    public float getGiaFloat() {
        return GiaFloat;
    }

    /**
     *
     * @return
     */
    public int getSoluongint() {
        return Soluongint;
    }

    public String getLoaitoString() {
        return LoaitoString;
    }

    public void setLoaitoString(String LoaitoString) {
        this.LoaitoString = LoaitoString;
    }
    public String getThitStrings() {
        return null;
    }

    public void setThitStrings(String thitStrings) {
    }
}
