package day16arraysforeachloop;

import java.util.Arrays;

public class Summary03 {
    public static void main(String[] args) {
        //split() methodu (String'leri parcalamada kullaniriz)

        String s = "Calis bakalim zor mu?";
        //Bu String'e space'den split yaparsam elimde 4 tane yeni String oluyor
        //split() methodu bu 4 parcayi Array'in icine koyar. Cunku birden fazla data var
        //Elemanlar String old icin String bir Array olusturmaliyim. int olusturamam

        String words1[] = s.split(" ");
        System.out.println(Arrays.toString(words1)); //[Calis, bakalim, zor, mu?]

        System.out.println("Kelime sayisi: " + (words1.length)); //4


        //"s" String'inde kac character kullanilmistir, split() kullanarak yapiniz
        String words2[] = s.split("");
        System.out.println(Arrays.toString(words2)); //[C, a, l, i, s,  , b, a, k, a, l, i, m,  , z, o, r,  , m, u, ?]
        System.out.println("Character Sayisi: " + words2.length); //21


        //"s" String'inde bosluk haric kac character kullanilmistir, split() kullanarak yapiniz
        String words3[] = s.replaceAll(" ", "").split("");
        System.out.println(Arrays.toString(words3)); //[C, a, l, i, s, b, a, k, a, l, i, m, z, o, r, m, u, ?]
        System.out.println("Bosluk haric character sayisi: " + words3.length); //18


        //"s" String'inde kac tane "a" characteri var?
        String words4[] = s.split("");

        int counter = 0;
        for (int i = 0; i < words4.length; i++) {
            if (words4[i].equals("a")) {
                counter++;
            }

        }

        System.out.println("Sorulan character'in sayisi: "+ counter); //3

        




    }
}
