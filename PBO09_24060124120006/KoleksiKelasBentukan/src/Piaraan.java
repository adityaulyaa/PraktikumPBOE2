// Nama File    : Piaraan.java
// Deskripsi    : Kelas untuk mengelola antrean hewan menggunakan Queue
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 30/04/2026

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    // Atribut
    private int nbelm;                   
    private Queue<Anabul> Lanabul;
    
    // Konstruktor
    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }
    
    // i. getNbelm()
    public int getNbelm() {
        this.nbelm = Lanabul.size();
        return nbelm;
    }
    
    // ii. enqueueAnabul(anabul)
    // Menambah elemen di akhir antrean
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        System.out.println(" Antrean masuk: " + anabul.getPanggilan() + 
                           " (" + anabul.getClass().getSimpleName() + ")");
    }
    
    // iii. isMember(anabul)
    // Memeriksa apakah anabul ada dalam antrean
    public boolean isMember(Anabul anabul) {
        boolean ada = Lanabul.contains(anabul);
        if (ada) {
            System.out.println(anabul.getPanggilan() + " sedang dalam antrean");
        } else {
            System.out.println(anabul.getPanggilan() + " TIDAK dalam antrean");
        }
        return ada;
    }
    
    // iv. getAnabul()
    // Mengambil data anabul pertama dalam antrean (tanpa menghapus)
    public Anabul getAnabul() {
        Anabul first = Lanabul.peek();
        if (first != null) {
            System.out.println("Antrean pertama: " + first.getPanggilan() + 
                               " (" + first.getClass().getSimpleName() + ")");
        } else {
            System.out.println("Antrean kosong!");
        }
        return first;
    }
    
    // v. dequeueAnabul()
    // Mengambil anabul pertama sekaligus mengeluarkannya dari antrean
    public Anabul dequeueAnabul() {
        Anabul removed = Lanabul.poll();
        if (removed != null) {
            System.out.println(" Antrean keluar: " + removed.getPanggilan() + 
                               " (" + removed.getClass().getSimpleName() + ")");
        } else {
            System.out.println("Antrean kosong, tidak ada yang dikeluarkan!");
        }
        return removed;
    }
    
    // c. showAnabul()
    // Menampilkan nama-nama panggilan para Anabul dalam antrean
    public void showAnabul() {
        System.out.println("\n===== ANTREAN HEWAN =====");
        if (Lanabul.isEmpty()) {
            System.out.println("(Antrean kosong)");
        } else {
            System.out.println("Total antrean: " + getNbelm());
            System.out.println("-----------------------");
            int urutan = 1;
            for (Anabul a : Lanabul) {
                System.out.println(urutan + ". " + a.getPanggilan() + 
                                   " (" + a.getClass().getSimpleName() + ")");
                urutan++;
            }
            System.out.println("-----------------------");
        }
    }
    
    // d. countKucing()
    // Menghitung banyak keluarga kucing dalam antrean (Kucing, Anggora, Kembangtelon)
    public int countKucing() {
        int jumlah = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                jumlah++;
            }
        }
        System.out.println("Jumlah keluarga Kucing dalam antrean: " + jumlah);
        return jumlah;
    }
    
    // e. bobotKucing()
    // Menghitung total bobot keluarga kucing dalam antrean
    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        System.out.println("Total bobot semua Kucing: " + totalBobot + " kg");
        return totalBobot;
    }
    
    // f. showJenisAnabul()
    // Menampilkan nama panggilan dan jenis objek (gunakan getClass().getName())
    public void showJenisAnabul() {
        System.out.println("\n===== JENIS ANABUL DALAM ANTREAN =====");
        if (Lanabul.isEmpty()) {
            System.out.println("(Antrean kosong)");
        } else {
            System.out.println("Total antrean: " + getNbelm());
            System.out.println("----------------------------------------");
            int urutan = 1;
            for (Anabul a : Lanabul) {
                // Menggunakan getClass().getName() untuk mendapatkan nama lengkap kelas
                String namaKelas = a.getClass().getName();
                String namaSederhana = a.getClass().getSimpleName();
                System.out.println(urutan + ". Panggilan: " + a.getPanggilan());
                System.out.println("   Nama lengkap kelas: " + namaKelas);
                System.out.println("   Jenis: " + namaSederhana);
                System.out.println("----------------------------------------");
                urutan++;
            }
        }
    }
}