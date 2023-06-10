package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
        /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
        1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil


        int year =1600;

       String r= year%100==0 ? (year%400==0 ? "leap" : "not leap") : year%4==0 ? "leap" : "not leap";
        System.out.println(r);
 */


        //NOTE: Java da kodlarimizi yazarken nested yapilardan mumkun oldugunca uzak durmaliyiz. Cunku bu tarz yapilar
        //      uygulamayi yavaslatir.(Time Consuming)
        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7
        /*



        Scanner scan = new Scanner(System.in);
        System.out.println("hafta ismi giriniz");
        String dayName = scan.nextLine();


        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);

        } else if (dayName.equalsIgnoreCase("monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("wednesday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("saturday")) {
            System.out.println(7);
        } else {
            System.out.println("gecersiz islem");
        }
*/
        /*


        Scanner scan = new Scanner(System.in);
        System.out.println("hafta ismi giriniz");
        String dayName = scan.nextLine();


        switch (dayName.toLowerCase()){
            case "sunday" :
                System.out.println(1);
                break;
            case  "monday" :
                System.out.println(2);
                break;
            case "tuesday" :
                System.out.println(3);
                break;
            case "wednesday" :
                System.out.println(4);
                break;
            case "thursday" :
                System.out.println(5);
                break;
            case "friday" :
                System.out.println(6);
                break;
            case "saturday" :
                System.out.println(7);
                break;
            default:
                System.out.println("gecersiz islem");

        }
*/


        /*
        Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
                   yazdiran kodu yaziniz.
                   8 ==> August - September - October - November - December



        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz");
        int numOfMonth = input.nextInt();


        switch (numOfMonth) {
            case 1:
                System.out.println("january");
            case 2:
                System.out.println("february");
            case 3:
                System.out.println("march");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august");
            case 9:
                System.out.println("september");
            case 10 :
                System.out.println("october");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("hatali islem");
        }
*/



        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz
        //           (Hesap makinesi)

/*


        Scanner scan = new Scanner(System.in);

        System.out.println("2 sayi giriniz");
        int a =scan.nextInt();
        int b =scan.nextInt();

        System.out.println("yapilacak islemi seciniz");
        char opr = scan.next().charAt(0);

        switch (opr){
            case '+' :
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-' :
                System.out.println(a + "-" + b  + "=" + (a-b));
        }
*/

         /*
         Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

        Kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("ulke ismi giriniz");
        String country = scan.nextLine();

        switch (country.toLowerCase()){
            case "america" :
                System.out.println("US");
                break;
            case "england" :
                System.out.println("UK");
                break;
            case"germany" :
                System.out.println("DE");
                break;
            default:
                System.out.println("hatali islem");

        }






    }
}
