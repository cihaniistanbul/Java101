package day16arraysforeachloop;

import day04scannerwrapper.ScannerDeneme;

import java.util.Arrays;
import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {

        /*
        1) Coklu deger yerlestirebiliyoruz. Birden fazla degeri depolamak icin kullanilabilir.
        2) Array'lere konulan degerlerin data type lari hep ayni olmalidir.
        3) Array olustururken mutlaka kac eleman yerlestirecegimizi belirtmemiz gerekir.
        4) Array'lerde sadece a)primitive ve b)reference lar depolanabilir. (Array'in icinde String depolayamayiz)
        5) Array'leri yazdirmak icin "Arrays.toString()" methodu kullanilir.
        6) Array'deki elemanlari birer birer ekrana yazdirmak for loop ile yapiliyor
        7) String Array'lerde sort() methodu alfabetik siralama yapar
           Integer Array'lerde sort() methodu kucukten buyuge siralar -->Ascending order
           Kucukten buyuge siralama ve alfabetik siralama yerine "Natural Order" kullanilir
         */

        //Array olusturmak
        int a[] = new int[4]; //Bir array olusturdum, icinde 4 kisilik yer var.Eger deger atamasi yapmazsam
        //                     Java integer lar icin default deger olan 0'ı koyar. [0, 0, 0, 0] olur


        //System.out.println(a); --> [I@58ceff1   bu sekilde yazdirirsam ekrana reference degerini getirir.

        //Array i console a yazdirmak
        System.out.println(Arrays.toString(a)); //[0, 0, 0, 0]


        //Array' eleman eklemek: (indexlerle calisiyor.)
        a[0] = 8;  // --> "a" Array inde index'i 0 olan elemana 8 yolla.

        System.out.println(Arrays.toString(a)); //[8, 0, 0, 0]


        a[2] = 15;
        System.out.println(Arrays.toString(a)); //[8, 0, 15, 0]

        a[3] = 8;
        System.out.println(Arrays.toString(a));

        a[1] = 23;
        System.out.println(Arrays.toString(a));


        //Array'de kac eleman oldugunu bulmak:
        System.out.println(a.length);


        //String Array olusturunuz (Not kisminda String kullanilmaz demistik.Java reference'dan getiriyor degeri)
        String b[] = new String[3];
        System.out.println(Arrays.toString(b)); //[null, null, null] -->String'in default degeri null

        b[0] = "Ali";
        System.out.println(Arrays.toString(b)); //[Ali, null, null]

        b[2] = "Kemal";
        System.out.println(Arrays.toString(b)); //[Ali, null, Kemal]


        //Bir Array'den specific bir elemani yazdirmak
        System.out.println(b[2]); //indexi yaziyoruz


        //b Array'indeki elemanlari alt alta console'a yazdiriniz
        b[0] = "Ali";
        b[1] = "Ayse";
        b[2] = "Kemal";

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        //a Array'indeki elemanlari ayni satira onlerine "*" koyarak tersten yazdiriniz [8, 23, 15, 8]
        for (int i = a.length - 1; i >= 0; i--) { //tersten yazdir dedigi icin length-1 ile basladik
            System.out.print("* " + a[i]);  //[* 8* 15* 23* 8]
        }

        System.out.println();

        //a Array'inde index'i cift olan elemanlari yazdiriniz

        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                System.out.println(a[i]);

            }
        }


        //Array'deki elemanlari kucukten buyuge(ascending order) siralamak

        //a Array'indeki elemanlari kucukten buyuge siralayiniz
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); //[8, 8, 15, 23]


        //sort() methodunu b array'i icin kullaniniz
        Arrays.sort(b);
        System.out.println(Arrays.toString(b)); //[Ali, Ayse, Kemal]


        /*
        Kullaniciya kac elemanli bir array girecegini sorun
        Kullanicidan array'in elemanlarini girmesini isteyin.
        a)Bu array'in tum elemanlarini ekrana yazdirin.
        b)Bu array'in son elemanini ilk eleman yapin ve tum elemanlarini ekrana yazdirin.
        Mesela array {1,2,3} ise ekrana {3,2,1} seklinde yazdirin
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Array'in length'ini giriniz");
        int lenght = scan.nextInt();

        int arr[] = new int[lenght];

        int i = 0;

        do {
            System.out.println("Lutfen array'in index'i " + i + " olan elemanini giriniz");
            arr[i] = scan.nextInt();
            i++;
        } while (i < lenght);

        System.out.println(Arrays.toString(arr));

        int newArr[] = new int[lenght];

        newArr[0] = arr[arr.length - 1];

        for (int j = 1; j < arr.length; j++) {
            newArr[j] = arr[j - 1];

        }
        System.out.println(Arrays.toString(newArr));


    }
}
