package day31mapsexceptions;

import java.util.Hashtable;

public class Hashtable01 {
    public static void main(String[] args) {

        /*   bu iki fark interviewlarda sorulabiliyor

        HashMap ile Hashtable arasindaki fark nedir?
           1) Hashmap thread-safe ve synchronized degildir, Hashtable tread-safe ve synchronized'dir
           2) HashMap bir tane null key'e ve istediginiz kadar null value a musaade eder
              Hashtable key'lerde ve value'larda null kullanilmasina musaade etmez
           3) HashMap hizlidir, Hashtable hashmaplere gore yavastir.


           Note: HashMap ve Hashtable ikiside entry'leri rastgele siralar
         */


        Hashtable<String,Integer> stdAges = new Hashtable<>();
        stdAges.put("Mustafa",41);
        stdAges.put("Seda",30);
        stdAges.put("Ekim",22);
        stdAges.put("Ali Can",18);
        //stdAges.put(null,15); --> bunu kabul etmedi hata verdi
        //stdAges.put("mehmet",null); --> burada da hata verdi. Hashtable lar null deger alamaz
        System.out.println(stdAges); //{Ekim=22, Ali Can=18, Mustafa=41, Seda=30}


        /*
        NOTE:
          Java HashMap'leri cok hizli yapmak icin ozelliklerini az tutmus.
        -Mesela HashMap'ler elemanlari herhangi bir siraya koymaz.
        -HashMap'ler multi-thread degildir, dolayisiyla synchronized da degildir. Bu nedenle HashMap'ler cok hizlidir

          Bazen multi-thread'lere ihtiyac duyabiliriz. Java bunun icin Hashtable uretmis. Hashtable'lari tread-safe ve
         synchronized yapmis

          "Thread-safe" ayni anda birden fazla is yapabilmek demektir. Multi-thread ve thread safe ayni kavramlardir.
          StringBuffer'da bunlari gormustuk. Ayni anda corbayi yaparken salatayi yapmis oluyorduk.

          HashMap "thread-safe ve synchronized degildir" demek HashMap'ler coklu isleri ayni anda yapamaz demektir.
         Coklu isleri ayni anda yapmamiz gerekiyorsa "Hashtable" kullaniriz.
         thread-safe degilse synchronized olmanin bir anlami yok. Ayni anda birden fazla is yapamiyorsaniz hangisini
         once yaptiginizin bir anlami yok.
         "synchronized" demek multi-threadlerde mantikli siralama yapmak demektir.


         "HashMap bir tane null key'e ve istediginiz kadar null value a musaade eder" Cunku key'ler tekrarsizdir.
         Sadece 1 tane null koyabiliyoruz.


         Hashtable yavastir, cunku ona bir gorev verdiginizde tread-safe ve synchronization'a da bakiyor. Bu da
        zaman kaybettiriyor.

         */



    }
}
