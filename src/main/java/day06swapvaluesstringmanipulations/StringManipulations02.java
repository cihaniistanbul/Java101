package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";

        //Ornek 1: "s" String inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd); //true

        //Ornek 2: "s" String inindeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1); //Learn Java earn dollar

        //Ornek 3: "s" String inindeki "earn" kelimesini "win" kelimesine ceviriniz.
        String s2 = s.replace("earn", "win");
        System.out.println(s2); //Lwin Java win money

        //Ornek 4: "s" String inindeki "a" kelimesini "*" kelimesine ceviriniz.
        String s3 = s.replace('a', '*');
        System.out.println(s3); //Le*rn J*v* e*rn money
        //Note: replace () methodunda coklu karakterler icin calirisaniz mecbur cift tirnak kullanmaliyiz
        //Ama tek character ile calisirsaniz cift tirnak veya tek tirnak kullanabilirsiniz
        //Ya ikiside cift tirnak olmalidir ya da ikiside tek tirnak olmalidir


        //Ornek 5: "s" String inindeki "n" kelimesini "XXX"e kelimesine ceviriniz
        String s4 = s.replace("n", "XXX");
        System.out.println(s4); //LearXXX Java earXXX moXXXey

        //Ornek 6: "s" String inindeki "e" harflerini siliniz
        String s5 = s.replace("e", "");
        System.out.println(s5); //Larn Java arn mony


        //Note: Bir grup datayi degistirmek icin replaceAll() kullanilir
        //Note: Bir grup datayi ifade etmek icin "Regular Expressions" (Regex) kullanilir
        //Ornek 7: "t" String indeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz
        /*

                 Meshur Regex ler
             1)Tum rakamlar                --> [0-9]
             2)Tum  kucuk harfler          --> [a-z]
             3)Tum buyuk harfler           --> [A-Z]
             4)Tum kucuk ve buyuk harfler  --> [a-zA-Z]
             5)Tum harfler ve rakamlar     --> [a-zA-Z0-9]
             6)Tum noktalama isaretleri    --> \\p{Punct}
             7)Tum sesli harfli harfler    -->[aeiouAEIOU]
             8)Tum x,q,w harfleri          -->[xqw]
             9)Kucuk harflerden farkli tum characterler -->[^a-z]
             10)Tum harflerden farkli tum characterler  -->[^a-zA-Z]


         */
        String t = "Ali 13 yasindadir!...";
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1); //Ali ** yasindadir!...

        //Note: Regex ifadesinde "^" isareti haric anlamina gelir


    }
}
