// Nama File    : Kucing.java
// Deskripsi    : Berisi atribut dan method dalam class Kucing
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS ANAK: Kucing ==========
public class Kucing extends Anabul {
    protected double bobot;
    
    public Kucing(String nama) {
        super(nama);
    }

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan MELATA");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: MEONG MEONG");
    }

    public void tampilkanBobot() {
        System.out.println(nama + " memiliki bobot: " + bobot + " kg");
    }
}