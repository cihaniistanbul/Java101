package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {

        /*
   Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin

           --> String class kullanmak tercih edilir cunku string class method acisindan cok zengindir
    */


        List<String> myList = new ArrayList<>(); // kullanicinin girdigi datayi kiyaslamak icin hazir list olusturdum
        myList.add("A");
        myList.add("H");
        myList.add("J");


        Scanner input = new Scanner(System.in);

        int counter = 0;
        int can = 3;


        do {

            if (counter == can){
                System.out.println("Game Over");
                break;
            }


            System.out.println("Please enter a letter"); //kullanicinin girdigi stringden 1 harf almak istiyorum her defasinda. charAt() ile de alabiliriz ama sub
                                                         // methodu daha genis.
            String letter = input.next().toUpperCase().substring(0, 1); //kullanicidan alir almaz uppercase e cevirdik

            if (myList.contains(letter)) {
                myList.set(letter.indexOf(letter), "Buldum!"); //dinamic olarak letter in indexini vermek istiyorum , sonra "Buldum!" a cevirecegim

            } else {
                myList.add(letter); //yoksa harfi listeye ekle diyorum
            }
            System.out.println(myList);

            counter++;

        } while (true);


        /*
        Kodu dinamik yapmak istiyorum. Kullanicidan tekrar tekrar harf almak istiyorum. O zaman loop a koyarim tekrar etmesini istedigim yerleri
        İlk condition sartsiz calissin istiyorum. do while() kullandik. do while in icine aldigimiz code lar artik sonsuz kez tekrar edecek.
        counter++ olusturup sona koydum.counter loop un kac kere calistigini artik sayacak. biraz limit koymak istersem mesela 3 can verip counter<3 game over
        yapabiliriz
         */
    }
}
