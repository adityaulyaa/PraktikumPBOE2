// Nama File    : Dosen.java
// Deskripsi    : Berisi atribut dan method dalam class DosenTamu
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 12/03/2026

import java.time.LocalDate;

public class DosenTamu extends Dosen {

    private String nidk;
    private LocalDate akhirKontrak;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                     double gajiPokok, String fakultas, String nidk, LocalDate akhirKontrak) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("===== DOSEN TAMU =====");

        System.out.println("NIP               : " + NIP);
        System.out.println("NIDK              : " + nidk);
        System.out.println("Nama              : " + Nama);
        System.out.println("Tanggal Lahir     : " + formatTanggal(tanggalLahir));
        System.out.println("TMT               : " + formatTanggal(TMT));
        System.out.println("Jabatan           : Dosen Tamu");
        System.out.println("Fakultas          : " + Fakultas);

        System.out.println("Akhir Kontrak     : " + formatTanggal(akhirKontrak));
        System.out.println("Gaji Pokok        : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan         : 2.5% x " + formatRupiah(gajiPokok)
            + " = " + formatRupiah(getTunjangan()));
    }
}