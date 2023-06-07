package day09ifstatements;

import java.util.Scanner;

public class IfStatment02SuleymanHoca {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi aliniz
        Eger tamsayi 0 dan kucuk ise ekrana "Negatif" yazdirin
        0 ise ekrana "Notr" yazdirin
        0 dan buyuk ise ekrana "Pozitif" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        if (sayi < 0) {
            System.out.println("Negatif");

        } else if (sayi == 0) {
            System.out.println("Notr");

        } else {
            System.out.println("Pozitif");

        }

        /*
        Ornek: Kullanicidan bir ucgenin uc kenar uzunlugunu alın. Eger
               Uc kenar uzunlugu birbirine esit ise ekrana "Eskenar Ucgen"
               Sadece 2 kenar uzunlugu birbirine esit ise ekrana "Ikızkenar Ucgen"
               Tum kenar uzunluklari birbirinden farkli ise ekrana "Cesitkenar Ucgen" yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        if (a == b && b == c && a == c) {
            System.out.println("Eskenar Ucgen");

        } else if (a == b || b == c || a == c) {
            System.out.println("Ikızkenar Ucgen");

        } else if (a != b && b != c && a != c) {
            System.out.println("Cesitkenar Ucgen");

        }

        /*
        Kullanicidan notunu alin ve asagidaki kurallara gore ekrana A,B,C veya D yazdirin
        1. 50 den az -D  2. 50(dahil) ile 60 arasi  C-  3. 60(dahil) ile 80 arasi -B  4. 80(dahil) ile 100(dahil)  -A

         */

        Scanner scaN = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not = scaN.nextInt();

        if (not < 0) {
            System.out.println("Sana not gir dedik");
        } else if (not < 50) {
            System.out.println("D");

        } else if (not < 60) {
            System.out.println("C");
        } else if (not < 80) {
            System.out.println("B");

        } else if (not <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Sana not gir dedik");
        }



        Scanner inpuT = new Scanner(System.in);
        System.out.println("Yil giriniz");
        int yil = input.nextInt();

        if(yil<=0){
            System.out.println("Negatif veya sifir yil olarak kabul edilmez");
        }else
        if (yil % 1000 == 0) {
            System.out.println("Milenyum");

        } else if (yil % 100 == 0) {
            System.out.println("Yuzyil");

        } else if (yil % 10 == 0) {
            System.out.println("Onyil");

        }else {
            System.out.println("Hicbiri");
        }


    }
}
