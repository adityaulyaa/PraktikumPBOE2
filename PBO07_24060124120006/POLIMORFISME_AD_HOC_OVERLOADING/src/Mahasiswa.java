// Nama File    : Mahasiswa.java
// Deskripsi    : Berisi Implementasi Program dari POLIMORFISME AD HOC OVERLOADING
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 29/04/2026

// ========== KELAS MAHASISWA ==========
public class Mahasiswa {
    // Atribut
    private int NIM;
    private String Nama;
    private String Programstudi;
    
    // ========== JAWABAN A: Operator setProgramStudi (Overloading) ==========
    
    // Varian 1: tanpa parameter -> "Kosong"
    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }
    
    // Varian 2: satu parameter string
    public void setProgramStudi(String programstudi) {
        this.Programstudi = programstudi;
    }
    
    // Varian 3: satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        this.Programstudi = m.Programstudi;
    }
    
    // ========== JAWABAN C: Konstruktor tanpa parameter ==========
    public Mahasiswa() {
        this.NIM = -999;
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }
    
    // ========== JAWABAN D: Konstruktor dengan 3 parameter ==========
    public Mahasiswa(int NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }
    
    // ========== JAWABAN E: Konstruktor cloning (1 parameter objek Mahasiswa lain) ==========
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }
    
    // ========== GETTER (untuk menampilkan data) ==========
    public int getNIM() {
        return NIM;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public String getProgramstudi() {
        return Programstudi;
    }
    
    // Method untuk menampilkan semua data
    public void tampilkanData() {
        System.out.println("NIM: " + NIM + ", Nama: " + Nama + ", Program Studi: " + Programstudi);
    }
}