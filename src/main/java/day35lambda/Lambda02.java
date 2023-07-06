package day35lambda;

import java.util.ArrayList;
import java.util.List;

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
    }

    //7) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.

    public static void removeIfLengthGreaterThanFive(List<String> myList) {
        myList.removeIf(t->t.length()>5);
        System.out.println(myList); //[Ali, Elif, Yusuf, Elif]
    }


    //removeIf() methodu list imdeki elemanlari siler, icinde filter methodu calisiyor
    //removeIf() methodu, bir koleksiyondan belirli bir kosulu saglayan ögeleri kaldirmak icin kullanilir
    //hangi kosula gore silsin onu soyluyoruz kisacasi

    }

