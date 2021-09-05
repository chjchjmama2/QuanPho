/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daocontroller;



import java.sql.PreparedStatement;
import java.sql.Connection;
import goiClass.Nhanvien;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Quang Truong
 */
public class DAOnhanvien {
    private ArrayList<Nhanvien> list = new ArrayList<>();
    private static Connection conn = ConnectionMySQL.getConnection();
    
    public ArrayList<Nhanvien> getlistNhanviens() {
        int key = DAOlogin.key;
        try {
            String sql;
            sql = "SELECT * FROM `nhanvien` WHERE `iduser` = '"+ key +"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Nhanvien nv = new Nhanvien();
                nv.setManvInt(rs.getInt("manv"));
                nv.setHotennvString1(rs.getString("hotennv"));
                nv.setDiachiString1(rs.getString("diachi"));
                nv.setNgaysinhDate(rs.getDate("ngaysinh"));
                nv.setCmndString(rs.getString("cmnd"));
                nv.setDienthoaiString1(rs.getString("dienthoai"));
                nv.setNgaylamviecDate(rs.getDate("ngaylamviec"));
                nv.setLuongFloat(rs.getFloat("luong"));
                list.add(nv);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    public boolean addNhanvien(Nhanvien nv) {
        int key = DAOlogin.key;
        String sql = "INSERT INTO nhanvien (manv,hotennv,diachi,ngaysinh,cmnd,dienthoai,ngaylamviec,luong,iduser) VALUES (NULL,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,nv.getHotennvString1());
            ps.setString(2, nv.getDiachiString1());
            ps.setDate(3, new Date(nv.getNgaysinhDate().getTime()));
            ps.setString(4, nv.getCmndString());
            ps.setString(5, nv.getDienthoaiString1());
            ps.setDate(6, new Date(nv.getNgaysinhDate().getTime()));
            ps.setFloat(7, nv.getLuongFloat());
            ps.setInt(8, key);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("CSDL manv");
        }
        return false;
    }
    public static void xoaNhanvien(Nhanvien nv) {
        String sql = "DELETE FROM nhanvien WHERE manv='"+nv.getManvInt()+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
     public static void suaNhanvien(Nhanvien nv) {
         int key = DAOlogin.key;
         String sql = "UPDATE nhanvien SET hotennv = '"+nv.getHotennvString1()+
                 "', diachi = '"+nv.getDiachiString1()+"', ngaysinh = '"+
                 nv.getNgaysinhDate()+"', cmnd = '"+nv.getCmndString()+"', dienthoai = '"+
                 nv.getDienthoaiString1()+"', ngaylamviec = '"+
                 nv.getNgaylamviecDate()+"', luong = '"+nv.getLuongFloat()+"', iduser = '"+ key +"' WHERE manv= "+nv.getManvInt();
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.executeUpdate();
         } catch (SQLException e) {
         }
     }
    
}
