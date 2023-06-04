package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {

        //Ornek1:
        int a = 10;
        int b = 20;

        int r1 = a < b ? a++ : ++b;
        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);


        //Ornek2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //        -4 ==>  -1*-4     4 ==>4      0 ==>0
        //

        int c = 4; //-4 yazsam da console da 4 cikar. cunku -4<0 true idi. o zaman -1 ile -4u carpiyoruz
        int r2 = c < 0 ? -1 * c : c;
        System.out.println(r2);


        //Ornek3 : Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri
        // farkli ise "farkli isaretli sayilari carpamiyorum" mesaji veren kodu yazin

        int m = 5;
        int n = -6;

        Object r3 = ( m>0 && n>0 ) || (m<0 && n<0) ? m*n : "farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);


        //"Object" java da butun "Non-Primitive Data Type"(Class) larinin ortak "Parent" (anne-baba) idir.
        //"Object" in Parenti yoktur
        //Farkli data type lar icin ortak bir variable olusturmak istediginizde, data type olarak object kullanabilirsiniz
        //Java da "Object" , insanlik aleminde "Hz. Adem'e benzer"



        //Ornek4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int p = 313;
        String r4 = p>99 && p<1000 ? p+ "  uc basamaklidir" : "uc basamakli degildir";
        System.out.println(r4);




    }
}
