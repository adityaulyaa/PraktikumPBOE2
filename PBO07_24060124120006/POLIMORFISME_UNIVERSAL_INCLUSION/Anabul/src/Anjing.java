// Nama File    : Anjing.java
// Deskripsi    : Berisi atribut dan method dalam class Anjing
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS ANAK: Anjing ==========
public class Anjing extends Anabul {
    
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan MELATA ");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: GUK GUK GUK");
    }
}