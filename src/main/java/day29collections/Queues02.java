package day29collections;

import java.util.Deque;
import java.util.LinkedList;
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



        //Deque --> Doube ended Queue (iki uclu queue)
        //Deque daki add(), get(), peek(), poll() methodlari first-last seklinde iki uclu sekilde sunulur

        Deque<String> d = new LinkedList<>();
        //Deque bir interface. Eger bir Deque object'i olusturmak istersem bunu LinkedListten secebilirim(constructor)
        //LinkdeList bir class
        //Queue bir interface. Objecti olusturacaksam ya LinkedList ya da Priority'den kullanmam gerek

        d.add("Egg");
        d.add("Milk");
        d.add("Cheese");
        d.add("Meat");
        System.out.println(d); //[Egg, Milk, Cheese, Meat] --> Constructor'i LinkedListten sectigim icin
        //                                                     insertion order'a gore siraladi
        //



        /*
        Search islemi hizli olsun istiyorsam --> ArrayList
        Sıkca ekleme, cikarma yapiyorsam     --> LinkedList
        Fifo mantigiyla islem yapacaksam     --> Queue


        Ogrenci emaillerini depolayacak,
        super fast bir yapiya ihtiyacim var -->HashSet

        insertion order onemliyse          --> LinkedHashSet
        natural ordera gore siralayacaksam --> TreeSet



        Note: Queue bizi hep ilk eleman uzerinde calismaya zorluyor. Fifo
              Eklerken araya kaynak yapamiyorsunuz
              Tum methodlarimiz hep ilkine yonelik. Cunku queue'nun amaci bu.
              Queue bir uclu, hep bastakiyle ilgileniyoruz


              Zaman zaman sondanda ekleme-cikarma yapmak istiyorum.
              Cift uclu olsun, hem bastan hem sondan olsun
              Deque ise "Double Ended" oldu





         */
    }
}

