package day22arraylistsdatetime;

import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {


        //Ornek 1: Bir listteki tekrarsiz elemanlari console a yazdiran kodu yaziniz
        //Lists non-primitive data ile calisir. O yuzden wrapper Double kullandik
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for (double w : prices) { //basi sonu belli datalar uzerinde calisacaksan foreach kullanmak ilk tercih
            if (prices.indexOf(w) == prices.lastIndexOf(w)) { //esitse tekrarsiz demektir
                System.out.println(w); //3.75  4.0

            }
        }


        //Ornek 2: Bir listte tekrarli eleman olup olmadigini bulan kodu yaziniz
        List<Integer> height = List.of(3, 13, 3); //esit degilse tekrarli demek
        int counter = 0;
        for (Integer w : height) {
            if (height.indexOf(w) != height.lastIndexOf(w)) {                      //bu adimdan sonra sout(w) yaparsam console da 3 3 cikar. Bu blok calistigi zaman
                counter++; // if dogru old zaman counteri 1 artir                    console a bir mesaj vermek isticem
                break; //1 kere calissa yeterli o yuzden break
            }
        }

        if (counter == 0) { //daha sonra counter in 0 olup olmamasina gore bir code yazdik.counter 0 degilse if blogu calismis ve en az 1 tekrarli eleman var demektir
                             //counter 0 a esitse if blogu hic calismamis ve hepsi tekrarsiz demektir
            System.out.println("All elements are unique in the list");
        } else {
            System.out.println("At least one element isn't unique in the list");
        }


    }
}
