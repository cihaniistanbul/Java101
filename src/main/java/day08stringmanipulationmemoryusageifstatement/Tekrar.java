package day08stringmanipulationmemoryusageifstatement;

public class Tekrar {
    public static void main(String[] args) {



        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol length() methodu ile cozum
        String str = "";
        boolean isEmpty = str.isEmpty();
        System.out.println(isEmpty);

        boolean r = str.length()==0;
        System.out.println(r);



        //Ornek 2:Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz
        String t = "";
        boolean r2= t.replace("[\\S]","").length()==0;
        System.out.println(r2);

        boolean r3 = t.isBlank();
        System.out.println(r3);





        //Ornek 3: Bir string de a, i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        // "Java is easy to learn" ==>   1 + 5 + 8 ==> 14
        //  0123456789.....index
        String st= "Java is easy to learn";
        System.out.println(st.indexOf('a') + st.indexOf('i') + st.indexOf('e'));


        //Ornek 4: Bir string deki "Java" kelime sinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        //  "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz
        String u = "Ah Java vah Java sensiz olmuyor Java.";
        System.out.println(u.indexOf("Java"));


    }
}
