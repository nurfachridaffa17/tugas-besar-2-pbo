package tugasBesar2;


import javax.swing.JOptionPane;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class koneksi {
    
    private String url = "jdbc:mysql://localhost:3306/tb2pbo";
    private String username_db = "root";
    private String password_db = "password";
    private Connection con;
    
    public void connect() {
        try {
            con = DriverManager.getConnection(url,username_db, password_db);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public Connection getCon() {
        return con;
    }
}
