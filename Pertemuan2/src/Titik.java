// Nama File    : Titik.java
// Deskripsi    : Berisi atribut dan method dalam class titik
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 19/02/2026

public class Titik {
    /************************** ATRIBUT **************************/
    double absis;
    double ordinat;

    /************************** METHOD **************************/
    // konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    // mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // menggeser absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // menggeser ordinat titik dengan nilai baru x
    void setOdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}

// end class titik
