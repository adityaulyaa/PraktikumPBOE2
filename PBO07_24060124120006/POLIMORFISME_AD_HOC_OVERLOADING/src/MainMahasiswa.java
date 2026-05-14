// Nama File    : MainMahasiswa.java
// Deskripsi    : Berisi Program Main
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 29/04/2026

// ========== KELAS MAIN / APLIKASI (JAWABAN B, C, D, E) ==========
public class MainMahasiswa {
    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("JAWABAN B: Aplikasi semua varian setProgramStudi");
        System.out.println("==========================================");
        
        // Membuat objek Mahasiswa dengan konstruktor default
        Mahasiswa m1 = new Mahasiswa();
        System.out.print("Sebelum setProgramStudi : \n");
        m1.tampilkanData();
        
        // Varian 1: tanpa parameter
        m1.setProgramStudi();
        System.out.print("Varian 1 (tanpa parameter): \n");
        m1.tampilkanData();
        
        // Varian 2: satu parameter string
        Mahasiswa m2 = new Mahasiswa();
        m2.setProgramStudi("Informatika");
        System.out.print("Varian 2 (dengan string 'Informatika'): \n");
        m2.tampilkanData();
        
        // Varian 3: satu parameter objek Mahasiswa lain
        Mahasiswa m3 = new Mahasiswa();
        m3.setProgramStudi(m2); 
        System.out.print("Varian 3 (copy dari m2): \n");
        m3.tampilkanData();
        
        System.out.println("\n==========================================");
        System.out.println("JAWABAN C: Konstruktor tanpa parameter");
        System.out.println("==========================================");
        
        Mahasiswa m4 = new Mahasiswa();
        System.out.print("Objek hasil konstruktor default: \n");
        m4.tampilkanData();
        
        System.out.println("\n==========================================");
        System.out.println("JAWABAN D: Konstruktor dengan 3 parameter");
        System.out.println("==========================================");
        
        Mahasiswa m5 = new Mahasiswa(12345, "Budi Santoso", "Sistem Informasi");
        System.out.print("Objek hasil konstruktor 3 parameter: \n");
        m5.tampilkanData();
        
        System.out.println("\n==========================================");
        System.out.println("JAWABAN E: Konstruktor cloning (objek Mahasiswa lain)");
        System.out.println("==========================================");
        
        Mahasiswa m6 = new Mahasiswa(m5); 
        System.out.print("Objek hasil cloning dari m5: \n");
        m6.tampilkanData();
    }
}