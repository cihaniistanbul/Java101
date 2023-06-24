package day31mapsexceptions;

public class E05 {
    public static void main(String[] args) {


        int a = 12;
        int b = 4;
        String s = "Java";
        getCharFromString(s, a, b);//a

    }

    public static void getCharFromString(String s, int a, int b) {

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullandiniz");
        }
        /*
        try kisminda birden fazla Exception olusturma ihtimali olan kod varsa coklu catch kullanabilirisinz
        coklu catch kullandiginizda exception classlar arasinda parent-child iliskisi yoksa catchlerin sirasi önemli degildir
        Ama koddaki siralamaya uymak tavsiye edilir

        Coklu catch kullandiginizda exception classlar arasinda parent-child iliskisi varsa catchlerin sirasi önemlidir,
        child olan class ustte olmalidir

         */


    }
}
