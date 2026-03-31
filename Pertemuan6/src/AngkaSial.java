/**
 * File        : AngkaSial.java
 * Deskripsi   : Program untuk mendemonstrasikan penggunaan eksepsi buatan sendiri
 *               dengan klausa throw dan throws
 * Pembuat      : Aditya Sultonul Ulya
 * NIM          : 240601214120006
 * 
 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);  // baris yang akan menyebabkan eksepsi
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// 1. Apakah baris 12 pada AngkaSial.java dieksekusi?
// Jawaban:    TIDAK dieksekusi untuk angka yang menyebabkan eksepsi (angka 13), tetapi dieksekusi untuk angka-angka sebelumnya (10).
//             Ketika method cobaAngka(13) dipanggil, kondisi if (angka == 13) bernilai true
//             Program langsung mengeksekusi throw new AngkaSialException()
//             Eksepsi dilempar, sehingga eksekusi dalam method cobaAngka berhenti dan tidak melanjutkan ke baris berikutnya
//             Baris System.out.println(angka + " bukan angka sial"); dilewati (tidak dieksekusi) untuk angka 13

// 2. Apakah baris 21 pada AngkaSial.java dieksekusi?
// Jawaban:    YA, baris 21 dieksekusi
//             Baris 21 berada di dalam blok catch (AngkaSialException ase)
//             Ketika eksepsi terjadi (pada pemanggilan as.cobaAngka(13)), program langsung keluar dari blok try dan masuk ke blok catch
//             Blok catch akan mengeksekusi semua pernyataan di dalamnya, termasuk:
//             System.out.println(ase.getMessage()); (baris 20)
//             System.out.println("hati-hati memasukkan angka!!!"); (baris 21)