package day21arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        // Bir List in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        // İki List in esit olabilmesi icin ayni indexte ayni elemanlar olmalidir**
        ArrayList<String> names1= new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        // 2 list olustuyorum karsilastirmak icin

        ArrayList<String> names2= new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        System.out.println(names1.equals(names2)); //false verir cunku indexler esit degil



        //Ornek: Verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        //karsilastirmak icin 2 List olusturdum.Eger bunlari siralayip karsilastirirsak esit cikacak

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
        //siralamayi yaptim simdi esit olup olmadigini karsilastirabilirim
        boolean result = nums1.equals(nums2);
        System.out.println(result); //true


        //ArrayListte bir elemanin ilk gorunumu nasil silinir?
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities); //[Miami, Istanbul, Yozgat, Barcelona, Miami, Istanbul, Istanbul, Yozgat]


        //remove() methodu bir elemanin ilk gorunumunu siler
        //silmek istedigim string i icine yaziyorum
        System.out.println(cities.remove("Miami")); //true --> remove() methodu bize boolean return ediyor
        System.out.println(cities); //[Istanbul, Yozgat, Barcelona, Miami, Istanbul, Istanbul, Yozgat] ilk miami silindi


        //ArrayListte bir eleman index kullanarak nasil silinir?
        System.out.println(cities.remove(2)); //Barcelona --> sildigini yaziyor.
        System.out.println(cities); //[Istanbul, Yozgat, Miami, Istanbul, Istanbul, Yozgat]


        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        //ve o elemani silip silmedigini ifade eden true veya false return eder

        //remove() methodu index ile kullanilirsa bu indexte silmis oldugu datayi return eder




        //ArrayList olustururken sag tarafa (constructor) ArrayList yazmak zorundasiniz
        //Ama sol tarafa ister ArrayList yazin ister List yazin ikiside calisir
        //Detaylari collections konusunda gorecegiz

        //Ornek: Bir integer list olusturun ve 12 elemanini siliniz
        //remove() methodunda tamsayi girdiginiz zaman Java otomatik olarak primitive int kabul eder ve index olarak alir.
        //Javaya sunu söylemem lazim. Ben index 12 yi degil eleman 12 yi silmek istiyorum
        List<Integer> ages = new ArrayList<>();

        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);



        //1.yol
        //Integer nonPrimitive=12; //amacim primitive degil demek o zaman object oldugunu anlayacak
        //ages.remove(nonPrimitive);
        //System.out.println(ages); //[23, 7, 4]


        //2.yol recommended
        // wrapperina koyarak autoboxing yaptik.
        //"remove(12)" bu primitive amacim non-primitive demek o zaman basina gelip Integer koyarim
        //basina Integer koyunca bu int'in wrapper yani int 12 old soyluyorum. Cunku basina Integer girmezsem index kabul ediyor
        //Cunku Java default olarak tamsayilari primitive int kabul ediyor. bende primitive olmadigini soyluyorum
        ages.remove((Integer)12);
        System.out.println(ages); //[23, 7, 4]


        //3.yol
        //ages.remove(Integer.valueOf(12)); // -->valueOf() methodunu kullanip integer'a cevirdik
        //System.out.println(ages); //[23, 7, 4]


        //4.yol
        // indexini bilmedigimiz zaman bu sekilde de yapabiliriz. dinamik olarak yaptim
        //remove() methodu indexle calisiyor
        //System.out.println(ages);
        //ages.remove(ages.indexOf(12));
        //System.out.println(ages); //[23, 7, 4]


        //Bir ArrayLitteki bir elemanin tum gorunumlerini nasil sileriz?
        //remove() methodu sayesinde specific elemanlari silebildik. removeAll() ile hepsini silebiliriz
        //Bir Listteki bir elamanin tum gorunumlerini removeAll() ile silebiliriz ama removeAll() methodu List ile kullanilir
        //Yani once bir silinecekler listesi olusturmamiz lazim sonra removeAll() kullanmamiz.

        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Istanbul");
        citiesToRemove.add("Yozgat");

        //silinecekler listemi olusturdum. simdi removeAll() diyebiliriz:

        cities.removeAll(citiesToRemove);
        System.out.println(cities); //[Miami]


    }

}
