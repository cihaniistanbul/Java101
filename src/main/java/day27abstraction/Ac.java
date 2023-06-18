package day27abstraction;

public interface Ac {


     public abstract void cool ();

    //interface methodlar abstract old icin body kullanilmiyor.
    //interface'lerda detay hakki yok. detaylar body kisminda olur.


    /*
    1) Bir interface'i bir class'in parent'i yapmak icin "implements" keywordunu kullaniriz
    2) Java parent'lar class oldugunda multiple parent'a musade etmez ama biz bazen multiple
       parent'a ihtiyac duyariz
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



}