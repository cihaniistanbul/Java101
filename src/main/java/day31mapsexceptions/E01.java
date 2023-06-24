package day31mapsexceptions;

public class E01 {
    /*
    Exception beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda exception class'i devreye girer.
    Exception class'i bize karsilasilan sorunun cinsini, bu sorunun nereden kaynaklandigini ve sebebini verir.

    Java Exception firlattiginda kodun calismasini durdurur (stops execution)
    Java Exception olusturan kod icin bizden karar vermemizi ister

    Eger hicbir sey yapmazsak beklendigi gibi Java kodumuzun calismasini durdurur.
          -Kodumuzun calismaya devam etmesini istiyorsak "try catch" ile exception olusturması muhtemel kodlarimizi
          try catch blogu icinde yazmaliyiz

          -Exception i halledebilmek icin iki temel yol vardir
            1) Exception a uygun cozumler uretebilirsiniz. Buna Exception Handling denir
            2) Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da throw exception denir


          -Exception a uygun cozumler uretmede try-catch kullanilir
          try block da yapilmasi gereken islemler Javadan istenir
          Java islemi problemsiz bir sekilde yaparsa catch block Java tarafindan okunmaz
          try block da islem yapilirken Exception olusursa catch block devreye girer ve catch block icindeki kodlar calisir
          try block da islem yapilirken Exception olusursa try block icindeki exception dan sonraki kodlar calistirilmaz.

          catch parantez icine karsilasilmasi muhtemel olan exception class ismini ve bir obje ismi (e) catch bloguna ise
          exception ile karsilasildiginda yapilmasi istenen kodlari yazariz.


          if else kullanirsak olusabilecek her problemi  specific olarak if parantezine yazmamiz gerekir, bu da neredeyse
          imkansiza yakindir ve yazacagimiz kodu cok uzatir. Ama try-catch te java ilgili exception ile alakali
          olusabilecek tum problemleri yakalar.
     */

    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        divide(a, b);
        divide2(a, b);

    }

    //ArithmeticException yazdiginiz code da matematiksel islem kullanyorsaniz alinabilecek bir exception dir.
    public static void divide2(int a, int b) {

        try {
            System.out.println("try block ici exception oncesi");
            System.out.println(a / b);
            System.out.println("try block ici exception sonrasi");

        } catch (ArithmeticException e) { //matematik iile alakali olusabilecek butun exceptionlari yakalar

            System.out.println("Do not divide by zero ");
        }

    }

    //Kesinlikle tavsiye edilmez. En kotu handle edilme sekli
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a / b);
        }

    }

}


/*


Exception in thread "main" java.lang.ArithmeticException: / by zero
    at day31mapexception.E01.divide(E01.java:25)   => ben bu satirda hata aldim yurtmeyi durdurdum diyor
    at day31mapexception.E01.main(E01.java:19)     => ben bu satirda hata aldim yurtmeyi durdurdum diyor

" ArithmeticException:" kismi hatanin teknik ismidir. ---- " / by zero" kismi da hata oldugunu soyledigi sey

** Interview da hatayla karsilastin naparsin dicekler? Loglara bakarim derim. Yukardidaki kismin tamamina "log" denir.


  Peki sorunu cozmek icin simdiye kadar ki bildiklerimizle ne yapabiliriz?
  diyelim ki if else() kullanmak istedik ve spesifik olarak da sorunu cozduk. Kodu degistirdik ve hata yok ama
  if else() ile bu sekilde cozumler kesinlikle tavsiye edilmez. Bu en kotu cozumdur.

        */
