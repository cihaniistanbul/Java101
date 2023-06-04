package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz
        //           (Hesap makinesi)

        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();


        System.out.println("Yapilacak islemi giriniz. +, -, *, /, % dan birini seciniz");  // burada tekrar mesaj verdim cunku yapilacak islemi alan diyor soruda
        char opr = input.next().charAt(0);                                                // --> Scanner class icinde kullanicidan direk char alabileceginiz bir method yok.
                                                                                          //     Kullanicidan 1 tane sembol alicam. 1 tane oldugu icin Java tek characterler koyulsun diye char olusturmus
                                                                                          //     Israr etmiyorum ve char kullaniyorum.

        switch (opr) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a * b/100));  //yuzdesini almak icin /100 yaptik
                break;
            default:                                                      //kullanici bize ? gonderdi diyelim. default: ile uygun mesaji veriyoruz
                System.out.println("Bu islem tanimlanmamistir");

        }



        }


    }

