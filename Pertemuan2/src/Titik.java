// Nama File    : Titik.java
// Deskripsi    : Berisi atribut dan method dalam class titik
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 19/02/2026

public class Titik {
    /************************** ATRIBUT **************************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /************************** METHOD **************************/
    // konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    // mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // menggeser absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    // menggeser ordinat titik dengan nilai baru x
    public void setOdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    public int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis < 0 && ordinat < 0){
            return 3;
        }
        else{
            return 4;
        }
    }

    public double jarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public double getJarak(Titik T){
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
}

// end class titik