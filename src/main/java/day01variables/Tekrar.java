package day01variables;

public class Tekrar {

    public static void main(String[] args) {
        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));




        long carpmaSonucu = multiply(5,12);

        int sonuc = toplamaYap(3, 5);
        System.out.println(sonuc);


        String ogrenciAdi = "Ali Can";


        char isminIlkHarfi = 'A';

        byte note1 = 50;
        byte note2 = 70;
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note1 + note2);

        //Ornek1: Sehir ismi icin bir variable olusturun once "Ankara"
        //sonra ekrana yazdirin

        String sehirIsmi = "Ankara";
        sehirIsmi = "Izmir";
        System.out.println(sehirIsmi);

        //Ornek2: Sehir plaka kodu icin bir variable olusturun ve once
        // "06" sonra da "35" degeri atayip ekrana yazdirin.

        byte plakaKodu = 06;
        System.out.println(plakaKodu);
        plakaKodu = 35;
        System.out.println(plakaKodu);

        //Ornek3: Basarili mi sorusu icin bir variabla olusturun ve
        //once "false" sonra da "true" degeri atayip ekrana yazdirin

        boolean isSuccessful = true;
        System.out.println(isSuccessful);
        isSuccessful = false;
        System.out.println(isSuccessful);

        //Ornek4: Ulke ismi icin bir variable olusturun ve ekrana yazdirin

        String ulkeIsmi = "Turkiye";
        System.out.println(ulkeIsmi);


    }


    //METHOD OLUSTURMA


    //Ornek1: Toplama islemi yapan bir method olusturunuz

    // access + return type + method name + ()

    public static int toplamaYap(int a, int b) {
        return a + b;
    }

    //Ornek2: 2 sayiyi carpma islemi yapan bir method olusturunuz

    public static long multiply(int c , int d){
       return c*d;
    }

    //Ornek3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu
    //sayi ile toplayan methodu olusturunuz ve kullaniniz.

    private static int firstTwoMultiplyThirdAdd(int a , int b , int c){
       return a*b+c;
    }






}
