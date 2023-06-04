package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {

        // While kalibini olusturalim



  /*
        --> For loop kalibi

        for ( baslangic degeri ; loop calisma kurali  ;  artirma/azaltma){

            calisacak kodlar
        }




        --> While loop kalibi

            Sadece soz syntax indeki yeri degisiyor

        baslangic degeri
                while(loop calisma kurali){
                    calisacak kodlar
                    artirma azaltma
        }

        Note: For loop ile yapacaginiz her seyi while loop ile yapabilirsiniz. Ar
              Aralarinda sadece syntax farki var



*/

        //Ornek 1: 3ten 6 ya kadar tamsayilari console a yazdiriniz
        //1.yol : for loop

        for (int i = 3; i < 7; i++) {
            System.out.print(i + "  ");

        }


        //2.yol : while loop

        int i = 3;
        while (i < 7) {
            System.out.print(i + "  ");              // i 7 den kucuk oldugu muddetce body i calistir ve 1 artir, scope u bitir
            i++;
        }
        System.out.println();



        //Ornek 2 : 23 den 12 ye kadar cift sayilari console a yazdiriniz

        int k = 23;
        while (k > 11) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();


        //Ornek 3 : 6 dan 19 a kadar tum tek sayilari console a yazdiriniz

        int j = 6;
        while (j < 20) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;           //increment-decrement i scope dan 1 once yazariz
        }


    }
}
