package day15loops;

import java.util.Scanner;

public class WhileLoopKonu1 {
    public static void main(String[] args) {




        /*
        --> For loop kalibi

        for ( baslangic degeri ; loop calisma kurali  ;  artirma/azaltma){

            calisacak kodlar /sout
        }




        --> While loop kalibi

            Sadece soz syntax indeki yeri degisiyor

        baslangic degeri
                while(loop calisma kurali){
                    calisacak kodlar
                    artirma azaltma
        }

        Note: For loop ile yapacaginiz her seyi while loop ile yapabilirsiniz.
              Aralarinda sadece syntax farki var
         */


        //Ornek 1: 3ten 6 ya kadar tamsayilari console a yazdiriniz
        //1.yol : for loop
        for (int i = 3; i < 7; i++) {
            System.out.println(i + " ");
        }


        //2.yol
        int k = 3;
        while (k < 7) {
            System.out.println(k + "");    // k 7 den kucuk oldugu muddetce body i calistir ve 1 artir, scope u bitir
            k++;
        }

        System.out.println();


        //Ornek 3 : 6 dan 19 a kadar tum tek sayilari console a yazdiriniz
        int i = 6;
        while (i < 20) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

            i++;  //increment-decrement i scope dan 1 once yazariz
        }


        //while-loop kullanarak "Java kolaydir" Stringini tersten yazdiriniz
        String s = "Java kolaydir";

        int n = s.length() - 1; //--> tersten yazdirirken baslangic degerimiz son indexti
        while (n >= 0) {
            System.out.println(s.charAt(n)); //s stringinden characteri alicam
            n--;
        }


        //Kullanicidan isim ve soyismini alin
        //Kullanicinin ilk isminin ilk harfinden, soy isminin son harfine kadar olan tum harfleri buyuk harf olarak ekrana
        //ayni satirda aralarina bosluk birakarak yaziniz --> Ali Kemal --> A B C D  .. L

        Scanner input = new Scanner(System.in);

        System.out.println("İsminizi giriniz");
        //kullanicinin ismini aldim buyuk harfe cevirdim, bana ilk character lazim onu da charAt ile aldim
        char ilkHarf = input.nextLine().toUpperCase().charAt(0); //bunu hafizada buyuk harf olarak sakliyor

        System.out.println("Soy isminizi giriniz");
        String soy = input.nextLine().toUpperCase();
        //burada henuz tanimiyor last'i o yuzden son characteri alamadim
        char sonHarf = soy.charAt(soy.length() - 1); //charAt ile soy ismin son characterini aldim

        if (ilkHarf <= sonHarf) {

            while (ilkHarf <= sonHarf) {
                System.out.println(ilkHarf + " ");
                ilkHarf++;
            }
        } else {
            while (sonHarf <= ilkHarf) {  //Tufan Kar durumu icin boyle yazdik.
                System.out.println(sonHarf + " ");
                sonHarf++;
            }
        }





        //3 basamakli 4 ve 6 ya tam bolunebilen tamsayilari buyukten kucuge ekrana yazdiriniz
        //Bu sayilari kac tane oldugunu da ekrana yazdiriniz (counter ı 0 dan baslatip m her artirdiginda counteri da 1 artir diyorum

        int m = 999;

        int counter=0;

        while (m>=100){
           if (m%4==0 && m%6==0){
               System.out.print(m + " ");
               counter++;
           }
            m--;
        }
        System.out.println();
        System.out.println(counter);






    }
}
