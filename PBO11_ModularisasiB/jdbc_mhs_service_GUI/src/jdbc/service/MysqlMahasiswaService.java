/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author Faizin
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {

    Connection koneksi;

    public MysqlMahasiswaService() throws Exception {
        koneksi = MysqlUtility.getConnection();
    }

    // CREATE
    public void insert(Mahasiswa mhs) throws Exception {

        String query =
                "INSERT INTO mahasiswa(nama) VALUES(?)";

        PreparedStatement ps =
                koneksi.prepareStatement(query);

        ps.setString(1, mhs.getNama());

        ps.executeUpdate();

        System.out.println("Data berhasil ditambah");
    }
    
    public ArrayList<Mahasiswa> getAll()
        throws Exception {
        String query =
            "SELECT * FROM mahasiswa";
        PreparedStatement ps =
            koneksi.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        ArrayList<Mahasiswa> list =
            new ArrayList<>();
        while(rs.next()) {
            Mahasiswa mhs =
                new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );
            list.add(mhs);
        }
        return list;
    }
    
    public void update(Mahasiswa mhs)
            throws Exception {
        String query =
            "UPDATE mahasiswa "
            + "SET nama=? "
            + "WHERE id=?";
        PreparedStatement ps =
            koneksi.prepareStatement(query);
        ps.setString(1, mhs.getNama());
        ps.setInt(2, mhs.getId());
        ps.executeUpdate();
        System.out.println("Data berhasil diupdate");
    }
    
    public void delete(int id)
            throws Exception {
        String query =
            "DELETE FROM mahasiswa "
            + "WHERE id=?";
        PreparedStatement ps =
            koneksi.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Data berhasil dihapus");
    }
    
    public void resetIndex() throws Exception {

        String query =
                "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";

        PreparedStatement ps =
                koneksi.prepareStatement(query);

        ps.executeUpdate();

        System.out.println("Index berhasil direset");
    }
}
