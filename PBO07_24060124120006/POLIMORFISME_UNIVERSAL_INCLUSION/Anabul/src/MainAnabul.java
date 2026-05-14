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
    }
}