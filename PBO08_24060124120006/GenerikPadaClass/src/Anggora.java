// Nama File    : Anggora.java
// Deskripsi    : Berisi atribut dan method dalam class Anggora
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS Anggora (turunan Kucing) ==========
// JAWABAN 1b: Kelas Anggora mewarisi Kucing
public class Anggora extends Kucing {
    private String warnaBulu;
    
    public Anggora(String nama, double bobot, String warnaBulu) {
        super(nama, bobot);
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " (Anggora) bergerak dengan MELATA yang LEMBUT dan ANGGUN");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " (Anggora) bersuara: meowww yang lebih halus ");
    }
    
    public void tampilkanWarnaBulu() {
        System.out.println(nama + " memiliki bulu warna " + warnaBulu);
    }
}