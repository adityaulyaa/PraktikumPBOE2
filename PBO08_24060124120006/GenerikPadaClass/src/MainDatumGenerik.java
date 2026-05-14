// Nama File    : MainDatumGenerik.java
// Deskripsi    : Berisi class main
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

// ========== PROGRAM UTAMA UNTUK SOAL 2 ==========
public class MainDatumGenerik {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("SOAL 2: KELAS GENERIK DATUM");
        System.out.println("Polimorfisme Parametric");
        System.out.println("==========================================\n");
        
        //  APLIKASI DENGAN TIPE PRIMITIF (Integer, Double, String) 
        System.out.println("===== DATUM DENGAN TIPE INTEGER =====");
        Datum<Integer> datumInteger = new Datum<>(100);
        System.out.println("Isi Datum Integer: " + datumInteger.getIsi());
        datumInteger.tampilkanTipe();
        datumInteger.setIsi(250);
        System.out.println("Isi setelah diubah: " + datumInteger.getIsi());
        
        System.out.println("\n===== DATUM DENGAN TIPE DOUBLE =====");
        Datum<Double> datumDouble = new Datum<>(3.14);
        System.out.println("Isi Datum Double: " + datumDouble.getIsi());
        datumDouble.tampilkanTipe();
        datumDouble.setIsi(2.718);
        System.out.println("Isi setelah diubah: " + datumDouble.getIsi());
        
        System.out.println("\n===== DATUM DENGAN TIPE STRING =====");
        Datum<String> datumString = new Datum<>("Hello Generik!");
        System.out.println("Isi Datum String: " + datumString.getIsi());
        datumString.tampilkanTipe();
        datumString.setIsi("Polimorfisme Parametric");
        System.out.println("Isi setelah diubah: " + datumString.getIsi());
        
        //  APLIKASI DENGAN KELUARGA ANABUL 
        System.out.println("\n==========================================");
        System.out.println("===== DATUM DENGAN KELUARGA ANABUL =====");
        System.out.println("==========================================");
        
        // Membuat objek Anabul, Kucing, Anggora, Kembangtelon
        Anabul anabul1 = new Anabul("Umum");
        Kucing kucing1 = new Kucing("Tom", 4.5);
        Anggora anggora1 = new Anggora("Luna", 3.2, "Putih");
        Kembangtelon kembangtelon1 = new Kembangtelon("Milo", 5.0, "Belang");
        
        // Datum dengan tipe Anabul
        System.out.println("\n----- Datum<Anabul> -----");
        Datum<Anabul> datumAnabul = new Datum<>(anabul1);
        System.out.println("Isi Datum Anabul: " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().gerak();
        datumAnabul.getIsi().bersuara();
        
        // Mengubah isi datumAnabul menjadi Kucing (Polimorfisme Inclusion)
        System.out.println("\n-- Mengubah isi Datum<Anabul> menjadi Kucing --");
        datumAnabul.setIsi(kucing1);
        System.out.println("Isi baru: " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().gerak();
        datumAnabul.getIsi().bersuara();
        
        // Datum dengan tipe Kucing
        System.out.println("\n----- Datum<Kucing> -----");
        Datum<Kucing> datumKucing = new Datum<>(kucing1);
        System.out.println("Isi Datum Kucing: " + datumKucing.getIsi().getNama());
        datumKucing.getIsi().gerak();
        datumKucing.getIsi().bersuara();
        datumKucing.getIsi().tampilkanBobot();
        
        // Datum dengan tipe Anggora
        System.out.println("\n----- Datum<Anggora> -----");
        Datum<Anggora> datumAnggora = new Datum<>(anggora1);
        System.out.println("Isi Datum Anggora: " + datumAnggora.getIsi().getNama());
        datumAnggora.getIsi().gerak();
        datumAnggora.getIsi().bersuara();
        datumAnggora.getIsi().tampilkanWarnaBulu();
        datumAnggora.getIsi().tampilkanBobot();
        
        // Datum dengan tipe Kembangtelon
        System.out.println("\n----- Datum<Kembangtelon> -----");
        Datum<Kembangtelon> datumKembangtelon = new Datum<>(kembangtelon1);
        System.out.println("Isi Datum Kembangtelon: " + datumKembangtelon.getIsi().getNama());
        datumKembangtelon.getIsi().gerak();
        datumKembangtelon.getIsi().bersuara();
        datumKembangtelon.getIsi().tampilkanCorakBulu();
        datumKembangtelon.getIsi().tampilkanBobot();
    }
}