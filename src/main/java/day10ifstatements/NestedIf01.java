package day10ifstatements;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

       /* Example 1: Kullanicidan 3 tane sayi aliniz.
                     Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                     Eger ucgen ise “eskenar” Ucgen olma durumunu kontrol ediniz.
                     INFO :
                     Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                       herhangi iki kenar farki ucuncu kenardan kucuk olmali
                     a+b>c>|a-b|
                     a+c>b>|a-c|
                     b+c>a>|b-c|
                     a=b=c ise eskenar ucgen     */

        //Once kullanicidan data almam lazim Scanner Class ile
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz");


        //Kullanici yanlislikla eksi bir deger girer diye Math.abs methodunu kullandik.
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());


        //burada normalde if() parantez icinde yaziyordu. Kod kalabaligi olmasin diye boolean sepetine attik
        boolean ucgenMi = (a + b > c && c > Math.abs(a - b) &&
                (a + c > b && b > Math.abs(a - c)) &&
                (b + c > a && a > Math.abs(b - c)));

        //Simdi ucgen olusturma durumunu yazalim
        if (ucgenMi) {
            System.out.println("Bu bir ucgendir");

        } else {
            System.out.println("Bu bir ucgen degildir");
        }

        //ucgen mi sartina baktik. Simdi sirada eskenar mi ona bakalim. nested if ile

        if (ucgenMi) {
            if (a == b && b == c && a == c) {
                System.out.println("Ucgendir hemde eskenar ucgen");
            } else {
                System.out.println("Ucgendir ama eskenar degil");
            }
        } else {
            System.out.println("Bu bir ucgen degildir");
        }


    }
}
