// Nama File    : OperatorGenerik.java
// Deskripsi    : Berisi atribut dan method dalam class OperatorGenerik
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

public class OperatorGenerik {
    
    //  JAWABAN 3a: Prosedur generik Tukar 
    // Method generik untuk menukar dua nilai bertipe sama
    public static <T> void Tukar(T a, T b) {
        System.out.println("SEBELUM ditukar:");
        System.out.println("  a = " + a);
        System.out.println("  b = " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("SESUDAH ditukar:");
        System.out.println("  a = " + a);
        System.out.println("  b = " + b);
    }
       
    //  JAWABAN 3c: Fungsi generik Bobot2 
    // Menerima dua objek keturunan Kucing, mengembalikan jumlah bobot keduanya
    public static double Bobot2(Kucing k1, Kucing k2) {
        double totalBobot = k1.getBobot() + k2.getBobot();
        System.out.println("Bobot " + k1.getNama() + " (" + k1.getBobot() + " kg) + " 
                         + k2.getNama() + " (" + k2.getBobot() + " kg) = " + totalBobot + " kg");
        return totalBobot;
    }
}