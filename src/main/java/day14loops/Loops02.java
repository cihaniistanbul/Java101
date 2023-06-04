package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ornek: 5den 8e kadar tamsayilarin toplamini veren kodu yaziniz              --> belirli bir sayidan belirli bir sayiya kadar tamsayi toplamini nasil
        // 5+6+7+8=26                                                                     elde ederiz sorusu

        int sum = 0;                                                                   // Yapacaginiz islem sonrasinda ortaya yeni bir data cikiyorsa bunun icin
                                                                                       // bir reserved area olusturun . Toplam sepeti olusturucam ve ona toplamlari
                                                                                       // koyucaz. Toplamin kendisini aradigim icin etkisiz eleman olan "0" koydum

        for (int i = 5  ; i<9   ; i++   ){

            sum = sum+i;                                                               // i'yi sum sepetiyle toplucam. sum sepetinde 0 var.sonra tekrar sum a koy
        }
        System.out.println(sum);



        //Ornek 2 :  7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        // 7*8*9= 504

        int multiply= 1;

        for (int i = 7 ; i<10 ; i++){
            multiply = multiply*i;
            System.out.println(multiply);
        }
        System.out.println(multiply);


        //Ornek 3 : Verilen bir tamsayinin rakamlari toplamini bulan kodu yaziniz       -->578 % 10 = 8   578 / 10 = 57..
        //578 --> 5+7+8=20

        int toplam = 0;
        int n = -578;
        n = Math.abs(n);

        for (int i =578 ; i>0    ; i=i/10  ){                                           // Baslangic noktamizi direk sayiyla yapicaz.Cunku sayiyi alip %10 yapicaz
                                                                                        // Decrement i son haneyi silmeyle yani /10 ile yaptik

            toplam = toplam + i%10;                                                     // Buradaki i%10--> sayiyi bu sekilde alabiliyorum. İlk iteration da 578 in
                                                                                        // 8 ini almak istiyorum o zaman %10 yaparim bu sekilde bana 8 verir
        }
        System.out.println(toplam);


        /*
        --> Loop calisma kuralim : 578>0 true , iceriye inise izin var.
            i%10 => 578%10=8 verir.
            toplam = toplam + i%10 => 0+8 , toplam=8 toplam sepetimde 8 var.

            Loop icerisinde yapilacak baska bir is yok. Decrement part a gelicez.
            i=i/10 burada 578/10= 57 ,  i=57 oldu
            Loop condition: 57>0 true
            57%10=7  toplam = toplam+7 --> toplam sepetimde 8 vardi ...
            57/10=5


         --> -578 verseydi loop calismazdi. i>0
              Once bir variable olustur daha sonra Math.abs sepetine koy.
         */




    }
}
