// Nama File    : Kembangtelon.java
// Deskripsi    : Berisi atribut dan method dalam class Kembangtelon
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS Kembangtelon (turunan Kucing) ==========
// JAWABAN 1b: Kelas Kembangtelon mewarisi Kucing
public class Kembangtelon extends Kucing {
    private String corakBulu;
    
    public Kembangtelon(String nama, double bobot, String corakBulu) {
        super(nama, bobot);
        this.corakBulu = corakBulu;
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " (Kembangtelon) bergerak dengan MELATA yang biasanya cewe banget");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " (Kembangtelon) bersuara: MEEONG! berisik layaknya cewe");
    }
    
    public void tampilkanCorakBulu() {
        System.out.println(nama + " memiliki corak bulu " + corakBulu);
    }
}