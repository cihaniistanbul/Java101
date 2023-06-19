package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        /*
        NOTE:
        Hashset        -----setlerin en hızlısı (speedyGonzales) bizim icin hiz cok onemliyse bunu kullaniyoruz
        LinkedHashSet  -----insertion (Ekleme sırasına göre diziyor . caba var . sıraya koyacak o yüzden yavas.
        TreeSet        -----Natural Order'a göre diziyor .Alphabetik ve Numeric . iste bu yüzden cok yavas.
         */

        /*
        1) Setler tekrarsiz eleman (unique) depolamak icin kullanilir
        2) 3 tane Set class vardır
           a) HashSet Class:
                "Hash" benzersiz bir id olusturma teknigidir. Bu teknige "Hashing Technique" denir
                "HashSet" elemanlari siralamadigindan cok hizli calisirlar
                "HashSet"ler "null"i eleman olarak kabul ederler (1 kere kullanilir)
                "HashSet"ler tekrarsiz eleman depolamak icindir

           b) LinkedHashSet Class:
                "LinkedHasSet"ler elemanlari sizin verdiginiz siraya gore dizdiklerinden (insertion order), "HashSet"lere
                gore yavastirlar
                "LinkedHasSet"ler tekrarsiz eleman depolamak icindir

           c) TreeSet Class:
                "TreeSet"ler elemanalari natural order(kucukten buyuge ya da alfabetik siraya gore) a gore dizerler
                "TreeSet"ler elemanlari natural order'a gore dizdiklerinden cok yavastirlar.
                En yavas set "TreeSet"tir.

         3) TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz

         */


        HashSet<String> hs = new HashSet<>();
        hs.add("Gulce");
        hs.add("Seda");
        hs.add("Omer");
        hs.add("Hasan");
        hs.add("Benna");
        System.out.println(hs); //[Hasan, Seda, Omer, Gulce, Benna] -->random siraladi.

        hs.add("Seda"); //Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece 1 kere ekler. //[Hasan, Seda, Omer, Gulce, Benna]
        System.out.println(hs);//[Hasan, Seda, Omer, Gulce, Benna]


        //null ekleyebiliyor muyum?
        hs.add(null);
        hs.add(null); //[null, Hasan, Seda, Omer, Gulce, Benna]
        System.out.println(hs);


        //benzersiz bir code verir
        System.out.println(hs.hashCode()); //207764255


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(19);
        lhs.add(13);
        lhs.add(-33);
        lhs.add(312);
        System.out.println(lhs); //[19, 13, -33, 312] --> elemanlari bizim ona verdigimiz insertion order'a gore diziyor
        //hashsetlere gore biraz daha yavastir. Elemanlarimizin sirasi onemliyse bunu kullanabiliriz


        lhs.add(null);
        lhs.add(null);//sadece 1 kere koyabiliriz
        System.out.println(lhs); //[19, 13, -33, 312, null]


        //2 farkli objectim var lhs ve ls
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(19);
        ls.add(13);
        ls.add(313);
        ls.add(45);

        lhs.retainAll(ls);//ilk basta lhs i kullandim. ortak olanlari verdi olmayanlari sildi.Eger bos [] verirse kesisen eleman yok demektir
        System.out.println(lhs); //[19, 13] -->retainAll kullandiktan sonra lhs sepetim bozuldu. LinkedHashSetteki farkli elemanlari siler
        System.out.println(ls); //[19, 13, 313, 45] --> ls sepetim old gibi duruyor.


        //lhs set'imizdeki ls ile ortak olan elemanlari verdi, ortak olmayanlari sildi.
        //bu methodu kullaninca datamiz bozuluyor


        TreeSet<Character> ts = new TreeSet<Character>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('Y');
        ts.add('E');
        System.out.println(ts); //[A, B, E, G, L, Y] -->alfabetik olarak siraya dizdi. Tekrarlanan oge yok.


        //ts.add(null); -->TreeSet'lerde null eklenemez. Natural order'a gore dizdigi icin ekleyemiyor.

        System.out.println(ts.first()); //A --> en kücügü verir
        System.out.println(ts.last()); //Y

        System.out.println(ts.lower('E')); //B --> Verilen eleman olan E den bir onceki elemani verir
        System.out.println(ts.lower('F')); //E --> Verilen eleman F olmadigi icin olsaydi nerede olurduyu bulup
        //                                            bir oncekini verir. (F yok olsaydi bir oncekini verirdi)
        System.out.println(ts.lower('A')); //null --> A'dan once eleman olmadigi icin null verdi


        System.out.println(ts.higher('B'));//E --> B'den bir sonrakini verdi.
        System.out.println(ts.higher('F'));//G --> F olsaydi bir sonraki olan G i verirdi

        System.out.println(ts.headSet('E')); //[A, B] -->Girmis oldugum character haric olmak uzere bastakileri verdi
        System.out.println(ts.headSet('E', true));//[A, B, E] -->true yazarak E'i dahil ettik

        System.out.println(ts.tailSet('E')); //[E, G, L, Y] --> E dahil olmak uzere sonuna kadar verdi
        System.out.println(ts.tailSet('E', false)); //[G, L, Y] --> false yazarak E haric dedik

        System.out.println(ts.ceiling('G')); //G --> Eleman set'in icinde varsa elemanin kendisini verir
        System.out.println(ts.ceiling('F'));//G -->  Eleman set'in icerisinde yoksa sonrakini veriyor

        System.out.println(ts.floor('B')); //B --> Eleman set'in icinde varsa elemanin kendisini verir
        System.out.println(ts.floor('C')); //B --> Eleman set'in icinde yoksa onceki elemani return eder


        System.out.println(ts.subSet('E', 'L'));//E G --> Baslangic index dahil, son haric
        System.out.println(ts.subSet('E', false, 'L', true)); //[G, L]



        /*
         --> Set'ler tekrarsiz elemanlar depolamak icin kullanilir(unique)

             Hangi datalar tekrarsiz olur?
            Id, Tc, Telefon numarasi, Plaka ..

             Collection'da neyi nerede kullanacagimizi ogreniyorduk. Applicationımizda id, email, tc gibi bir data
            depolayacaksaniz "Set" tabanina koymaniz lazim. ArrayList kullanilabilir ama onun yeri orasi degil.
            Cay kasigi-yemek kasigi gibi

            3 tane set var.
           1) HashSet       : Eger size performans-hiz gerekirse bunu kullan. Hash'lerin en hizlisi
           2) LinkedHashSet : Ekleme sirasina gore diziyor. "insertion" burada bir sira var. o yuzden biraz daha yavas
           3) TreeSet       : "natural order" a gore diziyor. kucukten buyuge, alfabetik olarak diziyor. en yavasi bu.


            Bir raf dusunelim.
           HashSet kitaplari rafa oldugu gibi koyuyor random sekilde. Hicbir sira gozetmiyor kendi mantigiyla calisiyor
           LinkedHashSet ler bizim verdigimiz siraya gore koyuyor. (insert)
           TreeSet ler tek tek bakip natural order a gore siraliyor.


           HashSet--> Kitaplikta yeter ki kitap olsun, siralama bizim icin bir onemi yoksa, hiz cok onemliyse bunu kullan.
           LinkedHashSet--> Ogrenci kayitlarini siralamamiz gerekiyorsa bunu kullan
           TreeSet--> natural order


         */

    }
}
