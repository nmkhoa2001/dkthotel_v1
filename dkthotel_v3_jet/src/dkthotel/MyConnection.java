/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dkthotel;

import java.sql.DriverManager;

/**
 *
 * @author Thanh Phan
 */
public class MyConnection {
    public static java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DKTHOTEL";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String username = "sa";
            String password = "12345OHdf%e";
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
        return conn;
    }

    public static void closeConnection(java.sql.Connection c) {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    
}
