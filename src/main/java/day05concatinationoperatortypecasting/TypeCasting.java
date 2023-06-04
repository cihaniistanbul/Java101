package day05concatinationoperatortypecasting;

public class TypeCasting {
    public static void main(String[] args) {

    /*

      Numeric primitive data type larinin birbirine donusturulmesine 'Type Casting' denilir
      Numeric(sayisal) primitive Data type lar: byte - short - int - long- float - double
     */


        //Note1: Kucuk data type larini buyuk data type larina cevirmeyi java otomatik olarak yapabilir
        // Bu isleme "AutoWidening" (otomatik genisletme) denir.

        //Note2: Buyuk data type larini kucuk data type larina cevirmek riskli bir istir, java bu riskli
        //       isi otomatik olarak yapmaz, bu islemi kod yazanlar yaparlar.
        //       Bu isleme "ExplicitNarrowing"(Aciktan daraltma) denir


        //byte data type ini int data type ina ceviriniz
        byte age = 13;
        int ageInt = age; //AutoWidening

        //int data type ini short data type ina ceviriniz
        int weight = 313;
        short weightShort = (short) weight; //Explicit Narrowing

        //int data type ini float data type ina ceviriniz
        int population = 77000;
        System.out.println(population);

        float populationFloat=population;
        System.out.println(populationFloat);

        //double data type ini short data type ina ceviriniz
        double number = 12.99;
        System.out.println(number);//12.99

        short numberShort = (short) number;
        System.out.println(numberShort);//12

        //ornek
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte) num;
        System.out.println(numByte);//4

        //NOT
        //Donusum yaptiginiz sayi (260), donuseceginiz data tyepi inin sinirlari disinda ise
        //java kullandiginiz sayi ile "mod" islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur






    }
}
