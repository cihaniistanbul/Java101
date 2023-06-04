package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek 1: Kullanicinin coklu datayi bir array e yerlestirebilmesi, istedigi zaman durdurabilmesi icin
        //         gereken kodu yaziniz.


        /*
        1) Kullanicidan data almak icin Scanner object olustur
        2) Coklu datayi yerlestirmek icin bir array olusturmaliyiz
        3) Array olusturabilmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4) Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz ogrenci sayisini giriniz");
        int numOfElements = input.nextInt();

        String stdNames [] = new String [numOfElements];

        System.out.println("Islemi durdurmak icin 'q' ya basiniz"); //bundan sonraki islemler tekrar edecegi icin for loop kullanicam

        for (int i = 0; i < stdNames.length; i++) {

           //                   0 olmamasi icin i+1
            System.out.println((i+1) +"  . ogrencinin ismini giriniz"); // tekrarli bir sekilde 1.ogrenciyi gir dicem, kontrol edicem, bu tekrar ediyor
            String name = input.next();

            if (name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames [i] =name;

            }
        }
        System.out.println(Arrays.toString(stdNames));


    }
}
