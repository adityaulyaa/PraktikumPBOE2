// Nama File    : Kembangtelon.java
// Deskripsi    : Berisi atribut dan method dalam class Kembangtelon
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS Kembangtelon (turunan Kucing) ==========
public class Kembangtelon extends Kucing {
    private String corakBulu;
    
    public Kembangtelon(String nama, double bobot, String corakBulu) {
        super(nama, bobot);
        this.corakBulu = corakBulu;
    }
    
    public Kembangtelon(String nama, String panggilan, double bobot, String corakBulu) {
        super(nama, panggilan, bobot);
        this.corakBulu = corakBulu;
    }
    
    @Override
    public void gerak() {
        System.out.println(panggilan + " (Kembangtelon) bergerak dengan MELATA yang biasanya cewe banget");
    }
    
    @Override
    public void bersuara() {
        System.out.println(panggilan + " (Kembangtelon) bersuara: MEEONG! berisik layaknya cewe");
    }
    
    public void tampilkanCorakBulu() {
        System.out.println(panggilan + " memiliki corak bulu " + corakBulu);
    }
}