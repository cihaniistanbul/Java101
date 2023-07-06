package day35lambda;

import java.util.ArrayList;
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


    //collect(Collectors.toList() methodu streamde bulunan akistaki elemanlari alip bir list'in icinde bize verecek
}


//collect(Collectors.toList() methodu streamde bulunan akistaki elemanlari alip bir list'in icinde bize verecek
