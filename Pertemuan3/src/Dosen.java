// Nama File    : Dosen.java
// Deskripsi    : Berisi atribut dan method dalam class Dosen
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 05/03/2026

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    // konstruktor tanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // konstruktor dengan parameter
    Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // getter
    String getNipDosen() {
        return this.nip;
    }

    String getNamaDosen() {
        return this.nama;
    }

    String getProdiDosen() {
        return this.prodi;
    }

    // setter
    public void setNipDosen(String nip) {
        this.nip = nip;
    }

    public void setNamaDosen(String nama) {
        this.nama = nama;
    }

    public void setProdiDosen(String prodi) {
        this.prodi = prodi;
    }
}