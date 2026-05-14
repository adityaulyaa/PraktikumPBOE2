// Nama File    : Civitasakademika.java
// Deskripsi    : Berisi atribut dan method dalam class Civitasakademika
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS INDUK: Civitasakademika ==========
public class Civitasakademika {
    protected String nama;
    
    public Civitasakademika(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNomor() {
        return ""; // Akan di-override kelas anak
    }
}