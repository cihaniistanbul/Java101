package day10ifstatements;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
 /*
                PASSWORD UN ILK HARFI BUYUK HARF ISE       ---burada nested yapisi oldugunu soyle anladik.
                                                           password buyuk mu degil mi diye kontrol ediyorum once.
                                                           eger buyukse gelip bas harfini kontrol ediyorum
                                                           ayni sey asagida da gecerli


                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli



                PASSWORD UN ILK HARFI KUCUK HARF ISE

                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
        */



        //datayi kullanicidan alicaz. Scanner olusturalim
        Scanner input = new Scanner(System.in);   //obje
        System.out.println("Passwordunuzu giriniz");   //kullanici ne girecegini bilsin diye mesaj veriyoruz
        String pwd = input.nextLine();


        //once bir iskelet olusturup kod yazalim. Ilk olarak buyuk harf mi kucuk harf mi onun kontrolunu yapalım
        //kullanici buyuk, harf kucuk harf ve bunlar disinda baska bir sey de girebilir. 3 condition var if else if else

        //dis iskeleti olusturduktan sonra ice geciyorum.Eger buyuk harfse benim 2 senaryom var. Gecerli ve gecersiz
        //A olursa gecerli degilse gecersiz olacakmis yani if else. 2 senaryomuz var. Ilk if in altina yaziyoruz if else
        //nested yapilar oyle calisiyordu
        //Ayni durum z icinde gecerli.Cunku kucuk harfse orasi calisacak Asagidaki if in altina nested yerlestirdik


                 //buyuk harf olma sarti
        if(pwd.charAt(0)  >='A' && pwd.charAt(0) <='Z'){ //burada ilk harfi kontrol etmek icin charAt kullandik

            if(pwd.charAt(0)=='A'){
                System.out.println("Gecerli password");

            }else{
                System.out.println("Gecersiz password cunku harf buyuk ama A degil");

            }

                       //kucuk harf olma sarti
        }else if(pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){ // PASSWORD UN ILK HARFI KUCUK HARF ISE
                   //burada 2 ihtimal var. True ya da false o zaman if else olusturalim

            if(pwd.charAt(0)=='z'){
                System.out.println("Gecerli password");

            }else{
                System.out.println("Gecersiz password cunku kucuk harf ama z degil");

            }


        }else{
            System.out.println("Ilk character harf olmali");

        }












    }
}
