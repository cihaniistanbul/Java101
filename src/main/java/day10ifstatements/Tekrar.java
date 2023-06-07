package day10ifstatements;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        /*
        Ornek: Verilen bir sayinin pozitif, negatif ya da notr oldugunu kontrol eden kodu yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num= scan.nextInt();

        if (num>0){
            System.out.println("Pozitif");
        } else if (num==0) {
            System.out.println("Notr");
        } else {
            System.out.println("Negatif");

        }
*/
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1 --> Pazar ,  2--> Pazartesi ....
        // 7 tane senaryomuz var. Kullanicinin yanlis girme ihtimaline karsi 1 tane else olustururuz 9 yaptı
        /*


        Scanner scan = new Scanner(System.in);
        System.out.println("Gun sayisi giriniz");
        int day = scan.nextInt();

        if (day == 1) {
            System.out.println("Pazar");
        } else if (day == 2) {
            System.out.println("Pazartesi");
        } else if (day == 3) {
            System.out.println("Sali");
        } else if (day == 4) {
            System.out.println("Carsamba");
        } else if (day == 5) {
            System.out.println("Persembe");
        } else if (day == 6) {
            System.out.println("Cuma");
        } else if (day == 7) {
            System.out.println("Cumartesi");
        }else {
            System.out.println("Hatali Giris");
        }

 */
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz
        //Kullanici bize data gondericek, bizde ona bakarak kacinci ay oldugunu söyleyecegiz
        // January--> 1...

        /*


        Scanner scan = new Scanner(System.in);
        System.out.println("Ay ismi giriniz");
        String month =scan.nextLine();

        if (month.equalsIgnoreCase("ocak")){
            System.out.println("1");
        } else if (month.equalsIgnoreCase("subat")) {
            System.out.println("2");
        }else if (month.equalsIgnoreCase("mart")) {
            System.out.println("3");
        }else if (month.equalsIgnoreCase("nisan")) {
            System.out.println("4");
        }else if (month.equalsIgnoreCase("mayis")) {
            System.out.println("5");
        }else if (month.equalsIgnoreCase("haziran")) {
            System.out.println("6");
        }else if (month.equalsIgnoreCase("temmuz")) {
            System.out.println("7");
        }else if (month.equalsIgnoreCase("agustos")) {
            System.out.println("8");
        }else if (month.equalsIgnoreCase("eylul")) {
            System.out.println("9");
        }else if (month.equalsIgnoreCase("ekim")) {
            System.out.println("10");
        }else if (month.equalsIgnoreCase("kasim")) {
            System.out.println("11");
        }else if (month.equalsIgnoreCase("aralik")) {
            System.out.println("12");
        }else {
            System.out.println("gecersiz islem");
        }
*/

        /*
        Example 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                   asagidaki tabloya gore yazdirab kodu olusturunuz
                   0-4     --> bebek
                   5-12    --> cocuk
                   13-20   --> genc
                   21-30   --> yetiskin
                   30 ustu --> Tanimlanmamis
                   Hata mesaji olarak "Gecerli bir yas giriniz" yazdiriniz.

         */

        /*


        Scanner scan = new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas =scan.nextInt();


        if (yas<0){
            System.out.println("gecersiz yas");
        }else if (yas<5){
            System.out.println("Bebek");
        } else if (yas<13) {
            System.out.println("cocuk");
        } else if (yas<21) {
            System.out.println("genc");
        } else if (yas<31) {
            System.out.println("yetiskin");
        }else {
            System.out.println("gecersiz yas");
        }
 */

        /* Example 1: Kullanicidan 3 tane sayi aliniz.
                     Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                     Eger ucgen ise “eskenar” Ucgen olma durumunu kontrol ediniz.
                     INFO :
                     Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                       herhangi iki kenar farki ucuncu kenardan kucuk olmali
                     a+b>c>|a-b|
                     a+c>b>|a-c|
                     b+c>a>|b-c|
                     a=b=c ise eskenar ucgen     */

        /*



        Scanner scan = new Scanner(System.in);

        System.out.println("3 sayi giriniz");

        double a =Math.abs(scan.nextDouble());
        double b = Math.abs(scan.nextDouble());
        double c = Math.abs(scan.nextDouble());


        boolean ucgenMi = (a+b>c && c>Math.abs(a-b) && a+c>b && b> Math.abs(a-c) && b+c>a && a>Math.abs(b-c));

       if (ucgenMi){
           System.out.println("Ucgen");
       }else {
           System.out.println("Ucgen degil");
       }

       if (a==c || a==b || b==c){
           System.out.println("Eskenar");
       }else {
           System.out.println("Eskenar degil");
       }


         */


        /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("3 sayi giriniz");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();




    }
}
