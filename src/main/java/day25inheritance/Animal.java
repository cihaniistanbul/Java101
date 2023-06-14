package day25inheritance;

public class Animal {

    //Inheritance --> Miras ,alma

    /*

    Ozellikleri(aktif-pasif) bir classtan diger classlara alan bir kavramdir
    Mesela siz bir class olusturmak istiyorsunuz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin
    cogunu kapsiyor. O zaman yeni olusturdugunuz classi ozelliklerini kullanmak istediginiz class'a child yaparsiniz

     Inheritance'in faydalari
     1) Code tekrarlarindan kurtuluruz
     2) Code tamiri(maintenance)  kolay olur
     3) Child classlari daha atomic yapmis oluruz

     -> Bir classi baska bir classin child classi yapmak icin
     extends keywordu kullanilir. Ilk yazilan child, ikinci yazilan class
     parent olur, parent class'a super class da denir

     -> child class objectleri parent class tan method ve variable lari kullanabilirler
     -> Parent class objectleri child classtan method ve variablelari kullanamazlar

     -> javada bir classin sadece 1 tane parenti olabilir, coklu parent'a "Multiple Inheritance" derler,
     tekli parent'a "single inheritance" derler. Java "Multiple Inheritance" i desteklemez, Java single inheritance kullanir

     -> Apartman seklindeki inheritance yapisina "MultiLevel Inheritance" denir, java multilevel inheritanece i destekler

     -> Object class her classin parentidir. Java da object class haric her classin parenti vardir.
        Java da parent i olmayan tek class object classdir

     -> java da parent'dan child'a olan iliskilere "HAS-A Relation Ship" denir
        child'dan parent'a olan iliskilere "IS-A Relation Ship" denir

     --> javada her classin bir tane default constructoru vardir. Bu default constructor classin icinde gorunmez
         cunku default constructor "Object Class" icindedir.


         ---------


         Note: Diyelim ki cesitli objectler uretmek istiyorum. Mesela "Cat, Dog, Bird". Object uretmek icin once bu isimlerde
               class olusturmam lazim. Simdi bu classlarda gormek istedigim aktif-pasif ozellikleri koymam lazim.

               Cat objectimize aktif ozellikleri yerlestirelim --> eat(){...}
                                                                   drink(){...}
                                                                   meow(){...}


               Dog objectimize de yapacagi cesitli ozellikler -->  eat(){...]
                                                                   drink(){...}
                                                                   bark(){...}


               Bird objectimize de yapacagi cesitli ozellikler -->  eat(){...]
                                                                    drink(){...}
                                                                    tweet(){...}


              1) Burada 500 cesit hayvan olabilirdi. Hepsine ayri ayri eat, drink vs koyduk. Tekrar java da iyi degil. Bu
               sekilde yapmak  en kotu ozelliklerin basinda gelir.

              2) Olusturdugumuz yapidaki bir seyi degistirmek istiyoruz diyelim tek tek 500unude gezip yeniden guncellememiz lazim

              3) Bu yapinin kotu olmasinin diger ozelligi: atomik degildir


              --> Bu problemleri ortadan kaldirmak icin Java soyle bir cozum bulmus: Ortak ozellikleri kapsayan yeni bir Class
                 olustuyorsunuz. Bu class i parent yapip digerlerini (cat, dog vs) sadelestiriyorsunuz. Simdi child classlar cat,
                 dog gibi kendilerinde bulunmayan Parent Class da bulunan ozellikleri alip kullanabiliyorlar. O yuzden inheritance
                 yani miras alma.

                 Parent Class --> Animal  (Sadece ortak olanlari buraya koyuyoruz eat,drink vs)
                 Child Class  --> Cat, dog, bird ...



                 Interview Question: Nicin inheritance kullaniriz?
                                     Reusability. Yani parent classin uyelerini kullanabiliriz.


                 Inheritance'in faydalari nelerdir?
                  a)tekrardan kurtuluruz
                  b)daha az code yazarak islemlerimizi yapabiliriz
                  c)kolayca update yapabiliriz
                  d)application'in bakimi ve surdurulmesi (maintenance) kolaylasir



                      ANİMAL        Cat IS-A mammal
                            -->     Cat IS-A animal   --> bu sekilde yukaridan asagi IS-A iliskisi var. Asagidan yukari da HAS-A relationship.
                      MAMMAL        Mammal IS-A animal

                      CAT








     */

    public void eat() {

        System.out.println("Animals eat...");
    }

    public void drink() {

        System.out.println("Animals drink...");
    }

}
