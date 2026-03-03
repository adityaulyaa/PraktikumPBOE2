// Nama File    : MTitik.java
// Deskripsi    : Berisi atribut dan method dalam class titik
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 19/02/2026

public class MTitik {
    public static void main(String[] args) {
        // Titik T1 = new Titik();     // membuat objek titik T1(0,0)
        // T1.setAbsis(3);         // mengubah absis T1 dengan nilai 3
        // T1.setOdinat(4);        // mengubah ordinat T1 dengan nilai 4
        // T1.printTitik();            // mencetak koordinat T1 ke layar
        // T1.geser(3, 4);         // menggeser T1 sejauh (3,4)
        // T1.printTitik();            // mencetak koordinat T1 setelah di geser
        
        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOdinat(10);
        // T2.printTitik();
        

        Titik T1 = new Titik();
        T1.printTitik();
        Titik T2 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        System.out.println("Kuadran T2: " + T2.getKuadran());
        System.out.println("Jarak ke pusat: " + T2.jarakPusat());

        Titik T3 = new Titik(6,8);
        System.out.println("Jarak T2 ke T3: " + T2.getJarak(T3));

        Titik refX = T2.getRefleksiX();
        refX.printTitik();

        Titik refY = T2.getRefleksiY();
        refY.printTitik();
    }
}