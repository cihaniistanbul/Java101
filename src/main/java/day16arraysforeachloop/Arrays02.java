package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek 1 : String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin icerdigi character sayilari
        //          toplamini ekrana yazdirin

        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "Music";
        arr[4] = "Art";

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); //[Math, Science, Music, Music, Art]

        System.out.println(arr[0].length() + arr[arr.length - 1].length()); //7
        //                                           son character
        // arr[0]-->Math,  bu bir String. Stringlerde character sayisini length() methodu ile yapiyorduk


        // Ornek 2 : String bir array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin icerdigi character sayisi
        //           toplamini ekrana yazdiriniz

        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Ankara";
        brr[3] = "Oslo";
        brr[4] = "Erzurum";


        // 1.yol for loop
        // tek tek butun elemanlarin character toplamini istiyor. tekrarli bir islem var. for loop kullaniriz
        // yapacagim islem sonucunda ortaya bir sayi cikacak (toplam character sayisi) bunun icin yeni bir sepete ihtiyacim var
        int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();
    //                              her iteration da 0,1,2,3,4 diye devam edecek ve length lerini alicaz
        }
        System.out.println(totalChar);


        //2.yol for each loop (enhanced loop)

        // baslangic degeri, loop un calisma sarti ve increment/decrement kismini kendisi halleder.
        // for-each-loop "Array" lerde ve "collection" larda kullanilir------


        /*

        kalibini olusturalim

        for ( DataType  w : arr/collection  ){
               calisacak kodlar
        }
       */

        int sum = 0; // bu elimde olmak zorunda. tek tek gezerken birikenleri sum a koyucam

     //                 [Miami, Istanbul, Ankara, Oslo, Erzurum] -->brr sepetinde bunlar var. tek tek w sepetine koyuyoruz
        for (String w : brr) {
            sum = sum + w.length();  // miami.length=5 ....
        }

        System.out.println(sum);//30


        //Ornek 3: Notlar adinda Integer bir array olusturunuz icine 6 tane not yerlestiriniz ve not ortalamasini ekrana yazdiriniz
        // ortalama icin tek tek gidip datalar uzerinde dolasmam lazim. o zaman for each loop kullanmam lazim
        //loop ile gezdikten sonra toplam elde edicem, onun icin toplam sepeti olusturucam

        int notlar [] = new int[6];
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;

        System.out.println(Arrays.toString(notlar)); //[50, 70, 60, 40, 90, 80]

        int toplam =0;

        for (int w : notlar){
            toplam=toplam+w;


        }
        System.out.println(toplam/ notlar.length);
        //                         dinamik olmasi icin boyle yazariz















    }
}
