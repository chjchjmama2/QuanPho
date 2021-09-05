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
public class Hoadonmonan {
    private int idhd;
    private String tenhoadonString;
    private int tongsoluong;
    private float tongsotien;
    private int ban;

    public Hoadonmonan() {
    }

    public Hoadonmonan(int idhd, String tenhoadonString, int tongsoluong, float tongsotien, int ban) {
        this.idhd = idhd;
        this.tenhoadonString = tenhoadonString;
        this.tongsoluong = tongsoluong;
        this.tongsotien = tongsotien;
        this.ban = ban;
    }

    public int getIdhd() {
        return idhd;
    }

    public String getTenhoadonString() {
        return tenhoadonString;
    }

    public int getTongsoluong() {
        return tongsoluong;
    }

    public float getTongsotien() {
        return tongsotien;
    }

    public int getBan() {
        return ban;
    }

    public void setIdhd(int idhd) {
        this.idhd = idhd;
    }

    public void setTenhoadonString(String tenhoadonString) {
        this.tenhoadonString = tenhoadonString;
    }

    public void setTongsoluong(int tongsoluong) {
        this.tongsoluong = tongsoluong;
    }

    public void setTongsotien(float tongsotien) {
        this.tongsotien = tongsotien;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }
    
}
