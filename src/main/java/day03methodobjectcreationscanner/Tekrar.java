package day03methodobjectcreationscanner;

public class Tekrar {

    public static void main(String[] args) {
        System.out.println(getCube(3));


        print("Java is easy");

        //2.yol
        String str ="TechproEdu";

        printConsole(str);


        //Ornek3: Verilen 2 tam sayiyi carpan ve sonucu ekrana yazdiran methodu
        //olusturup kullaniniz.

        int a =5;
        int b= 2;

        carpmaYap(a,b);


        System.out.println(tamSayi(3));

        //Ornek 4: Verilen bir tam sayinin karesini hesaplayip colsole a yazdiran
        //methodu olusturup kullaniniz

        int x =7;
        karesiniAl(x);

        //Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz

        int c = 5;

        cemberCevre(c);
    }

    private static void cemberCevre(int c) {
        System.out.println(c * c * 3.14);
    }

    private static void karesiniAl(int x) {
        System.out.println(x*x);
    }

    public static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    private static void printConsole(String str) {
        System.out.println(str);
    }


    //Ornek 1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz

    public static double getCube(double a){
        return a*a*a;
    }


    //Ornek2 : Girilen bir kelimeyi ekrana yazdiran bir method olustup kullaniniz.

    public static void print(String str){
        System.out.println(str);
    }

    //Ornek 4: Verilen bir tam sayinin karesini hesaplayip colsole a yazdiran
    //methodu olusturup kullaniniz

    public static int tamSayi (int a){
        return a*a;
    }




}
