// Nama File    : MainSeminar.java
// Deskripsi    : Berisi realisasi class Seminar
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== PROGRAM UTAMA SEMINAR ==========
public class MainSeminar {
    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("POLIMORFISME INCLUSION - SEMINAR");
        System.out.println("==========================================\n");
        
        // JAWABAN e: Membuat 2 objek dosen
        Dosen dosen1 = new Dosen("Prof. Dr. Budi Hartono", "197512251998021001");
        Dosen dosen2 = new Dosen("Dr. Siti Aminah, M.Kom.", "198008152005012002");
        
        // JAWABAN e: Membuat 5 objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Andi Wijaya", "202310101");
        Mahasiswa mhs2 = new Mahasiswa("Bella Pratiwi", "202310102");
        Mahasiswa mhs3 = new Mahasiswa("Citra Dewi", "202310103");
        Mahasiswa mhs4 = new Mahasiswa("Dimas Aditya", "202310104");
        Mahasiswa mhs5 = new Mahasiswa("Eka Saputra", "202310105");
        
        System.out.println("===== DATA DOSEN =====");
        System.out.println("Dosen 1: " + dosen1.getNama() + " (NIP: " + dosen1.getNomor() + ")");
        System.out.println("Dosen 2: " + dosen2.getNama() + " (NIP: " + dosen2.getNomor() + ")");
        
        System.out.println("\n===== DATA MAHASISWA =====");
        mhs1.tampilDataMahasiswa();
        mhs2.tampilDataMahasiswa();
        mhs3.tampilDataMahasiswa();
        mhs4.tampilDataMahasiswa();
        mhs5.tampilDataMahasiswa();
        
        // JAWABAN i: setWali untuk mahasiswa
        System.out.println("\n===== SET WALI MAHASISWA =====");
        mhs1.setWali(dosen1);
        mhs2.setWali(dosen1);
        mhs3.setWali(dosen2);
        mhs4.setWali(dosen2);
        mhs5.setWali(dosen2);
        
        // JAWABAN j: tampilDataMahasiswa setelah set wali
        System.out.println("\n===== DATA MAHASISWA SETELAH SET WALI =====");
        mhs1.tampilDataMahasiswa();
        mhs2.tampilDataMahasiswa();
        mhs3.tampilDataMahasiswa();
        mhs4.tampilDataMahasiswa();
        mhs5.tampilDataMahasiswa();
        
        // JAWABAN b: membuat objek Seminar
        Seminar seminar = new Seminar();
        
        // JAWABAN f: uji registrasi dengan 7 objek peserta
        System.out.println("\n===== PROSES REGISTRASI SEMINAR =====");
        seminar.registrasi(dosen1);
        seminar.registrasi(dosen2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);
        
        // JAWABAN c: countPeserta
        System.out.println("\n===== JUMLAH PESERTA =====");
        System.out.println("Total peserta terdaftar: " + seminar.countPeserta() + " orang");
        
        // JAWABAN g: tampilPeserta
        seminar.tampilPeserta();
        
        // JAWABAN h: countMahasiswa
        System.out.println("\n===== STATISTIK PESERTA =====");
        System.out.println("Jumlah Mahasiswa: " + seminar.countMahasiswa() + " orang");
        System.out.println("Jumlah Dosen: " + seminar.countDosen() + " orang");
        
        // Demonstrasi Polimorfisme Inclusion
        System.out.println("\n===== DEMONSTRASI POLIMORFISME INCLUSION =====");
        Civitasakademika[] pesertaArray = {dosen1, mhs1, dosen2, mhs2};
        
        for (Civitasakademika p : pesertaArray) {
            System.out.println(p.getNama() + " memiliki nomor: " + p.getNomor());
        }
        
        // Renungan: di akhir program
        System.out.println("\n==========================================");
        System.out.println("RENUNGAN:");
        System.out.println("==========================================");
        System.out.println("Polimorfisme Inclusion adalah konsep di mana suatu objek dari kelas anak");
        System.out.println("dapat diperlakukan sebagai objek dari kelas induknya, namun ketika method");
        System.out.println("dipanggil, yang dieksekusi adalah method dari kelas anak yang sebenarnya.");
        System.out.println("\nContoh pada program di atas:");
        System.out.println("- Variabel bertipe Civitasakademika bisa menampung Dosen atau Mahasiswa");
        System.out.println("- Method getNomor() memberikan NIP untuk Dosen, NIM untuk Mahasiswa");
        System.out.println("- Ini memungkinkan kode yang lebih fleksibel dan mudah dikembangkan");
        System.out.println("\nKesimpulan: Satu antarmuka (kelas induk), banyak implementasi (kelas anak)");
    }
}