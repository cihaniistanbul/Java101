package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {

        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        // Ornek : Yukaridaki students Array inde icinde "m" olan isimleri console a yazdiriniz

        for (String[] w : students) { //outer array

            for (String k : w) { // inner array e bakiyoruz. String koyma sebebimiz inner da artik elimizde sadece String var. inner elemanlarina bakiyoruz
                if (k.contains("m")) {
                    System.out.println(k); //Kemal Cemal
                }
            }
        }


        /*
        Once outer array'e gidicem, sonra inner array icindeki her bir elemanin "m" icerip icermedigine bakicam.
        Outer array'i olusturduktan sonra --> w artik bir array(icinde gezmek istedigim bir array)
        k'nin data type'i artik String cunku zaten w String array'di. String array'i gezip tek tek k'ya koyucam.
        String array'in icinde String var.

         */


        //Ornek 2: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz

        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};
        int result = 1; //tum elemanlari carptiktan sonra sepete koymam lazim

        for (int[] w : nums) { //outer foor loop ile nums MD array'ini dolasiyorum sirayla w sepetine koyuyor {5,4}...

            for (int k : w) { // k'ya sirayla degerleri koyuyor. 5 sonra 4..
                result = result * k;
            }
        }
        System.out.println(result); //1680


    }
}
