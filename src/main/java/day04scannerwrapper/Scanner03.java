package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    //Ornek: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana
    //       yazdiran kodu yaziniz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İki sayi giriniz..");

       double firstNumber = input.nextDouble();
       double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber );
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber );
        System.out.println(firstNumber / secondNumber );


    }
}
