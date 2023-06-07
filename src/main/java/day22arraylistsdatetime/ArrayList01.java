package day22arraylistsdatetime;

import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {


        //Ornek 1: Bir listteki tekrarsiz elemanlari console a yazdiran kodu yaziniz
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for (double w : prices) {
            if (prices.indexOf(w) == prices.lastIndexOf(w)) { //esitse tekrarsiz demektir
                System.out.println(w); //3.75  4.0

            }
        }


        //Ornek 2: Bir listte tekrarli eleman olup olmadigini bulan kodu yaziniz
        List<Integer> height = List.of(3, 13, 3); //esit degilse tekrarli demek
        int counter = 0;
        for (Integer w : height) {
            if (height.indexOf(w) != height.lastIndexOf(w)) {
                counter++;
                break;
            }
        }

        if (counter == 0) {
            System.out.println("All elements are unique in the list");
        } else {
            System.out.println("At least one element isn't unique in the list");
        }


    }
}
