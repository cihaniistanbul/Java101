package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {

        //Ornek : 2 boyutlu bir array'i tek boyutlu bir array e ceviriniz

        int numbers[][] = {{5, 4}, {2, 3, 2}}; // --> {5,4,2,3,2}


        //1.step : iki boyutlu array de kac tane eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0; //toplam eleman sayisini bir variable'a koymam lazim

        for (int[] w : numbers) { //loop ile elemanlari dolasarak length'leri aliyorum
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }

        System.out.println(toplamElemanSayisi); //5


        //2.step : tek boyutlu array i iki boyutlu array in eleman sayisini kullanarak olusturmaliyiz
        // --> Eleman sayisini bulduguma gore artik transfer yapacagim tek boyutlu array'imi olusturabilirim

        int newArr[] = new int[toplamElemanSayisi];



        //3.step : iki boyutlu array deki elemanlari tek boyutlu array e transfer etmeliyiz
        // --> Once array'lere daha sonra elemanlarina gitmem lazim ki transfer edebilmeliyim. loop icerisinde loop var. foreach
        int idx = 0; //for each icin index olusturduk

        for (int[] w : numbers) { //outer loop ile multidimensional arrayin int array olan elemanlarini tek tek aliriz

            for (int k : w) { //inner loop ile w sepetine koymus oldugumuz array e index kullanarak atama yapiyoruz
                newArr[idx] = k;
                idx++; //bir eleman ekledikten sonra bir yana kaydirma yapiyoruz
            }
        }
        System.out.println(Arrays.toString(newArr)); //[5, 4, 2, 3, 2]




    }
}
