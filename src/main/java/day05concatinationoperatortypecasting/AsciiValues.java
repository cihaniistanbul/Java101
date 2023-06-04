package day05concatinationoperatortypecasting;

public class AsciiValues {
    public static void main(String[] args) {

   /*
   java da her karakterin sayisal bir degeri vardir
   bu degerler ASCII degerler olarak adlandirilir
   Bu degerlerin tamaminin bukundugu tabloya ASCII table denir
    */

        //Herhangi bir character in ASCII degerini bulmak icin o karakteri "int" data type inda
        //bir variable in icine koyunuz
        char ch = 'A';
        System.out.println(ch); //A

        int k = 'A';
        System.out.println(k);

        int unlem = '!';
        System.out.println(unlem);

        char c1='a';
        char c2='?';
        System.out.println(c1+c2);//160
        //Java da char lari matematiksel islemlerde kullanirsaniz, Java o char larin ASCII degerlerini
        //kullanir





    }

}
