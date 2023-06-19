package day28interfacecollections;

public interface Ac {


     //Ac interface'in icin abstract method koyduk. Bunu da childlarda override ettik.(civic ve accord)
     public abstract void cool ();

     void run();
     public static final int price = 2000; //variable olusturduk.3 tane keyword koyduk ama hepsi silik
                                           //cunku interface'lerde otomatik olarak variable'lar public,
                                           //static yapar her yerden ulasilsin diye ve final yapar degistirilmesin diye.
                                           //public static final int price = 2000; --> public static final i siliyorum
                                           //HondaRunner'a gidip Ac.price yazinca degeri gosteriyor



     /*
     Bu klima interface'i method olusturmak icin var

     public void cool(){
     sout("Make it cool");    --> Bu sekilde yazarsak hata veriyor. Cunku interface methodlari
     }                            abstract olur. Abstract methodlarinda body'si olmaz. O zaman {} sileriz.
                                  Bu guzel bir ozellik aslında. Diyelim ki alicanin 3 teyzesi var. 3üde eat() diyor.
                                  Yeter ki ye sen karar ver diyor. Ama coklu parent yapisinda detay verseydik
                                  teyzelerden biri et ye biri sebze ye deseydi alican mutsuz olurdu.

                         onemli   --> Methodlar coklu parenttayken sadece ne yapilmasi gerektigini soylerler, nasil
                                  yapilacagina karisamazlar.

       Bu methodun body'si yok. Cunku bu bir abstract method. Biz normalde abstract methodylar abstract keywordunu
      yazardik. Burada yazmadik Java kizmadi. Cunku interface oldugu icin Java methodlarin abstract oldugunu bilir.
      Sen ister yaz ister yazma ben onu abstract kabul ediyorum der.
       Sadece void mavi renkte. Bunun anlami yazsan da bir yazmasan da demek. Public icinde bu gecerli. O zaman
      interface'deki tum methodlar public ve abstract olur


      */

    //interface methodlar abstract old icin body kullanilmiyor.
    //interface'lerda detay hakki yok. detaylar body kisminda olur.


    /*
    1) Bir interface'i bir class'in parent'i yapmak icin "implements" keywordunu kullaniriz
    2) Java parent'lar class oldugunda multiple parent'a musade etmez ama biz bazen multiple
       parent'a ihtiyac duyariz.
       Bu ihtiyaci gidermek icin Java "interface" adinda yeni bir yapi olusturdu.
       Bu yapi sayesinde bir class icin coklu interface parent olusturulabilir
    3) Interface'lerin icine concrete method konulmaz, cunku concrete methodlarda body vardir.
       Body, o methodun isi nasil yapacagini belirtir. Isin nasil yapilacagi bircok detay icerir.
       Bu durum child classlarda kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken
       isi soyleyip, isin nasil yapilacagini child'a birakirsaniz child class'in kafa karisikligini
       engellemis olursunuz.
    4) Interface'lerdeki tum methodlar otomatik olarak public dir, abstracttir, static degildir.
    5) Interface'ler concrete method iceremezler, interface icindeki hicbir sey istege bagli degildir.
       Her sey child classlar icin mecburidir. Bu yuzden interface'lere "to-do list" de denir.
    6) Coklu interface parentlarin her birinin icine ayni isimli methodlar koyabiliriz.
       Mesela Ac'nin, Engine'nin ve Security'nin iclerine run() methodu koymak gici
       Child class herhangi birini override ettiginde hepsini override etmis gibi olur. Sonrada
       body'i Child class da yazarak uygulamasini yapmis olur.
    7) a) Interface'lerdeki tum variablelar otomatik olarak(default) final'dir. Bu yuzden interface icindeki variable'i
          olusturdugumuzda mutlaka deger atamasi yapmalisiniz. (int price; dersek hata veriyor.deger atamasi yapmamiz gerek)
          Bilindigi gibi final variable'larin degeri degistirilemez.
       b) Interface'lerdeki tum variable'lar otomatik olarak(default) public'tir.
       b) Interface'lerdeki tum variable'lar otomatik olarak(default) static'tir.

        --> Dolayisiyla interface'lerde variable cagirirken interface adini kullanarak cagiririz, bu hem static variable
           olmanin geregidir hem de okunurlugu artirir.

     8) Normalde "interface" icine "concrete method" konulamaz. Ama bazi ozel durumlarda "concrete method" koymamiz
        gerekirse, default keyword kullanarak bunu yapabiliriz.
        "static" keyword'unu kullanarakta interface icine concrete method koyabiliriz.
        (2 istisna var default ve static keywordleri)
     9) "default" keywordunu kullanarak olusturdugunuz "concrete methodlara" interface'in child class'indan object
         olusturarak ulasabilirsiniz.(cunku interface'ten object olusturamayiz, olusturamazsak bu methoda ulasamayiz)
         "static" keywordunu kullanarak olusturdugunuz concrete methodlara ulasmak icin object olusturmaya gerek
         yoktur, interface ismi yeterlidir.
         (HondaRunner clasina gelip "myCivic." yazinca eco geldi. Bu nasil oldu? Bir ustte yazilan madde sayesinde)
     10) Interface'lerden object olusturulamaz. Interface'lerin constructori yoktur.

     11)

            Child           Parent              keyword
            class           class        ==>    extends
            interface       interface    ==>    extends
            class           interface    ==>    implements
            interface       class        ==>    OLAMAZ

      Ayni ise "extends" farkli ise implements kullaniriz, ve interface concrete classin childi olamaz




          Abstract class ile interface arasindaki farklar nelerdir?
      1) Abstract classlar hem abstract hemde concrete methodlar icerebilir fakat interfaceler sadece abstract method icerir.
         ama interface'lerde istersek "default" ve "static " keywordlerini kullanarak "concrete" method uretebiliriz.
      2) Abstract classlar multiple inheritance i desteklemez Ama interface ler destekler.
      3) Abstract classlar icinde her turlu variable olusturabilir, interface'ler icindeki variable'lar public, static
         ve final olmak zorundadir.
      4) interface Class in childi olamaz ama abstract class classin childi olabilir
      5) Abstract classlarda constructor vardir ama object uretemez, interface'lerde constructor yoktur bu yuzden
         object uretilemez.




     */


