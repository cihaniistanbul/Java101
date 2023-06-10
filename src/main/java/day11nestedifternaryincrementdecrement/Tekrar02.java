package day11nestedifternaryincrementdecrement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tekrar02 {
    public static void main(String[] args) {
//Ornek 2: Sayi cift ise console a "cift", tek ise "tek" yazdirin

/*


        int num = 13;
        String r = num%2==0 ? "cift" : "tek";
        System.out.println(r);

        //Ornek 3: Sayi 0 dan buyukse "Pozitif", kucukse "Negatif" yazdirin
        int s =7;
        String r2 = s>0 ? "pozitif" : "negatif";


        //Ornek 4: Kullanicidan 2 sayi aliniz, "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("2 sayi giriniz");
        int a= scan.nextInt();
        int b = scan.nextInt();

        int r3 = a<b ? a : b;
        System.out.println(r3);


        //Ornek2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //        -4 ==>  -1*-4     4 ==>4      0 ==>0

        int c =4;

        int r4= c<0 ? -1*c : c*c;
        System.out.println(r4);


        //Ornek3 : Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri
        // farkli ise "farkli isaretli sayilari carpamiyorum" mesaji veren kodu yazin


        int x = 7;
        int y =-8;

        Object r5 = x>0 && y>0 ? x*y : "farkli isaretli sayilari carpamiyorum";
        System.out.println(r5);


        //Ornek4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int p =313;

        String r6 = p>99 && p<1000 ? "uc basamakli"  : "uc basamakli degil";
        System.out.println(r6);
*/

          /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;----> {OUTER IF}
                60 yasindan buyukse "Emekli Olabilir "yazdirin --->{INNER IF}

               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */


        //Burada 2 tane variable olusturmam lazim.Kullaniciya 2 mesaj vericem yani
        //  1)kadın mı, degil mi?
        //  2)60 mi 65 mi?

        Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz");
        String gender = scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();


        if (yas<0 || yas>120){
            System.out.println("gecersiz islem");
        } else if (gender.equalsIgnoreCase("kadin")) {
            if (yas>60){
                System.out.println("emekli olabilir");

            }else {
                System.out.println("calismaya devam");
            }
        } else if (gender.equalsIgnoreCase("erkek")) {
            if (yas>65){
                System.out.println("emekli olabilir");
            }else {
                System.out.println("calismali");
            }
        }else {
            System.out.println("hatali islem");
        }


    }
}
