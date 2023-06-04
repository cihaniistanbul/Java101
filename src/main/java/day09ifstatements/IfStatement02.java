package day09ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Ornek: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu ekrana yazdiran kodu olusturunuz

        //kullanicidan data alacagimiz icin Scanner Class olusturalim

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int num = input.nextInt();

        //simdi sirada if yazmak var. Sayinin cift mi tek mi oldugunu 2 ye bolumunden kalan 0 veriyorsa sayimiz cift,
        // eger sifir degilse tek sayidir deriz


        //1.yol
        if (num % 2 == 0) {
            System.out.println("Cift sayidir");

        }

        if (num % 2 != 0) {
            System.out.println("Tek sayidir");
        }

        //1.yol ile 2 tane sart kontrol edildi


        //2.yol if else

        if (num % 2 == 0) {
            System.out.println("Cift.."); //true ise burasi calisir. Eger burasi calisirsa else kismi calismiyor. Java digerlerine bakmiyor

        } else {
            System.out.println("Tek.."); //false ise burasi calisir
        }

        //2.yol ile 1 sart kontrol edildi. Yani 2 senaryolu durumlar icin if else kullanmak daha mantikli
        //Java daha az yoruluyor cunku kontrol edilen condition sayisi daha az


    }
}
