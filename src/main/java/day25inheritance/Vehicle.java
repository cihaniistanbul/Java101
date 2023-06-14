package day25inheritance;

public class Vehicle {

    public Vehicle() { //constructor
        System.out.println("Vehicle 1");
    }

  public Vehicle(int price){ //parametreli constructor olusturuyoruz
      System.out.println("Vehicle 2");
  }
}

/*
     1) Child classtan bir object olusturdugunuzda Constructor en ustteki parent classtan baslatilarak alta dogru calisitirilir
     2) Child class taki constructor dan Parent class taki constructor a gidebilmek icin super() kullanilir
     3) Parent Class ta birden fazla constructor varsa istenilen constructor super() ifadesinin icine yazilan parametreler yardimi
       ile secilebilir
     4) Ayni class icindeki constructor i secmek icin this() kullanilir ,Ayni class ta birden fazla constructor varsa istenilen
       constructor this() ifadesinin parantez icine yazilan parametreler yardimi ile secilebilir
     5) super() ifadesini yazmak istege baglidir, yazmassaniz da java  sanki super() varmis gibi davaranir,
       Ama kodunuzun daha okunur kilmak icin yazmaniz tavsiye edilir
     6) super() ve this() ifadeleri constructor icinde her zaman ilk satirda olmalidir
     7) Bir constructor icinde super() ve this() ifadeleri sadece 1 kere kullanilabilir. (bkz 6.kural)
     8) inheritance da variable lari va methodlari cagirmak icin super kullanilir (parantez yok)
      this, ayni class icindeki variable veya methodlari cagirmak icin kullanilir
      super, parent class icindeki variable veya methodlari cagirmak icin kullanilir


     Parametreli Constructor nasil cagirilir?
   Her constructorin ilk satirinda super() keyword u var, yazilsada yazilmasada. Eger parametreli cons. i cagirmak istiyorsam
   super(); parantezinin icinde Strig bir seyler yaziyorum (string verildi diye)

   super()       --> parenttaki default constructor'a goturur
   super(String) --> icinde parametre olana gidiyor


 */