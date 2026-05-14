// Nama File    : MainData.java
// Deskripsi    : Aplikasi kelas generik Data untuk berbagai tipe
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

public class MainData {
    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("SOAL 4: KELAS GENERIK DATA");
        System.out.println("Polimorfisme Parametric - Array Statik 100 Elemen");
        System.out.println("==========================================\n");
        
        //  JAWABAN 4a: Aplikasi kelas Data dengan tipe Integer 
        System.out.println("===== 4a. APLIKASI DATA<Integer> =====");
        Data<Integer> dataInteger = new Data<>();
        
        System.out.println("\n--- Mengisi data Integer ---");
        dataInteger.setIsi(1, 100);
        dataInteger.setIsi(2, 200);
        dataInteger.setIsi(3, 300);
        dataInteger.setIsi(5, 500); 

        System.out.println("\n--- Membaca data Integer ---");
        System.out.println("getIsi(1): " + dataInteger.getIsi(1));
        System.out.println("getIsi(2): " + dataInteger.getIsi(2));
        System.out.println("getIsi(3): " + dataInteger.getIsi(3));
        System.out.println("getIsi(4): " + dataInteger.getIsi(4));  // Kosong
        System.out.println("getIsi(5): " + dataInteger.getIsi(5));
        
        System.out.println("\n--- getSize() ---");
        System.out.println("Banyak elemen efektif: " + dataInteger.getSize());
        
        // ========== JAWABAN 4b, 4c, 4d: Aplikasi untuk keluarga ANABUL ==========
        System.out.println("\n==========================================");
        System.out.println("===== APLIKASI DATA<ANABUL> =====");
        System.out.println("==========================================");
        
        // Membuat objek Data untuk keluarga Anabul
        Data<Anabul> dataAnabul = new Data<>();
        
        // Membuat objek-objek Anabul
        Anjing anjing1 = new Anjing("Buddy");
        Anjing anjing2 = new Anjing("Rex");
        Kucing kucing1 = new Kucing("Tom", 4.5);
        Kucing kucing2 = new Kucing("Jerry", 3.2);
        Anggora anggora1 = new Anggora("Luna", 3.8, "Putih");
        Kembangtelon kembangtelon1 = new Kembangtelon("Milo", 5.0, "Belang");
        Burung burung1 = new Burung("Tweety");
        
        //  JAWABAN 4b: Prosedur setIsi untuk keluarga Anabul 
        System.out.println("\n===== 4b. setIsi() untuk ANABUL =====");
        dataAnabul.setIsi(1, anjing1);
        dataAnabul.setIsi(2, kucing1);
        dataAnabul.setIsi(3, anggora1);
        dataAnabul.setIsi(4, kembangtelon1);
        dataAnabul.setIsi(5, burung1);
        dataAnabul.setIsi(7, anjing2);
        dataAnabul.setIsi(10, kucing2);
        
        //  JAWABAN 4c: Fungsi getIsi untuk keluarga Anabul 
        System.out.println("\n===== 4c. getIsi() untuk ANABUL =====");
        
        System.out.println("\n--- Mengambil data dari posisi 1 ---");
        Anabul hasil1 = dataAnabul.getIsi(1);
        if (hasil1 != null) {
            System.out.println("Posisi 1: " + hasil1.getNama());
            hasil1.gerak();
            hasil1.bersuara();
        }
        
        System.out.println("\n--- Mengambil data dari posisi 3 ---");
        Anabul hasil3 = dataAnabul.getIsi(3);
        if (hasil3 != null) {
            System.out.println("Posisi 3: " + hasil3.getNama());
            hasil3.gerak();
            hasil3.bersuara();
        }
        
        System.out.println("\n--- Mengambil data dari posisi 4 ---");
        Anabul hasil4 = dataAnabul.getIsi(4);
        if (hasil4 != null) {
            System.out.println("Posisi 4: " + hasil4.getNama());
            hasil4.gerak();
            hasil4.bersuara();
        }
        
        System.out.println("\n--- Mengambil data dari posisi 6 (kosong) ---");
        Anabul hasil6 = dataAnabul.getIsi(6);
        if (hasil6 == null) {
            System.out.println("Posisi 6 kosong (null)");
        }
        
        //  JAWABAN 4d: Fungsi getSize untuk keluarga Anabul 
        System.out.println("\n===== 4d. getSize() untuk ANABUL =====");
        System.out.println("Banyak elemen efektif di dataAnabul: " + dataAnabul.getSize());
        
        // Menampilkan semua isi dataAnabul
        dataAnabul.tampilkanSemua();
    }
}