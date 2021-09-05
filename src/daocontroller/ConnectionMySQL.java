/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daocontroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Quang Truong
 */
public class ConnectionMySQL {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pho";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "";
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Connect successfully");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connect failure!");
        }
        return conn;
    }
    public static void closeConnection(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
        }
    }
}
