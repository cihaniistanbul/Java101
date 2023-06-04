package day03methodobjectcreationscanner;

public class Homework {
    public static void main(String[] args) {

        double cevreHesap = cemberCevre(6.2);
        System.out.println("cevreHesap = " + cevreHesap);

        double alanSonuc = daireAlan(7);
        System.out.println("alanSonuc = " + alanSonuc);

    }

    //Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz

    public static double cemberCevre(double x) {

        return x * 3.14 * 2;
    }

    //Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz

    public static double daireAlan(double y) {
        return 3.14 * y * y;
    }

}
