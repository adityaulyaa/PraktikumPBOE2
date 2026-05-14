// Nama File    : MainPiaraan.java
// Deskripsi    : Aplikasi kelas Piaraan (Queue)
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

public class MainPiaraan {
    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("SOAL 2: KELAS PIARAAN (ANTREAN)");
        System.out.println("==========================================\n");
        
        // Membuat objek Piaraan (Klinik Hewan)
        Piaraan klinik = new Piaraan();
        
        // ========== Membuat objek-objek Anabul dengan panggilan ==========
        System.out.println("===== MEMBUAT HEWAN =====");
        
        Anjing anjing1 = new Anjing("Buddy", "Buddy");
        Anjing anjing2 = new Anjing("Rex", "Rexy");
        Kucing kucing1 = new Kucing("Tom", "Tommy", 4.5);
        Kucing kucing2 = new Kucing("Jerry", "Jerry", 3.2);
        Anggora anggora1 = new Anggora("Luna", "Luna", 3.8, "Putih");
        Kembangtelon kembangtelon1 = new Kembangtelon("Milo", "Milo", 5.0, "Belang Tiga Warna");
        Burung burung1 = new Burung("Tweety", "Tweet");
        
        // ========== ii. enqueueAnabul() ==========
        System.out.println("\n===== enqueueAnabul() =====");
        klinik.enqueueAnabul(anjing1);
        klinik.enqueueAnabul(kucing1);
        klinik.enqueueAnabul(anggora1);
        klinik.enqueueAnabul(burung1);
        klinik.enqueueAnabul(kembangtelon1);
        klinik.enqueueAnabul(kucing2);
        klinik.enqueueAnabul(anjing2);
        
        // ========== i. getNbelm() ==========
        System.out.println("\n===== getNbelm() =====");
        System.out.println("Jumlah antrean: " + klinik.getNbelm());
        
        // ========== c. showAnabul() ==========
        klinik.showAnabul();
        
        // ========== iv. getAnabul() ==========
        System.out.println("\n===== getAnabul() =====");
        klinik.getAnabul();
        
        // ========== iii. isMember() ==========
        System.out.println("\n===== isMember() =====");
        klinik.isMember(kucing1);
        klinik.isMember(new Kucing("Tom", "Tommy", 4.5)); 
        klinik.isMember(new Anjing("Unknown", "Unknown"));
        
        // ========== d. countKucing() ==========
        System.out.println("\n===== countKucing() =====");
        klinik.countKucing();
        
        // ========== e. bobotKucing() ==========
        System.out.println("\n===== bobotKucing() =====");
        klinik.bobotKucing();
        
        // ========== f. showJenisAnabul() ==========
        klinik.showJenisAnabul();
        
        // ========== v. dequeueAnabul() ==========
        System.out.println("\n===== dequeueAnabul() =====");
        klinik.dequeueAnabul();  
        klinik.dequeueAnabul(); 
        
        // Tampilkan antrean setelah dequeue
        klinik.showAnabul();
        
        // Hitung ulang setelah dequeue
        System.out.println("\n===== SETELAH DEQUEUE =====");
        System.out.println("Sisa antrean: " + klinik.getNbelm());
        klinik.countKucing();
        klinik.bobotKucing();
    }
}