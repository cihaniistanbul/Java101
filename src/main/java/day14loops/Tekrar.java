package day14loops;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
/*


        //Verilen bir String i ters ceviren kodu yaziniz
        // "Java" --> "avaJ"

        String t ="Java";
        String ters= "";

        for (int i =t.length()-1; i>=0 ; i--){
           ters= ters+t.substring(i,i+1);


        }
        System.out.println(ters);

        String u = "Java";
        String ters2= "";

        for ( int i = u.length()-1    ; i>=0   ; i--   ){
            ters2=ters2+u.charAt(i);

        }

        System.out.println(ters2);

        //Ornek 2: Size verilen bir String in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //  nalan, ey edip adanada pide ye, 404

        //Logic : String i ters cevir duz hali ile ters halini karsilastir, ayni ise "Palindrome"

        String a = "nalan";
        String tersA="";

        for (int i = a.length()-1; i>=0 ;  i--  ){
            tersA=tersA+a.substring(i,i+1);

        }

        System.out.println(tersA);


        //Ornek: 5den 8e kadar tamsayilarin toplamini veren kodu yaziniz
        // 5+6+7+8=26

        int sum = 0;

        for (int i = 5 ;  i<9 ;  i++ ){
            sum=sum+i;
        }
        System.out.println(sum);

        //Ornek 2 :  7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        // 7*8*9= 504

        int sum1 = 1;
        for (int i = 7 ; i<10    ; i++   ){
           sum1= sum1*i;

        }
        System.out.println(sum1);
*/

        //Ornek 3 : Verilen bir tamsayinin rakamlari toplamini bulan kodu yaziniz
        //578 --> 5+7+8=20



        //Ornek: 5den 8e kadar tamsayilarin toplamini veren kodu yaziniz
        // 5+6+7+8=26

        int sum = 0;

        for(int i =5; i<9   ; i++   ){
            sum=sum+i;
            System.out.println(sum);

        }


        /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14   */


         /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
        */

        for (int i = 1 ; i<5 ;  i++ ){
            System.out.println("Week : " +  i);

            for (int k = 1;  k<8;  k++){
                System.out.println("Day : " +k);
            }
        }



    }
}
