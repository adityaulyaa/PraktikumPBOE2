// Nama File    : Dosen.java
// Deskripsi    : Berisi atribut dan method dalam class Dosen
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS ANAK: Dosen ==========
public class Dosen extends Civitasakademika {
    private String NIP;
    
    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }
    
    @Override
    public String getNomor() {
        return NIP;  
    }
    
    public String getNIP() {
        return NIP;
    }
}