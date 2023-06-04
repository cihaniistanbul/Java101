package day09ifstatements;

import java.util.Scanner;

public class NestedIfSHoca {
    public static void main(String[] args) {
         /*

        Ornek: Kullanicidan password girmesini isteyin

               Girdigi password 5 e bolunuyorsa son rakamini kontrol edin.
               Son rakami 0 ise ekrana "5 e bolunen cift sayi" yazdirin
               Son rakami 0 degil ise ekrana "5 e bolunen tek sayi" yazdirin

               Girdigi password 5 e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.

         */

        Scanner password = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz");
        int pwd = password.nextInt();

        if(pwd % 5==0){
            if(pwd%10==0){
                System.out.println("5 e bolunen cift sayi");
            }else{
                System.out.println("5 e bolunen tek sayi");
            }

        }else{
            System.out.println("Tekrar deneyin");
        }

    }
}

