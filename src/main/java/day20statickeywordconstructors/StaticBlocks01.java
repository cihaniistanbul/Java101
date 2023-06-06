package day20statickeywordconstructors;

public class StaticBlocks01 {

    //Note 1: static blocklar static variable lari initialize etmek icin kullanilirlar ve class icinde her seyden once calistirilirlar
    //        Birden fazla static block oldugunda static blocklar yukaridan asagiya dogru yani yukarida olan once calisir


    //Bir variable olusturdugunuzda, deger atamadiginiz o variable i "initialize" etmediniz demektir. (olusturdunuz ama baslatmadiniz)
    //Variable olusturup deger atamazsam java default deger atar
    static double pi; // (double pi;) variable'ini olusturup deger atamasini main method icinde yapabilirim.Ama pi=3.14; yazinca java kiziyor cunku static degil
    // basina static yazinca main icinde baslatabiliyorum
    static String shape; //initialize etmedim static block icinden deger atadim

    //main method disinda class icinde static block olusturdum.Artik pi variable'ina initialize edilmesi main method dan once olacak.
    static {
        pi = 3.14; //main method calistirilmadan hazir oldu
        System.out.println("Static block 1");
    }


    static {
        shape = "Circle";
        System.out.println("Static block 2");
    }


    public static void main(String[] args) {

        /*
        Bazen main method dan calistirilmadan once variable larin hazir hale getirilmesi gerekir.
        Bu nedenle static block lara ihtiyac duyabiliriz

        static variable lar static blocklar icinde initialize edilirse o class in icinde her seyden once hazir hale getirilmis
        olur.
         */

        System.out.println(pi);
        System.out.println("main method");
        //once static block calisti. cunku static block her zaman ilk calisir. Sonra main methoda gectik kodlar yukaridan asagi calisiyor.

    }
}

/*
Note: static block u main disinda olusturmamiz yeterli. Istersek en alta yazalim ilk calisacak olan yine static blocktur.
      once static method sonra main method calisti
      Birden fazla static block olusturursak yukaridan asagi calisiyor. Kendi aralarindaki oncelik bu sekilde olusuyor

      Bazen bir variable'in initiliaze edilmesini main methoddan once olmasini isteyebiliriz.Yani main method calismadan once
      benim variable'imin bir degeri olsun, initialize yapilmis olsun.Bunu static block sayesinde yapiyoruz
      Class icinde main method disinda  --> static { pi=3.14; }
      Ayni mutfakta chef yemek yapmadan once malzemelerin hepsinin hazir olmasi gibi
 */