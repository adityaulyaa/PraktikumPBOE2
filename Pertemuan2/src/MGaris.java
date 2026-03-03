// Nama File    : MGaris.java
// Deskripsi    : Main class untuk menguji class Garis
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 02/03/2026

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        G1.printGaris();

        Titik A = new Titik(2, 3);
        Titik B = new Titik(6, 7);

        Garis G2 = new Garis(A, B);
        G2.printGaris();

        System.out.println("Panjang G2: " + G2.getPanjang());
        System.out.println("Gradien G2: " + G2.getGradien());

        Titik tengah = G2.getTitikTengah();
        System.out.print("Titik Tengah G2: ");
        tengah.printTitik();

        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());

        // Uji sejajar dan tegak lurus
        Titik C = new Titik(0, 0);
        Titik D = new Titik(4, 4);
        Garis G3 = new Garis(C, D);

        System.out.println("G2 sejajar G3? " + G2.isSejajar(G3));
        System.out.println("G2 tegak lurus G3? " + G2.isTegakLurus(G3));

        Titik P1 = new Titik(-2 , 0);
        Titik P2 = new Titik(0,4);

        Garis G4 = new Garis(P1,P2);

        System.out.println(G4.getPersamaanGaris());
    }
}