     /*
     Burada bir class'in birden fazla parent'i olmasina ihtiyacim var. Ama Java multiple inheritance'i desteklemiyordu.
     Java, multiple parent ihtiyacimizi karsilamak icin "INTERFACE" olusturmus. Bu parent'lari class yerine "interface"
     olarak seciyoruz bu sekilde multiple parent kullanabiliriz.
     Bir insanin 1 annesi olur. Ama bir insanin birden fazla teyzesi olabilir. Anneyi class gibi dusunursek, classlarda
     birden fazla parent olmasi mumkun degildir. Ama interface'leri teyzemiz gibi dusunebiliriz. Burada birden fazla
     parent mumkundur.



     Abstraction'a neden ihtiyac duyariz?
     Objectleri siniflandirmak, belirli gruplara ayirmak ve genel ozelliklerini cizmek icin classlar olustururuz.
     Eger ki bir classtan object olusturulmasini istemiyorsak ve amacimiz bu class'i sadece child classlarin yapmalari
     gereken gorevleri belirlemek icin kullaniyorsak orada abstraction kullaniyoruz. Bunu yapabilmek icin yani bir
     child'i bazi seylere mecbur birakabilmek icin belli kurallar var.
     Parenttaki abstract methodlar sayesinde child classlari override etmek zorunda birakiyorduk. Bu yuzden tum childlar
     icin mecburi olmasini istedigimiz fonksiyonlarin body'sini silip abstract yapiyorduk. Methoda da abstract keyword
     koyup abstract method olusturuyorduk.
     Bir onceki package da math dersini childlar icin mecburi ders yapmistik. Mecburi olmasi icin body'sini silip
     abstract yapmistik. Secmeli ders icin yaptigimiz sey yani childlar mecburi olmasin ama isterse yapabilsinler;
     "concrete" yapiyorduk. Abstract class icerisinde body'si olan concrete bir method yaziyorduk. Concrete aslinda
     bizim normal methodumuz.
     Concrete methodlar childlar tarafindan override edilmek zorunda degiller, bir opsiyondur.


     Bir methodu neden abstract yapariz?
     Override edilebilmesi icin.


     Abstract classlardan neden object olusturamayiz?
     Cunku kalip bozuk, sakat olur :D abstract class'larda bir eksiklik vardı. Body yok-govdesi yok
     bundan uretecegimiz objectlerde de sıkıntı olusmamasi icin java izin vermiyor.
     Ama abstract classlarin constructor'i vardır.


     Abstract class'larin child'i abstract olabilir mi?
     Evet. Abstract olunca override etme zorunlulugu yoktu. Abstract class'in cocugu da abstractsa override etme
     zorunlulugu yoktur. Ama concrete ise mecbur override ediyor. Ama abstract cocuklara karismiyor.


     Neden interface ortaya cikti? Neden ihtiyac var?
     Birden fazla parent'a ihtiyac duydugumuz durumda kullaniriz.


     Interface'lerin icine concrete method koyabilir miyiz?
     Hayir. Cunku alicanin teyzeleri meselesi. Kafa karisikligina yol aciyor. Concrete methodlarda body vardı. Body
     o methodun isi nasil yapilacagini belirtir. Bu da cok detay icerir. Hepsi bir sey soyledigi icin child class
     hangisini yapacagini sasiriyor :D java bu sebeple bazi temel dogrulari soylesinler ama detaylandirmasinlar
     diyerek detay soylemeyi yasaklamis. Bunun bazi istisnalari var.


     Interface'te method ile ilgili ozellikler?
     Access Modifier otomatik publictir
     Abstractir
     Static degildir


     Interfaceler Concrete method icermezler. "to-do" list gibidir. Dolayisiyla interface icerisindeki her sey abstract
     oluyor. Abstract olunca da otomatik olarak childlar icin mecburi oluyor.



        Istisnalar

          DEFAULT
     - Engine interface'inin icinde concrete bir method olusturduk.

         void eco(){
        System.out.println("Uses gas less");}

      Yukaridaki sekilde {} ile method olusturunca hem child, hem interface kiziyor. Interface'in kizma sebebi
     icerisinde body kullanamazdik. Ama koyduk diyelim. Bunu kullanmak istersek basina default yaziyoruz.

      Eger default keyword'u olmasaydi biz bunu yapamazdik. Buradaki default Access Modifier degil.
     Buradaki default, interface icerisinde concrete bir method yapabilmek icin javanin getirmis oldugu bir syntax.
     (note 8)


         STATİC
      Tek yol bu degil. Birde static keyword'umuz var. Engine icinde yeni bir method olusturdum stop isimli
     ve bodysi olan. Yine kiziyor.

         void stop(){
        System.out.println("Stops securely");}

      Istisnai bir durumdan faydalanmak istiyorum. Basina gelip static yaziyorum kizmayi birakiyor.
     (note 8)





















      */

}