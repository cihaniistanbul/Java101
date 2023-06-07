package day09ifstatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        /*


        //Ornek 1: Sayi uc basamakli ise ekrana "Sayi uc basamaklidir!" yazdirin
        int number = -123;
        number = Math.abs(number);

        if (number > 99 && number < 1000) {
            System.out.println("Sayi uc basamaklidir");

        }


        //Ornek 2: Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz
        //abbccdc --> a,d (burada tekrarsiz olanlar a,d)

        String str = "aac";

        char ch1 = str.charAt(0);
        if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

        char ch2 = str.charAt(1);
        if (str.indexOf(ch2) == str.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        char ch3 = str.charAt(2);
        if (str.indexOf(ch3) == str.lastIndexOf(ch3)) {
            System.out.println(ch3);
        }


        //Ornek: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu ekrana yazdiran kodu olusturunuz

        //kullanicidan data alacagimiz icin Scanner Class olusturalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayi");
        }


        //Ornek: Kullanicinin vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        //       kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu olusturunuz

        System.out.println("Bir character giriniz");
        char chr = scan.next().charAt(0);

        if (chr >= 'A' && chr < 'Z') {
            System.out.println("Buyuk Harf");
        } else if (chr > 'a' && chr < 'z') {
            System.out.println("Kucuk Harf");
        } else {
            System.out.println("Gecersiz islem");
        }

        /*
        Kullanicidan bir sayi aliniz
        Eger tamsayi 0 dan kucuk ise ekrana "Negatif" yazdirin
        0 ise ekrana "Notr" yazdirin
        0 dan buyuk ise ekrana "Pozitif" yazdirin
         */


        /*


        System.out.println("Tamsayi giriniz");
        int tams = scan.nextInt();

        if (tams < 0) {
            System.out.println("Negatif");
        } else if (tams == 0) {
            System.out.println("Notr");
        } else {
            System.out.println("Pozitif");
        }*/

       /*
        Ornek: Kullanicidan bir ucgenin uc kenar uzunlugunu alın. Eger
               Uc kenar uzunlugu birbirine esit ise ekrana "Eskenar Ucgen"
               Sadece 2 kenar uzunlugu birbirine esit ise ekrana "Ikızkenar Ucgen"
               Tum kenar uzunluklari birbirinden farkli ise ekrana "Cesitkenar Ucgen" yazdirin



        System.out.println("Uc kenar uzunlugu giriniz");
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        int k3 = scan.nextInt();


        if (k1 == k2 && k2 == k3 && k1 == k3) {
            System.out.println("Eskenar Ucgen");
        } else if (k1 == k2 || k1 == k3 || k2 == k3) {
            System.out.println("Ikızkenar Ucgen");
        } else if (k1!=k2 && k1!=k3 && k2!=k3) {
            System.out.println("Cesitkenar ucgen");
        }
 */

        /*
        Kullanicidan notunu alin ve asagidaki kurallara gore ekrana A,B,C veya D yazdirin
        1. 50 den az -D  2. 50(dahil) ile 60 arasi  C-  3. 60(dahil) ile 80 arasi -B  4. 80(dahil) ile 100(dahil)  -A



        System.out.println("Notunuzu giriniz");
        double not=scan.nextDouble();

        if (not<0){
            System.out.println("Gecersiz");
        }else if (not<50){
            System.out.println("D");
        } else if (not>=50 && not<60) {
            System.out.println("C");
        } else if (not>=60 && not<80) {
            System.out.println("B");
        } else if (not>79 && not<101) {
            System.out.println("A");
        }else {
            System.out.println("Gecersiz");
        }
 */
          /*
        Kullanicidan bir yil alin.
        Eger yil 1000'e bolunuyorsa ekrana "Milenyum" yazdirin
        Eger yil 100 e bolunuyorsa ekrana "Yuzyil" yazdirin
        Eger yil 10 a bolunuyorsa ekrana "Onyıl" yazdirin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Yil giriniz");
        int yil = scan.nextInt();

        if (yil <= 0) {
            System.out.println("Gecersiz");
        } else if (yil % 1000 == 0) {
            System.out.println("Milenyum");
        } else if (yil % 100 == 0) {
            System.out.println("Yuzyil");
        } else if (yil % 10 == 0) {
            System.out.println("On yil");
        } else {
            System.out.println("Gecersiz islem");
        }

         /*

        Ornek: Kullanicidan password girmesini isteyin

               Girdigi password 5 e bolunuyorsa son rakamini kontrol edin.
               Son rakami 0 ise ekrana "5 e bolunen cift sayi" yazdirin
               Son rakami 0 degil ise ekrana "5 e bolunen tek sayi" yazdirin

               Girdigi password 5 e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.

         */


    }
}
