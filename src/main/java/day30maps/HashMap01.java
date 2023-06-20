package day30maps;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {
        //map diyince aklimiza "sozluk" gelsin

        /*
        1) Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) "KEY" kismi "TEKRARSIZ", "VALUE" kismi "TEKRARLİ" olabilir.
        3) Map lerdeki her bir elemana "Entry" denir, tamamina ise "EntrySet" denir
        4) Entry ler tekrarsiz oldugu icin EntrySet denilir
        5) Key ve value'lar ayri ayri data typelarinda olabilirler
        6) Map ler Collection degildir, farkli bir yapidir

         */


        //Map nasil olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 40000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation); //{Netherland=18000000, USA=40000000, Turkey=83000000, Germany=83000000, Albania=3000000}
        // random olarak siraladik. Hash mantigi.


        //get() methodu key ile calisir ve istediginiz key'in value kismini verir. (value'a gore data type sectik)
        int usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation); //40000000


        //Butun keyleri nasil aliriz? (Key String old icin <String> icine yazdik)
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys); //[Netherland, USA, Turkey, Germany, Albania]


        //Butun value lari nasil alabiliriz?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values); //[18000000, 40000000, 83000000, 83000000, 3000000]


        //Ornek 1: countryPopulation map indeki ulkelerin nufuslarinin ortalamasi kactir?
        Collection<Integer> value = countryPopulation.values();

        int sum = 0;
        for (Integer w : value) {
            sum = sum + w;

        }
        System.out.println(sum / value.size()); //45400000

        //Map'lerle foreach kullanamiyoruz. value yerine "countryPop" yazarsak hata veriyor.
        //"entrySet()" methodu ile entry'leri kalip halinde bize set'in icine koyarak veriyor.
        //yani map'i set yapisina donusturuyor.
        //"set" bir collection'dir. set'leri looplar ile kullanabiliriz ama map'leri kullanamayiz. O yuzden donusturduk.

        //entrySet() mapteki entry'leri kalip halinde alip bize Set'in icine koyarak verir
        //loop lar map ler ile kullanilamaz. Bunun icin entrySet methodunu kullaniriz
        Set<Map.Entry<String, Integer>> entires = countryPopulation.entrySet();
        //<Bu map'in icindeki Entry'ler bu set'in elemanidir diyor>
        System.out.println(entires); //[Netherland=18000000, USA=40000000, Turkey=83000000, Germany=83000000, Albania=3000000] collection a donustu


        //Ornek 2 : countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz


        int toplam = 0;

        for ( Map.Entry<String, Integer>  w: entires ) {
          toplam = toplam+ w.getKey().length() + w.getValue();

        }
        System.out.println(toplam); //227000033










        /*
        NOTE :

          Map'ler collection degildir.
          Hash'ler; javanin arka planda yaptigi, bizim mudahale edemedigimiz, unique bir ID olusturma teknigidir.


           KEY       =    VALUE

          Cat        =    Kedi
          Dog        =    Kopek     -->MAP YAPİSİ
          Hard       =    Zor
          Difficult  =    Zor

          Sozlukte yukaridaki gibi bir yapilanma vardir.
          Sol taraflar hep unique(tekrarsiz), sag tarafta value olur
          KEY    --> Tekrarsiz/unique
          VALUE  --> Tekrarli olabilir

          Simdiye kadar hep tek type datalarla ugrastik, burada ikili bir yapi var.
          Map'in her bir elemanina "ENTRY" denir
          Map'in toplam elamanlarina "ENTRY SET" denir



         */
    }
}
