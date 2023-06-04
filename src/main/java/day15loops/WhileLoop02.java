package day15loops;

import java.util.Scanner;

public class WhileLoop02 {

    public static void main(String[] args) {

/*
      Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
              3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30

      -->Kullanici 3 verince, verdigi sayi hep basa koyulmus
         Daha sonra arada 'x' isareti var
         i'nin degerini koyuyoruz 1,2,3..
         Araya = koyuyoruz bu da sabit
         10 a kadar devam etmis.
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int num = input.nextInt();


        int i =1;
        while (i<11){
            System.out.println(num+ " x " +i+ " = " + (num*i));     //concatenation.   x dan sonra dinamik olarak artirmak icin i yazarim

            i++;
        }


        //Example 2 : Verilen bir String de her harfin sonrasina "*" sembolu ekleyin
        //      Java --> J*a*v*a*

        System.out.println("Bir kelime giriniz");
        String word = input.next();
        String newWord = "";                               // cesitli manipulasyonlar sonucu yeni bir data elde edilecegi zaman bunun icin bir alan reserve ediyoruz

        int a = 0;                                        // index le yapacagimiz icin loop un baslangic noktasi 0
        while (a<word.length()){                         // loop, word sepetindeki character sayisi kadar calismak zorunda

          newWord = newWord+ word.charAt(a)+"*";        // charAt(a) cunku characterleri bastan alacak.
                                                        // charAt(a) ile characteri aldiktan sonra yeni olusturdugum sepete koyacagim icin once newWord ile topluyorum
                                                        // sonuna * koymam lazim. +"*"   bunu tekrar newWord sepetine koymam lazim
            a++;
        }
        System.out.println(newWord);                  // loop un son halini gormek istedigim icin } disina yazdim


        //Example 3: Bir String deki tekrarsiz characterleri console a yazdiriniz
        // kertenkelle --> rtn

        //indexOf("k") --> 0  farkli ise tekrarli
        //lastIndexOf("k") --> 6

        //indexOf("r") --> 2  ayni ise tekrarsiz
        //lastIndexOf("r") --> 2

        String s = "kertenkelle";    // buradan yeni bir data alacagimiz icin yeni var varible olusturup, buldugum tekrarsizlari bu sepete eklicem
        String sonuc = "";

        int b = 0;
        while(b<s.length()){
            char ch =s.charAt(b);                        // once characteri elime alicam. Cocugu bakkala surekli gondermeye gerek yok

            if (s.indexOf(ch)==s.lastIndexOf(ch)){       // aldigim characterlerin indexOf ve lastIndexOf una bakicam
                sonuc = sonuc+ch;                        // tekrarsiz olanlari sonuc sepetine ekliyorum
            }
            b++;

        }
        System.out.println(sonuc);







    }
}

