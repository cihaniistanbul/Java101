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

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
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
    }


}
