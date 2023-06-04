package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String  bir non-primitive data type dir ve ayni zamanda bir classdir.

        String s = "Java is easy";

        //Ornek 1: "s" String indeki tum characterleri buyuk harf yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);


        //Ornek 2: "s" String indeki tum karakterleri kucuk harf yapiniz
        String sLower = s.toLowerCase();
        System.out.println(sLower);


        //Ornek 3: "s" Stringindeki ilk characteri aliniz
        s = "Java is easy";
        char firstChar = s.charAt(0);
        System.out.println(firstChar); //J

        //Ornek: "s" String indeki ikinci ve sondan ikinci characteri aliniz ve ekrana yazdiriniz
        char secondChar = s.charAt(1); //a
        char secondLastChar = s.charAt(10); //s
        System.out.println("" + secondChar + secondLastChar);


        //Ornek 5: "s" String inde kullanilan toplam character sayisini bulunuz
        int sLEngth = s.length();
        System.out.println(sLEngth); //12

        //Ornek 6: "s" Stringindeki ilk dort characteri aliniz
        //substring --> 0 ilk index dahil, 4 ikinci index dahil degil
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);

        //Ornek 7: "s" String inde "is" kelimesini aliniz
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);


        //Ornek 8: "s" Stringindeki "easy" kelimesini aliniz

        String sub3 = s.substring(8, 12);
        System.out.println(sub3); //easy

        //İkinci yol
        //Bir character den baslayip String in sonuna kadar almak isterseniz,
        //ikinci  indexi yazmayiniz
        //s.substring(8, 12); yerine substring(8) yazdik boylece baslangic indexinden itibaren sonuna kadar aldik
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy


        //Ornek 9: "s" Stringinde "money" kelimesinin var olup olmadigini kontrol ediniz
        boolean isExist = s.contains("money"); //false
        System.out.println(isExist);

        //Java case sensitive dir. J ve j arasinda fark var sout yapinca


        //Ornek 10: "s" Stringinin belli bir harfle baslayip baslamadigini kontrol ediniz
        boolean isStart = s.startsWith("java");
        System.out.println(isStart); //false

        //Ornek 11:"s" Stringinin  6. characterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz
        //soru: 5.index dahil olmak uzere i karakteri ile baslayip baslamadigini kontrol eden kodu yaziniz
        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin); //true verdi





    }


}
