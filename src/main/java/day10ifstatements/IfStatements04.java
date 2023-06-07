package day10ifstatements;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {

        /*
        Example 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                   asagidaki tabloya gore yazdiran kodu olusturunuz
                   0-4     --> bebek
                   5-12    --> cocuk
                   13-20   --> genc
                   21-30   --> yetiskin
                   30 ustu --> Tanimlanmamis
                   Hata mesaji olarak "Gecerli bir yas giriniz" yazdiriniz.

         */

        //Yas degeri alacaksak Scanner olusturmaliyiz
        //Gereksinimleri cok iyi anlamak gerek

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz..");
        int age = input.nextInt();

        if(age<0){
            System.out.println("Gecerli bir yas giriniz");

        }else if(age<5){
            System.out.println("Bebek");

        }else if(age<13){
            System.out.println("Cocuk");

        }else if(age<21){
            System.out.println("Genc");

        }else if(age<31){
            System.out.println("Yetiskin");

        }else{
            System.out.println("Tanimlanmamis Yas");
            //buraya if koymamiza gerek yok else her turlu kabul edecek
        }



        /*
        1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
        uygun mesaj veren kodu yaziniz.

        2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
        //Pazar--> 1.gun , Pazartesi-->2.gun...

        3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz
         1-->January , 2-->February
         */

    }
}














