package day17arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String s = "Java is easy. Learn Java earn money.";

        String words[] = s.split(" "); //Normal sartlarda bolunce 1 taneyken variable a koyuyorduk ama burada ayni tip coklu data var. array e koymaliyim

        System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length); //7


        // Ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz

        String letters[] = s.replaceAll("[^a-zA-Z]", "").split("");

        System.out.println(Arrays.toString(letters)); //[J, a, v, a, i, s, e, a, s, y, e, a, r, n, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length);


    }

}
