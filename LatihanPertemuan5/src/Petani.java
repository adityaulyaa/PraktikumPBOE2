// Nama File    : Manusia.java
// Deskripsi    : Class Petani
// Pembuat      : Aditya Sultonul Ulya
// NIM          : 240601214120006
// Tanggal      : 25/03/2026

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 0;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println();
    }
}