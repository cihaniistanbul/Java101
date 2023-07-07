package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
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
        printCubeOfDistinctOddElements(nums); //729 2248091 3375
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums); //81 17161 81 225
        System.out.println();
        printProductOfSquaresOfDistinctEvenElements(nums); //45158400
        System.out.println();
        getMaxValue1(nums); //131
        System.out.println();
        getMaxValue3(nums);
        System.out.println();
        getMinValue(nums);
        System.out.println();
        getMinGreaterThanSevenEven(nums);//10
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
        "foreach" stream'de bulunan elemanlarin her biri icin demek. Foreach ile burada bulunan elemanlari alip tek tek
        t'nin icerisine koyuyoruz. Ne yapacaginida parantez icinde soyluyoruz.
        */


    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1(List<Integer> nums) {

        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }

    }


    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Functional)
    public static void printEvenElements2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));

    }

    //"filter()" bir collection uzerinde belirli bir kosula uyan ogeleri filtreler

    //Functional programming'de code yazarken "." dan sonra satiri asagiya indirmek code'larin okunabilir olmasi icin
    //onemlidir. Daha readable oluyor.


    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements(List<Integer> nums) {

        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));


        // "map()" methodu stream'deki her bir elemanla ilgili degisiklik yapacagimiz zaman kullanilir.
    }


    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums) { //method

        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));


        //"distinct()" methodu tekrarlayan ogeleri kaldirir sadece benzersizler kalir.
        //bu methodu en basta kullanirsak javayi daha az yormus oluruz. Bastan eleyerek gidiyoruz. best practice'dir
    }


    //7)Bir list'teki "tekrarsiz" "CIFT "
    // ELEMANLARIN "karelerinin" "toplamını" hesaplayan method oluşturun

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        Integer sum = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum); //456
    }

    //"reduce()" methodu coklu datanin tek bir degere indirgenmesi gerektiginde kullanilir (azaltma)


    /*
        >map() methodu stream de bulunan her bir elemanda degisiklik yapilacagi zaman kullanilir.
        >filter() methodu stream icerisinde belirli datalari cekmek icin kullanilir
        >stream() methodu listteki elemanlari akis haline getirir. Hafizada yer tutmaz.
        >forEach() methodu streamdeki her elemani alip yazdirmaya yarar.
        >distinct() methodu stream deki elemanlarin tekrarsiz olanlarak kullanmaya yarar. stream den sonra kullanmak
            Java'yi yormamak icin best practice.
        >reduce() streamde coklu datanin tek bir dataya indirgenecegi (reduction) zaman kullanilir.
            identity ==> etkisiz eleman yazilir
         */


    //8) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void printProductOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        Integer product = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(product);

    }


    //9) Verilen List'teki "maksimum degeri" bulmak icin bir method olusturun
    //1.yol
    public static void getMaxValue1(List<Integer> nums) {
        Integer max =
                nums.
                        stream()
                        .distinct()
                        .reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);//131

    }

    //2.yol
    public static void getMaxValue2(List<Integer> nums) {
        Integer max =
                nums.
                        stream()
                        .distinct()
                        .reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);

    }


    //3.yol
    public static void getMaxValue3(List<Integer> nums) {
        int max =
                nums.
                        stream().
                        distinct().
                        sorted().reduce((t, u) -> u).get();
        System.out.println(max);
    }


    //4.yol  -->best practice bu yoldur
    public static void getMaxValue4(List<Integer> nums) {
        int max =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce(Math::max).get();
        System.out.println(max);
    }


    //10)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun

    //1.yol
    public static void getMinValue(List<Integer> nums) {
        int min =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce(Math::min).get();
        System.out.println(min);
    }

    //2.yol
    public static void getMinValue1(List<Integer> nums) {
        int min =
                nums.
                        stream().
                        distinct().
                        reduce((t, u) -> t > u ? u : t).get();
        System.out.println(min);//4
    }

    //3.yol
    public static void getMinValue2(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.println(min);


}



    //4.yol
    public static void getMinValue3(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);

}




    //5.yol
    public static void getMinValue4(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().reduce((t,u)->Math.min(t,u)).get();
        System.out.println(min);

    }



    //11)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 -->10 -->7 den buyuk en kucuk cift sayi
    public static void getMinGreaterThanSevenEven(List<Integer> nums){
      Integer min =
              nums.
                      stream().
                      filter(t->t>7 && t%2==0).
                      sorted(). //10,12,14
                      reduce((t,u)->t).get();
        System.out.println(min);
    }


    /*
          t baslangic degerini identity den alir, sonraki degerlerini action dan alir
            u tum degerlerini streamden alir
            t identity olmadigindan degerini streamden alir u da streamdeki diger degeri alir
            identity kullanmadigimizda Optional veri dondurur.
        >get() methodu Optional <Integer>'i int'e cevirir.
        >Comparator.reverseOrder() methodu sorted yapilan verileri ters cevirir.
        >sorted() methodu parantez icerisinde istenilen siralama methoduna gore siralar.

         */


}