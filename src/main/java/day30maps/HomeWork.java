package day30maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeMap;

public class HomeWork {
    public static void main(String[] args) {
         /*
        Home work:
        Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
         */


        String s = "Hello Henry!";
        String letters[] = s.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(Arrays.toString(letters));

        TreeMap<String, Integer> tm = new TreeMap<>();
        for (String w : letters) {
            Integer harf=tm.get(w);
            if (harf == null){
                tm.put(w,1);
            }else {
                tm.replace(w,harf+1);
            }

        }
        System.out.println(tm); //{H=2, e=2, l=2, n=1, o=1, r=1, y=1}
    }
}
