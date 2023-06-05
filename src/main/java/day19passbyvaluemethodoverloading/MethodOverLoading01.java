package day19passbyvaluemethodoverloading;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        //overloading --> ayni isimde farkli islemler yapabilen methodlar olusturmak demek.
        //Method isimleri yapilan islemle iliskili olmali demistik. Method overloading de isimler ayni parametreler farkli

        add(3, 5);


    }

    public static void add(int a, int b) { //basit haliyle bir method olusturup method call yapicam
        System.out.println(a + b);
    }


    //add ismine(method) farkli farkli isler yuklicem bundan sonrasinda
    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    //method call yapinca add methoduna birden fazla parametre yukledim. Overloadingimizi yapmis olduk

    /*
    1) Method Overloading yaparken isim degistirilmez

    2) Method Overloading yaparken parametreler degistirilir
        a) Parametreleri degistirirken, parametrelerin data type lari degistirilebilir
        b) Parametreleri degistirirken, parametrelerin sayisi degistirilebilir
        c) Parametre degistirirken, parametrelerin data type lari farkli ise yerleri degistirilebilir

    3) Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir
       bu yuzden ismi ve parametre "Method Signature" olarak adlandirilir

    4) Method Overloading olustururken return type i degistirmenin hicbir etkisi yoktur
       Method Overloading olustururken access modifier i degistirmenin hicbir etkisi yoktur
       Method Overloading olustururken method u static ya da non-static yapmanin hicbir etkisi yoktur
       Method Overloading olustururken body i degistirmenin hicbir etkisi yoktur

    5) "private" methodlar ovearload edilebilir. Cunku method overloading sadece bir class icinde olur
        private olmak ise baska class lara gidildiginde problem olusturur

    6) static methodlar overload edilebilir
       overloading yapmak icin (method ismini degistirmeden) method signature i degistiriririz,
       dolayisiyle signature degistiginde yeni bir method olusturmus oluruz, bu yuzden static
       olmasi bir seyi degistirmez
       static yaptigimiz objectler, variablelar ve methodlar ortak mal olur.


-------
     Overloading nasil yapilir?
     --> Ayni isimde farkli parametreler vererek, method signature ile overloading yapariz

     Diyelim ki; ay, dunya ve insanlar var. Dunya uzerinden bakarsak, dunya ile irtibatli olan ay gibi objectler ve insan gibi
     objectler var. Ayin uzerine cizik atarsak bundan hem dunya hem insanlar etkilenir. Yani ay gibi objectler uzerindeki
     yapilacak degisiklikler diger tum objectler uzerinde gorulebilir. Insan gibi objectler uzerindeki degisiklikler herkes
     tarafindan gorulmeyebilir
     Uzerinde yapilan degisiklikler herkes tarafindan gozlenebilen objectlere STATIC OBJECT denir
     Uzerinde yapilan degisiklikler sadece kendisiyle ilgili, baskasini ilgilendirmiyorsa NON-STATİC OBJECT denir
     Mesela "Ali Can" ismini "Ali Cin" yapti. Bu durumda Ali Can tek tek bankaya, sigortaya vb kurumlara gidip info vermesi lazim
     Bu mantikli degil. Diyelim ki Ali Can kaydini degistirmeyi unuttu. Boyle bir bilgilendirme Ali Can'ın keyfine birakilmamali

     String name ="Ali Can";   --> static String name ="Ali Cin"   basina static koyunca Ali Can'i gokteki ay gibi yaptim artik herkes gorebilir

     static yaptiklarimiz ortak mal oluyor.

     static --> class'a ait, class'in bir parcasi.



     [overloading interview'lar da sık sorulur]


     */
}
