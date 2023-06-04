package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
                   yazdiran kodu yaziniz.
                   8 ==> August - September - October - November - December
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){                    // --> ay numarasina gore degistir. 1 olmasi durumda January....
            case 1:
                System.out.println("January");  // --> numOfMonth sepetinde 1 olmasi durumunda January i calistir. Break yazmiyorum cunku soru onu istiyor
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;                          // --> buraya break koymazsam Java default u da ekrana yazdirir. Javanin scope u terk etmesi icin break koymaliyiz.Yoksa sonuna kadar yazdirir
            default:                            // --> Kullanici 35 verdi diyelim. Hatali oldugu icin mesaj vermemiz lazim
                System.out.println("Gecerli ay numarasi veriniz..");

        }

        /*
        NOTE: "switch" condition parantezi icinde String, int, byte, short, char kullanilabilir
        NOTE: switch" condition parantezi icinde long, boolean, float, double kullanilamaz
         */



        /*
          "break" ile Switch i hangi seviyede disari cikaracagimizi belirliyoruz.
          Yani kodumuz hangi seviyede switch scope unun disina ciksin. Onu belirliyoruz
          "break" switch statement ile kullanildiginda bizi kodun disina atar

         */

//---------------- Suleyman Hoca

        //Ornek : Kullanici ay ismini girdiginde o ayin kac cektigini ekrana yazan bir program yapiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Ay ismi giriniz");
        String mounth = scan.next();

        switch (mounth){
            case "ocak" :
            case "mart" :
            case "mayis" :        // buradaki case ler icin 31 yazdiracak
            case "temmuz" :
            case "agustos" :
            case "ekim" :
            case "aralik" :

                System.out.println(31);
                break;

            case "subat" :
                System.out.println("28 veya 29");
                break;


            case "nisan" :
            case "haziran" :      //buradaki case ler icin 30 yazdiracak
            case "eylul" :
            case "kasim" :

                System.out.println(30);
                break;

            default:
                System.out.println("Gecerli bir ay ismi giriniz");

                //Bu ornekte cok fazla tekrar oldugu icin tekrarlilari bir araya getirdik




        }






    }
}
