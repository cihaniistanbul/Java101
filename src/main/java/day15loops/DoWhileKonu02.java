package day15loops;

import java.util.Scanner;

public class DoWhileKonu02 {
    public static void main(String[] args) {
        
         /*
         Example:
            Kullanicidan sayi aliniz
            Tamsayi 10'dan kucuk ise ekrana "Kazandiniz!" yazdirin
            Tamsayi 10 ve 10'dan buyuk ise "Sayi giriniz" yazdirin
       
         */

        Scanner scan = new Scanner(System.in);


        int s=0; //baslangic degeri
        
        do {
            System.out.println("Bir sayi giriniz");
            s = scan.nextInt();

        } while (s >= 10);
        System.out.println("Kazandiniz");


        //Kullanici kazanirsa oyun bitecek. O yuzden while icindeki kurali kayba gore yazariz kazanmaya degil
        //Kullanici 10 dan kucukse kazaniyor. o zaman s>=10  loop kullanici kaybederse calisiyor.


        
        
        
        /*
        Kullanidan bir String alin
        Bu String'in icinde kac tane harf, kac tane rakam ve kac tane harf ve rakam disi character oldugunu gosteren programi yaziniz
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String s1 = input.nextLine().toLowerCase(); 
        
        int harfCounter =0;
        int rakamCounter =0;
        int digerCounter =0;
        
        int k=0;
        
        do {
            if (s1.charAt(k)>='a' && s1.charAt(k)<='z'){ //kullanicidan alirken direk kucuk harf yaptim simdi burada buyuk harfi denememe gerek yok
                harfCounter++;
            } else if (s1.charAt(k)>='0' && s1.charAt(k)<='9') {
                rakamCounter++;

            }else {
                digerCounter++;
            }

            k++;
        }while (k<s1.length());//condition

        System.out.println("harfCounter = " + harfCounter);
        System.out.println("rakamCounter = " + rakamCounter);
        System.out.println("digerCounter = " + digerCounter);


    }
}
