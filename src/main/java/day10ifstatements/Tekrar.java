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


        Scanner scan = new Scanner(System.in);

        System.out.println("3 sayi giriniz");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        boolean ucgenMi = (a + b > c && c > Math.abs(a - b) && a + c > b && b > Math.abs(a - c) && b + c > a && a > Math.abs(b - c));


        if (a <= 0 || a <= 0 || c <= 0) {
            System.out.println("Gecersiz islem");
        } else if (ucgenMi) {

            if (a == b && b == c & a == c) {
                System.out.println("Eskenar");
            } else if (a == b || b == c || a == c) {
                System.out.println("Ikızkenar");

            } else {
                System.out.println("Cesitkenar");
            }

        }else {
            System.out.println("Gecersiz islem");
        }
*/


        /*
                PASSWORD UN ILK HARFI BUYUK HARF ISE       ---burada nested yapisi oldugunu soyle anladik.
                                                           password buyuk mu degil mi diye kontrol ediyorum once.
                                                           eger buyukse gelip bas harfini kontrol ediyorum
                                                           ayni sey asagida da gecerli


                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli



                PASSWORD UN ILK HARFI KUCUK HARF ISE

                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli


        Scanner scan = new Scanner(System.in);
        System.out.println("passwordunuzu giriniz");
        String pwd = scan.nextLine();

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A') {
                System.out.println("Gecerli password");
            } else {
                System.out.println("gecersiz pwd");
            }
        } else if (pwd.charAt(0)>='a' && pwd.charAt(0)<='z') {


            if (pwd.charAt(0)=='z') {
                System.out.println("gecerli");
            }else {
                System.out.println("gecersiz");
            }
        }else {
            System.out.println("Gecersiz islem");
        }
       */


        //Nested If: Ic ice gecmis "If Statement" lar
        /*
        Kullanicidan bir sayi alin.
        Eger sayi pozitif ise; 10'dan buyuk olup olmadigini kontrol edin
        Eger 10'dan buyuk ise "Buyuksun!" yazdirin
        Eger 10'dan kucuk veya esit ise "Normalsin!" yazdirin

        Eger sayi pozitif degil ise; -10 dan buyuk olup olmadigini kontrol edin
        Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        Eger -10 dan kucuk veya esit ise "Cok Nsin!" yazdirin




        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();


        if (sayi>0){
            if (sayi>10){
                System.out.println("Buyuksun!");
            } else {
                System.out.println("Normalsin!");
            }


        }else {

                if (sayi>-10){
                    System.out.println("Negatifsin!");
                } else
                    System.out.println("Cok negatifsin!");

            }
           */

         /*
        Ornek:  Kullanicidan cinsiyetini girmesini isteyin

               Erkek ise yasini kontrol edin.
               Yasi 18 den kucuk ise ekrana "Erkek Cocuk" yazdirin
               Yasi 18 den buyuk ise ekrana "Adam" yazdirin

               Kadin ise yasini kontrol edin.
               Yasi 18 den kucuk ise ekrana "Kız Cocuk" yazdirin
               Yasi 18 den buyuk ise ekrana "Kadin" yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz");
        String c = scan.next();

        System.out.println("yasinizi giriniz");
        int y = scan.nextInt();

        if (c.equalsIgnoreCase("erkek")){
            if (y<18){
                System.out.println("erkek cocuk");
            }else {
                System.out.println("adam");
            }

        } else if (c.equalsIgnoreCase("kadin")) {
            if (y<18){
                System.out.println("kiz cocuk");
            }else {
                System.out.println("kadin");
            }
        }else {
            System.out.println("tanimsiz");
        }



         /*
        Ornek:  Kullanicidan bir harf girmesini isteyin.

                Girdigi harf kucuk harf ise harfin "a" olup olmadigini kontrol edin.
                Harf "a" ise ekrana "Ilk kucuk harf" yazdirin
                "a" degil ise ekrana "Ilk kucuk harf degil" yazdirin

                Girdigi buyuk harf ise harfin "Z" olup olmadigini kontrol edin.
                Harf "Z" ise ekrana "Son buyuk harf" yazdirin
                "Z" degil ise ekrana "Son buyuk harf degil" yazdirin


         */


        System.out.println("harf giriniz");
        char h = scan.next().charAt(0);

        if (h>'a' && h<'z'){
            if (h=='a'){
                System.out.println("ilk kucuk harf");
            }else{
                System.out.println("ilk kucuk harf degil");
            }
        } else if (h>'A' && h<'Z') {
            if (h =='Z'){
                System.out.println("son buyuk harf");
            }else {
                System.out.println("son buyuk harf degil");
            }
        }else {
            System.out.println("gecersiz islem");
        }


    }

    }

