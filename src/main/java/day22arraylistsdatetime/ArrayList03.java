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


        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");


        Scanner input = new Scanner(System.in);
        int counter = 0;
        int can = 3;


        do {

            if (counter==can)
                System.out.println("Game Over");

            System.out.println("Please enter a letter");
            String letter = input.next().toUpperCase().substring(0, 1);

            if (myList.contains(letter)) {
                myList.set(letter.indexOf(letter), "Buldum!");

            } else {
                myList.add(letter);
            }
            System.out.println(myList);

            counter++;

        } while (true);

    }
}
