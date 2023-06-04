package day18multidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {

        //Kullanicidan bir String"
        //Bir String'de kullanilan tum harflerin sayisini gosteren kodu yaziniz (interview sorusu)
        //Alaaddin --> A=1, l=1, a=3, d=2, i=1, n=1



        /*
        Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin toplamini birer birer bulan
        ve her bir sonucu yeni bir array'in elemani yapan ve yeni array'i ekrana yazdiran bir program yaziniz
        Ornegin: {  } -->1+2+3=6  4+5=9   6+7=13 --> output: {6, 9, 13}
         */

        //arr array ini olusturdum
        int arr[][] = {{1, 2, 3}, {4}, {6, 7, 20}, {12, 3}};

        int sum = 0; //toplama yapacagim icin sum a

        int sonuc[]= new int[arr.length]; // distaki array in length i kadar yaptim yeni olusturdugum array in uzunlugunu


        int i;
        for (i = 0; i < arr.length; i++){


            ; //for loop koymamin sebebi tek tek hepsini toplamam. tekrar var.outer array'in loopu o zaman arr'nin lengthi kadar alirim

        for (int k = 0; k < arr[i].length; k++) { //inner loop.icerdeki sayilari almak icin olusturduk. arr[i] olmasinin sebebi eger 1.array ile calisiyorsaniz 1.nin length inde bitecek.....
            sum = sum+arr[i][k]; //elemanlari 1er 1er almam lazim. toplami hesaplayacak bu loop. bunu tekrar bir array e koymam lazim sonuc array i olusturalim
        }
          sonuc[i]=sum;
            sum=0; // her turda sum 0 olmali
    }

        
    }
}








