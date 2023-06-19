package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> depo = new LinkedList<>(); //burada LinkedList kullandik cunku Queue interface
        //"Queue" bir interface'dir. İcerisinde Constructor yoktur. O yuzden LinkedList veya Priority kullanmamiz lazim

        depo.add("Milk");
        depo.add("Meat");
        depo.add("Egg");
        depo.add("Cheese");
        System.out.println(depo); //[Milk, Meat, Egg, Cheese]


        depo.remove();
        System.out.println(depo); //[Meat, Egg, Cheese] --> ilk eleman MILK silindi

        System.out.println(depo.peek()); //Meat --> yeni yapi uzerinden ilk elemani verdi (milk i sildik) peek-->copy+paste

        System.out.println(depo.element());//Meat
        System.out.println(depo); //[Meat, Egg, Cheese]


        System.out.println(depo.poll());//Meat
        System.out.println(depo);//[Egg, Cheese] (cut+paste) -->meat silindi


        depo.clear();
        System.out.println(depo.poll());//null --> poll bos collectionlar icin bize null verir

        //System.out.println(depo.remove()); //exception firlatti

        //System.out.println(depo.element());//exception

        System.out.println(depo.peek());//null

        //Burada depo bos oldugu zaman remove ve element kullanirsak exception verir


    }
}
