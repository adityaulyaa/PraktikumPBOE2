// Nama File    : Dosen.java
// Deskripsi    : Berisi atribut dan method dalam class Dosen
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 12/03/2026

import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String Fakultas;

    public Dosen(String NIP, String Nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String Fakultas){
        super(NIP, Nama, tanggalLahir, TMT,gajiPokok);
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas : " + Fakultas);
    }
}
