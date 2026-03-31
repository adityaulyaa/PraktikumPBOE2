/**
 * File    : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 * Pembuat      : Aditya Sultonul Ulya
 * NIM          : 240601214120006
 */

// class lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

// Yang Kurang Tepat
// 1. Penempatan Asersi yang Kurang Tepat
// Asersi seharusnya digunakan untuk memeriksa kondisi yang seharusnya selalu benar selama pengembangan dan debugging, bukan untuk memvalidasi input pengguna atau menangani kesalahan yang mungkin terjadi dalam kondisi normal.
// Pada program ini, asersi digunakan untuk memeriksa apakah jariJari > 0. Jika jari-jari bernilai 0 atau negatif, asersi akan aktif dan program berhenti. Namun:
// Jari-jari = 0 adalah nilai yang mungkin saja diberikan (misalnya dari input pengguna atau hasil perhitungan lain).
// Jika asersi dinonaktifkan (default Java), program akan tetap berjalan meskipun jari-jari = 0, dan menghasilkan keliling = 0
// Penggunaan asersi seharusnya digantikan dengan exception handling (seperti IllegalArgumentException) untuk validasi input atau kondisi yang mungkin terjadi.

// 2. Asersi Tidak Boleh Digunakan untuk Validasi Parameter Publik
// Harsnya:
// Asersi sebaiknya digunakan untuk memeriksa kondisi program yang seharusnya tidak terjadi jika kode benar.
// Untuk validasi parameter metode publik atau input dari luar (termasuk dari pengguna atau file), sebaiknya menggunakan exception (seperti IllegalArgumentException).
// kode diatas, nilai jariJari diberikan secara langsung di dalam kode (double jariJari = 0;), tetapi jika nantinya nilai tersebut berasal dari input pengguna, asersi tidak akan menjamin keamanan program karena asersi bisa dinonaktifkan.