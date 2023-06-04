package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {

        double kup = getCube(5);
        System.out.println("kup = " + kup);

        print("Java is easy");

        //Method olusturmak icin ikinci yol:
        //Ornek2 ikinci yol : Girilen bir kelimeyi ekrana yazdiran bir method olustup kullaniniz.
        //main method icinde iken method da kullanilacak olan variable lari olusturunuz
        String str = "TechproEdu";

        //method ismi ve parametreleri yazariz
        //Kirmizi kismin uzerinde bekleyip create method a tiklariz ve intelliJ
        //otomatik olarak bir method olusturur daha sonra kendi istegimize gore
        //dizayn ederiz.
        printConsole(str);

        //Ornek3: Verilen 2 tam sayiyi carpan ve sonucu ekrana yazdiran methodu
        //olusturup kullaniniz.
        int a = 3;
        int b = 5;
        carpmaYap(a, b);

        //Ornek 4: Verilen bir tam sayinin karesini hesaplayip colsole a yazdiran
        //methodu olusturup kullaniniz
        int sayi = 5;
        karesiniAl(sayi);


    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi * sayi);
    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a * b);
    }

    static void printConsole(String str) {
        System.out.println(str);
    }

    //Ornek 1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz

    static double getCube(double a) {
        return a * a * a;

    }
    //Note: Eger ki access modifier i default yapmak isterseniz modifier i
    //      YAZMAYİNİZ.

    //Ornek2 : Girilen bir kelimeyi ekrana yazdiran bir method olustup kullaniniz.

    public static void print(String str) {
        System.out.println(str);


    }

    //Eger bir method yeni bir data uretmiyorsa return type i void olur
    //Eger bir methodun return type i void ise method body icinde return keywordu yazilmaz


    /*
    Homework
    1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    2)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    */

    //Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz.







}
