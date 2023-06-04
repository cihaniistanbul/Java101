package day15loops;

import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {
/*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */

        Scanner input = new Scanner(System.in);


        int counter = 0;

        do{
            if (counter==4){    // 4 defa yanlis girerse
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }

            System.out.println("Username i giriniz");
            String userName = input.next();

            System.out.println("Password u giriniz");
            String password = input.next();

            if (userName.equals("admin") && password.equals("pwd123")){  //username-password un dogru olup olmadigini kontrol etmek icin if
                System.out.println("Hesabiniza hosgeldiniz!");
                break;   // kullanici dogru giris yaptiysa loop un tekrar calismasina gerek yok. O yuzden break
            }
            counter++; // kullanici yanlis girerse burasi calisacak ve counter 1 artacak



        }while (true); // true ile sonsuz dongu yaptik. Loop u yukarida kirdik if ile



        /*
        Kullanici yanlis password-username girdigi zaman 1 artirmak icin --> counter
        counter 4 e geldigi zaman loop kiricaz
         */



    }
}
