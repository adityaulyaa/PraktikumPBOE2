// Nama File    : Data.java
// Deskripsi    : Kelas generik dengan array statik 100 elemen
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

public class Data<T> {
    // Atribut: larik statik berisi 100 elemen generik
    private T[] ruang;
    private int banyak;  // menyatakan banyaknya elemen efektif
    
    // Konstruktor
    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[100];  // array statik 100 elemen
        this.banyak = 0;
    }
    
    // JAWABAN 4a: Fungsi getIsi
    // Mengembalikan nilai elemen generik pada posisi tertentu (1..100)
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return ruang[posisi - 1];  // posisi 1 = indeks 0
        } else {
            System.out.println("Error: Posisi harus antara 1-100!");
            return null;
        }
    }
    
    // JAWABAN 4a: Prosedur setIsi
    // Mengisi elemen pada posisi ruang yang tepat
    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null) {
                // Jika posisi sebelumnya kosong, tambah banyak
                banyak++;
            }
            ruang[posisi - 1] = objek;
            System.out.println("✓ Berhasil mengisi posisi " + posisi + " dengan: " + objek);
        } else {
            System.out.println("Error: Posisi harus antara 1-100!");
        }
    }
    
    // JAWABAN 4a: Fungsi getSize
    // Mengembalikan banyaknya elemen yang telah terisi
    public int getSize() {
        // Hitung ulang elemen yang tidak null
        int hitung = 0;
        for (int i = 0; i < ruang.length; i++) {
            if (ruang[i] != null) {
                hitung++;
            }
        }
        banyak = hitung;
        return banyak;
    }
    
    // Method tambahan: menampilkan semua isi (untuk debugging)
    public void tampilkanSemua() {
        System.out.println("\n===== ISI SELURUH DATA =====");
        System.out.println("Total elemen efektif: " + getSize());
        for (int i = 0; i < ruang.length; i++) {
            if (ruang[i] != null) {
                System.out.println("Posisi " + (i+1) + ": " + ruang[i]);
            }
        }
    }
}