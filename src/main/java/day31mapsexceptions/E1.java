package day31mapsexceptions;

public class E1 {
    /*
    Exception beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda exception class'i devreye girer.
    Exception class'i bize karsilasilan sorunun cinsini, bu sorunun nereden kaynaklandigini ve sebebini verir.

    Java Exception firlattiginda kodun calismasini durdurur (stops execution)
    Java Exception olusturan kod icin bizden karar vermemizi ister
     */

    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        divide(a,b);

    }

    public static void divide(int a, int b){
        if (b==0){
            System.out.println("Do not divide by zero");
        }else{
            System.out.println(a/b);
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
