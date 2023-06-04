package day02datatypesmethodcreation;

public class Variables02 {

/*
Java da temelde 2 tip data vardır.
   1)primitive data type:
     char, boolen, byte, short, int, long, float, double

   2)non-primitiv data type:
      String
 */
/*
 Note 1 : primitive data type'larını java oluşturmuştur, biz olusturamayız
 Note 2 : primitive data type'larının isimlerinde sadece kucuk harf kullanilir
 Note 3 : primitive data lar data type larina göre memory de farkli farkli yer kaplarlar
 Note 4 : primitive data lar iclerinde SADECE sizin atadiginiz degeri barindirirlar
            BUNLAR INTERVİEW LARDA SORULABİLİR

*/
/*
    Non-primitive data types
   Ornek => String.....
   ==> *Uretilen her bir class ayni zamanda bir non-primitive data type dir.
        Bu yuzden non-primitive data type lar sinirsiz sayidadir denilebilir
       *Non-primitive data typlarin isimleri büyük harf ile baslar
       *Non-primitive ler icin java memory de buyuklugune gore degisen boyutlarda yer ayirir

       */


    public static void main(String[] args) {
        //Ornek : Ulke ismi icin bir variable olusturun ve ekrana yazdirin
        String ulkeIsmi = "Turkiye";
        System.out.println(ulkeIsmi);



/*
    Interview sorusu : "primitive" ve "non-primitive" data type lari arasindaki fark nedir?(method)
    1) "primitive" ler sadece bizim atadigimiz degeri icerir
       "non-primitive" ler bizim atadigimiz degeri ve method lari icerir
    2)"primitive" ler kücük harfle baslar, "non-primitive" ler büyük harfle baslar
    3)"primitive" leri java üretmiştir ve 8 tanedir,
      "non-primitive" leri java ve devoloperlar üretebilir, sinirsiz sayidadir
    4)"primitive" ler memory de data type larina göre sabit boyutta bellek kullanir
      "non-primitive" ler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler


 */







    }




}
