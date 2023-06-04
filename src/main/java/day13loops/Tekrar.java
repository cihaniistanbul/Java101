package day13loops;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        /*
        Ornek: Kullanici haftanin gununun sayisini girsin program haftanin gununu yazsin
               7 --> Pazar

        Scanner scan = new Scanner(System.in);
        System.out.println("Gun sayisi giriniz");
        int day = scan.nextInt();

        switch (day){
            case 1 :
                System.out.println("Monday");
                break;

            case 2:
                System.out.println();
        }

  */


        //Ornek: Kullanicidan ay ismini alin ekrana kacinci ay oldugunu yazdirin
/*


        Scanner scan = new Scanner(System.in);
        System.out.println("Ay sayisi giriniz");
        String ay = scan.next();

        switch (ay.toLowerCase()){
            case "ocak" :
                System.out.println(1);
            break;

            case "subat" :
                System.out.println(2);
                break;

            case "mart" :
                System.out.println(3);
                break;

            case "nisan" :
                System.out.println(4);
                break;

            case "mayis" :
                System.out.println(5);
                break;

            case "haziran" :
                System.out.println(6);
                break;

            case "temmuz" :
                System.out.println(7);
                break;

            case "agustos" :
                System.out.println(8);
                break;

            case "eylul" :
                System.out.println(9);
                break;

            case "ekim" :
                System.out.println(10);
                break;

            case "kasim" :
                System.out.println(11);
                break;

            case "aralik" :
                System.out.println(12);
                break;

            default:
                System.out.println("Gecerli bir ay ismi giriniz");
        }


        //ornek: 11 den 14 e kadar tum sayilari ekrana yazdiran kodu yaziniz
        for (int i = 11 ; i<15  ; i++){
            System.out.println("Hi");
        }

        //Ornek 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz
        for (int i = 40 ; i>22       ; i--    ){
            if (i%2==0){
                System.out.println(i);
            }
        }

        //Ornek 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz
        for (int i = 18; i<57    ; i++     ) {
            if (i%2!=0){
                System.out.print(i + "  ");
            }
        }

        //Ornek 1: 21 den 180 e kadar hem 2 hem 3 ile bolunebilen tamsayilari ekrana yazdiriniz

        for (int i = 21; i<181;   i++){
            if (i%2==0 && i%3==0){
                System.out.println(i);

            }
        }

//Ornek 2: Size verilen kucuk harf ile yazilmis String in index i cift sayi olan characterlerini buyuk harfe donusturen kodu yaziniz
        //         0 1 2 3 4 5
        //         a n k a r a  --> bizden cift olan indexleri buyuk yapmamiz isteniyor. AKR

        String s = "ankara";
        for (int i = 0 ; i<s.length() ; i++){

            String ch= s.substring(i,i+1);
            if (i%2!=0){

            System.out.println(ch.toUpperCase());

            }

        }

        //Ornek 3: Verilen bir String ile ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java" --> "I love J"
        //burada neden loop kullanmaliyiz? Cunku a yi gorene kadar characterlere tek tek bakmam lazim. loop var

        String s1= "I love Java";
        for (int i = 0; i<s1.length() ;   i++){
           char ch = s1.charAt(i);
           if (ch=='a'){
               break;
           };

            System.out.println(ch);

        }
        System.out.println();

        //Ornek 4: Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //    "Germany" --> yn

        String t = "Germany";

        for (int i= t.length()-1 ;  i>=0 ;   i--  ){
            if (t.charAt(i)=='a'){
                break;

            }
            System.out.println(t.charAt(i));
        }


        //Ornek: Verilen bir String de kucuk harfleri console a yazmayiniz
        //   "" --> P12?A

        String s = "Pwd12?Ab";

        for (int i=0 ; i<s.length()    ;  i++    ){
           char ch = s.charAt(i);

           if (ch>='a' && ch<='z'){
               continue;

           }else {
               System.out.print(ch);
           }

        }


        //Ornek 2: 11 den 14 e kadar tum sayilari ekrana yazdiran kodu yaziniz

        for(int i = 11 ; i<15     ; i++    ){
            System.out.print(i + " ");

        }
        System.out.println();
        //Ornek 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz                 --> i-=2 yapsaydik dinamik olmazdi

        for ( int i =40  ; i>22    ;  i-- ){
            if (i%2==0)
            System.out.print(i + " ");
        }

        System.out.println();

        //Ornek 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz
        for(int i = 18   ; i<57     ; i++   ){
            if (i%2!=0)
                System.out.print(i + " ");

        }

        System.out.println();



        //Ornek 1: 21 den 180 e kadar hem 2 hem 3 ile bolunebilen tamsayilari ekrana yazdiriniz
        for (int i = 21 ; i<181    ; i++    ){
            if (i%2==0 && i%3==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();



        //Ornek 2: Size verilen kucuk harf ile yazilmis String in index i cift sayi olan characterlerini buyuk harfe donusturen kodu yaziniz
        //         0 1 2 3 4 5
        //         a n k a r a  --> bizden cift olan indexleri buyuk yapmamiz isteniyor. AKR

        String s = "ankara";
        for (int i = 0; i<s.length()  ; i++ ){
            String ch =s.substring(i,i+1);
             if (i%2==0){
                 System.out.print(ch.toUpperCase()+ " ");
             }
        }

        System.out.println();

        //Ornek 3: Verilen bir String ile ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java" --> "I love J"      -->a dan sonrakileri console yazdirmamizi istemiyor
        //burada neden loop kullanmaliyiz? Cunku a yi gorene kadar characterlere tek tek bakmam lazim. loop var

        String s1 = "I love Java";

        for (int i = 0 ; i<s1.length()     ; i++    ){

            char ch = s1.charAt(i);
            if (ch =='a'){
                break;

            }
            System.out.println(ch);

        }

        System.out.println();



        //Ornek 4: Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //    "Germany" --> yn

        String t= "Germany";

        for (int i = t.length()-1; i>=0     ; i--    ){
            if (t.charAt(i)=='a'){
                break;


            }
            System.out.println(t.charAt(i));
        }
*/

        /*
        Note :  Ornek 4 te Java soldan saga geliyor.  i e length()-1 atamisim.
                "Germany" --> length() = 7    o zaman i sepetinde 6 oluyor. Altinci indexten basla diyorum
                Sıra condition a geldi. i>=0  6>=0  true verir. Asagiya if() e iniyor
                "t.charAt(6)" --> 'y'  verir bana. Condition da y=='a' false. Bu durumda if body kapali. Break calismayacak.
                sout(t.charAt(6)--> 'y' console a y yazdirir

         */


        //Ornek: Verilen bir String de kucuk harfleri console a yazmayiniz
        //   "Pwd12?Ab" --> P12?A


        String s = "Pwd12?Ab";

        for (int i = 0; i<s.length()    ; i++   ){

            char ch = s.charAt(i);

            if (ch>'a' && ch<'z'){
                continue;

            }else{
                System.out.print(ch);
            }

        }





    }
}

