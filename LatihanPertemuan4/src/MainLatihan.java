// Main.java

import java.time.LocalDate;

public class MainLatihan {

    public static void main(String[] args) {

        DosenTetap dt = new DosenTetap(
                "1987654321",
                "Dr. Budi",
                LocalDate.of(1975,5,10),
                LocalDate.of(2005,3,1),
                5000000,
                "Fakultas Sains dan Matematika",
                "012345"
        );

        DosenTamu dta = new DosenTamu(
                "198999999",
                "Dr. Andi",
                LocalDate.of(1980,8,12),
                LocalDate.of(2022,1,1),
                4000000,
                "Fakultas Sains dan Matematika",
                "987654",
                LocalDate.of(2026,12,31)
        );

        Tendik tk = new Tendik(
                "199111111",
                "Siti",
                LocalDate.of(1985,2,15),
                LocalDate.of(2010,4,1),
                3500000,
                "Akademik"
        );

        dt.printInfo();
        System.out.println();

        dta.printInfo();
        System.out.println();

        tk.printInfo();
    }
}