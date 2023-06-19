package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
        System.out.println(s); //[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        // s.remove(2);
        // System.out.println(s); //[Nuriye, Orhan, Saadet, Niyazi, Bilal, Abdullah, Nuriye] -->2.indexi siler, bunyamin gitti

        // s.remove("Bilal"); -->Bilal'i siler
        // System.out.println(s);  //[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Abdullah, Nuriye]

        // s.removeFirstOccurrence("Nuriye"); -->Ilk gorunumu siler
        // System.out.println(s); //[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        s.removeLastOccurrence("Nuriye"); //-->Son gorunumunu siler
        System.out.println(s); //[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah]



        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
        Yani bizim ilk elemani aliyor ama silmeden veriyor.
         */

        String r1 = s.peek(); //ilk node u silmeden size verir(copy paste)
        System.out.println(r1); //Nuriye
        System.out.println(s); //[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah]



        /*
        Retrieves and removes the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
         */
        String r2 = s.poll(); //ilk nodu size verir ve listten siler (cut-paste)
        System.out.println(r2); //Nuriye
        System.out.println(s); //[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah]


        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list
        Throws: NoSuchElementException – if this list is empty!

        NOTE: peek() ile element() ikiside ilk elemani silmeden verir
              ama peek() list bos oldugunda size null verir
              element() ise hata verir.
         */
        //ayni peek gibi bize silmeden verdi. Peki farki ne?
        String r3 = s.element();
        System.out.println(r3); //Orhan
        System.out.println(s); //[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah]


        /*
        NOTE: poll() ile pop() ikiside ilk elemani siler ve size verir. (cut+paste)
        ama poll() list bos oldugunda size null verir, pop() ise hata verir.
         */
        String r4 = s.pop();
        System.out.println(r4); //Orhan
        System.out.println(s); //[Bunyamin, Saadet, Niyazi, Bilal, Abdullah] cut-paste




        /*
               Collection nedir?
         Java'da coklu datalarla manipulasyon yapmaya yarar. Nasil ki evinizde salata tabagi, yemek tabagi ayri ayri ise
        yani bunlarin hepsi coklu yemek parcaciklarini muhafaza etmek icindir. Ama hepsinin bir amaci var. Tatli
        tabagina yemek koyamayiz. Koyarsak garip karsilanir. Collection'lardaki mantik bu'dur. Neyi nerede kullanmamiz
        gerektigine odaklanmaliyiz.
         ArrayList'ler ekleme ve silme islemlerinde cok zahmet cekiyor :D Tekrar tekrar indexleme yapmak zorunda kaliyor.
        Java yeni bir yapi olusturuyor. Bunun adi LinkedList'di.

         LinkedList'lerde index yapisi olmadigi icin eleman ekleme cikarma isleminde basariliydi. Bunun dezavantaji da
        search isleminde cok yavas olmasi.

         Search isleminde ArrayList'ler daha basarili. Cunku indexlerle calisiyor.

         */
    }
}
