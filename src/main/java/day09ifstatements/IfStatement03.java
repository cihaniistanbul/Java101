package day09ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        //Ornek: Kullanicinin vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        //       kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu olusturunuz



        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz");
        char ch = input.next().charAt(0);  //Kullanicidan 1 tane character alacagim icin charAt kullandim

        //1.yol
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }


        if(ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf");
        }


        //burada ascii degerlerine bakip buyuk kucuk oldugunu ayarliyor


        //2.yol
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");

        }else{
            System.out.println("Kucuk Harf");
        }

        //tekrar tekrar kod yazmamak icin 2. yol olan if else kullan, javayi yorma

        //simdi bu kodda bir hata var. Normalde 3 condition var. Buyuk, Kucuk ve Harf degil olmali
        // if else if else

        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");

        }else if(ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf");

        }else{
            System.out.println("Harf Degil");
        }


    }
}
