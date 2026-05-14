// Nama File    : Datum.java
// Deskripsi    : Berisi atribut dan method dalam class Datum
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

//  KELAS GENERIK DATUM 
// JAWABAN 2: Kelas generic dengan parameter tipe T
public class Datum<T> {
    private T isi; 
    
    // Konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }
    
    public Datum() {
        this.isi = null;
    }
    
    public T getIsi() {
        return isi;
    }
    
    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
    
    public void tampilkanTipe() {
        if (isi != null) {
            System.out.println("Tipe data isi: " + isi.getClass().getSimpleName());
        } else {
            System.out.println("Isi masih kosong (null)");
        }
    }
}