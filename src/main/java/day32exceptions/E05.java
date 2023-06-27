package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {

    public static void main(String[] args) {


        try {

            FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) { //child yukarida

        } catch (IOException e) { //parent asagida
            System.err.println(e.getMessage());

        }


        /*
        1) "FileNotFoundException" ve "IOException" Compile Time Exceptionlardir, yani code yazarken hata aliriz
        2) "FileNotFoundException" path in dogrulugu ve dosyanin varligi ile ilgilidir
            IOException tum input ve output islemleri ile ilgilidir
        3) IOException Class FileNotFoundException classin parentidir
           Istenirse FileNotFoundException yerine IOException da kullanilabilir
        4) IOException Class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte
           IOException altta kullanilmalidir
         */


        /*
         E04 dekini kopyalayip farkli yoldan cozuyoruz.IOException'da parent-child iliskisi var demistik. Burada onun
        uzerinden catch kullanimini gosterdik. "FileInputStream " a tiklayinca try-catch'i seciyoruz. throws yerine
        try-catch ile cozduk.

         Parent-child iliskisi old zaman catch'de child'in yukari yazilmasi gerek.
         */
    }


}
