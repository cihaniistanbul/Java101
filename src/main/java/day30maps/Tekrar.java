package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Tekrar {
    public static void main(String[] args) {

        HashMap<String, Integer> countryPop = new HashMap<>();
        countryPop.put("Germany", 83000000);
        countryPop.put("Albania", 3000000);
        countryPop.put("USA", 400000000);
        countryPop.put("Turkey", 83000000);
        countryPop.put("Netherland", 18000000);

        System.out.println(countryPop);

        int usaPop = countryPop.get("USA");
        System.out.println(usaPop);


        Set<String> keys = countryPop.keySet();
        System.out.println(keys);

        Collection<Integer> values =countryPop.values();
        System.out.println(values);

        //Ornek 1: countryPopulation map indeki ulkelerin nufuslarinin ortalamasi kactir?

        Collection<Integer> value = countryPop.values();

        int sum =0;
        for ( Integer  w: value ) {
            sum = sum+w;
        }
        System.out.println(sum/value.size());

    }
}
