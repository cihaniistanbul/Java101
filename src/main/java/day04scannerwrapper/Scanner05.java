package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacagimiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli biir sayi giriniz");

        int number = input.nextInt();

        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolun ve kalani alin
        //bir tam sayiyi baska bir tam sayiya bolerseniz java sonucu kesinlikle tam sayi yapar
        //Java sonucu tam sayi nasil yapar? Ondalik kismi iptal eder, java yuvarlama islemi yapmaz

        //Bir tam sayiyi bir tam sayiya bolerseniz java sonucu kesinlike tam sayi yapar
        //Java yuvarlama yapmaz, ondalikli kismi iptal eder
        //Dolayisiyle bir tam sayiyi 10 a bolersek birler basamagini silmis oluruz

        // % --> modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumundan kalani verir
        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz



        //son rakami al
        int birlerBasamagi = number%10;
        //sayiyi kucult
        number = number/10;


        //sondan ikinci rakami al
        int sondanIkinci  = number%10;

        //sayiyi kucult
        number = number /10;

        //sondan ucuncu rakami al
        int sondanUcuncu = number%10;
        //sayiyi kucult
        number = number/10;

        //sondan dorduncu rakami al
        int sondanDorduncu = number%10;
        //sayiyi kucult
        number=number/10;

        //sondan besinci rakami al
        int sondanBesinci = number%10;

        //son rakam oldugu icin kucultmeye gerek yok

        System.out.println(sondanBesinci+sondanDorduncu+ birlerBasamagi+sondanIkinci);


        //homework
        //1)Kullanicidan aldigimiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        //Ornegin --> 3,5,7 icin ortalama (3+5+7)/3=5

        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        // ornegin => 312 icin 3+1+2=6

    }
}
