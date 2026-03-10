// Nama File    : Kendaraan.java
// Deskripsi    : Berisi atribut dan method dalam class Kendaraan
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 05/03/2026

public class Kendaraan {

    private String noPlat;
    private String jenis;

    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    String getNoPlatKendaraan() {
        return this.noPlat;
    }

    String getJenisKendaraan() {
        return this.jenis;
    }

    public void setNoPlatKendaraan(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenisKendaraan(String jenis) {
        this.jenis = jenis;
    }
}