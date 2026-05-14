// Nama File    : Teman.java
// Deskripsi    : Berisi atribut dan method dalam class Teman
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 07/05/2026

import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    // a. getNbelm()
    // Mengembalikan banyaknya elemen dalam list
    public int getNbelm() {
        this.nbelm = Lnama.size();
        return nbelm;
    }

    //  b. getNama(indeks) 
    // Mengembalikan nama pada indeks tertentu (0-based)
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            return Lnama.get(indeks);
        } else {
            System.out.println("Error: Indeks " + indeks + " tidak valid!");
            return null;
        }
    }

    //  c. setNama(indeks, nama) 
    // Mengubah nama pada posisi indeks tertentu
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            String namaLama = Lnama.get(indeks);
            Lnama.set(indeks, nama);
            System.out.println("Berhasil mengubah \"" + namaLama + "\" menjadi \"" + nama + "\"");
        } else {
            System.out.println("Error: Indeks " + indeks + " tidak valid!");
        }
    }

    //  d. addNama(nama) 
    // Menambahkan nama baru ke dalam list
    public void addNama(String nama) {
        this.Lnama.add(nama);
        this.nbelm++;
        System.out.println("Berhasil menambahkan \"" + nama + "\"");
    }

    //  e. delNama(nama) 
    // Menghapus nama dari list (hapus yang pertama ditemukan)
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            System.out.println(" Berhasil menghapus \"" + nama + "\"");
        } else {
            System.out.println(" \"" + nama + "\" tidak ditemukan!");
        }
    }

    //  f. isMember(nama) 
    // Memeriksa apakah nama ada dalam list
    public boolean isMember(String nama) {
        boolean ada = Lnama.contains(nama);
        if (ada) {
            System.out.println("\"" + nama + "\" adalah anggota teman");
        } else {
            System.out.println("\"" + nama + "\" BUKAN anggota teman");
        }
        return ada;
    }

    //  g. gantiNama(nama, namabaru) 
    // Mengganti nama lama dengan nama baru
    public void gantiNama(String namaLama, String namaBaru) {
        int indeks = Lnama.indexOf(namaLama);
        if (indeks != -1) {
            Lnama.set(indeks, namaBaru);
            System.out.println(" Berhasil mengganti \"" + namaLama + "\" menjadi \"" + namaBaru + "\"");
        } else {
            System.out.println(" \"" + namaLama + "\" tidak ditemukan!");
        }
    }

    //  h. countNama(nama) 
    // Menghitung berapa kali nama muncul dalam list
    public int countNama(String nama) {
        int jumlah = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                jumlah++;
            }
        }
        System.out.println("Nama \"" + nama + "\" muncul sebanyak " + jumlah + " kali");
        return jumlah;
    }

    //  i. showTeman() 
    // Menampilkan semua nama teman dalam Lnama
    public void showTeman() {
        System.out.println("\n===== DAFTAR TEMAN =====");
        if (Lnama.isEmpty()) {
            System.out.println("(Belum ada teman)");
        } else {
            System.out.println("Total teman: " + getNbelm());
            System.out.println("-----------------------");
            for (int i = 0; i < Lnama.size(); i++) {
                System.out.println((i+1) + ". " + Lnama.get(i));
            }
            System.out.println("-----------------------");
        }
    }
}