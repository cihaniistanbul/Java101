package task;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {


        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        //Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
        //System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
        //kullanıcıya seçim içn işlem menusu yazdırdık






    /*  TASK :
     *  Kullanicidan 3 tene pozitif  tam sayi alniz.
     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
        INFO :
         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
        a=b=c ise es kenar ucgen

     */







        /* TASK :
         *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        INFO :
        BMI = kilo(kg)/(boy*boy)(m)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = input.nextDouble();

        double BMI = kilo/(boy*boy);

        if (kilo/(boy*boy)<=20){
            System.out.println("oldukca zayifsiniz");

        } else if (kilo/(boy*boy)>20 && kilo/(boy*boy)<=20){
            System.out.println("Normal sinirlardasiniz");

        } else if (kilo/(boy*boy)>25 &&kilo/(boy*boy)<=30 ) {
            System.out.println("Sisman kategorisindesiniz");

        } else if (kilo/(boy*boy)>30) {
            System.out.println("Obez grubundasiniz.");

        }












    /*  TASK :
         *  Kullanicidan IT alanini bilgisini alarak console'a
         *  meslegi = qa ==> Quality Analyst
                     dev ==> Developer
                      ba ==> Busines Analyst
                      pm ==> Project Manager
        bilgilileri yazdiriniz
         */

    /*
        TASK :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
         */







    }
}
