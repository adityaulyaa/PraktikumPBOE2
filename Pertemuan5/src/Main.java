// Nama File    : Main.java
// Deskripsi    : Driver class untuk uji BangunDatar
// Pembuat      : Aditya Sultonul Ulya
// NIM          : 240601214120006
// Tanggal      : 24/03/2026

public class Main
{
    public static void main(String[] args)
    {
        // Eksperimen (sesuai soal)

        // BangunDatar B1 = new BangunDatar();
        // ERROR: BangunDatar adalah abstract class, tidak bisa diinstansiasi

        // BangunDatar P1 = new Persegi(10);
        // ERROR (jika konstruktor 1 parameter tidak ada)

        // Persegi P2 = new Persegi(5);
        // ERROR (jika konstruktor 1 parameter tidak ada)

        // BangunDatar L1 = new Lingkaran(7);
        // ERROR (jika konstruktor 1 parameter tidak ada)

        // Lingkaran L1 = new Lingkaran(14);
        // ERROR: variabel L1 sudah digunakan sebelumnya (duplikasi)

        // Perbaikan (agar bisa jalan)

        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");

        BangunDatar L1 = new Lingkaran(7, "Hijau", "Kuning");
        Lingkaran L2 = new Lingkaran(14, "Ungu", "Abu");

        // Pemanggilan method

        System.out.println("=== PERSEGI ===");
        P1.printInfo();
        P2.printInfo();

        System.out.println("\n=== LINGKARAN ===");
        L1.printInfo();
        L2.printInfo();

        // Perbandingan luas & keliling

        System.out.println("\nPerbandingan Luas:");
        System.out.println("P1 vs P2: " + P1.isEqualLuas(P2));
        System.out.println("P1 vs L1: " + P1.isEqualLuas(L1));

        System.out.println("\nPerbandingan Keliling:");
        System.out.println("P1 vs P2: " + P1.isEqualKeliling(P2));
        System.out.println("P1 vs L1: " + P1.isEqualKeliling(L1));

        // Jawaban Analisis (No 5)

        // Apakah method isEqualLuas() dan isEqualKeliling() dapat digunakan
        // untuk membandingkan objek bangun datar yang berbeda?
        // Jawaban:
        // Ya, method tersebut dapat digunakan untuk membandingkan objek bangun datar
        // yang berbeda bentuk (misalnya Persegi dan Lingkaran), karena yang dibandingkan
        // adalah nilai luas dan kelilingnya (tipe double), bukan jenis objeknya.

        // Jika BangunDatar tidak dijadikan sebagai abstract class,
        // dapatkah membuat method isEqualLuas() dan isEqualKeliling()?
        // Jawaban:
        // Bisa, namun kurang tepat. Karena method getLuas() dan getKeliling()
        // tidak memiliki implementasi umum yang sama untuk semua bangun datar.
        // Jika BangunDatar bukan abstract, maka harus memberikan implementasi
        // default yang tidak bermakna atau tidak sesuai.

        // Apa kelebihan BangunDatar dijadikan abstract class?
        // Jawaban:
        // 1. Mencegah pembuatan objek BangunDatar secara langsung.
        // 2. Memaksa setiap subclass (Persegi, Lingkaran) untuk mengimplementasikan
        //    method getLuas() dan getKeliling().
        // 3. Mendukung konsep satu reference untuk banyak bentuk objek.
        // 4. Desain program menjadi lebih rapi, dan jelas.

        // Percobaan IResize

        System.out.println("\n=== RESIZE PERSEGI ===");
        P2.printInfo();
        P2.zoomIn();
        System.out.println("Setelah zoomIn:");
        P2.printInfo();

        P2.zoomOut();
        System.out.println("Setelah zoomOut:");
        P2.printInfo();

        P2.zoom(200);
        System.out.println("Setelah zoom 200%:");
        P2.printInfo();


        System.out.println("\n=== RESIZE LINGKARAN ===");
        L2.printInfo();
        L2.zoomIn();
        System.out.println("Setelah zoomIn:");
        L2.printInfo();

        L2.zoomOut();
        System.out.println("Setelah zoomOut:");
        L2.printInfo();

        L2.zoom(50);
        System.out.println("Setelah zoom 50%:");
        L2.printInfo();

        // Hasil percobaan:
        // Method zoomIn() memperbesar ukuran objek sebesar 10%.
        // Method zoomOut() memperkecil ukuran objek sebesar 10%.
        // Method zoom(percent) mengubah ukuran sesuai persentase yang diberikan.
        // Perubahan ukuran mempengaruhi nilai luas dan keliling.

        // Jawaban Analisis Interface

        // Apa keuntungan menggunakan interface IResize dibanding abstract method di BangunDatar?
        // Jawaban:
        // 1. Interface lebih fleksibel karena dapat diimplementasikan oleh berbagai kelas
        //    yang tidak harus memiliki hubungan pewarisan (misalnya Garis, Bangun3D, dll).
        // 2. Tidak semua BangunDatar perlu memiliki kemampuan resize, sehingga lebih tepat
        //    jika dipisahkan dalam interface.
        // 3. Mendukung konsep multiple inheritance (satu kelas bisa implement banyak interface).
        // 4. Desain program menjadi lebih modular dan tidak memaksa semua subclass
        //    BangunDatar memiliki method resize.
    }
}