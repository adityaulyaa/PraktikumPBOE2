// Nama File    : Dosen.java
// Deskripsi    : Berisi atribut dan method dalam class DosenTetap
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 12/03/2026

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {

    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                      double gajiPokok, String fakultas, String nidn) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerja() * gajiPokok;
    }

    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo(){
        System.out.println("===== DOSEN TETAP =====");

        Period masaKerja = getMasaKerjaDetail();

        int tahun = masaKerja.getYears();
        int bulan = masaKerja.getMonths();

        double tunjangan = 0.02 * tahun * gajiPokok;

        System.out.println("NIP               : " + NIP);
        System.out.println("NIDN              : " + nidn);
        System.out.println("Nama              : " + Nama);
        System.out.println("Tanggal Lahir     : " + formatTanggal(tanggalLahir));
        System.out.println("TMT               : " + formatTanggal(TMT));
        System.out.println("Jabatan           : Dosen Tetap");
        System.out.println("Fakultas          : " + Fakultas);

        System.out.println("Masa Kerja        : " + tahun + " tahun " + bulan + " bulan");

        System.out.println("Tanggal Pensiun   : " + formatTanggal(getTanggalPensiun()));

        System.out.println("Gaji Pokok        : " + formatRupiah(gajiPokok));

        System.out.println(
            "Tunjangan         : 2% x " + tahun +
            " x " + formatRupiah(gajiPokok) +
            " = " + formatRupiah(tunjangan)
        );
    }
}