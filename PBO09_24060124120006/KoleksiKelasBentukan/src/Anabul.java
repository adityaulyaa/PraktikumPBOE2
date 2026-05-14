// Nama File    : Anabul.java
// Deskripsi    : Berisi atribut dan method dalam class Anabul
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS INDUK: Anabul ==========
public class Anabul {
    protected String nama;
    protected String panggilan;  // JAWABAN 2a: atribut panggilan
    
    // Konstruktor
    public Anabul(String nama) {
        this.nama = nama;
        this.panggilan = nama;
    }
    
    public Anabul(String nama, String panggilan) {
        this.nama = nama;
        this.panggilan = panggilan;
    }
    
    // JAWABAN 2a: getNama()
    public String getNama() {
        return nama;
    }
    
    // JAWABAN 2a: setNama(nama)
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // getPanggilan
    public String getPanggilan() {
        return panggilan;
    }
    
    // setPanggilan
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    public void gerak() {
        // Akan di-override oleh kelas anak
    }
    
    public void bersuara() {
        // Akan di-override oleh kelas anak
    }
}