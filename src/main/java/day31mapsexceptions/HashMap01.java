package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        //HashMap arkasinda calisan mekanizma nasil?

        HashMap<String , String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.get("USA");
        capitals.put("Italy","Roma");
        capitals.put("Turkiye","Ankara");
        capitals.get("Turkiye");
        System.out.println(capitals.hashCode());


        //Java bucketlar icinde LinkList kullanir. Entryleri birbirine bagliyor. Indexte birden fazla entry olduysa
        // onlari node yapisi gibi birbirine baglar.

        /*
        NOTE:
          "HashMap<String , String> capitals = new HashMap<>();" boyle bir code yazdiginiz zaman Java arka planda
          memory'de 16 tane bucket olusturuyor. Bu kovalari indexliyor.
           Diyelim ki HashMap'in icine code yazdik. Java map'deki key icin HashCode uretiyor. Diyelim ki HashCode olarak
          34 uretiyor. Elimde 16 bucket var. 34'u 16'nin diline cevirmem lazim. Mod alarak yapiyor. 34'u 16'ya boler,
          kalan bizim icin onemlidir. Bu sayede index disi bir degere gidilmesi engellenmis oluyor. Kalan 2 old icin
          Java 2.indexe gelip key,value ve HashCode'a gelip bunu yerlestiriyor. Arka planda olan sey bu. 34'u farazi
          olarak aldik.

           Bir bucket'a istediginiz kadar HashCode koyabilirsiniz. Diyelim ki 2.index de bulunan bucket'imizda 2 tane
          entry var. Ayni indexde bulunan birden fazla entry'ler arasinda "LinkedList" iliskisi var. LinkedList'lerde
          "node" yapisi kullaniliyordu.

           get() methoduyla 2.index de bulunan "Turkiye" yi cagirdik. Java Turkiye icin olusturdugu HashCode'u biliyor.
          Bunun 2.indexe tekabul ettigini de biliyor. 2.index de birden fazla indexle karsilasti. Ama HashCode'lar
          ayni degil. Turkiye icin olusturdugu HashCode'u aliyor.

           Diyelim ki bucket'lar doldu.  LinkedList'lerde search islemi cok basarili degildi. Bu durumda Java, varolan
          16 bucket'tan 12'si doldugu zaman 16 bucket daha veriyor. Bu defa toplamda 32 tane bucket oluyor. Indexleri
          hesaplarken 16 yerine 32 ye bolerek adreslemeye basliyor. Bunu yapma sebebi su; surekli 16yla giderse
          bucket larin icerisine cok fazla entry birikebilir. LinkedList mantigiyla calistigi icin cok iyi search
          yapamiyor. Bu yuzden bucket'in ici fazla dolmasin diye boyle calisan bir mekanizma var.

          Eger value degistirecek olursa da "overwrite" yapiyor

          interview lara sorulabiliyor.





         */

    }
}
