package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {


        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

        //1.adim: sort yap   2.adim: min fark istiyor.O zaman her iteration da tek tek fark almaliyim.Once 10-12,  12-19...
        //3.adim: min. buldugumuzda en yakini bulduk demektir

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        Collections.sort(nums);

        int minDiff = nums.get(1) - nums.get(0); //karsilastirma yapmak icin 1.index ve 0. indexi alip cikardim dinamik olarak yazdim.
                                                 //O verseydik min ile karsilastirdigim her seferde 0 i secerdi

        for (int i = 1; i < nums.size(); i++) { //amac min farki bulmak
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));// min methoduyla 2 sayiyi karsilastirip kucuk olani alicam. minDiff=2 var
            // minDiff ile karsilastiracagim sayi, farklarin dinamik hali olmali. indexi 1 den baslatma sebebim de bunun icindi

        }


        System.out.println(minDiff); //2

        for (int i = 1; i <nums.size() ; i++) { //minDiff i hangi 2liden aldigimin code unu yazdim ---- bu min farki hangi 2 sayi verdi
            if (nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }
    }
}
