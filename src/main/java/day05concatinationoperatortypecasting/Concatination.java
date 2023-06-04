package day05concatinationoperatortypecasting;

public class Concatination {
    public static void main(String[] args) {

        //Ornek1: Bir string ve iki int variable olusturun. String degeri ile int lerin toplamini
        //console a yazdiriniz
        String s = "Elma";
        int a = 10;
        int b = 11;
        System.out.println(s+a+b);//console da elma1011 cikti
        System.out.println(s+ (a+b) );//elma21 java islem onceligi yapti
        System.out.println(s+a*b);// elma110 islem onceligi
        System.out.println(a+b+s);//21elma soldan saga dogru gidiyor
        System.out.println(a+s+b);//10elma11

        //Java da "+" sembolu iki sayi arasinda toplanirsa "toplama islemi" olur
        //Java da "+" sembolu iki String arasinda veya bir String veya bir sayi arasinda
        //kullanilirsa bu islem concatination islemi olur

        //concatination islemi birlestirme yapar
        //Note: Concatination islemlerinde java matematikte ki islem onceli kurallarini kullanir

        //Ornek2: Size String olarak verilen 2 fiyatin toplamini ekrana yazdiriniz
        String shirt="2300";
        String shoes="5200";
        System.out.println(shirt+shoes);//23005200

        //Integer.valueOf() string degerleri intiger a cevirir

        int toplamFiyat= Integer.valueOf(shirt )+ Integer.valueOf(shoes);
        System.out.println(toplamFiyat); //7500


        //Ornek3: Size String olarak verilen 2 fiyatin toplamini ekrana yazdiriniz
        String tv="$1100";
        String radio = "$300";
        System.out.println(tv+radio);//$1100$300

        int totalPrice= Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);
        //Note: valueOf() methodu tum karakterleri rakam olan Stringleri sayilara cevirir
        //Eger valueOf() methodu kullanirken String icine rakam olmayan bir karakter koyarsaniz
        //hata alirsiniz
        //bu tarz hatalari duzeltmeyi ilerleyen derslerimizide ogrenecegiz
        //valueOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir

    }
}
