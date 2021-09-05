/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goiClass;

import java.util.Date;

/**
 *
 * @author Quang Truong
 */
public class Hoadon {
    private int idhd;
    private String tenhoadonString;
    private String tenmonString;
    private int tongsomon;
    private float tongtien;
    private Date ngaythanhtoanDate;
    private int maban;

    public Hoadon() {
    }

    public int getIdhd() {
        return idhd;
    }

    public String getTenhoadonString() {
        return tenhoadonString;
    }

    public String getTenmonString() {
        return tenmonString;
    }

    public int getTongsomon() {
        return tongsomon;
    }

    public float getTongtien() {
        return tongtien;
    }

    public Date getNgaythanhtoanDate() {
        return ngaythanhtoanDate;
    }

    public int getMaban() {
        return maban;
    }

    public void setIdhd(int idhd) {
        this.idhd = idhd;
    }

    public void setTenhoadonString(String tenhoadonString) {
        this.tenhoadonString = tenhoadonString;
    }

    public void setTenmonString(String tenmonString) {
        this.tenmonString = tenmonString;
    }

    public void setTongsomon(int tongsomon) {
        this.tongsomon = tongsomon;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public void setNgaythanhtoanDate(Date ngaythanhtoanDate) {
        this.ngaythanhtoanDate = ngaythanhtoanDate;
    }

    public void setMaban(int maban) {
        this.maban = maban;
    }
    
}
