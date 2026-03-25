// Nama File    : Manusia.java
// Deskripsi    : Class Pengusaha
// Pembuat      : Aditya Sultonul Ulya
// NIM          : 240601214120006
// Tanggal      : 25/03/2026

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl, String alamat, double pendapatan, String npwp) {
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 0;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println();
    }
}