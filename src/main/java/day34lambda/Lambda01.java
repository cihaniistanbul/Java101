package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        /*
        1) Lambda "Functional Programming"dir, digeri "Structured Programming"
        2) "Functional Programming"te "Ne yapilacak" (What to do) uzerine yogunlasilir.
           "Structured Programming"te "Nasil yapilacak" (How to do) uzerine yogunlasilir
         */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);


        printElements1(nums); //12 9 131 14 9 10 4 12 15
        System.out.println();
        printElements2(nums); //12 9 131 14 9 10 4 12 15
        System.out.println();
        printEvenElements1(nums); //12 14 10 4 12
        System.out.println();
        printEvenElements2(nums); //12 14 10 4 12
        System.out.println();
        printSquareOfOddElements(nums); //81 17161 81 225
        System.out.println();
    }
    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Structured == Yapisal)

    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }

    }


    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Functional)

    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));
    }

       /*
       "t" Stream'de bulunan her bir elemani alip tek tek t'nin icerisine koyacak
       "t-> " lambda expression demek.
        Action'i stream ile veriyoruz ve list'in yapisini degistiyoruz. "stream" demek akis demek. Stream methodunu
       kullandiktan sonra yapimiz degisti. yatis modundan akis moduna gecildi.
        "foreach" stream'de bulunan elemanlarin her biri icin demek. Foreach ile burada bulunan elemanlari alip tek te
        t'nin icerisine koyuyoruz. Ne yapacaginida parantez icinde soyluyoruz.
        */


    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1(List<Integer> nums) {

        for ( Integer w : nums) {
            if (w%2==0){
                System.out.print(w + " ");
            }
        }

    }



    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Functional)
    public static void printEvenElements2(List<Integer> nums) {
        nums.
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+" "));

    }

    //"filter()" bir collection uzerinde belirli bir kosula uyan ogeleri filtreler

    //Functional programming'de code yazarken "." dan sonra satiri asagiya indirmek code'larin okunabilir olmasi icin
    //onemlidir. Daha readable oluyor.


    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements(List<Integer>nums){

        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t+ " "));


       // "map()" methodu stream'deki her bir elemanla ilgili degisiklik yapacagimiz zaman kullanilir.
    }

}