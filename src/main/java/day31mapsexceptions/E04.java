package day31mapsexceptions;

public class E04 {
    public static void main(String[] args) {

        String arr [] = {"J", "A", "V", "A"};
        getElementFromArray(arr,1);//A
        getElementFromArray(arr,5);//

    }

    //Array'lerde olmayan bir index kullanildiginda java ArrayIndexOutOfBoundsException atar
    public static void getElementFromArray(String[] s ,int idx){


        try {
            String el = s[idx];
            System.out.println(el);
        } catch (Exception e) {
            System.out.println(e.getMessage()); //Index 5 out of bounds for length 4
            System.out.println(e.getCause()); //null
        }


    }


}
