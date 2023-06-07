package day08stringmanipulationmemoryusageifstatement;

public class Tekrar {
    public static void main(String[] args) {
        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol length() methodu ile cozum
        String str = "";

        boolean result=str.length()==0;
        System.out.println(result);

        boolean r1= str.isEmpty();
        System.out.println(r1);


        //Ornek 2:Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz

        boolean r2=str.isBlank();
        System.out.println(r2);



        //Ornek 3: Bir string de a, i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        // "Java is easy to learn" ==>   1 + 5 + 8 ==> 14
        //  0123456789.....index
        String r = "Java is easy to learn";

        int ıdxA= r.indexOf('a');
        System.out.println(ıdxA);

        int idxI=r.indexOf('i');
        System.out.println(idxI);

        int idxE=r.indexOf('e');
        System.out.println(idxE);

        System.out.println(idxE+idxI+ıdxA);



        //Ornek 4: Bir string deki "Java" kelime sinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        //  "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz
        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int r4=u.indexOf("Java");
        System.out.println(r4);


















    }
}
