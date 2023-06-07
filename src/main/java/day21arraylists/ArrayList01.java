package day21arraylists;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        /*
        1) Ayni data type'indaki coklu datalari depolamak icin Array kullaniriz
        2) Arraylerin negatif bir yonu var, icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz
        3) Arraylar eleman sayisinda esnek degildirler, bu yuzden java ArrayList adli yeni bir yapi olusturdu
           Bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
           1000 eleman koyarsaniz eleman sayisini 1000 olarak ayarlar.
        4) ArrayList yerine sadece List de diyebilirsiniz
        5) Java Arraylistleri olusturduktan sonra Arrayleri iptal etmedi cunku
            a) Arrayler super fast tir.
            b) Arrayler memory de cok az yer kaplar.
            c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir.(gun sayilari gibi)
        6) Arrayler primitive data type lari ve "reference" lari depolayabilir
           Ama ArrayList ler non-primitive data type lari depolar, bu nedenle ArrayListler Arraylerden daha fazla yer kaplarlar
         */

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();



        //ArrayList console a nasil yazdirilir?
        System.out.println(ages);// direk yaziyoruz




        //add() methodu elemanlari sizin verdiginiz sirada "list"e ekler (insertion order)
        //Arraylist-->class   ages-->variable name,object   ben bu class tan, constructor sayesinde bir obje urettim(ages)
        //objectler uzerinden cesitli methodlara ulasabilirdik, burada da "ages" objectiyle add methodunu kullanarak eleman ekleriz
        //"add" methodu non-static, cunku objecte bagli.
        //ArrayList lere eleman nasil eklenir?
        //ArrayList lere eleman eklemek icin add() methodunu kullaniriz
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 656); //sayiyi 1 ve 12 arasina koymak istiyorum, indexle yapiyoruz. add methodu overload yapildigi icin indexli olani secerim
        ages.add(3, 777); // 12 ile 10 arasina koyduk (2.indexten sonra yani 3.ye eklemek istiyorum)
        ages.add(888); // add methodu bizim verdigimiz sirada sona ekliyor. en sona eklemek istedigim icin direk yazdik
        System.out.println(ages); //[9, 12, 10]


        //List'e coklu eleman nasil eklenir? veya List'e baska bir list nasil eklenir? (addAll)
        //Bir List'e coklu eleman eklemek icin o elemanlari oncelikle bir Listin icine koymalisiniz. newAges Listini olusturdum
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);

        ages.addAll(newAges);//List bir collection dir.
        System.out.println(ages); //[9, 656, 12, 777, 10, 888, 9, 656, 12, 777, 10, 888] newAges'i ages'e ekledim
        //                          burada newAges elemanlari ages'in sonuna eklenir.


        //newAges i sonda degilde 656 dan sonra gormek istiyorum. indexlerle yaparim
        ages.addAll(2, newAges);
        System.out.println(ages);


        //ArrayList te eleman sayisi nasil bulunur?
        //size() methodu bir list teki eleman sayisini verir
        int numOfElement = ages.size();
        System.out.println(numOfElement);


        //ArrayList te specific bir eleman nasil alinir?
        // get() methodu index kullanarak istedigimiz elemani almaya yarar
        ages.get(1);
        int el1 = ages.get(1);
        System.out.println(el1); //656


        //ArrayList te specific bir elemani nasil degistirebiliriz?
        ages.set(6, 111);
        ages.set(4, 313); //10'u 313 yaptik
        System.out.println(ages);


        //Bir listte tum elemanlari nasil silebiliriz?
        ages.clear();
        System.out.println(ages); //[]


        //ArrayListte specific bir elemanin var olup olmadigini nasil anlariz?
        boolean r = ages.contains(313);
        System.out.println(r); //false, cunku bir ustte butun elemanlari sildik


        //Bir ArrayListin bos olup olmadigini nasil kontrol ederiz?
        //isEmpty() methodu ArrayList bos ise true, bos degilse false return eder
        boolean r2 = ages.isEmpty();
        System.out.println(r2);


        //Ornek 1: Size verilen bir Listin bos olup olmadigini kontrol eden kodu yaziniz
        ArrayList<String> names = new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Ridvan");
        names.add("Enes");

        //1.way
        if (names.size() == 0) {
            System.out.println("List is empty");
        } else {
            System.out.println("List has at least 1 element"); //List has an element

        }

        names.clear(); //names icindeki butun elemanlar silindi

        //2. way Recommended

        if (names.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List has at least 1 element"); //List is empty
        }

        /*
        Bir methodu ogrenirken asagidaki 3 seyi ogrenin
        1) O method ne is yapar?
        2) O method nasil kullanilir?
        3) O method size ne return eder?
         */


    }
}
