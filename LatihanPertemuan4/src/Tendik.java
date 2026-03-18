// Nama File    : Dosen.java
// Deskripsi    : Berisi atribut dan method dalam class Tendik
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 12/03/2026

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {

    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                  double gajiPokok, String bidang) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public double getTunjangan() {
        return 0.01 * getMasaKerja() * gajiPokok;
    }

    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {

        System.out.println("===== TENAGA KEPENDIDIKAN =====");

        Period mk = getMasaKerjaDetail();
        int tahun = mk.getYears();
        int bulan = mk.getMonths();

        double tunjangan = 0.01 * tahun * gajiPokok;

        System.out.println("NIP               : " + NIP);
        System.out.println("Nama              : " + Nama);
        System.out.println("Tanggal Lahir     : " + formatTanggal(tanggalLahir));
        System.out.println("TMT               : " + formatTanggal(TMT));
        System.out.println("Jabatan           : Tendik");
        System.out.println("Bidang            : " + bidang);

        System.out.println("Masa Kerja        : " + tahun + " tahun " + bulan + " bulan");

        System.out.println("Tanggal Pensiun   : " + formatTanggal(getTanggalPensiun()));

        System.out.println("Gaji Pokok        : " + formatRupiah(gajiPokok));

        System.out.println(
            "Tunjangan         : 1% x " + tahun +
            " x " + formatRupiah(gajiPokok) +
            " = " + formatRupiah(tunjangan)
        );
    }
}