/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daocontroller;

import goiClass.Hoadon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Quang Truong
 */
public class DAOhoadon {

    private static Connection conn = ConnectionMySQL.getConnection();
 
    public static ArrayList<Hoadon> getListMonans() {
        ArrayList<Hoadon> list = new ArrayList<>();
        int key = DAOlogin.key;
        String sqlString = "SELECT * FROM hoadon WHERE iduser = '"+key+"' ";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlString);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hoadon hoadon = new Hoadon();
                hoadon.setIdhd(rs.getInt("idhd"));
                hoadon.setTenhoadonString(rs.getString("tenhoadon"));
                hoadon.setTenmonString(rs.getString("tenmon"));
                hoadon.setTongsomon(rs.getInt("tongsomon"));
                hoadon.setTongtien(rs.getFloat("tongtien"));
                hoadon.setNgaythanhtoanDate(rs.getDate("ngaythanhtoan"));
                hoadon.setMaban(rs.getInt("maban"));
                list.add(hoadon);
            }
        } catch (SQLException e) {
            System.out.println("Loi lay danh sach hoa don");
        }
        return list;
    }

    public static boolean xoaHoadon(Hoadon hoadon) {
        String sql = "DELETE FROM hoadon WHERE idhd='" + hoadon.getIdhd() + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
        }
        return false;
    }

    public static boolean suaHoadon(Hoadon hoadon) {
        int key = DAOlogin.key;
        String sql = "UPDATE hoadon SET tenhoadon = '" + hoadon.getTenhoadonString()
                + "', tenmon = '" + hoadon.getTenmonString() + "', tongsomon = '"
                + hoadon.getTongsomon() + "', tongtien = '" + hoadon.getTongtien() + "', ngaythanhtoan = '"
                + hoadon.getNgaythanhtoanDate() + "', maban = '"
                + hoadon.getMaban() + "', iduser = '"+ key +"' WHERE idhd = " + hoadon.getIdhd();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Loi csdl sua hoa don");
        }
        return false;
    }
}
