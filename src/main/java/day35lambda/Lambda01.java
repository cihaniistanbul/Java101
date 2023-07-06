package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementExceptStartsWithE(myList); //Ali Yusuf Zeynep Mustafa
        System.out.println();
        printDistinctElLengthLessThanFive(myList); //Ali Elif
        System.out.println();
        List<String> newList = getElementsLengthMoreThanFiveWithUpper(myList); //[ZEYNEP, MUSTAFA]
        System.out.println(newList);
        printElementLengthLessThanFiveUniqueWithLowerCase(myList); //ali elif
        System.out.println();
        printElementsUniqueToUpperCaseSorted(myList); //ALİ ELİF MUSTAFA YUSUF ZEYNEP
        System.out.println();
        printElementUniqueLowerCaseSortWithLength(myList); //ali elif yusuf zeynep mustafa
        System.out.println();

    }

    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.

    public static void printElementExceptStartsWithE(List<String> myList) {
        myList.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));
    }



    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.

    public static void printDistinctElLengthLessThanFive(List<String> myList) {
        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                forEach(t -> System.out.print(t + " "));

    }


    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method'u olusturunuz.

    public static List<String> getElementsLengthMoreThanFiveWithUpper(List<String> myList) {
        return myList.
                stream().
                filter(t -> t.length() > 5).
                map(t -> t.toUpperCase()).
                collect(Collectors.toList());
    }

    //method reference tavsiye edilir
    public static List<String> getElementsLengthMoreThanFiveWithUpper2(List<String> myList) {
        return myList.
                stream().
                filter(t -> t.length() > 5).
                map(String::toUpperCase). //Class Name ::method --> method reference
                collect(Collectors.toList());
    }


    //collect(Collectors.toList() methodu streamde bulunan akistaki elemanlari alip bir list'in icinde bize verecek
    //collect() methodu bir streamdeki elemanlari list icerisine koyup verir.


    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak
    // kucuk harflerle natural order da console'a yazdiran method'u olusturunuz.

    public static void printElementLengthLessThanFiveUniqueWithLowerCase(List<String> myList) {
        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                map(t -> t.toLowerCase()).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }


    //method reference
    public static void printElementLengthLessThanFiveUniqueWithLowerCase2(List<String> myList) {
        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                map(String::toLowerCase).
                sorted().
                forEach(Utils::printInTheSameLineWithSpace); //burada util class'indan faydalandik. buradaki kullanim best practice
    }



    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    public static void printElementsUniqueToUpperCaseSorted(List<String> myList) {
        myList.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }

    //method reference
    public static void printElementsUniqueToUpperCaseSorted2(List<String> myList) {
        myList.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(Utils::printInTheSameLineWithSpace); // burayida cevirdik. t yazmaktan kurtulmus olduk
    }




    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore
    // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void printElementUniqueLowerCaseSortWithLength(List<String> myList) {
        myList.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));
    }


    //method reference
    public static void printElementUniqueLowerCaseSortWithLength2(List<String> myList) {
        myList.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)). //burada :: ile methodlardan faydalandik, string class'indan
                forEach(Utils::printInTheSameLineWithSpace); //util class'indan aldik
    }

    //siralamanin kuralini siz belirliyorsaniz sorted parantezi icerisine "Comparator.comparing" kullanilir

    //projenizde tekrar tekrar lazim olacak methodlari alip util class'ina koyarsiniz, daha sonra oradan rahatlikla
    //kullanirsiniz

    //javanin olusturdugu hazir methodlari method reference seklinde kullanmamiz lazim. code yazmaktan kurtulmaliyiz


    ////Class Name ::method --> method reference ile


}



