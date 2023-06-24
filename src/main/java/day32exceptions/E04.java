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




    //                                               parent           child
    public static void main(String[] args) throws IOException, FileNotFoundException {

        Scanner input = new Scanner(System.in);


        FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");

        int k =0;

        while ((k=fis.read())!=-1){
            System.out.print((char) k);
        }

        /*
        NOTE:
             "fis.read()" methodu
         */

    }
}
