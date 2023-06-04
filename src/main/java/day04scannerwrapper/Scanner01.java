package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //Ornek: Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz.

        //1.adim : Scanner class dan obje olustur
        Scanner input = new Scanner(System.in);

        //2.adim : Kullaniciya ne istedigine dair mesaj veriniz
        System.out.println("ilk isminizi giriniz...");

        //3.adim : Uygun methodu kullanarak kullanıcının verdigi datayı memory'e kaydet
        //next() methodu kullanicidan tek kelimeli String almak icin kullanilir
        String firtName = input.next();

        System.out.println("Soyisminizi giriniz...");
        String lastName = input.next();

        System.out.println(firtName+ " " +lastName);
    }
}
