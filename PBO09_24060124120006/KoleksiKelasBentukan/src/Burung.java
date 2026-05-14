// Nama File    : Burung.java
// Deskripsi    : Berisi atribut dan method dalam class Burung
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS ANAK: Burung ==========
public class Burung extends Anabul {
    
    public Burung(String nama) {
        super(nama);
    }
    
    public Burung(String nama, String panggilan) {
        super(nama, panggilan);
    }
    
    @Override
    public void gerak() {
        System.out.println(panggilan + " bergerak dengan TERBANG ");
    }
    
    @Override
    public void bersuara() {
        System.out.println(panggilan + " bersuara: CUIT CUIT ");
    }
}