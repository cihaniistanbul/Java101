package day32exceptions;

public class E06 {
    public static void main(String[] args) {



        /*
        1) Exception olsada olmasada calistirmamiz gereken kodlari finally block icine yazariz
        2) Database ile baglantiyi kesme isini yapan kodlar gibi kodlar her halukarda calistirilmalidir, bu tarz kodlari finally block icine koyariz
        3) try tek basina kullanilamaz, try + catch olabilir, try + cok catch olabilir
            try catch block olmadan sadece finally block ile de kullanilabilir
            try ile coklu catch ve finally block kullanilabilir
         */

        int a = 12;
        int b = 6;
        int c[] = {3, 6, 9, 12};
        getElementFromArray(c, a, b);

    }

    public static void getElementFromArray(int[] c, int a, int b) { //methodumuza 2 sayi giriyoruz, bu sayilarin bolumundan index aliyoruz
                                                                    //bu index ile de arrayimizden eleman secip yazdiriyoruz.

        try {
            int idx = a / b;    //burada belirli riskler var. ArithmetichException alabiliriz. Cunku 0 olabilir

            int element = c[idx]; //ArrayOutOfBoundException riski var.

            System.out.println(element);  //bunu try catch yapiyorum

        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) { //kodumuzda olusmasi muhtemel iki hatayi handle etmek icin catch'lerimizi olusturduk
            System.err.println(e.getMessage());

        } finally {   //database ile baglantiyi kesmek istiyorum. sout ile mesaj veriyorum. finally hepsinden sonra calisiyor. her halukarda.
            System.out.println("Cut the connection with the DataBase");
        }


        /*
         Application ile database arasinda surekli bir iletisim vardır.Cunku username-password girdiginiz zaman
        bunlar kontrol edilip geri bildirim yapiliyor. Application neye gore karar veriyor? Database'den gidip kontrol
        ediyor. Girdiniz username-password'u database'e gidip karsilastiriyor. Database'in icinde bilgiler var. Onlarla
        karsilastiriyor. Dogruysa app e giris yapilabiliyor. Yani app ile database arasinda surekli bir iletisim var.
        Database'ler genelde cloud'da olur. Sifreleriniz telefonda degil database'de olur.
         Eger username-password dogru olursa baglantiyi hemen kesmeliyiz. Connection'in devam etmesine gerek yok. Bizim
        connection daki mantigimiz suydu; database'e girip karsilastirma yapmak. Bundan sonraki her senaryo icin her
        halukarda baglantiyi kesmeliyiz. Bilgeler dogru veya yanlis olsun her halukarda connection kesilmeli.

         Connection'i her halukarda kesmek icin Java her halukarda calisan bir yapi olusturmus. Bu yapinin ismi
        "finally block" dur.
         */
    }
}
