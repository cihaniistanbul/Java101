package day28interfacecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        //List'leri 2 sekilde olusturmustuk:

        //bu ilk olusturma seklimiz
        ArrayList<String> list1 = new ArrayList<>();


        List<String> list2 = new ArrayList<>();
        // data tipini list secebildik cunku parenti Array list in
        // Array list is a List, array list is a Collection,
        // Array list is an Interable, Array list is an Object diye tanimlanabilir.


        /*
        1) ArrayListler eleman ekleme ve silme islemlerinde basarisizdirlar
            o yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2) LinkedListler index kullanmadiklarindan node silme ve eklemede re-index yapilmasina gerek yoktur
            Bu da LinkedListleri eleman ekleme ve silmede cok basarili hale getirir
            Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda linkedlist kullanmak tavsiye edilir
        3) ArrayList lerde search islemi kolay yapilir cunku indexler adres gibidir
        4) LinkedListlerde search islemi zor yapilir cunku linkedlistler index kullanmaz, index kullanmayinca herhangi
         bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir
         */

        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
        s.add(2, "Omer"); //orhan ile bunyamin arasina omer eklemek istedik
        s.addFirst("Mahmut Tuncer"); //en basa ekler
        s.addLast("Emin"); //en sona ekler
        System.out.println(s);//[Mahmut Tuncer, Nuriye, Orhan, Omer, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye, Emin]

    }
}
     /*
     NOTE:

        --> Listte bir elemani silince Java yeniden indexleme yapmak zorunda kaliyor.
        --> Listte bir eleman ekleyince Java yeniden "reindex" yapmak zorunda.
           Yani arraylistler elemani hem silerken hemde eklerken cok fazla caba sarfediyor. O yuzden yavas calisirlar

           Tekrar indexleme ile ugrasmamak icin Java LinkedList yapisini olusturmus. Burada 2 tane bolmeli kutucuklar
          var. İlk bolumunde datalar, ikinci bolumunde bir sonrakini gosteren pointerlar var. Sadece sonunca pointer
          "null" gosteriyor sonrasinda eleman olmadigi icin. Buna "tail" denir.
          En bastakide "Head" denir.

          "Node" --> dugum, baglama ..

           LinkedListte eleman silince; diger elemanlarda bir islem yapilmiyor, pointer'i alip bir sonrakini gosteriyor.
          Tren vagonu gibi. Burada index yok pointer var data var. Index yoksa reindexte yoktur. Silme islemi gayet
          basit.

          LinkedListte eleman ekleyince; aradaki pointeri kirip ekleyecek elemani gosteriyor.

          LinkedLister index kullanmazlar bu yuzden node ekleme ve silme islemlerinde tekrar indexleme yapilmaz.
          LinkedListerde node ekleme ve silme islemleri yaparken sadece pointerlari degisir.
      */