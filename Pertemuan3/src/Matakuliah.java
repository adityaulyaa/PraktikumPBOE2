// Nama File    : Matakuliah.java
// Deskripsi    : Berisi atribut dan method dalam class Matakuliah
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 05/03/2026

public class Matakuliah {

    private String idMatKul;
    private String nama;
    private int sks;

    public Matakuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    Matakuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    String getIdMatKulMatakuliah() {
        return this.idMatKul;
    }

    String getNamaMatakuliah() {
        return this.nama;
    }

    int getSksMahasiswa() {
        return this.sks;
    }

    public void setIdMatKulMatakuliah(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNamaMatakuliah(String nama) {
        this.nama = nama;
    }

    public void setSksMahasiswa(int sks) {
        this.sks = sks;
    }
}