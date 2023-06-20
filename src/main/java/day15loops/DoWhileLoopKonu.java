package day15loops;

import java.util.Scanner;

public class DoWhileLoopKonu {

    public static void main(String[] args) {

        /*

        --> While loop kalibi


        baslangic degeri
                while(loop calisma kurali){
                    calisacak kodlar
                    artirma azaltma
         */


        /*

        --> Do While loop

        baslangic degeri
                     do{
                          calisacak kodlar
                          artirma /azaltma

                    }while(loop calisma kurali);

         */



        // 1) while-loop

        int i = 1;
        while (i < 1) { //
            System.out.println("Sen bir while loopsun");
            i++;
        }

        // while loop ta zero execution mumkundur. Yani loop body hic calismayabilir.
        // false cikinca condition sout hic calismadi




        // 2) do-while-loop -->yazdiginiz code un en az 1 kere calismasini istiyorsaniz do while kullanin
        int k = 1;
        do {
            System.out.println("Sen bir do-while loopsun");
            k++;
        } while (k < 1);

        // do while kullandiginizda loop body en az 1 kere calisir, yani zero execution mumkun degildir
        // Once kod calisiyor. sout ekrana yazdiriyor. condition altta old icin loop u en az 1 kere calistirip
        // kiriyor



        /*
        interview'larda while- do while farki sorulur
        eger yazdiginiz code en az 1 kere calismasini istiyorsaniz do while kullanin
        hic calismasa da olur onemli olan condition diyorsaniz while kullanin
         */



    }
}
