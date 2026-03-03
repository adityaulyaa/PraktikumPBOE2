// Nama File    : Garis.java
// Deskripsi    : Berisi atribut dan method dalam class Garis
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 02/03/2026

public class Garis {

    /************************** 1. ATRIBUT **************************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /************************** 2. METHOD **************************/

    // a. Konstruktor tanpa parameter
    public Garis(){
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    // b. Konstruktor dengan parameter
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // c. Getter dan setter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // d. Menghitung panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // e. Menghitung gradien
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx; // hati-hati jika dx = 0 (garis vertikal)
    }

    // f. Menghitung titik tengah
    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    // g. Mengecek sejajar
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // h. Mengecek tegak lurus
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // i. Menampilkan garis
    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // j. Menaampilkan persamaan garis dalam bentuk string y = mx + c.
    public String getPersamaanGaris(){
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        double dx = x2 - x1;
        double dy = y2 - y1;

        if (dx == 0){
            return "x = " + x1;
        }

        double m = dy / dx;
        double c = y1 - m * x1;

        return "y = " + m + "x + " + c;
    }
}