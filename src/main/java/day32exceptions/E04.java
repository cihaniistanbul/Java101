package day32exceptions;

import java.io.FileInputStream; //io --> input output
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class E04 {

    /*
    1) Run button'una bastiktan sonra console'da alinan Exceptionlara "Runtime Exception" denir
         ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException,
         StringIndexOutOfBoundsException...  RunTime Exception'lara ornektir.
         Runtime Exceptionlara Unchecked Exception da denir

    2) Code yazarken kirmizi alt cizgi seklinde alinan Exception lar da vardir, bunlara da "Compile Time Exception" denir
        FileNotFoundException,IOException compile time exceptionlara örnektir
        Compile Time Exceptionlara "Checked Exception" da denir

        throw ile throws arasindaki fark nedir?
       1) throw method body'si icinde, throws ise method parantezinden hemen sonra kullanilir
       2) throw method body'si icinde istenilen yerde istenildigi kadar kullanilir
          throws ise method parantezinden hemen sonra sadece 1 kere kullanilabilir
       3) throw'dan sonra "new" keyword ve "constructor" kullanilarak obje olusturulur
          throws'dan sonra sadece Exception class ismi yaziliir
       4) throw belli sartlar icin Exception firlatmada kullanilir
          throws ise bir methodun belli bir Exception i firlatabilecegini belirtmek icin kullanilir


     */

    /*
     Exceptionlar 2'ye ayrilir
       1)Compile Time Exception -->yazdiginiz code'un aninda hata vermesi/kizarmasi
       2)RunTime Exception -->calisma zamani ortaya cikiyor

     */



    //                                               parent           child
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);


        FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");
        //FileInputStream class'i Scanner'a cok benziyor.


        int k =0;

        while ((k=fis.read())!=-1){  //fis objectimi eline al, read methodunu kullan ve buldugun degeri k'nin icine koy.
                                     //ve -1 e esit olmadigi surece okumaya devam et
            System.out.print((char) k); //k'da ascii deger var. bu sekilde yazdirirsam ascii deger gorurum.Bunu charactere
                                        //donusturmek icin char koyuyoruz basina.Mesela k'ya 65 gelecek ama char sayesinde A gorucez
        }

        /*
        NOTE:
            "FileInputStream" class'i uzerinden bir object olusturup, bu objectimiz sayesinde class'da bulunan methodlari
           kulllanabiliriz. Object'ler kalibinin instance'i demistik.
            " FileInputStream fis = new FileInputStream() bu sekilde olusturunca hata veriyor, bizden parametre istiyor
           Bu class file dosyalarini okumak icin kullaniliyor. () icine dosyanin adresini yaziyoruz. sağ tik-copy path
           /reference-3.u sec.


           FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");
          Bu sekilde birakinca Java hata veriyor. Dosyanin silinmesi vs gibi durumlar icin garanti istiyor, adres
          degisikligine karsi.
          "FileInputStream" uzerinde durup more action'si sectik. "Add exception to method signature" u secersem eger
          "throws FileNotFoundException" geldi. Burada sunu demis oluyorum. Java sen yoluna devam et, eger dosyayi
          bulamazsan execution'i durdur ve bana "FileNotFoundException" firlatarak bildir, mudahale edicem diyorum.
          Java kizmayi birakiyor.
          try-catch ile de yapabiliriz.

          "read()" methodu sayesinde, ona verdigimiz adrese gidip oradaki characterlerin ascii degerlerini tek tek alip
          bize verecek. Okuyacak deger kalmadiginda yani en sona geldiginde -1 veriyor.
          Code'mu buna gore yaziyorum -1 vermedigi surece okumaya devam et diyorum loop ile.


           loop ile code'umu yazdim. Ama read methodu hata veriyor. Adrese gidip okuyamazsam ne olacak diyor? more actions
          a tiklayip ister try-catch yap ister method signature'a ekler. Tikladigim anda "IOException" geldi. Bazi
          exception class'larin arasinda parent-child iliskisi var demistik. IOException, FileNotFound'un parent'i.
          Babasi ciktigina gore artik FileNotFound'a gerek yok. Yazsak bile sonuk cikiyor.


          (char) k -->  (char) 74 --> J -->Type Casting yapiyoruz









         */

    }
}
