package task;


import java.util.Scanner;

public class Task {
    public static void main(String[] args) {



    /*  TASK :
     *  Kullanicidan 3 tane pozitif  tam sayi aliniz.
     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

        INFO :
         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
        a=b=c ise es kenar ucgen


 */

        Scanner input = new Scanner(System.in);
        System.out.println("3 tane pozitif tamsayi yaziniz..");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenMi = (a + b > c && c > Math.abs(a - b) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c)));

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Pozitif tamsayi giriniz");

        } if (ucgenMi) {

        }
        if (a == b && b == c && a == c) {
            System.out.println("Eskenar ucgen");

        } else if (a != b || b != c || a != c) {
            System.out.println("Eskenar ucgen degil");

        } else {
            System.out.println("Ucgen degildir");
        }



    }
}


