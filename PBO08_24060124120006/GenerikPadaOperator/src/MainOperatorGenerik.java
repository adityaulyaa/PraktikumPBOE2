// Nama File    : MainOperatorGenerik.java
// Deskripsi    : Berisi class main dari OperatorGenerik
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

public class MainOperatorGenerik {
    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("SOAL 3: OPERATOR GENERIK");
        System.out.println("Polimorfisme Parametric - Tukar & Bobot2");
        System.out.println("==========================================\n");
        
        //  JAWABAN 3b: Aplikasi Tukar untuk sesama INTEGER 
        System.out.println("===== 1. TUKAR INTEGER (menggunakan method generik) =====");
        Integer a = 3;
        Integer b = 6;
        // Memanggil method Tukar dari kelas OperatorGenerik
        OperatorGenerik.Tukar(a, b);
        
        //  JAWABAN 3b: Aplikasi Tukar untuk sesama STRING 
        System.out.println("\n===== 2. TUKAR STRING (menggunakan method generik) =====");
        String x = "Hello";
        String y = "World";
        // Memanggil method Tukar dari kelas OperatorGenerik
        OperatorGenerik.Tukar(x, y);
        
        //  JAWABAN 3b: Aplikasi Tukar untuk sesama KELUARGA ANABUL 
        System.out.println("\n===== 3. TUKAR OBJEK ANABUL (menggunakan method generik) =====");
        
        // Membuat objek Anjing dan Kucing
        Anjing anjing = new Anjing("Buddy");
        Kucing kucing = new Kucing("Tom", 4.5);
        
        // Memanggil method Tukar dari kelas OperatorGenerik
        System.out.println("(Catatan: Method Tukar hanya menukar di dalam method)");
        OperatorGenerik.Tukar(anjing, kucing);
        
        //  JAWABAN 3c: Aplikasi fungsi Bobot2 
        System.out.println("\n==========================================");
        System.out.println("===== FUNGSI GENERIK BOBOT2 =====");
        System.out.println("==========================================");
        
        // Membuat objek keturunan Kucing
        Kucing kucing1 = new Kucing("Tom", 4.5);
        Kucing kucing2 = new Kucing("Jerry", 3.2);
        Anggora anggora1 = new Anggora("Luna", 3.8, "Putih");
        Kembangtelon kembangtelon1 = new Kembangtelon("Milo", 5.0, "Belang");
        
        // Memanggil fungsi Bobot2 dari kelas OperatorGenerik
        System.out.println("\n--- Bobot2(Kucing, Kucing) ---");
        double hasil1 = OperatorGenerik.Bobot2(kucing1, kucing2);
        
        System.out.println("\n--- Bobot2(Kucing, Anggora) ---");
        double hasil2 = OperatorGenerik.Bobot2(kucing1, anggora1);
        
        System.out.println("\n--- Bobot2(Anggora, Kembangtelon) ---");
        double hasil3 = OperatorGenerik.Bobot2(anggora1, kembangtelon1);
    }
}