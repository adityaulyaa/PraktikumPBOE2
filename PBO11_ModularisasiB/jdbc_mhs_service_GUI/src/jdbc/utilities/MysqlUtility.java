/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

/**
 *
 * @author Faizin
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection() throws Exception {

        if(koneksi == null) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            koneksi = DriverManager.getConnection(
                    "jdbc:mysql://localhost/jdbc_mhs_service",
                    "root",
                    "Kanjengmami100_"
            );
        }

        return koneksi;
    }
}
