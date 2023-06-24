package day32exceptions;

public class E03 {
    public static void main(String[] args) {

        /*
         "throw" keyword bir methodun body'si icinde istedigimiz yerde, istedigimiz kosullar icin
         istedigimi kadar Exception atmamizi saglar

         throw keyword yazildiktan sonra bir Exception class object'i olusturulur

         Exception class constructor'inin parantezi icine istediginiz Exception mesajini yazabilirsiniz
         */

        try {
            printAge(-63);

        } catch (IllegalArgumentException e) { //Age cannot be negative
            System.err.println(e.getMessage());
        }


    }


    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");

        } else {
            System.out.println(age);
        }


    }
}
