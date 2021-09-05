/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daocontroller;
import java.sql.Connection;
import goiClass.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Quang Truong
 */
public class DAOlogin {
    private static Connection conn = ConnectionMySQL.getConnection();
    public static int key;
    public static boolean dangnhap(User user){
        String sql = "SELECT * FROM user WHERE username=? AND userpassword=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUserString());
            ps.setString(2, user.getPassString());
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                key = rs.getInt("iduser");
                return true;
            }
            
        } catch (SQLException e) {
            System.out.println("Loi phan csdl dang nhap");
        }
        return false;
    }
    public static boolean dangky(User user) {
        String sql = "INSERT INTO user (iduser,hoten,username,userpassword,sodienthoai) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            // Nếu muốn lấy ID sau lúc chèn thì dùng : PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            // Rồi sau đó : ResultSet rs = ps.getGeneratedKeys(); 
            ps.setString(1, null);
            ps.setString(2, user.getHotenString());
            ps.setString(3, user.getUserString());
            ps.setString(4, user.getPassString());
            ps.setString(5, user.getSdtString());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Loi csdl phan dang ky");
        }
        return false;
    }
}
