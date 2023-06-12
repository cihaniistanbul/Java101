package day22arraylistsdatetime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
/*


        //Ornek 1: Bir listteki tekrarsiz elemanlari console a yazdiran kodu yaziniz
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.25, 1.25, 4.0);

        for (double w : prices) {
            if (prices.indexOf(w) == prices.lastIndexOf(w)) {
                System.out.println(w);
            }
        }

        //Ornek 2: Bir listte tekrarli eleman olup olmadigini bulan kodu yaziniz
        List<Integer> heigth = List.of(3,13,3);

        int counter =0;
        for ( Integer w : heigth ) {
            if (heigth.indexOf(w) !=heigth.lastIndexOf(w)){
                counter++;
                break;
            }
        }

        if (counter ==0){
            System.out.println("tekrarsiz");
        }else {
            System.out.println("tekrarli");
        }
*/

        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

        /*



       List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        Collections.sort(nums);

        int minDiff=nums.get(1)-nums.get(0);


        for (int i = 1; i <nums.size() ; i++) {

            Math.min(minDiff,nums.get(i)-nums.get(i-1));
        }

        System.out.println(minDiff);

*/


           /*
   Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin

           --> String class kullanmak tercih edilir cunku string class method acisindan cok zengindir



        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");

        Scanner scan = new Scanner(System.in);
        System.out.println("harf giriniz");
        String letter= scan.nextLine().substring(0,1);


        if (myList.contains(letter)){
             myList.set(myList.indexOf(letter),"Buldum!" );
        }


            */
        LocalDate myCurrentDate= LocalDate.now();
        System.out.println(myCurrentDate); //2023-06-11


        int  monthValue=myCurrentDate.getMonthValue();
        System.out.println(monthValue);


        System.out.println(myCurrentDate.plusYears(2).plusDays(1));

        System.out.println(myCurrentDate.minusYears(30));

        System.out.println(myCurrentDate.minusYears(30).plusMonths(1).minusDays(2)); //1993-07-09

        LocalDate date1 =LocalDate.of(1993,7, 9);
        LocalDate date2 =LocalDate.of(1990,7, 9);

        boolean r1 = date1.isAfter(date2);
        System.out.println(r1);

        System.out.println(date1.isBefore(date2)); //false

    }
}
