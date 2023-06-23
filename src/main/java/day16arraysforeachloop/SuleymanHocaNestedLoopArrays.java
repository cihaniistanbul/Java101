package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class SuleymanHocaNestedLoopArrays {
    public static void main(String[] args) {


        //interviewlarda nestedloop cikar.

         /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
        */

        //Nested for-loop
        for (int i = 1; i < 5; i++) {
            System.out.println("Week: " + i);

            for (int j = 1; j < 8; j++) {
                System.out.println("   Day: " + j);
            }

        }

        System.out.println();

        //Nested while-loop

        int i = 1;
        while (i < 5) {
            System.out.println("Week: " + i);
            i++;


            int j = 1;
            while (j < 8) {

                System.out.println("  Day: " + j);

                j++;
            }


        }


        /*
        2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                            ****
                            ****
                            ****
         Note: Get the number of the rows and the columns from user
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int rows = input.nextInt();

        System.out.println("Please enter number of columns");
        int column = input.nextInt();

        //once satirlari olusturmam lazim.
        //sonra olusturdugum satirin icine yildizlari koymaliyim


        for (int j = 1; j <= rows; j++) {
            for (int k = 1; k < column; k++) { //1 den basladik cunku sayarken oyle. 4 yildiz var //satiri olusturdum
                System.out.print("*");
            }
            System.out.println();
        }

        //0'dan baslamanin sarti yok. Satirlari sayarken 1.satir 2.satir diye sayiyoruz.


        /*
        3.Example:

          1
          1 2
          1 2 3
          1 2 3 4
          1 2 3 4 5
         (icerdeki loop satir sayisi kadar calisacak - sutun sayisini kullanicidan almicam cunku sutun sayisi satira gore degisiyor. ucuncu sutunda uc sutun var..)
         */

        System.out.println("Please enter row number");
        int row = input.nextInt();


        for (int j = 1; j <=row ; j++) {
            for (int k = 1; k <=j ; k++) { //sutuna bagli old icin j ne kadar artarsa k o kadar artacak
                System.out.print(k +" ");
            }
            System.out.println();
        }

        //dikdortgen ve ucgen olusturabiliyorsan okey.


        /*
        1) Array, Java'nin "ayni data" tipinde "coklu data" depolamak icin olusturdugu bir yapidir
        2) Array'ler "primitive data type" leri veya "reference"lar ile calisir
        3) Array'ler "super fast" dir ve "memory'de cok az yer" kaplarlar

         */


        //Array nasil olusturulur?
        String stdNames[] = new String[5]; //data sayisini yazmazsaniz hata verir


        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));//Arrays.toString [null, null, null, null, null] --> null'lar String'in default degerleridir


        //Array'e nasil eleman eklenir?
        stdNames[0]="Ajda";
        stdNames[3]="Cuneyt";
        stdNames[2]="Kemal";
        stdNames[1]="Ayhan";
        stdNames[4]="Filiz";

        System.out.println(Arrays.toString(stdNames)); //[Ajda, Ayhan, Kemal, Cuneyt, Filiz]


        //Array'deki specific bir elemani nasil alabiliriz?
        System.out.println(stdNames[3]); //Cuneyt


        //Example 1: stdNames Array'indeki her ismin sonuna yildiz koyarak console'a yazdiriniz

        for (int j = 0; j <stdNames.length ; j++) {
            System.out.println(stdNames[j] + "*");
        }



        //2.Way: for-each loop --> Enhanced(Zenginlestirilmis) Loop - Mumkunse hep for-each loop kullanin

                                    ////[Ajda, Ayhan, Kemal, Cuneyt, Filiz]
        for (String  w : stdNames  ) {
            System.out.println(w+ "*");
        }

        //for-each loop sadece Array'lerde ve Collection'larda kullanilir



        //Example 3: Bir Integer Array olusturunuz, 5 eleman ekleyiniz, elemanlarin toplamini bulup console'a yazdiriniz
        int ages[]= new int[5];
        ages [0]=12;
        ages [1]=23;
        ages [2]=9;
        ages [3]=38;
        ages [4]=27;

        System.out.println(Arrays.toString(ages)); //[12, 23, 9, 38, 27]

        int carpim =0;
        for (int w: ages) {
           carpim= carpim+w;
        }
        System.out.println(carpim); //109



        //Example 3: Bir char Array'i olusturunuz, 3 eleman ekleyiniz, elemanlarin carpimini bulup console'a yazdiriniz
        char initials[] = new char[3];
        initials[0]='J';
        initials[1]='P';
        initials[2]='A';

        int sum=1;
        for (char w : initials) {
            sum = sum*w;
        }
        System.out.println(sum); //384800




    }
}
