package day10ifstatements;

import java.util.Scanner;

public class NestedIfSuleymanHoca {
    public static void main(String[] args) {


        //Nested If: Ic ice gecmis "If Statement" lar
        /*
        Kullanicidan bir sayi alin.
        Eger sayi pozitif ise; 10'dan buyuk olup olmadigini kontrol edin
        Eger 10'dan buyuk ise "Buyuksun!" yazdirin
        Eger 10'dan kucuk veya esit ise "Normalsin!" yazdirin

        Eger sayi pozitif degil ise; -10 dan buyuk olup olmadigini kontrol edin
        Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        Eger -10 dan kucuk veya esit ise "Cok Nsin!" yazdirin

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int s = input.nextInt();

        if (s > 0) {
            if (s > 10) {
                System.out.println("Buyuksun!");
            } else {
                System.out.println("Normalsin!");

            }

        } else {
            if (s > -10) {
                System.out.println("Negatifsin!");
            } else {
                System.out.println("Cok Negatifsin");
            }
        }

        /*
        Ornek:  Kullanicidan cinsiyetini girmesini isteyin

               Erkek ise yasini kontrol edin.
               Yasi 18 den kucuk ise ekrana "Erkek Cocuk" yazdirin
               Yasi 18 den buyuk ise ekrana "Adam" yazdirin

               Kadin ise yasini kontrol edin.
               Yasi 18 den kucuk ise ekrana "Kız Cocuk" yazdirin
               Yasi 18 den buyuk ise ekrana "Kadin" yazdirin



         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz: Erkek/Kadin");
        String c = scan.next();

        System.out.println("Yasinizi giriniz");
        int y = scan.nextInt();

        if (c.equalsIgnoreCase("Erkek")) {
            if (y < 18) {
                System.out.println("Erkek Cocuk");
            } else {
                System.out.println("Adam");
            }
        } else if (c.equalsIgnoreCase("Kadin")) {
            if (y < 18) {
                System.out.println("Kiz Cocuk");
            } else {
                System.out.println("Kadin");
            }

        } else {
            System.out.println("Bu cinsiyet tanimli degil");
        }

        /*
        Ornek:  Kullanicidan bir harf girmesini isteyin.

                Girdigi harf kucuk harf ise harfin "a" olup olmadigini kontrol edin.
                Harf "a" ise ekrana "Ilk kucuk harf" yazdirin
                "a" degil ise ekrana "Ilk kucuk harf degil" yazdirin

                Girdigi buyuk harf ise harfin "Z" olup olmadigini kontrol edin.
                Harf "Z" ise ekrana "Son buyuk harf" yazdirin
                "Z" degil ise ekrana "Son buyuk harf degil" yazdirin


         */

        Scanner scaN = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char h = scaN.next().charAt(0);


        if (h >= 'a' && h <= 'z') {
            if (h == 'a') {
                System.out.println("Ilk kucuk harf");
            } else {
                System.out.println("Ilk kucuk harf degil");
            }
        } else if (h >= 'A' && h <= 'Z') {
            if (h == 'Z') {
                System.out.println("Son buyuk harf");
            } else {
                System.out.println("Son buyuk harf degil");
            }

        } else {
            System.out.println("Lutfen harf giriniz");
        }


        scan.close();






















    }
}
