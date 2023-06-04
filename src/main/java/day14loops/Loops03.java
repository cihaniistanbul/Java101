package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14   */

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz");
        int start = input.nextInt();
                                                                                                 // Kullanicidan baslangic ve bitis degerlerini aldim
        System.out.println("Bitis degerini giriniz");
        int end = input.nextInt();

        if (start>end){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");               //else koymazsam bagimsiz olur. Bu kod calismazsa asagiya gitmesi lazim
        }else{

            for ( int i=start   ; i<=end  ; i++  ){
                if (i%2==0){                                                                     // soru da istenen for(){} arasinda. Kullanicinin yanlis girme
                                                                                                 // ihtimaline karsi bilgilendirme yapmam lazim. Loop oncesi
                    System.out.println(i+ "  ");
                }
            }

        }


        //Ornek2 : Hic sayi kullanmadan 1 den 100 e kadar olan sayilari console a yazdiriniz           //asci table kullaniliriz
        for (int i ='d' / 'd';   i <= 'd' ; i++  ){                                                   // char lar mat. operatorlerle kullanilirsa mat. islem yapar.
            System.out.print(i + "  ");                                                               // d yerine istedigimizi kullanabilirdik.


        }

        /*
        Note 1: Bazi loop lar sonsuz defa calisabilir, Bu tarz looplara Infinite (sonsuz) loop denir
                Infinite loop genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir

                for (int i = 1 ; i<10  ; i--){
                }


         Note 2: Loop olusturdugumuzda "ikinci kismi" (loop calisma sarti) yazmazsaniz Infinite loop olur

               for (int i = 0;     ; i++){
               }


         Note 3: Bazi loopelar hic calismayabilir

              for (int i = 1 ; i<0 ; i--){
              }



         --> d nin ascii degerini bulmak icin:

             int d = 'd';  --> char lari int sepetine koyup yazdirinca ascii degerini verir
             sout(d);





         */




    }
}
