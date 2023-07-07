package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 13;
        //Bu yapinin icinde sadece 1 tane data depolanabilir.
        //Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //Bir yapinin icinde coklu data depolayabilmek icin java "Array" yapisini olusturmustur.
        // Javanin ayni data tipinde coklu data depolamak icin kullandigi yoldur Array <--

        //Array nasil olusturulur?
        //                             kac tane string koyacagimi yaziyorum(lenght)
        String stdNames[] = new String[5];
        System.out.println(stdNames);

        //Array ler console a nasil yazdirilir?
        //toString() methodunu kullanmadan sadece Array ismi ile yazdirirsaniz java o Array in adresini yazdirir
        System.out.println(Arrays.toString(stdNames));

        /*
        Arrayler diger collectionlardan cok daha hizlidir (superfast)
        Yazdirmak icin her zaman Arrays.toString(variableName) olarak sout icinde yazdirilir
         */


        // Array e eleman ekleme nasil yapilir?
        // Array lerde de index yapisi kullanilir (String deki gibi)

        stdNames[2] = "Benna";
        stdNames[3] = "Abdullah";
        stdNames[4] = "Recep";
        stdNames[0] = "Ekim";
        stdNames[1] = "Busra";
        System.out.println(Arrays.toString(stdNames));  // [Ekim, Ailana, Benna, Abdullah, Recep]

        // Array'den specific bir elemani nasil aliriz?
        // (hangisini almak istiyorsam onun index ini yaziyorum)
        System.out.println(stdNames[3]); // Abdullah (3.indexin karsiligi zaten String. Yeniden toString e koymaya gerek yok)
        System.out.println(stdNames[4]); // Recep


        // Ornek 1: Arraydeki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz
        // Burada tekrarli bir islem var. 0.indexi alip sonuna ! koyucam, 1.indexi alip sonuna ! koyucam... loop kullaniliriz(for i)
        // Note : length parantezi stringlerde parantezli (method), arraylerde ise parantezsiz yazilir (method degil)

        //  0       1      2        3       4
        //[Ekim, Ailana, Benna, Abdullah, Recep]

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "!"); // Her seferinde stdNames e gidip buradaki characterleri tek tek alacagim icin [i] yazdik

        }


        /*

        Note:      String a ="Ali Can";
              String olustururken Java ya 6 tane character koyucam gibi bir sey soylemiyorum. Yani String e ne kadar data koyacagimi Java bilmiyor
              O yuzden Java, String deki character sayisini hesaplayabilmek icin method kullanmak zorunda --> length()

              String stdNames[] = new String[5];
              Array de en basta length i yaziyorum. [5] length=5  ,  Javanin bunun icin bir method olusturmasina gerek yok. O yuzden () yok
              Method degil

         */
    }
}

