/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author Faizin
 */

public class Mahasiswa {

    private int id;
    private String nama;

    // constructor kosong
    public Mahasiswa() {

    }

    // constructor tanpa id
    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    // constructor lengkap
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
