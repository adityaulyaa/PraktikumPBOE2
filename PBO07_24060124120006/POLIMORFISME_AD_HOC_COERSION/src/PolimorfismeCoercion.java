// Nama File    : PolimorfismeCoercion.java
// Deskripsi    : Berisi program dari Polimorfisme Ad Hoc Coercion
// Pembuat      : Aditya Sultonul Ulya
// Tanggal      : 27/04/2026

public class PolimorfismeCoercion {
    public static void main(String[] args) {
        
        System.out.println("========== JAWABAN A ==========");
        // Jawaban a: Konversi nilai 65 ke berbagai tipe
        int nilaiInt = 65;
        
        // Tampil sebagai integer
        System.out.println("Sebagai integer: " + nilaiInt);
        
        // Tampil sebagai karakter 
        char nilaiChar = (char) nilaiInt;
        System.out.println("Sebagai karakter: " + nilaiChar);
        
        // Tampil sebagai real 
        double nilaiDouble = (double) nilaiInt;
        System.out.println("Sebagai real: " + nilaiDouble);
        
        // String ke integer
        String strAngka = "100";
        int hasilParseInt = Integer.parseInt(strAngka);
        System.out.println("String '100' ke integer: " + hasilParseInt);
        
        // String ke double
        double hasilParseDouble = Double.parseDouble(strAngka);
        System.out.println("String '100' ke double: " + hasilParseDouble);
        
        // Integer ke String
        int angka = 200;
        String hasilToString = Integer.toString(angka);
        System.out.println("Integer 200 ke string: '" + hasilToString + "'");
        
        System.out.println("\n========== JAWABAN B ==========");
        // Jawaban b: Integer -> Real -> Integer kembali
        int angkaAsli = 65;
        double angkaReal = (double) angkaAsli;  
        System.out.println("Integer 65 menjadi real: " + angkaReal);
        
        int angkaKembali = (int) angkaReal;     
        System.out.println("Real " + angkaReal + " kembali ke integer: " + angkaKembali);
        
        System.out.println("\n========== JAWABAN C ==========");
        // Jawaban c: String X="1234", Y="5678"
        String X = "1234";
        String Y = "5678";
        
        // Konkatenasi 
        String S = X + Y;
        System.out.println("Konkatenasi X + Y = \"" + S + "\"");
        
        // Penjumlahan angka
        int Xint = Integer.parseInt(X);
        int Yint = Integer.parseInt(Y);
        Integer Z = Xint + Yint;  
        System.out.println("Penjumlahan X + Y = " + Z);
        
        System.out.println("\n========== JAWABAN D ==========");
        // Jawaban d: String P="12.34", Q="56.78"
        String P = "12.34";
        String Q = "56.78";
        
        // Konkatenasi
        String R = P + Q;
        System.out.println("Konkatenasi P + Q = \"" + R + "\"");
        
        // Penjumlahan angka double
        double Pdouble = Double.parseDouble(P);
        double Qdouble = Double.parseDouble(Q);
        Double D = Pdouble + Qdouble;  
        System.out.println("Penjumlahan P + Q = " + D);
        
        System.out.println("\n========== JAWABAN E ==========");
        // Jawaban e: Konversi nilai S ke Integer
        // S dari jawaban c = "12345678"
        Integer A = Integer.parseInt(S);
        System.out.println("Objek Integer A dari konversi nilai S \"" + S + "\" = " + A);
        
        System.out.println("\n========== JAWABAN F ==========");
        // Jawaban f: Konversi nilai A ke String
        String T = Integer.toString(A);
        System.out.println("Objek String T dari konversi nilai A " + A + " = \"" + T + "\"");
    }
}