// Nama File    : MMahasiswa.java
// Deskripsi    : Berisi program main
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 05/03/2026

public class MMahasiswa {
    public static void main(String[] args) {
        Matakuliah PBO = new Matakuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        Matakuliah MBD = new Matakuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("032", "Citra", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("123", "Honda");

        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS = " + M1.getJumlahSKS());
    }
}
