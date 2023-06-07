package day21arraylists;

import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Kisa yoldan bir List nasil olusturulur?
        //List.of() methodu  degistirilemez bir list olusturmak icin kullanilir,
        // Degisiklik yapmaya yonelik methodlari desteklemez ama diger list methodlarini kullanabiliriz
        List.of('a', 'c', 'd', 'k'); //charlardan olusan List olusturdum
        //List.of(1,2,3,4);  integer list
        //List.of("1","3");String List (List.of icerisinde istedigim gibi liste olusturabilirim)


        //Listi olusturdum simdi bir sepete koymam lazim
        List<Character> initials = List.of('a', 'c', 'd', 'k'); //Charactere koydum cunku list ler primitive data kullanmaz
        System.out.println(initials); //[a, c, d, k]

        //initials.add('b');
        // initials.set(0,'u');


        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumunun index ini verir.
        int r1 = initials.indexOf('k');
        System.out.println(r1); //3

        //lastIndexOf(aranan karakter) methodu aranan karakterin son gorunumun index ini verir.
        int r2 = initials.lastIndexOf('k');
        System.out.println(r2);


    }

}
