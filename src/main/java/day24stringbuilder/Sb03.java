package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {

        /*
        1) StringBuffer java da String ureten bir diger classtir.
           StringBuffer java nin String uretmek icin olusturdugu ilk classtir.

        2) StringBuffer, StringBuilder'a cok benzer, yani ikisi de "mutable" String uretir.

        3) StringBuffer "multi-thread"dir ama StringBuilder "multi-thread" degildir

        4) StringBuilder "multi-thread" olmadigi icin StringBuffer dan daha hizli calisir

        5) "multi-thread" yapilirken yapilan islerin siralamasi onem arzeder,
            yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir
            StringBuffer multi-tread oldugu icin ayni zamanda "syncronized"dir.



        3 tane String olusturan Class ogrendik;
            1) immutable String lazimsa; String Class

            2) mutable String lazimsa; StringBuilder veya StringBuffer
                a) StringBuilderi "multi-thread" gerekmezse kullaniriz
                b) StringBufferi "multi-thread" gerekirse kullaniriz
         */


        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf); //Java

        System.out.println(sbf.capacity());//20

        /*
        Burada yemekler uzerinden ornek verildi
        CORBA     --> 30 dk
        SALATA    --> 15 dk
        ET YEMEGI --> 20 dk
        TATLI     --> 20 dk

        Bu yemekleri yapma suresi toplam 110 dk. Eger corba bittikten sonra salataya baslarsak ve bu siralama da gidersek 110 dk suruyor.
        Ama corba piserken salatayı yaptik diyelim. Yani beklemedik o zaman sureler dusuyor. Bazi isleri ayni anda yapabiliriz.
        Corba piserken salata yaparsak -->30 dk
        Et piserken tatli yaparsak --> 45 dk ikisinide halletmis oluruz.
        Yani 110 dk surecek yemegi 75 dk ya dusurduk. Bunu multi-thread ile yaptik (coklu-is)
        Bunu yapmak bize zamandan tasarruf sagladi. Ama multi-tread in basarili olmasi icin mantikli bir siralama gerekli.
        Eger once salatadan yapmaya baslarsak corba pismiyor. once corbayı ocaga koyup salata yapmaliyiz
        Bu siralamaya syncronization denir

         */


    }
}
