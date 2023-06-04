package day02datatypesmethodcreation;

public class Variables01 {

    public static void main(String[] args) {

        //Ornek 1: Sehir ismi icin bir variable olusturun ve once "Ankara" sonra da "Izmir" degerleri atayip
        //         ekrana yazdirin.

        String cityName = "Ankara";
        System.out.println(cityName);

        cityName = "Izmir";     // String sepeti old icin tekrar yazmiyorum
        System.out.println(cityName);


        //Ornek 2: Sehir plaka kodu icin bir variable olusturun ve once "06" sonra "35" degeri atayip ekrana yazidiriniz
        // byte data type ini kullanirsam memory i daha iyi kullanmis olurum

        byte plakaKodu = 06;
        System.out.println(plakaKodu);

        plakaKodu = 35;
        System.out.println(plakaKodu);


        //Ornek 3: Basarili mi? sorusu icin bir variable olusturun ve once "false" sonra da "true" degerini atayip ekrana yazdirin

        boolean isSuccesful = false;
        System.out.println(isSuccesful);

        isSuccesful = true;
        System.out.println(isSuccesful);



    }


}
