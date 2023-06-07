package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tekrar {
    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<>();

        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);
        System.out.println(ages);


        List<Integer> newAges = new ArrayList<>();

        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);

        ages.addAll(newAges);
        System.out.println(ages);

        ages.addAll(2,newAges);
        System.out.println(ages);

        int num = ages.size();
        System.out.println(num);

        ages.get(2);
        int el= ages.get(2);
        System.out.println(el);

        ages.set(6,111);
        System.out.println(ages);

        ages.set(4,313);
        System.out.println(ages);

        ages.clear();
        System.out.println(ages);

        System.out.println(ages.contains(313));

        System.out.println(ages.isEmpty());


        //Ornek 1: Size verilen bir Listin bos olup olmadigini kontrol eden kodu yaziniz
        ArrayList<String> name= new ArrayList<>();
        name.add("Gulce");
        name.add("Seda");
        name.add("Benna");
        name.add("Rıdvan");
        name.add("Enes");

        if (name.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has an element");
        }

        name.clear();

        if (name.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has an element");
        }

        // Bir List in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        // İki List in esit olabilmesi icin ayni indexte ayni elemanlar olmalidir

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");


        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean result = names1.equals(names2);
        System.out.println(result);


        //Ornek: Verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz

        List<Integer>num1 = new ArrayList<>();
        num1.add(8);
        num1.add(10);
        num1.add(9);


        List<Integer>num2 = new ArrayList<>();
        num2.add(8);
        num2.add(9);
        num2.add(10);

        Collections.sort(num1);
        Collections.sort(num2);

        System.out.println(num1.equals(num2));



        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");

        System.out.println(cities);

        cities.remove("Miami");
        System.out.println(cities);


        System.out.println(cities.remove(2));


        List<Integer> yas = new ArrayList<>();
        yas.add(23);
        yas.add(12);
        yas.add(7);
        yas.add(4);

        yas.remove(1);


    }
}
