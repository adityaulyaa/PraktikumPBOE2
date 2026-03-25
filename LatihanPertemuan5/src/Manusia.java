// Nama File    : Manusia.java
// Deskripsi    : Abstract class Manusia
// Pembuat      : Aditya Sultonul Ulya
// NIM          : 240601214120006
// Tanggal      : 25/03/2026

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // Formatter untuk parsing tanggal
    protected static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja, formatter);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public abstract int hitungMasaKerja();
}