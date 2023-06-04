package day09ifstatements;

import java.util.Scanner;

public class SuleymanHocaIf {
    public static void main(String[] args) {

        /*
        Ornek: Kullanicidan bir sayi alin bu sayi cift sayi ise console a "Cift"
               tek sayi ise console a "Tek" yazdirtin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int result = input.nextInt();

        if (result % 2 == 0) {
            System.out.println("Cift");
        } else {
            System.out.println("Tek");
        }




        /*
       Ornek: Kullanicidan bir character alin
              Bu character buyuk harf ise "Buyuk Harf" yazdirin
              kucuk harf ise "Kucuk Harf" yazdirin
              harf degilse "Harf Degil" yazdirin


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz..");
        char ch = scan.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf");

        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk Harf");

        } else {
            System.out.println("Harf Degil");
        }




        /*
        Ornek:
        Kullanicidan bir sayi alin
        Sayi 3 basamakli ise console a "3 Basamakli" yazdirin
        Sayi 2 basamakli ise console a "2 Basamakli" yazdirin
        Sayi 3 basamakli veya 2 basamakli degil ise console a "Ikiside degil" yazdirin
         */

        Scanner inpuT = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = inpuT.nextDouble();

        if (sayi > 99 && sayi < 1000) {
            System.out.println("3 Basamakli");

        } else if (sayi > 9 && sayi < 100) {
            System.out.println("2 Basamakli");

        } else {
            System.out.println("Ikısıde degil");
        }


        //if else --> if it rains I will go to MALL else I will go to picnic
        //            condition true ise 1.bolge, false ise 2.bolge calisir


        if (sayi >= 0) {
            System.out.println("Negatif degil");

        } else {
            System.out.println("Negatif");

        }

        /*
        Ornek:

        Kullanicidan bir character aliniz
        Bu character harf ise colsole a "Harf" yazdirin
        Harf degil ise console a "Harf Degil" yazdirin

         */

        Scanner scaN = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz..");
        char ch1 = scaN.next().charAt(0);

        if ((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z')) {
            System.out.println("Harf");
        } else {
            System.out.println("Harf Degil");
        }

        //Ornek : Kullanicidan bir tamsayi alin ve o tamsayinin mutlak degerini ekrana yazdiriniz.
        //        a>=0 --> Mutlak Deger=a       a<=0 --> Mutlak Deger = -a // yani a>=0 ise ekrana a, a<=0 ise ekrana -a yazdir

        Scanner inPut = new Scanner(System.in);
        System.out.println("Lutfen bir sayi degeri giriniz");
        int ch2 = inPut.nextInt();

        if (ch2>=0){
            System.out.println(ch2);

        }else{
            System.out.println(-ch2);

        }

        /*
        Ornek: Kullanicidan bir gun alin. Eger gun
               "Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin
               "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin
               "Pazar" ise ekrana "Hristiyanlar icin kutsal gun" yazdirin
         */


        //Note: equals() methodu iki String i karsilastirir

        Scanner inpUt = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String day = inpUt.next();

        if(day.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gun");

        }else if(day.equalsIgnoreCase("Cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");

        } else if (day.equalsIgnoreCase("Pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");

        }else{
            System.out.println("Oyle bir kutsal gun yok");
        }



        /*
        Ornek: Kullanicidan alacagi urun miktarini ve urunun birim fiyatini alin. Eger urun miktari 1000 den fazla ise
               kullaniciya %10 indirim yapin ve odemesi gereken toplam parayi ekrana yazdirin. Diger durumlarda odemesi
               gereken toplam parayi herhangi bir indirim yapmadan ekrana yazdirin.

         */

        Scanner iNput = new Scanner(System.in);
        System.out.println("Urun miktarini giriniz");
        int qty = iNput.nextInt();

        System.out.println("Urun birim fiyatini giriniz");
        double price =iNput.nextDouble();

        if(qty>1000){
            System.out.println("%10 indirimli fiyat" + price*0.9*qty);

        }else{
            System.out.println("indirimsiz fiyat" + price*qty);

        }

    }
}
