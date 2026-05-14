// Nama File    : Burung.java
// Deskripsi    : Berisi atribut dan method dalam class Burung
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS ANAK: Burung ==========
public class Burung extends Anabul {
    
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan TERBANG ");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: CUIT CUIT ");
    }
}