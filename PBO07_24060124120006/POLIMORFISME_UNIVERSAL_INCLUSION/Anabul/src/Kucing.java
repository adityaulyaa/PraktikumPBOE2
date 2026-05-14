// Nama File    : Kucing.java
// Deskripsi    : Berisi atribut dan method dalam class Kucing
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS ANAK: Kucing ==========
public class Kucing extends Anabul {
    
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan MELATA");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: MEONG MEONG");
    }
}