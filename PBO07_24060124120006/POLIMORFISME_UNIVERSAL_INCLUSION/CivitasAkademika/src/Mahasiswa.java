// Nama File    : Mahasiswa.java
// Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS ANAK: Mahasiswa ==========
public class Mahasiswa extends Civitasakademika {
    private String NIM;
    private Dosen dosenWali;
    
    public Mahasiswa(String nama, String NIM) {
        super(nama);
        this.NIM = NIM;
        this.dosenWali = null; 
    }
    
    @Override
    public String getNomor() {
        return NIM;  
    }
    
    public String getNIM() {
        return NIM;
    }
    
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // JAWABAN i: setWali
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
        System.out.println("Wali untuk " + nama + " (" + NIM + ") adalah " + dosen.getNama());
    }
     
    // JAWABAN j: tampilDataMahasiswa
    public void tampilDataMahasiswa() {
        System.out.print("NIM: " + NIM + ", Nama: " + nama);
        if (dosenWali != null) {
            System.out.println(", Dosen Wali: " + dosenWali.getNama());
        } else {
            System.out.println(", Dosen Wali: Belum ditentukan");
        }
    }
}