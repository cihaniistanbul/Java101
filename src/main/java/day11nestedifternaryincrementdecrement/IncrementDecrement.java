package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        //increment artırma demek, decrement azaltma demekj

        //Increment
        int a = 5; //5
        System.out.println(a);


        a = a + 2;  //burada 2 tane a var. Tekrar sevilmedigi icin kisaltmasi var bunun 7
        System.out.println(a);

        a += 2;
        System.out.println(a); //9


        //Ornek : Bir tane intiger variable olusturun ve onu iki sekilde 5 artirin

        int b = 10;
        System.out.println(b); //10

        b = b + 5;
        System.out.println(b);//15

        b += 5;
        System.out.println(b);//20 bir variable in degerini artırdık burada


        //Decrement: Variable in degerini azaltmak

        int c = 8;
        System.out.println(c); //8

        c = c - 3;
        System.out.println(c); //5

        c -= 3;
        System.out.println(c); //2


        //Increment 2
        int d = 6;
        System.out.println(d); //6

        d = d * 2;
        System.out.println(d); //12

        d *= 2;
        System.out.println(d); //24


        //Decrement 2
        int e = 24;
        System.out.println(e); //24

        e = e / 2;
        System.out.println(e); //12

        e /= 2;
        System.out.println(e); //6


        //"1" ile increment
        int f = 12;
        //f=f+1; bunlari kullanmayalim. 1 artirmalarda artik "f++;" kullan
        //f+=1;
        f++;


        //"1" ile decrement
        int h = 10;
        //h = h-1; hepsi ayni isi yapar ama h--; kullan
        //h-=1;
        h--;


        // carpma ve bolmede 1 etkisiz eleman oldugu icin onlari yapmayiz

        //"post-increment" ve "pre-increment"
        int i = 10;
        int k = i++; //post increment

        System.out.println(k); // 10 --> i artirilmadan "k" ya konuldugu icin "k" nin degeri 10 olur
        System.out.println(i); // 11 --> i satir sonunda artirildigi icin "i" nin degeri 11 olur


        int m = 15;
        int n = ++m; //pre-increment

        System.out.println(m); //16
        System.out.println(n); //16


        //Ornek:
        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r); //17


        //Ornek:
        int s = 20;
        int t = --s;

        System.out.println(s);//19
        System.out.println(t);//19


        /*
        1)Increment artirmak demektir, decrement azaltmak demektir.
        2)Increment toplama ve carpma ile, decrement cikarma ve bolme ile yapilabilir
              a)i=i+5
              b)i+=5;
              c)eger 1 ile artirma --> i++
              note: c sikki sadece 1 artirmak icin kullanilir

              a)i=i-5
              b)i-=5;
              c)eger 1 ile artirma --> i--
              note: c sikki sadece 1 azaltmak icin kullanilir

         */


    }
}
