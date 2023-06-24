package day31mapsexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {


        /*
        1) TreeMap "thread safe" ve "synchronized" degildir
            Note: Map'lerde multi thread kullanmamiz gerektiginde sadece HashTable kullanabilirsiniz
        2) TreeMap entry'leri key'lerine gore "natural order" a gore siralar. Bu yuzden coook yavastir
        3) TreeMap'lerin key'lerinde null kullanilamaz, ama value'larinda istediginiz kadar kullanabilirsiniz
         */

        long t1 =System.nanoTime();

        TreeMap<String, Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("USA",400000);
        countryPopulations.put("Netherland",1800000);
        countryPopulations.put("Turkiye",83000000);
        countryPopulations.put("Belgium",4000000);
        countryPopulations.put("Mexico",4000000);
        countryPopulations.put("Brasil",4000000);
        countryPopulations.put("France",4000000);
        countryPopulations.put("Finland",4000000);
        countryPopulations.put("Germany",85000000);
        System.out.println(countryPopulations); //{Belgium=4000000, Brasil=4000000, Finland=4000000, France=4000000, Germany=85000000, Mexico=4000000, Netherland=1800000, Turkiye=83000000, USA=400000}


        long t2= System.nanoTime();

        HashMap<String, Integer> countryPop = new HashMap();
        countryPop.put("USA",400000);
        countryPop.put("Netherland",1800000);
        countryPop.put("Turkiye",83000000);
        countryPop.put("Belgium",4000000);
        countryPop.put("Mexico",4000000);
        countryPop.put("Brasil",4000000);
        countryPop.put("France",4000000);
        countryPop.put("Finland",4000000);
        countryPop.put("Germany",85000000);
        System.out.println(countryPopulations);//{Belgium=4000000, Brasil=4000000, Finland=4000000, France=4000000, Germany=85000000, Mexico=4000000, Netherland=1800000, Turkiye=83000000, USA=400000}


        long t3 = System.nanoTime();

        System.out.println(t2-t1);//treemap  2070839
        System.out.println(t3-t2); //hashmap 270163


        /*
         NOTE:
            Java'da Tree kelimesini gorunce "natural order" aklimiza gelmeliydi.

            TreeMap multi-thread degildir. Eger map'lerde multi-thread yapmak gerekirse geriye sadece "Hashtable" kaldi
            Cunku HashMap ve TreeMap ler multi-thread degildir.

            TreeMap'le calismak tavsiye edilmez. Cunku cok yavas.
         */

    }
}
