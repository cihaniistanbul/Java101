package day07stringmanipulations;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir
        /*
                        Meshur Regex
           1)Tum  rakamlar ==> [0-9]
           2)Tum kucuk harfler==> [a-z]
           3)Tum buyuk harfler==> [A-Z]
           4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
           5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
           6)Tum noktalama isaretleri==>\\p{Punct}
           7)Tum sesli harfler ==> [aeiouAEIOU]
             Tum x,q,w harfleri     ==> [xqw]i

           8)Kucuk harflerden farkli tum characterler ==>[^a-z]
           9)Tum harflerden farkli tum characterler ==>  [^a-zA-Z]

           10) sadece space karakteri --> \\s
               space karakteri haric  --> \\S

               sadece rakamlar --> \\d
               rakamlar haric  --> \\D

         */


        /*
        String t = "Ali 13 yasindadir!...";

        // t yi ! e cevir
        String t2 = t.replaceAll("[0-9a-zA-Z]", "!");
        System.out.println(t2);


        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);

        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);


        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);


        String t6 =t.replaceAll("[\\S]", "?");
        System.out.println(t6);

        String t7=t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);


         */


        //StringManipulations02
        /*
        Ornek:
            Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 charcter olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun












        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        boolean first = pwd.length() > 7;
        System.out.println("first = " + first);

        boolean second = !pwd.contains(" ");
        System.out.println("second = " + second);

        boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("third = " + third);

        boolean fourth = pwd.replaceAll("[^a-z]", "").length() > 0;
       System.out.println("fourth = " + fourth);


        boolean sixth = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("sixth = " + sixth);


        System.out.println();
*/

        String str = "Java kolaydir";
        System.out.println(str.endsWith("Java kolaydir"));
        System.out.println(str.endsWith("dir"));
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith("r"));

        String b = "Ali  12  ?_";
        System.out.println(b.replaceAll("\\d", "*"));

        System.out.println(b.replaceAll("\\D", "*"));
        System.out.println(b.replaceAll("\\S", "*"));
        System.out.println(b.replaceAll("\\s", "*"));
    }

}
