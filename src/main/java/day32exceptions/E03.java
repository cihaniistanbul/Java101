package day32exceptions;

public class E03 {
    public static void main(String[] args) {

        /*
         "throw" keyword bir methodun body'si icinde istedigimiz yerde, istedigimiz kosullar icin
         istedigimi kadar Exception atmamizi saglar

         throw keyword yazildiktan sonra bir Exception class object'i olusturulur

         Exception class constructor'inin parantezi icine istediginiz Exception mesajini yazabilirsiniz
         */

        try {
            printAge(-63);

        } catch (IllegalArgumentException e) { //Age cannot be negative
            System.err.println(e.getMessage());
        }


    }


    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");//buradaki mesaj console'da cikacak

        } else {
            System.out.println(age);
        }

        /*
        Gereksinimlere gore bir method olusturduk. Methodun amaci kullanicidan yasini alip console'a yazdirmak
         printAge(-63); kullanici yasi yanlis girebilir. Code'umuz yanlis senaryolar icinde calisiyor. Bu mantikli
        degil. Kullanici -63 girer, Java hata vermez ama yas negatif olmamalidir.
        Kullaniciya mesaj verebiliriz, yas negatif olmamali tarzinda. Ama bu mesajlar bazen tek basina yeterli
        olmayabilir. Sadece mesaj vermek kullanicinin negatif deger girmesini engellemez.
        Gercek hayattaki kirmizi isik gibi, herkes durmuyor.
        Yazdigimiz code ile kirmizida gecenlerin lastiklerini patlatabiliriz :D
          (age < 0) durumlar da exception firlaticaz!
        Kullanici 0'dan kucuk sayi girerse hata ver dedik. Artik negatif yas girmek yasak.
        Java notlarin, yasin 0'dan kucuk olmamasi gerektigini bilmez. Bunu exception firlatarak Java'ya soyluyorum

        "(age < 0)" Java yasin 0'dan kucuk oldugu zaman exception firlatmasi gerektigini bilmiyordu. Digerlerinde
        Java mesaji kendisi veriyordu. Ama burada biz belirledik exception'i biz attigimiz icin.

        "new" keyword'unu gorur gormez, Java yeni bir object olusturur. Hangi object'i uretecek?
        Yaninda hangi constructor varsa ondan object uretecek.


         printAge(-63); bunu boyle birakirsam eger, kullanici negatif deger girdigi anda uygulamayi orada kitliyorum
         Buradaki exception'i handle etmem lazim.
         try-catch kullamiyorum. "e" object'i uzerinden mesaj veriyorum.


         "try-catch" ile cozum uretiyoruz, hata olmasi durumunda. Yapmasi gereken durumu catch ile yakaliyoruz,
         catch ile de yapmasi gereken code'lari soyluyoruz.

         "throw" ile Java calismaya devam etmesin, calismayi durdursun, developer'a bilgi versin istiyoruz.
         Lastik patlasin istiyorsak throw, kullanici hata yapmasina ragmen devam etsin istiyorsaniz try-catch kullanilir




         */

    }
}
