package day13loops;

public class Loops02 {
    public static void main(String[] args) {

        //Ornek 1: 21 den 180 e kadar hem 2 hem 3 ile bolunebilen tamsayilari ekrana yazdiriniz

        for(int i = 21; i<181 ; i++){
            if(i%2==0 && i%3==0){
                System.out.print(i + "  ");

            }
        }

        //Ornek 2: Size verilen kucuk harf ile yazilmis String in index i cift sayi olan characterlerini buyuk harfe donusturen kodu yaziniz
        //         0 1 2 3 4 5
        //         a n k a r a  --> bizden cift olan indexleri buyuk yapmamiz isteniyor. AKR

        String s = "ankara";
                                                                //0 dan basla sepette bulunan character sayisina kadar git dedik length ile
        for(int i =0 ;  i<s.length()      ; i++    ){           // Dinamik olmasi icin length ile yaptik. i.length()-1 de yapabilirdik ama cok islem oluyor.Daha sade olmasini istiyoruz

            String ch = s.substring(i,i+1);                     //Tek tek index girip characterleri kontrol edicez.Cift olanlari Upper a donustur.Substring kullaniriz
                                                                //Eger substring(0,1) alirsam o hep 'a' yi alir. O zaman i kullaniyorum
            if(i%2==0){                                         //buraya if i suzgec olarak koyduk. Sadece cift i almak icin
                System.out.println(ch.toUpperCase());

            }

        }


        //Ornek 3: Verilen bir String ile ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java" --> "I love J"      -->a dan sonrakileri console yazdirmamizi istemiyor
        //burada neden loop kullanmaliyiz? Cunku a yi gorene kadar characterlere tek tek bakmam lazim. loop var


        String s1= "I love Java";                                        //  String sepeti uzerinde kontrol yapicam. Loop un String de bulunan character sayisi
        for (int i = 0; i <s1.length() ; i++) {                          //  kadar calismasi lazim ki tek tek hepsini kontrol edebilelim.Indexlerle calisacagi icin
                                                                         //   int i = 0 dedik. Cunku index her zaman 0 dan baslar. Bitmesi gereken yer character sayisi yani length

            char ch= s1.charAt(i);                                      //   charAt ile tek tek i nin 0 dan baslayip sona gelene kadar characterleri alacak console a "I love Java" yazdiracak
            if(ch =='a'){                                               //   soruda 'a' yi gordugu zaman break yapsin.
                break;
            }
            System.out.print(ch);

        }
        System.out.println();

        System.out.println("----");



        //Ornek 4: Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //    "Germany" --> yn

        String t = "Germany";                                           //  Tersten baslayip 1. indexi alsak, sonra bir sonrakine gecsek, a yi gorunce de dursak.

        for(int i = t.length()-1; i>=0 ; i--){                         //  'y' den baslamak istiyorum ve kodu dinamik yazmak istiyorum. Son character icin length()-1 --> t sepetindeki character sayisi 7 dir. 1 azalttik
                                                                       //  ilk indexe(0) kadar gidebilmek icin >=0 yazmam lazim. = demezsem G i gormez. Buraya kadar loop String de bulunan character sayisi kadar tersten calisiyor. 7 6 5 ..

            if(t.charAt(i)=='a')                                      // t sepetindeyken charAt(i) ne zaman ki 'a' oldu o zaman break;
                break;
            System.out.print(t.charAt(i));

        }

        /*
              charAt() ve substring() farki?
         --> charAt() kullandigimiz zaman bize char return eder
         --> substring() kullanirsak bu method bize String verir.

         Yukaridaki ankara orneginde String manipulation a devam edecegim icin sub kullandim. (toUpperCase)

         */


        /*
        Note :  Ornek 4 te Java soldan saga geliyor.  i e length()-1 atamisim.
                "Germany" --> length() = 7    o zaman i sepetinde 6 oluyor. Altinci indexten basla diyorum
                Sıra condition a geldi. i>=0  6>=0  true verir. Asagiya if() e iniyor
                "t.charAt(6)" --> 'y'  verir bana. Condition da y=='a' false. Bu durumda if body kapali. Break calismayacak.
                sout(t.charAt(6)--> 'y' console a y yazdirir

         */


    }
}
