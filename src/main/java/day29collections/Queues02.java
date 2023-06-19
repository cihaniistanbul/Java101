package day29collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Bread");
        line.add("Apple");
        line.add("Milk");
        line.add("Orange");
        line.add("Egg");
        line.add("Meat");
        line.add("Tomatoes");

        System.out.println(line); //[Apple, Milk, Bread, Milk, Orange, Egg, Meat, Tomatoes] -->insertion order degil kendi default onceligine gore verdi


        /*
        "Queue" bir interface'dir, bu yuzden constructor'i yoktur. Dolayisiyla object olustururken new keyword'unden sonra
        "Queue" kullanilamaz, Data type'i Queue olan bir object olusturmak icin new keywordundna sonra;
            1) LinkedList
            2) PriorityQueue
        classlari kullanilabilir
        "Queue" olustururken constructor olarak PriorityQueue kullanirsaniz elemanlari kendi belirleyeceginiz kurala gore
        siralama hakkiniz olur
         */




    }
}
