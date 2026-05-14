// Nama File    : MainAnabul.java
// Deskripsi    : Berisi atribut dan method dalam main class Anabul
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== PROGRAM UTAMA ANABUL ==========
public class MainAnabul {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("POLIMORFISME INCLUSION - ANABUL");
        System.out.println("==========================================\n");
        
        // Polimorfisme --> variabel induk bisa menampung objek anak
        Anabul[] koleksiAnabul = new Anabul[3];
        
        koleksiAnabul[0] = new Kucing("Tom");
        koleksiAnabul[1] = new Anjing("Spike");
        koleksiAnabul[2] = new Burung("Jerry");
        
        // Demonstrasi polimorfisme: method yang dipanggil sesuai objek asli
        for (Anabul a : koleksiAnabul) {
            System.out.println(a.getNama());
            a.gerak();     
            a.bersuara();  
            System.out.println();
        }

        // Demonstrasi Kucing dengan bobot
        System.out.println("===== KUCING DENGAN BOBOT =====");
        Kucing kucingBiasa = new Kucing("Tom", 4.5);
        kucingBiasa.tampilkanBobot();
        kucingBiasa.gerak();
        kucingBiasa.bersuara();

        System.out.println("\n-- Setelah diet --");
        kucingBiasa.setBobot(4.0);
        kucingBiasa.tampilkanBobot();

        System.out.println("\n===== ANGGORA (Turunan Kucing) =====");
        Anggora anggora = new Anggora("Luna", 3.2, "Putih");
        anggora.tampilkanBobot();
        anggora.tampilkanWarnaBulu();
        anggora.gerak();
        anggora.bersuara();
        
        System.out.println("\n===== KEMBANGTELON (Turunan Kucing) =====");
        Kembangtelon kembangtelon = new Kembangtelon("Milo", 5.0, "Belang Tiga Warna");
        kembangtelon.tampilkanBobot();
        kembangtelon.tampilkanCorakBulu();
        kembangtelon.gerak();
        kembangtelon.bersuara();

        // Demonstrasi Polimorfisme Inclusion
        System.out.println("\n===== DEMONSTRASI POLIMORFISME INCLUSION =====");
        System.out.println("(Variabel Kucing bisa menampung Anggora atau Kembangtelon)");
        
        Kucing[] koleksiKucing = {kucingBiasa, anggora, kembangtelon};
        
        for (Kucing k : koleksiKucing) {
            System.out.println("\n--- " + k.getNama() + " ---");
            k.gerak();      
            k.bersuara();   
            k.tampilkanBobot();
        }
    }
}