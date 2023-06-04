package day10ifstatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
         /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz
         */


        //Kullanicidan data alacagimiz icin Scanner Class olusturalim
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz..");

        //burada kullanicinin - girmesini affetmiyorum
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenMi = (a + b > c && c > Math.abs(a - b) &&
                (a + c > b && b > Math.abs(a - c)) &&
                (b + c > a && a > Math.abs(b - c)));

        //diyelim ki alican -3 -4 -5 degerlerini girdi. En ustten gelince -3<=0 true -4<=0 true -5<=0. bunlardan birisinin bile
        //true olmasi yeterliydi cunku || or kullandik. True cikinca hemen altindaki sout calisir diger kodlari gitmez java

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Gecerli kenar uzunlugu giriniz"); //En uste yazdik. Bunlari birbirine baglamamiz lazim
            //mesaji if else ile veriyorum. else ile if(ucgenMi) i birlestiririz
            //else ve if() i bagladik
        } else if (ucgenMi) {
            //tum kodlarımın burada olmasi lazim. cunku bir ucgenin eskenar mi, ikizkenar mi, cesitkenar mi oldugunu ilk basta
            //ucgen olduktan sonra bakmam lazim.ucgenMi true olduktan sonra yani condition true olduktan sonra dikkate almam
            //lazim. O yuzden buraya yazicaz.
            //3 tane senaryomuz var. if else if ile cozebiliriz

            if (a == b && b == c && a == c) { //bunlar esitse birbirine mesajimiz belli. sout ile mesaj vericez
                System.out.println("Eskenar");

            } else if (a == b || b == c || a == c) { //burada ikizkenar istedigi icin or kullanmak daha mantikli
                System.out.println("ikizkenar");

            } else {
                System.out.println("Cesitkenar"); //geriye cesitkenar kaliyor. onu da sout ile yazdirdik
            }

        } else {
            System.out.println("Ucgen degildir");
        }

        //kod yazdiktan sonra bakiyorum. Eger kullanici negatif deger girerse diyelim ki -3 -4 -5 girdi
        //burada cesitkenar yerine ucgen degildir yazdi. Bir onceki ornekte math.abs ile degerleri pozitife
        //cevirdik. burada hatali giris yaptiniz diye console yazicaz.
        //En uste yazicaz bu uyariyi. Kullanicinin if(girmis oldugu kenar uzunluklarindan a sifir ya da sifirdan
        //daha kucukse...
        //2 sekilde de eksi degerleri duzeltme sansimiz var. Ya Math.abs yontemiyle yapicaz. Ya da en uste gelip
        //if else ile kullaniciya mesaj vericez


    }
}
