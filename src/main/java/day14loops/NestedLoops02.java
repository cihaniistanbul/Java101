package day14loops;

import java.util.Scanner;

public class NestedLoops02 {
    public static void main(String[] args) {
         /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir (row) sayisini giriniz");
        int row = input.nextInt();

        System.out.println("Sütun (column) sayisini giriniz");
        int column = input.nextInt();

        for (int i = 1; i <= row; i++) {                  //distaki loop satirlar icin satir sayisi kadar calisir

            for (int k = 1; k <= column; k++) {          //icteki loop yanyana yazdigindan sutunlar icin sutun sayisi kadar calisir

                System.out.print("X ");
            }
            System.out.println();                         // satir yan yana yazdirildiktan sonra pointer i bir sonraki satira almak icin kullanilir


        }

        /*
           1.satir da 5 tane yan yana X bastiricam
           2.satir da 5 tane yan yana X bastiricam
           3.satir da 5 tane yan yana X bastiricam

           row=3
           column=5  yukaridaki seklin cikmasi icin kullanicinin girmesi gereken sayilar

            outer loop --> yan yana X bastiracak
            inner loop --> satir atlatacak

         */

    }
}
