package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        // Bir Array in elemanlari Array ise bu Array ler Multidimensional Array dir
        // Cok boyutlu Array (Nested demiyoruz)

        // Multidimensional Array nasil olusturulur?
        int a[][] = new int[3][2];


        //Multidimensional Array lere eleman nasil eklenir?
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;


        // Multidimensional Array nasil yazdirilir? -->deeptoString
        // Normal Array leri yazdirirken toString yazdiriyorduk. Bu bize 1 tanesini veriyordu. Ama multi de DİBİNE kadar yazdirmam lazim
        // Multidimensional Array leri console yazdirmak icin deepToString methodunu kullaniriz

        System.out.println(Arrays.toString(a)); //[[I@58ceff1, [I@7c30a502, [I@49e4cb85] referanslari gorduk
        System.out.println(Arrays.deepToString(a));  //[[5, 12], [81, 45], [123, 0]]


        //Multidimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(a[1][1]); //45 -->nokta atisi yaptigimiz icin deepTo veya toString kullanmamiza gerek yok
        System.out.println(a[2][1]); //0


        //Multidimensional Array icindeki bir Array nasil yazdirilir?
        System.out.println(Arrays.toString(a[0])); //[5, 12] -->multidimensional array'in 0.indexinde bulunan data bir Array'dir. array'ler toString ile yazdirilir
        System.out.println(Arrays.toString(a[1])); //[81, 45]
        System.out.println(Arrays.toString(a[2])); //[123, 0]


        // Kisa yoldan Multidimensional Array nasil olusturulur?
        // {} curly braces sayesinde icerideki indexleri istedigimiz gibi artirip, azaltabiliriz

        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};


        //Ornek 1: Yukaridaki students array inde toplam kac isim oldugunu bulunuz
        // Tekrarli bir islem old icin loop kullaniriz.

        int sum = 0; // sum sepetine biriktiricem

        for (String[] w : students) {  //data type'ini array yapmam lazim[],  sadece String yazamam, String[] olmali
            // w'nin icinde artik array var. sirayla ali,kemal gelecek cemal gelecek..
            sum = sum + w.length;
        }
        System.out.println(sum); //8


        /*
        length() --> String methodu
        length   --> variable
         */

    }
}
