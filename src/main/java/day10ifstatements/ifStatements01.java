package day10ifstatements;

import java.util.Scanner;

public class ifStatements01 {
    public static void main(String[] args) {

        //Ornek: Verilen bir sayinin pozitif, negatif ya da notr oldugunu kontrol eden kodu yaziniz.


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int num = input.nextInt();

        //3 senaryo var burada. pozitif, negatif, nötr. Once if kalibini olusturalim:

        if (num > 0) {
            System.out.println("Pozitif");

        } else if (num < 0) {
            System.out.println("Negatif");

        } else {
            System.out.println("Notr");

        }

        //2 den fazla senaryolar icin else if else kullaniriz


    }

}
