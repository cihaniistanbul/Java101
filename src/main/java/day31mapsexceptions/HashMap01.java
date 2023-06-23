package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        //HashMap arkasinda calisan mekanizma nasil?

        HashMap<String , String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.get("USA");
        capitals.put("Italy","Roma");
        capitals.put("Turkiye","Ankara");
        capitals.get("Turkiye");
        System.out.println(capitals.hashCode());


        //Java bucketlar icinde LinkList kullanir. Entryleri birbirine bagliyor. Indexte birden fazla entry olduysa
        // onlari node yapisi gibi birbirine baglar.

    }
}
