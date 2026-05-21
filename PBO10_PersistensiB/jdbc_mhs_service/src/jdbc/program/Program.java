/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

/**
 *
 * @author Faizin
 */

import java.util.ArrayList;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {

    public static void main(String[] args) {

        try {

            MysqlMahasiswaService service =
                    new MysqlMahasiswaService();

            // =========================
            // CREATE
            // =========================
            System.out.println("CREATE");

            Mahasiswa mhsBaru =
                    new Mahasiswa("Ulya");

            service.insert(mhsBaru);

            // =========================
            // READ
            // =========================
            System.out.println("\nREAD");

            ArrayList<Mahasiswa> list =
                    service.getAll();

            for(Mahasiswa mhs : list) {

                System.out.println(
                        mhs.getId()
                        + " - "
                        + mhs.getNama()
                );
            }

            // =========================
            // UPDATE
            // =========================
            System.out.println("\nUPDATE");

            Mahasiswa updateMhs =
                    new Mahasiswa(1, "Budi");

            service.update(updateMhs);

            // tampilkan lagi setelah update
            System.out.println("\nSETELAH UPDATE");

            list = service.getAll();

            for(Mahasiswa mhs : list) {

                System.out.println(
                        mhs.getId()
                        + " - "
                        + mhs.getNama()
                );
            }

            // =========================
            // DELETE
            // =========================
            System.out.println("\nDELETE");

            service.delete(1);

            // tampilkan lagi setelah delete
            System.out.println("\nSETELAH DELETE");

            list = service.getAll();

            for(Mahasiswa mhs : list) {

                System.out.println(
                        mhs.getId()
                        + " - "
                        + mhs.getNama()
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}