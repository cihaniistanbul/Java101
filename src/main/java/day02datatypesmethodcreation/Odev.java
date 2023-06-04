package day02datatypesmethodcreation;

public class Odev {

    public static void main(String[] args) {

        int sonuc1 = dikdortgenAlan(3, 5);
        System.out.println(sonuc1);

        System.out.println(dikdortgenCevre(7, 8));
    }
    /*
    1)Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz.
    2)Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
     */



    public static int dikdortgenAlan(int a, int b) {
        return a * b;
    }

    private static int dikdortgenCevre(int c, int d) {
        return 2 * (c + d);

    }

}
