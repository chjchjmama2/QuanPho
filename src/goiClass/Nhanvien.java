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
public class Nhanvien {
    private int manvInt;
    private String hotennvString1,diachiString1;
    private Date ngaysinhDate;
    private String cmndString,dienthoaiString1;
    private Date ngaylamviecDate;
    private Float luongFloat;

    public Nhanvien(int manvInt, String hotennvString1, String diachiString1, Date ngaysinhDate, String cmndString, String dienthoaiString1, Date ngaylamviecDate, Float luongFloat) {
        this.manvInt = manvInt;
        this.hotennvString1 = hotennvString1;
        this.diachiString1 = diachiString1;
        this.ngaysinhDate = ngaysinhDate;
        this.cmndString = cmndString;
        this.dienthoaiString1 = dienthoaiString1;
        this.ngaylamviecDate = ngaylamviecDate;
        this.luongFloat = luongFloat;
    }

    public Nhanvien() {
    }

    public int getManvInt() {
        return manvInt;
    }

    public String getHotennvString1() {
        return hotennvString1;
    }

    public String getDiachiString1() {
        return diachiString1;
    }

    public Date getNgaysinhDate() {
        return ngaysinhDate;
    }

    public String getCmndString() {
        return cmndString;
    }

    public String getDienthoaiString1() {
        return dienthoaiString1;
    }

    public Date getNgaylamviecDate() {
        return ngaylamviecDate;
    }

    public Float getLuongFloat() {
        return luongFloat;
    }

    public void setManvInt(int manvInt) {
        this.manvInt = manvInt;
    }

    public void setHotennvString1(String hotennvString1) {
        this.hotennvString1 = hotennvString1;
    }

    public void setDiachiString1(String diachiString1) {
        this.diachiString1 = diachiString1;
    }

    public void setNgaysinhDate(Date ngaysinhDate) {
        this.ngaysinhDate = ngaysinhDate;
    }

    public void setCmndString(String cmndString) {
        this.cmndString = cmndString;
    }

    public void setDienthoaiString1(String dienthoaiString1) {
        this.dienthoaiString1 = dienthoaiString1;
    }

    public void setNgaylamviecDate(Date ngaylamviecDate) {
        this.ngaylamviecDate = ngaylamviecDate;
    }

    public void setLuongFloat(Float luongFloat) {
        this.luongFloat = luongFloat;
    }
}
