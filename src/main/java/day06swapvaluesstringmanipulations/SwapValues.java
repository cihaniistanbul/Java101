package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {

        //Swap : Yer degistirmek demek.
        //1.kap: Patates 2.kap Domates --> swap->1.kap: Domates  2.kap: Patates

        int a = 12;
        int b = 5; //Swap den sonra a=5, b=12 olacak
        int temp = 0; //kabı gecici kullanacagim icin 0 verdim

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //1.Adim
        temp = a;

        //2.Adim
        a = b;

        //3.Adim
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //2.Yol (bu yol interview'larda sorulabiliyor
        int elma = 12;
        int armut = 5;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma = elma + armut;
        armut = elma - armut; //toplam sepetim elmada oldugu icin armutu cikardim
        elma = elma - armut; //toplam elmadan guncellenmis armutu cikariyoruz

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);





    }

}
