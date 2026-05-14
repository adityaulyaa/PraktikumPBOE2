// Nama File    : Anabul.java
// Deskripsi    : Berisi atribut dan method dalam class Anabul
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS INDUK: Anabul ==========
public class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void gerak() {
        // Akan di-override oleh kelas anak
    }
    
    public void bersuara() {
        // Akan di-override oleh kelas anak
    }
}