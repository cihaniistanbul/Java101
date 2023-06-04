package day15loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
 /*
           Example : Asagidaki sekli cizen kodu yaziniz
             Logic : İcerdeki loop un calisma limitini outer loop un o an ki degeri belirliyor
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
*/

        Scanner input = new Scanner(System.in);

        System.out.println("Satir (row) sayisini giriniz");
        int row = input.nextInt();

        for (int i = 1; i <= row ; i++) {              // disaridaki looptan gelen degerine gore limit belirleyerek calisiyor

            for (int k = 1; k <=i  ; k++) {           // 1.dongude i=1 iken inner loop 1 kere calissin, 2.dongude i=2 old inner loop kere calissin istiyorum
                                                      // o zaman k<=i koymaliyiz
                System.out.print(k + "  ");
            }

            System.out.println();                     // tek gorevi inner loop tamamlandiktan sonra pointer i bir sonraki satira almak
        }



        /*
              5 satır var. Bunlari outer loop ile yapabiliriz.
              5.satırda 1 yazdirip bosluk birakmis, 2 yazdirip bosluk birakmis..
              Yani her bir satirda tekrarlayan islemler var. Biz satirlari outer loop
              ile geziyorduk. Ama icerde de tekrarli islemler var. Bu islemler
              sabit degil. 1.satirda inner loop 1 kez, 2.satirda 2 kez calismis..

              Kullanicidan satir sayisi almam yeterli. Sutun sayisi satira bagli calisiyor
              tekrar almama gerek yok.

              Dinamik yapmak icin i<=row yaptik. Outer loop u satir sayisi kadar calistiricam.
              Yeniden for loop a ihtiyacim var. Cunku her adimda tekrarli bir is yaptiricam.

         */


    }
}

