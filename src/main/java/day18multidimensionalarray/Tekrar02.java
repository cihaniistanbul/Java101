package day18multidimensionalarray;

import java.util.Arrays;

public class Tekrar02 {
    public static void main(String[] args) {

        // İki boyutlu bir arrayı tek boyutlu array e karakterler tersten olacak sekilde cevirip yazdırınız
        // Örn :
        //String isimler [][]={{"Ahmet","Mehmet"},{"Canan","Rana","Ferit" }}; Ferit, Rana, Canan, Mehmet, Ahmet olacak..

        String isimler[][] = {{"Ahmet", "Mehmet"}, {"Canan", "Rana", "Ferit"}};

        int elemanSayisi = 0;
        for (String[] w : isimler) {
            elemanSayisi = elemanSayisi + w.length;
        }
        System.out.println(elemanSayisi); //5

        String newArr[] = new String[elemanSayisi];

        int idx = newArr.length-1;
        for (String[] w : isimler) {
            for (String i : w) {
                newArr[idx] = i;
                idx--;
            }
        }
        System.out.println(Arrays.toString(newArr)); //[Ahmet, Mehmet, Canan, Rana, Ferit]

/*


        int arr []={0, 4, 3, 0, 12, 0};

        System.out.println(Arrays.toString(arr));

        int elemanSayisi=arr.length;

        int yeniArr[]=new int[elemanSayisi];

        System.out.println(Arrays.toString(yeniArr));

        int idx=yeniArr.length-1;

        for (int w:arr) {

            if (w==0){
                yeniArr[idx]=w;
                idx--;
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    */

    }
}
