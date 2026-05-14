// Nama File    : MainTeman.java
// Deskripsi    : Aplikasi kelas Teman
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 07/05/2026

public class MainTeman {
    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("SOAL 1: KELAS TEMAN (KOLEKSI LIST)");
        System.out.println("==========================================\n");
        
        // Membuat objek Teman
        Teman daftarTeman = new Teman();
        
        // d. addNama()
        System.out.println("===== addNama() =====");
        daftarTeman.addNama("Andi");
        daftarTeman.addNama("Budi");
        daftarTeman.addNama("Citra");
        daftarTeman.addNama("Dewi");
        daftarTeman.addNama("Eka");
        daftarTeman.addNama("Budi");  
        
        // a. getNbelm()
        System.out.println("\n===== getNbelm() =====");
        System.out.println("Jumlah elemen: " + daftarTeman.getNbelm());
        
        // b. getNama(indeks)
        System.out.println("\n===== getNama() =====");
        System.out.println("Nama pada indeks 0: " + daftarTeman.getNama(0));
        System.out.println("Nama pada indeks 2: " + daftarTeman.getNama(2));
        System.out.println("Nama pada indeks 5: " + daftarTeman.getNama(5));
        
        // i. showTeman()
        daftarTeman.showTeman();
        
        // c. setNama()
        System.out.println("\n===== setNama() =====");
        daftarTeman.setNama(2, "Cindy");
        
        // f. isMember()
        System.out.println("\n===== isMember() =====");
        daftarTeman.isMember("Andi");
        daftarTeman.isMember("Zaki");
        
        // h. countNama()
        System.out.println("\n===== countNama() =====");
        daftarTeman.countNama("Budi");
        daftarTeman.countNama("Andi");
        
        // g. gantiNama()
        System.out.println("\n===== gantiNama() =====");
        daftarTeman.gantiNama("Dewi", "Devi");
        daftarTeman.gantiNama("Zaki", "Zakaria");  // Nama tidak ditemukan
        
        // e. delNama()
        System.out.println("\n===== delNama() =====");
        daftarTeman.delNama("Budi");  // Hapus Budi pertama
        daftarTeman.delNama("Budi");  // Hapus Budi kedua
        daftarTeman.delNama("Budi");  // Sudah tidak ada
        
        // Tampilkan setelah perubahan
        daftarTeman.showTeman();
    }
}