// Nama File    : Pegawai.java
// Deskripsi    : Berisi atribut dan method dalam class Pegawai
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 12/03/2026

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    protected String NIP;
    protected String Nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    // dengan parameter
    public Pegawai (String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public int getMasaKerja() {
        return Period.between(TMT, LocalDate.now()).getYears();
    }

    public Period getMasaKerjaDetail(){
        return Period.between(TMT, LocalDate.now());
    }

    public String formatRupiah(double nilai){
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
        return rupiah.format(nilai);
    }

    public String formatTanggal(LocalDate tanggal){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));
        return tanggal.format(format);
    }

    public void printInfo() {
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + Nama);
        System.out.println("Tanggal Lahir     : " + formatTanggal(tanggalLahir));
        System.out.println("TMT               : " + formatTanggal(TMT));
        System.out.println("Gaji Pokok        : " + formatRupiah(gajiPokok));
        System.out.println("TMT : " + TMT);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}
