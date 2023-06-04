package day05concatinationoperatortypecasting;

public class Tekrar {
    public static void main(String[] args) {

        //Ornek2: Size String olarak verilen 2 fiyatin toplamini ekrana yazdiriniz
        String shirt="2300";
        String shoes="5200";

        System.out.println(shirt+shoes); //23005200

        //String değerini integer a cevirmem lazim

        int toplamFiyat =Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);






        //double data type ini short data type ina ceviriniz

        double number =12.99;
        System.out.println(number);
        short numShort =(short)number;
        System.out.println(numShort);














    }
}
