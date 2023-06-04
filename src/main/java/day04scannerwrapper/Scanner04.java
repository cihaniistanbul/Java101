package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunuz aliniz
        //a)Alaninin hesaplayiniz -->kisa kenar * uzun kenar
        //b)Cevresini hesaplayiniz -->2*kisa kenar + 2*uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz..");
        double shortSide = input.nextDouble();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz...");
        double longSide = input.nextDouble();

        System.out.println(shortSide*longSide);

        System.out.println(2*shortSide+2*longSide);


    }
}
