/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// membuat package khusus untuk melakukan konfigurasi dan memanggilnya di sini
package Konfigurasi;
// mengimport library untuk melakukan proses dalam database SQL
import java.sql.*;

/**
 *
 * @author REPUBLIC OF GAMERS
 */
// membuat kelas koneksi dalam package Konfigurasi
public class Koneksi {
    // membuat prosedur untuk melakukan koneksi ke db
    public static Connection getConnection(){
        // set dulu nilai var conn sebagai var untuk menentukan apakah berhasil terkoneksi atau tidak
        Connection conn = null;
        try {
            // menghubungkan database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mobil", "root", "");
        } catch(SQLException e) {
            System.out.println(e);
        }
        // mereturn value conn
        return conn;
    }
}
