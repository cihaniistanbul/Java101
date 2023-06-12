package day23datetimevarags;

public class Varargs01 {
    public static void main(String[] args) {



        System.out.println(add(2,3,4,5,6));
    }

    //Note 1) Bir method parantezinde birden fazla Varargs kullanilamaz
    //Note 2) Eger bir method parantezinde birden fazla parametre kullanilacaksa Varargs sonda olmalidir(int b, int  ....a)

    public static int add(int... a) { ////int type inda varargs demis olduk.Artik add() icine istedigim kadar sayi gonderebilirim

        int sum = 0;

        for (int w : a) { //array den toplam sayiyi almak icin foreach kullanirdik
            sum = sum + w;

        }
        return sum;
    }

    /*
          Asagidaki gibi farkli methodlar olusturarak is yapamayiz
          Cunku kullanici farkli sayidaki sayilari toplamak isteyebilir
          her ihtimal icin bir method olusturmak mumkun degildir
          java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
          Bu yapiya Varargs denir
          Varargs arkada Array yapisini kullanir.(Degisen uzunluktaki argumanlar)


      toplama islemi yapan bir method olusturun
      public static int add(int a, int b){
      return a+b;
     }

      public static int add(int a, int b, int c){
        return a+b+c;
    }

     public static int add(int a, int b, int c, int d){
         return a+b+c+d;
     */

    }

