package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {



     /*



        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yil giriniz");
        int year = scan.nextInt();

        String result1= year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println(result1);


        /*
        Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        yazdiran kodu yaziniz.
        8 ==> August - September - October - November - December
                */


        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz.


        /*


        Scanner input = new Scanner(System.in);
        System.out.println("2 sayi giriniz");
        double a =input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapilacak islemi giriniz.      +, -, *, /, % dan birisini seciniz");

        char opr= input.next().charAt(0);

        switch (opr){                     // --> opr sepetindeki charactere gore switch yap.
            case '+' :                    // --> ne zamanki opr sepetindeli case imiz + ise bunu a+b olarak yazdir.
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '%' :
                System.out.println(a%b);
            default:
                System.out.println("Hatali giris yaptiniz");


        }

        */

        /*
         Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

        Kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ulke ismi giriniz");
        String c = input.nextLine();

        switch (c) {
            case "America" :
                System.out.println("US");
                break;

            case "England" :
                System.out.println("UK");
                break;

            case "Germany" :
                System.out.println("DE");
                break;

            case "Turkey" :
                System.out.println("TR");
                break;

            case"India" :
                System.out.println("IN");
                break;

            case "Peru" :
                System.out.println("PE");
                break;

            case "Spain" :
                System.out.println("ES");
                break;

            case "Bulgaria" :
                System.out.println("BG");
                break;

            case "Albania" :
                System.out.println("AL");
                break;

            case "France" :
                System.out.println("FR");
                break;

            default:
                System.out.println("Gecerli bir ulke adi giriniz");

        }









    }
}
