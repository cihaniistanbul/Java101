package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*
        Ornek:
            Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 charcter olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //  1) En az 8 character olsun
        boolean first = pwd.length() > 7;
        System.out.println(" first  " + first);

        // 2) Space characteri passwordde olmasin
        boolean second = !pwd.contains(" ");
        System.out.println("second = " + second);

        //3) En az bir buyuk harf olsun
        //Note:Buyuk harf olmayanlari sil
        //     kalan character sayisina bak(lenght ile)
        //     character sayisi sifir ise buyuk harf yok demektir
        //      sifirdan buyuk ise buyuk harf var demektir

        boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0;//Methodlari ayni satirda yanyana kullanmaya method chain denilir
        System.out.println("third = " + third);

        //4)  4) En az bir kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("fourth = " + fourth);

        //  5) En az bir rakam olsun
        boolean fifth = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("fifth = " + fifth);

        System.out.println(("Password gecerli mi?  "+(first && second && third && fourth && fifth)));



    }
}