package day16arraysforeachloop;

import java.util.Scanner;

public class SuleymanHocaHesapMakinesi {
    public static void main(String[] args) {

        // +, -, /, % islemlerini yapabilen bir hesap makinesi yapiniz
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin

        /*
        1) Kullanicidan data almak icin Scanner object olustur
        2) Kullanicidan yapacagi islemi almaliyiz
        3) Kullanicidan 2 tane sayi almaliyiz
        4) Tekrar tekrar islem yapabilmek icin loop kullanmaliyiz
         */


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the operation among +, -, *, /, %");
            char opr = input.next().toLowerCase().charAt(0);

            System.out.println("Enter the first number");
            int n1 = input.nextInt();

            System.out.println("Enter the second number");
            int n2 = input.nextInt();

            if (opr == 'q') {
                break;

            } else {

                switch (opr) {
                    case '+':
                        System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
                        break;

                    case '-':
                        System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
                        break;
                    case '*':
                        System.out.println(n1 + "x" + n2 + "=" + (n1*n2));
                        break;
                    case '/':
                        System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
                        break;
                    case '%':
                        System.out.println(n1 + "%" + n2 + "=" + (n1%n2));
                    default:
                        System.out.println("Undeifined operation");
                }

            }

        } while (true);

    }
}
