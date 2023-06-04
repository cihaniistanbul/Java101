package day16arraysforeachloop;

import java.util.Arrays;

public class Summary02 {
    public static void main(String[] args) {

        int a[] = {2, 5, 2, 8, 6};
        //Bir Array'de belirli bir elemanin var olup olmadigini kontrol etmek
        //binarySearch() methodu bir array'de belli bir elemanin var olup olmadigini kontrol etmek icin kullanilir
        //binarySearch() methodunu kullanamdan once MUTLAKA sort() kullanmalisiniz
        //sort() kullanmadan binarySearch() kullanirsaniz buldugunuz sonuc manali olmaz
        //bu method 2 parametreli calisir. ilki array ismi, ikincisi kontrol etmek istedigim eleman
        //binarySearch() methodu var olan elamanlar icin o elemanin sort edilmis array'deki index'ini verir
        //binarySearch() methodu tekrarli elemanlar icin kullanilmaz
        //binarySearch() methodu negatif sayi return ederse; bu kontrol ettiginiz sayinin array'de bulunmadigi anlamina gelir

        Arrays.sort(a); // [2, 2, 5, 6, 8]

        System.out.println(Arrays.binarySearch(a, 8)); //4

        System.out.println(Arrays.binarySearch(a, 5)); //2

        System.out.println(Arrays.binarySearch(a, 2)); //0  -->Tekrarli elemanlar icin binarySearch() kullanmayiniz

        System.out.println(Arrays.binarySearch(a, 4)); //-3 -->Olsaydi 3.sirada olurdu. index degil elemana bakılıyor

        System.out.println(Arrays.binarySearch(a, 7)); //-5 -->indexi kullanmiyor. olsaydi 5.eleman olacakti



        //Iki Array'in esit olup olmadigini kontrol etmek
        //Iki Array'in esit olabilmesi icin ayni indexlerde ayni elemanlara sahip olmasi gerekir

        String s1[] ={"A", "D", "C"};
        String s2[] ={"A", "C", "D"};
        String s3[] ={"A", "C", "D"};

        System.out.println(Arrays.equals(s1, s2)); //false
        System.out.println(Arrays.equals(s3, s2)); //true
        System.out.println(s3==s2); //false
        System.out.println((s2 == s2)); //true


    }
}
