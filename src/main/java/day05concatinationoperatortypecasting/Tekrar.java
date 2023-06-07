package day05concatinationoperatortypecasting;

public class Tekrar {
    public static void main(String[] args) {


        String s = "Java is easy";

        String sUpper= s.toUpperCase();
        System.out.println(sUpper);

        String sLower =s.toLowerCase();
        System.out.println(sLower);


        //Ornek 3: "s" Stringindeki ilk characteri aliniz

        char sChar=s.charAt(0);
        System.out.println(sChar);


        //Ornek: "s" String indeki ikinci ve sondan ikinci characteri aliniz ve ekrana yazdiriniz

        System.out.println(s.charAt(1));
        System.out.println(s.charAt(10));



        //Ornek 5: "s" String inde kullanilan toplam character sayisini bulunuz
        int sLeng= s.length();
        System.out.println(sLeng);


        //Ornek 6: "s" Stringindeki ilk dort characteri aliniz
        //substring --> 0 ilk index dahil, 4 ikinci index dahil degil
         String sub=s.substring(0,4);
        System.out.println(sub);


        //Ornek 7: "s" String inde "is" kelimesini aliniz
        System.out.println(s.substring(5, 7));

        //Ornek 8: "s" Stringindeki "easy" kelimesini aliniz
        System.out.println(s.substring(8));

        //Ornek 9: "s" Stringinde "money" kelimesinin var olup olmadigini kontrol ediniz
        boolean result= s.contains("money");
        System.out.println(result);

        //Ornek 10: "s" Stringinin belli bir harfle baslayip baslamadigini kontrol ediniz
        boolean isSta=s.startsWith("Java");
        System.out.println(isSta);

        //Ornek 11:"s" Stringinin  6. characterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz
        //soru: 5.index dahil olmak uzere i karakteri ile baslayip baslamadigini kontrol eden kodu yaziniz
        boolean isS =s.startsWith("i",5);
        System.out.println(isS);

    }
}
