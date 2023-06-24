package day32exceptions;

public class E06 {
    public static void main(String[] args) {



        /*
        1) Exception olsada olmasada calistirmamiz gereken kodlari finally block icine yazariz
        2) Database ile baglantiyi kesme isini yapan kodlar gibi kodlar her halukarda calistirilmalidir, bu tarz kodlari finally block icine koyariz
        3) try tek basina kullanilamaz, try + catch olabilir, try + cok catch olabilir
            try catch block olmadan sadece finally block ilede kullanilabilir
            try ile coklu catch ve finally block kullanilabilir
         */

        int a = 12;
        int b = 6;
        int c[] = {3, 6, 9, 12};
        getElementFromArray(c,a,b);

    }

    public static void getElementFromArray(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch ( ArithmeticException e) {
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the DataBase");
        }



    }
}
