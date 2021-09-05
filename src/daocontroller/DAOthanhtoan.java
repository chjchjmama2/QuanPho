/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daocontroller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author Quang Truong
 */
public class DAOthanhtoan {

    private static Connection conn = ConnectionMySQL.getConnection();

    public static boolean taohoadon(String tenhoadon, String tencacmon, int tongsomon, float giatien,int ban) {
        LocalDate millDate = LocalDate.now();
        Date date = Date.valueOf(millDate);
        int key = DAOlogin.key;
        String sql = "INSERT INTO hoadon (idhd,tenhoadon,tenmon,tongsomon,tongtien,ngaythanhtoan,maban,iduser)"
                + " VALUES (NULL,'" + tenhoadon + "','" + tencacmon + "','" + tongsomon + "','" + giatien + "','"
                + date + "','"+ban+"','"+key+"')";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Loi cau truy van phan tao hoa don");
        }
        return false;
    }

    public static boolean taohoadonMonan(String tenhoadon, int tongsoluong, float tongsotien,int ban) {
        LocalDate millDate = LocalDate.now();
        Date date = Date.valueOf(millDate);
        String sql = "INSERT INTO hoadon (idhd,tenhoadon,tongsoluong,tongsotien,ngaythang,ban)"
                + " VALUES (NULL,'" + tenhoadon + "','" + tongsoluong + "','" + tongsotien + "','"
                + date + "','"+ ban +"')";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Loi cau truy van phan tao hoa don");
        }
        return false;
    }
    
    
}
