package day26polymorhphism;

public class Animal {

    /*
    1) Parent Class daki methodu Child Class icinde ozellestirerek kullanmaya Overriding denir.
    2) Overriding de methodun parantezine, method ismine dokunulmaz (METHOD SIGNATURE) degistirilmez
      methodun body'si degistirilir
    3) Private methodlar override edilemezler
    4) Child Classdaki methodun access modifieri Parent Classdaki override edilmis method(Overriden Method) un
      access modifierindan dar olamaz. Aynisi ya da daha genis olabilir
    5) Child class da override edilen methodun return type i ile parenttaki methodun return type i arasinda
      IS-A iliskisi varsa return type degistirilebilir
    6) Methodun return type i primitive ise overriding yaparken return type degistirilemez. Cunku return type
      ayni olur veya parenttan secilir, ama primitive ler arasinda parent-child iliskisi olmadigindan parent tan
      secmek soz konusu olamaz.
    7) Child da override edilen methodun return type ile parenttaki methodun return type i arasinda IS-A iliskisi
      yoksa return type degistirilemez.
      Mesela;
      Integer wrapper class ile Long wrapper class arasinda IS-A iliskisi YOKTUR. o yuzden degistirilemez
    8) Methodun return type i void ise, Overriding yaparken return type degistirilemez.
    9) "Static methodlar" override edilemezler. Cunku static methodlar tum child lar icin ortak methodlardir.
       Mesela bir child bir ortak methodu degistirdiginde diger childlar bundan olumsuz etkilenebilir. Bu nedenle
       Java static methodlarin override edilmesine izin vermez.
    10) Final methodlar override edilemezler
        a) Final keywordunu variable larda kullanabilirsiniz
            i) final variable a mutlaka deger atanmalidir
            ii) ilk atanan deger degistirilemez
        b) Final keywordunu method larda kullanabilirsiniz
             i) final methodun bodysi degistirilmez
            ii) method bodysi degistirilemeyince override yapmak mumkun olmaz
        c) Final keywordunu class larda kullanabilirsiniz
            i) class final ise o classin childi olamaz

       Polymorphism = Method overloading + method overriding





     */



    public void eat(){
        //parenttaki override edilmis eat() methoduna "Overriden Method" denir
        System.out.println("Animal eat ..");
    }


    public void drink(){

        System.out.println("Animal drink ..");
    }


    public Animal create(){
        return new Animal();
    }


    public int add(int a, int b){
        return a+b;
    }


    public Integer multiply(Integer a, Integer b){
       return a*b;
    }





}


   /*
   Overriding --> Parent Class daki methodlari ozellestirerek child icerisinde kullanmaya denir.
   Bu classin daha specific olmasini istiyoruz. Cat ise "Animals eat" diye dolasmasin.
    */