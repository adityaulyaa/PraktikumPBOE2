// Nama File    : Seminar.java
// Deskripsi    : Berisi atribut dan method dalam class Seminar
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== KELAS SEMINAR (JAWABAN B, C, D, G, H) ==========
public class Seminar {
    // JAWABAN b: array statis dengan kapasitas 100
    private Civitasakademika[] pesertas;
    private int banyakPeserta;
    
    // Konstruktor
    public Seminar() {
        this.pesertas = new Civitasakademika[100]; // Array statis kapasitas 100
        this.banyakPeserta = 0; 
    }
    
    // JAWABAN c: fungsi countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }
    
    // JAWABAN d: prosedur registrasi
    public void registrasi(Civitasakademika peserta) {
        if (banyakPeserta < pesertas.length) {
            pesertas[banyakPeserta] = peserta; 
            banyakPeserta++;
            System.out.println("Registrasi berhasil: " + peserta.getNama() + 
                               " (" + peserta.getNomor() + ")");
        } else {
            System.out.println("✗ Registrasi gagal! Kapasitas seminar penuh (maks 100 orang)");
        }
    }
    
    // JAWABAN g: prosedur tampilPeserta
    public void tampilPeserta() {
        System.out.println("\n===== DAFTAR PESERTA SEMINAR =====");
        System.out.println("Total peserta: " + banyakPeserta);
        System.out.println("---------------------------------");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i+1) + ". " + pesertas[i].getNomor() + 
                               " - " + pesertas[i].getNama());
        }
        System.out.println("---------------------------------");
    }
    
    // JAWABAN h: fungsi countMahasiswa (menggunakan instanceof)
    public int countMahasiswa() {
        int jumlahMahasiswa = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                jumlahMahasiswa++;
            }
        }
        return jumlahMahasiswa;
    }
    
    // Fungsi tambahan: countDosen
    public int countDosen() {
        int jumlahDosen = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Dosen) {
                jumlahDosen++;
            }
        }
        return jumlahDosen;
    }
}