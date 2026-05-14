// Nama File    : Kucing.java
// Deskripsi    : Berisi atribut dan method dalam class Kucing
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS ANAK: Kucing ==========
public class Kucing extends Anabul {
    protected double bobot;
    
    public Kucing(String nama) {
        super(nama);
        this.bobot = 0;
    }

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }
    
    // JAWABAN 2a: Konstruktor dengan panggilan
    public Kucing(String nama, String panggilan, double bobot) {
        super(nama, panggilan);
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
        System.out.println(panggilan + " bergerak dengan MELATA");
    }
    
    @Override
    public void bersuara() {
        System.out.println(panggilan + " bersuara: MEONG MEONG");
    }

    public void tampilkanBobot() {
        System.out.println(panggilan + " memiliki bobot: " + bobot + " kg");
    }
}