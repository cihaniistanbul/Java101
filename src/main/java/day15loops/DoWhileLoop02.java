package day15loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
            (mayin tarlasi oyunu gibi)
         */

        Scanner input = new Scanner(System.in);




        do{
            System.out.println("Lutfen bir  sayi giriniz");
            int num = input.nextInt();

            if (num>=100){
                System.out.println("Kazandiniz");

            }else{
                System.out.println("Kaybettiniz");
                break;  // sout calistigi zaman break. burada sonlandiriyorum
            }

        }while (true);



        /*
        Olusturacagimiz kodda kullanici 100 den buyuk tahminde bulundugu surece calismaya devam edecek
        Kullanici dogru girdigi surece tekrar tekrar sayi almam lazim ve surekli kullaniciyi bilgilendirmem
        lazim. Bu durumda sout kismini dongunun icine koymam lazim.

        increment/decrement yok. Bu senaryoya gore bir kod yazdik. Sonsuz bir loop olusturduk ve senaryoyu sadece
        condition nın false olmasi durumuna bagladik. Loop u sonlandirmak icin tek condition var. O da oyunu
        kaybetmesi. 100 den kucuk olmasi.

        (false) dersek hic calismaz.

         */















    }
}
