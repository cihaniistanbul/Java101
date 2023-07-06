package day35lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");


        removeIfLengthGreaterThanFive(myList);
        System.out.println();
        removeIfElementsStartsWithZOrEndsWithf(myList);
        System.out.println();
        removeIfElementsStartsWithZOrEndsWithf2(myList);
        System.out.println();

        System.out.println(getSumFromSevenToSeventy()); //2464

        int multilication1 = getMultiplicationFromThreeToNine();
        System.out.println(multilication1); //181440

        System.out.println(getMultiplicationFromThreeToNine2()); ////181440

        System.out.println(getFactorial(-5)); //120


    }

    //7) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.

    public static void removeIfLengthGreaterThanFive(List<String> myList) {
        myList.removeIf(t -> t.length() > 5);
        System.out.println(myList); //[Ali, Elif, Yusuf, Elif]
    }


    //removeIf() methodu list imdeki elemanlari siler, icinde filter methodu calisiyor
    //removeIf() methodu, bir koleksiyondan belirli bir kosulu saglayan ögeleri kaldirmak icin kullanilir
    //hangi kosula gore silsin onu soyluyoruz kisacasi


    //8) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.

    public static void removeIfElementsStartsWithZOrEndsWithf(List<String> myList) {
        //1.yol
        myList.removeIf(t -> t.charAt(0) == 'Z' || t.charAt(t.length() - 1) == 'f');
        System.out.println(myList);
    }


    //2.yol
    public static void removeIfElementsStartsWithZOrEndsWithf2(List<String> myList) {
        //1.yol
        myList.removeIf(t -> t.startsWith("Z") || t.endsWith("f"));
        System.out.println(myList);
    }


    //9) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).
                reduce(Math::addExact).//bu sekilde kullanirsak optional veriyordu
                        getAsInt();

    }


    //IntStream --> integer'lari yukaridan asagiya dizer. Ama hangi araligi istedigini vermemiz gerekiyor. kisacasi
    //              integer'lardan bir stream olusturuyor
    //addExact -->

    // Note : Bize bir list verilmezse, baslangic bitis degerleri verilirse rangeClosed() ile


    //10)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //1.yol
    public static int getMultiplicationFromThreeToNine() {
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();

    }


    //2.yol
    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.
                range(3, 10).
                reduce(Math::multiplyExact).
                getAsInt();

    }


    //11)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz. (interview q.)

    public static int getFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Faktoriel islemi negatif sayilarla yapilamaz");
            return -1;
        } else {
            return
                    IntStream.
                            rangeClosed(1, x).
                            reduce(Math::multiplyExact).
                            getAsInt();
        }
    }


    // rangeClosed() kullanildiginda ikinci sayi birinci sayidan kucuk olamaz. ya esit olacak ya da ikinci sayi birinci
    // sayidan buyuk olacak


}

