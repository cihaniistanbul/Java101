package day17arrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Example 1:  [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz. -->  [2, 3, 12, 0, 0, 0]


        int a[] = {0, 2, 3, 0, 12, 0}; // bana verilen array
        int b[] = new int[a.length];  // olusturdugum array

        int idx = 0;

        for (int w : a) {
            if (w != 0) {
                b[idx] = w; //b arrayimde 0.idx den baslayip atamaya basla
                idx++; // bunu yapmazsak 1 1 artirmaz
            }
        }

        System.out.println(Arrays.toString(b)); //[2, 3, 12, 0, 0, 0]

        /*
         Yeni bir array olusturucaz. Eleman sayilari ayni olmak zorunda. Tek tek kontrol edip 0 olup olmadigina bakicam. Eger 0 degilse yeni
         array e yerlestiricem. 0 sa eklemicem. Yani en basa 0 olmayanlari ekledigim zaman geriye kalanlar 0 oluyor

         */
    }
}

