package day14loops;

public class NestedLoops01 {
    public static void main(String[] args) {

         /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
        */

        for (int i = 1 ; i<5 ; i++   ){                       // Dısardaki loop
            System.out.println("Week : " +i);

            for (int k = 1 ; k<8  ; k++  ){                   // inner loop
                System.out.println("Day : "   + k);

            }

        }


        /*
           Dısardaki gunlerimiz haftalari sayiyor. 1 ayda 4 hafta var. int i =1 ;  i<5 --> outer loop
           İcerdeki (inner) loop u olusturmak icin tekrar for olusturuyorum day:1-7

           Sart degilse nested yapilari kullanma. Time Consuming. interview da cikabiliyor

         */

    }
}
