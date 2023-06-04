package day15loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        /*

        --> While loop kalibi


        baslangic degeri
                while(loop calisma kurali){
                    calisacak kodlar
                    artirma azaltma
         */


        /*

        --> Do While loop

        baslangic degeri
                     do{
                          calisacak kodlar
                          artirma /azaltma

                    }while(loop calisma kurali);

         */


        //Ornek 1: 5 den 3 e kadar tam sayilari console a yazdiriniz

        int a = 5;

        do {
            System.out.println(a);
            a--;
        } while (a > 2);


        // 1) while-loop

        int i = 1;
        while (i < 1) {
            System.out.println("Sen bir while loopsun");
            i++;
        }

        // while loop ta zero execution mumkundur. Yani loop body hic calismayabilir.
        // false cikinca condition sout hic calismadi




        // 2) do-while-loop
        int k = 1;
        do {
            System.out.println("Sen bir do-while loopsun");
            k++;
        } while (k < 1);

        // do while kullandiginizda loop body en az 1 kere calisir, yani zero execution mumkun degildir
        // Once kod calisiyor. sout ekrana yazdiriyor. condition altta old icin loop u en az 1 kere calistirip
        // kiriyor



        /*
           while loop ve do while loop u calistirinca console da sadece "Sen bir do-while loopsun" cikti
           İkiside birebir ayni olmasina ragmen while loop calismadi, do while calisti .Cunku do while da
           kod yukaridan asagi gelirken hicbir condition yok. Direk sout ile console a yazdirip daha sonra
           condition i kontrol ediyor.

           Bu farktan dolayi zaman zaman do while tercih edilir. Mesela bankamatikte karti takinca sart
           olmadan sifre istiyor. Herhangi bir onkosul olmadan 1 kere sifre girme hakki var. Sifreyi
           alan kodlar calisiyor dogruysa hesabiniza yonlendiriyor.
           Ya da mayin tarlasi oyununda ilk hamlenin serbest olmasi gibi.

         */

    }
}
