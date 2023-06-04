package day02datatypesmethodcreation;

public class Tekrar {

    public static void main(String[] args) {

        int sonuc= toplamaYap(3,5);
        System.out.println(sonuc);

       int result =carpmaYap(3,4);
        System.out.println(result);

        int result2=methodCr(2,3,4);
        System.out.println(result2);


    }

    //Ornek 1: Toplama islemi yapan bir method olusturunuz

    public static int toplamaYap(int a, int b) {

       return a+b;


    }


    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusturunuz

    public static int carpmaYap(int x, int y) {
        return x*y;

    }


    //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz ve kullaniniz

    public static int methodCr (int k, int i, int z){
        return k*i+z;
    }

}
