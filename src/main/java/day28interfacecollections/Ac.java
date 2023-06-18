package day28interfacecollections;

public interface Ac {


     public abstract void cool ();


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









      */

}