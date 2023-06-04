package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Ternary Statement
        //Ornek1 : Sayi 10 dan kucuk ise console a kucuk yazdirin, degil ise kucuk degil yazdirin

        //--------if else cozumu--------

        int num = 3;
        if (num < 10) {
            System.out.println("kucuk");
        } else {
            System.out.println("Kucuk degil");
        }


        //----------ternary cozumu-----------
        //Condition    ?   Condition true ise calisir   :   Condition false ise calisir  ;
        String sonuc = num < 10 ? "Kucuk" : "Buyuk";

        System.out.println(sonuc);


        //Ornek 2: Sayi cift ise console a "cift", tek ise "tek" yazdirin
        int k = 13;
        if (k % 2 == 0) {
            System.out.println("Cift");
        } else {
            System.out.println("Tek");
        }


        //---------ternary cozumu-----------
        String result = k % 2 == 0 ? "Cift" : "Tek";
        System.out.println(result);


        //Ornek 3: Sayi 0 dan buyukse "Pozitif", kucukse "Negatif" yazdirin

        //burada ternary nin farkli yolunu gorduk
        int i = 5;
        System.out.println(i>0 ? "Pozitif" : "Pozitif degil");

        //Ornek 4: Kullanicidan 2 sayi aliniz, "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz..");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //1.yol cozumu
        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }


        //2.yol Ternary
        double result2 = a<b ? a : b;
        System.out.println(result2);




    }


}
