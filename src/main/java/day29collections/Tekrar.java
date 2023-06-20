package day29collections;

import java.util.*;

public class Tekrar {
    public static void main(String[] args) {


        HashSet<String> hs = new HashSet<>();
        hs.add("Gulce");
        hs.add("Seda");
        hs.add("Omer");
        hs.add("Hasan");
        hs.add("Benna");
        System.out.println(hs);
        hs.add("Seda");
        System.out.println(hs);
        hs.add(null);
        System.out.println(hs);


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(19);
        lhs.add(13);
        lhs.add(-33);
        lhs.add(312);
        System.out.println(lhs);


        lhs.add(null);
        System.out.println(lhs);



        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(19);
        ls.add(13);
        ls.add(313);
        ls.add(13);
        System.out.println(ls);

        lhs.retainAll(ls);
        System.out.println(lhs);
        System.out.println(ls);


        TreeSet<Character> ts =new TreeSet<Character>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('Y');
        ts.add('E');
        System.out.println(ts);

        System.out.println(ts.first());
        System.out.println(ts.last());


        System.out.println(ts.headSet('E'));
        System.out.println(ts.headSet('E', true));

        System.out.println(ts.tailSet('E'));

        System.out.println(ts.ceiling('E'));


        Deque<String> d = new LinkedList<>();
        d.add("Egg");
        d.add("Milk");
        d.add("Cheese");
        d.add("Meat");

        System.out.println(d);
    }
}
