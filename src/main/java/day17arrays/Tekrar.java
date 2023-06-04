package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        /*


        int arr[]={63,19,313,253,7,200,4};
        System.out.println(Arrays.toString(arr));

        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz

        int counter=0;
        for (int w : arr){
            if (w%2==0){
                counter++;

            }
        }

        System.out.println("Array de " +counter+" adet cift sayi " +(arr.length-counter)+" adet tek sayi kullanilmistir");



     //Ornek 2: Size verilen bir String arraydeki isimlerden 5 character den az character icerenleri console a yazdiriniz
        String stdNames[] = new String[5];

        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";


        for ( String w : stdNames ) {
            if (w.length()<5){
                System.out.println(w);
            }

        }


        //Ornek 3: Size verilen bir String arraydeki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan isimler haric
        //         diger isimleri console a yazdiriniz

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));

        for(String w : stdNames){
            if (w.startsWith("F")){
               continue;
            }
            System.out.println(w);
        }


        String stdNames[] = new String[5];

        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";


        //Ornek 1: Kullanicinin coklu datayi bir array e yerlestirebilmesi, istedigi zaman durdurabilmesi icin
        //         gereken kodu yaziniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz ogrenci sayisini giriniz");
        int numOfElements = scan.nextInt();

        String stdNames[] = new String[numOfElements];
        System.out.println("Islemi durdurmak icin 'q' ya basiniz");

        for (int i = 0; i < stdNames.length; i++) {

            System.out.println("(i+1)" + " . ogrenci ismini giriniz ");
            String name = scan.next();

            if (name.equalsIgnoreCase("q")) {
                break;
            } else {
                stdNames[i] = name;


            }
        }

        // Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "R";

        int counter = 0;

        for (String w : names) {

            if (w.equals(el)) {
                counter++;
                break;

            }
        }

        if (counter > 0) {
            System.out.println("Array has " + el);
        } else {
            System.out.println("Array doesnt have " + el);
        }


        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz

        String s = "Java is easy. Learn Java earn money.";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words)); //[Java, is, easy., Learn, Java, earn, money.]

        System.out.println(words.length);


        // Ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz

        String letters[] = s.replaceAll("[^a-zA-Z]","").split(" ");

*/


        /*
         a[0] = 8;
        a[1] = 23;
        a[2] = 15;
        a[3] = 8;
        a Array'indeki elemanlari ayni satira onlerine "" koyarak tersten yazdiriniz/

    */


        int a[] = {8, 23, 15, 8};

        for (int i=a.length-1 ;i>=0 ;i-- ){

            System.out.print("*" +a[i]);
        }


    }
}




