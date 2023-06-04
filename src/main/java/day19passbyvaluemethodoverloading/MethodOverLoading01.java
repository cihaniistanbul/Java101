package day19passbyvaluemethodoverloading;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        add(3, 5);


    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }


    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    /*
    1) Method Overloading yaparken isim degistirilmez
    2) Method Overloading yaparken parametreler degistirilir
        a) Parametreleri degistirirken, parametrelerin data type lari degistirilebilir
        b) Parametreleri degistirirken, parametrelerin sayisi degistirilebilir
        c) Parametre degistirirken, parametrelerin data type lari farkli ise yerleri degistirilebilir
    3) Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir
       bu yuzden ismi ve parametre "Method Signature" olarak adlandirilir

    4) Method Overloading olustururken return type i degistirmenin hicbir etkisi yoktur
       Method Overloading olustururken access modifier i degistirmenin hicbir etkisi yoktur
       Method Overloading olustururken method u static ya da non-static yapmanin hicbir etkisi yoktur
       Method Overloading olustururken body i degistirmenin hicbir etkisi yoktur

    5) "private" methodlar ovearload edilebilir. Cunku method overloading sadece bir class icinde olur
        private olmak ise baska class lara gidildiginde problem olusturur

    6) static methodlar overload edilebilir
       overloading yapmak icin (method ismini degistirmeden) method signature i degistiriririz,
       dolayisiyle signature degistiginde yeni bir method olusturmus oluruz, bu yuzden static
       olmasi bir seyi degistirmez

     */
}
