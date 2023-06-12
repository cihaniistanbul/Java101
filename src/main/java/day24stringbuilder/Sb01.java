package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

        /*
        1) "StringBuilder" classi da String ureten bir classdir

        2) "String" Class kullanarak string uretiriz, nicin "StringBuilder" classi da var?
            String Class immutable (degistirilemez) String uretir
            "StringBuilder" class mutable (degistirilebilir) String uretir

        3) "immutable" olmak demek orijinal degerin korunmasi, degistirilemez olmasi demektir
           "mutable" olmak demek orijinal degerin degistirilebilir olmasi demektir
         */


        //immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String i degistirdikten sonra ayni String i assign ederseniz, java yine bir container olusturur
        //Degismis degeri bu yeni containerin icine koyar ve eski containeri gosteren pointer yeni containera yonlendirir
        //Dolayisiyla eski container adressiz kalir ve "Garbage Collector" adressiz olan containerlari siler
        String a="Money";
        a=a+"More"; // bu sekilde a sepetini guncelliyordum



        //mutable
        //StringBuilder kullanarak string olusturmanin 1.yolu
        //Heap memory de ayni kabin icinde orijinali silip yenisini yazabiliyorum

        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);
        sb1.append("!"); //mutable da sadece method kullanmak yeterli. console da direk yazdiriyor
        System.out.println(sb1);//Python

        // mutable --> Array List
        //immutable --> String, Wrapper class


        //StringBuilder kullanarak String olusturmanin 2. yolu:

        StringBuilder sb2= new StringBuilder(); //bos sekilde de olusturup append ile ekleme yapabiliriz
        System.out.println(sb2.length()); //0
        System.out.println(sb2.capacity()); //16

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");

        //capacity() ve length arasindaki fark nedir?
        System.out.println(sb2.length()); //4
        System.out.println(sb2.capacity()); //16

        //capacity() javanin size verdigi data depolama yer sayisidir
        //length() ise size verilen data depolama yerinin kullanilan kismidir
        //Java baslangic olarak size capacity'i 16 olarak verir, eger siz verilen capacity'i asarsaniz
        //java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
        // 16 --> 16*2 +2       -     34 --> 34*2+2

        //java default olarak capacity i 16 veriyor. Eger ekledigimiz degerler 16 dan fazla olursa java (oldcapacity*2)+2
        //veriyor



        //StringBuilder kullanarak String olusturmanin 3. yolu:
        //default capacity i nasil degistirebiliriz?
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("ali");




    }
}
