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

        System.out.println(sbf.capacity());


    }
}
