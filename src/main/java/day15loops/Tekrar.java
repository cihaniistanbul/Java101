package day15loops;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
  /*
           Example 1: Asagidaki sekli cizen kodu yaziniz
               Logic: İcerdeki loop un calisma limitini outer loop un o an ki degeri belirliyor
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5



        Scanner scan = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int row = scan.nextInt();

        for (int i =1; i<=row; i++){
            for (int k=1 ; k<=i ; k++){
                System.out.print(k + " ");
            }
            System.out.println();

        }

        //Ornek 1: 3ten 6 ya kadar tamsayilari console a yazdiriniz

        for(int i=3 ; i<7   ;i++   ){
            System.out.print(i + " ");

        }
        System.out.println();

        int k =3;
        while (k<7){
            System.out.print(k + " ");
            k++;

        }


        //Ornek 2 : 23 den 12 ye kadar cift sayilari console a yazdiriniz

        for (int i = 23; i > 11; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int k = 23;
        while (k > 11) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k--;
        }


        //Ornek 3 : 6 dan 19 a kadar tum tek sayilari console a yazdiriniz

        //1.yol
        for (int i =6; i<20     ; i++  ){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();


        //2.yol while
        int k= 6;
        while (k<20){
            if (k%2!=0){
                System.out.print(k + " ");
            }


            k++;
        }
  */

        /*
      Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
              3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30



        Scanner scan = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int num = scan.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(num + "x" +i+ "=" + (num*i) );
            i++;
        }




        //Example 2 : Verilen bir String de her harfin sonrasina "*" sembolu ekleyin
        //      Java --> J*a*v*a*



        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");

        String word = scan.next();
        String newWord = "";

        int i = 0;
        while (i<word.length()){
           newWord= newWord+word.charAt(i)+"*";
            i++;
        }
        System.out.print(newWord);



        //Example 3: Bir String deki tekrarsiz characterleri console a yazdiriniz
        // kertenkelle --> rtn
        //indexOf("k") --> 0
        //lastIndexOf("k") --> 6

        //indexOf("r") --> 2  ayni ise tekrarsiz
        //lastIndexOf("r") --> 2

        String s = "kertenkelle";
        String sonuc = "";

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
               sonuc = sonuc+ch;

            }
            i++;
        }

        System.out.println(sonuc);


        //Ornek 1: 5 den 3 e kadar tam sayilari console a yazdiriniz

        for (int i =5; i>2; i--    ){
            System.out.print(i + " ");

        }

        System.out.println();
        int i = 5;
        while (i>2){
            System.out.print(i +" ");
            i--;
        }

        int a = 5;

        do {
            System.out.println(a);
            a--;
        }while (a>2);
*/

        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz



           Scanner scan = new Scanner(System.in);



           do {
               System.out.println("Bir sayi giriniz");
               int num = scan.nextInt();

               if (num>=100){
                   System.out.println("Kazandiniz");

               }else{
                   System.out.println("Kaybettiniz");
                   break;
               }
           }while (true);


  */

        /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */


        Scanner scan = new Scanner(System.in);
        int counter = 0;


        do {
            if (counter == 4) {
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }


            System.out.println("Username i giriniz");
            String userName = scan.next();

            System.out.println("Password giriniz");
            String password = scan.next();

            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniza hosgeldiniz");
                break;
            }

            counter++;

        } while (true);


    }
}
