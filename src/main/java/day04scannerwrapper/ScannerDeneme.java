package day04scannerwrapper;

import java.util.Scanner;

public class ScannerDeneme {
    public static void main(String[] args) {

        //homework

        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        // ornegin => 312 icin 3+1+2=6


        //Ornek 1: short data type inin min ve max degerlerini kod yazarak bulunuz

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        //Ornek2: int data type inin minimum degeri ile byte data type inin
        //maximum degerleri toplamini bulunuz

        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt + maxByte);

        //Ornek4: Wrapper Byte i primitive byte a ceviriniz(Unboxing)
        Byte k =19;
        byte primitiveK=k;

        //Ornek5: Primitive char i Wrapper Character e ceviriniz
        char x ='A';
        Character wrapperX='x';


        //Ornek6: Wrapper Boolen i primitive boolean a ceviriniz
        Boolean isOldWrapper=true;
        boolean isOld=isOldWrapper;





    }
}
