/**
 * File        : ExceptionOnArray.java
 * Deskripsi   : Program untuk menunjukkan penggunaan eksepsi menggunakan class library java
 * Pembuat      : Aditya Sultonul Ulya
 * NIM          : 240601214120006
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}