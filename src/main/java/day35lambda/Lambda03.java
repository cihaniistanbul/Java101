package day35lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

        System.out.println(getSumOfEvensBetweenTwoInt(13, 7));

        int sum = getSumOfEvensBetweenTwoInt(3,13);
        System.out.println(sum);//40


    }


    //12) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren methodu olusturunuz.
    //1.yol
    public static int getSumOfEvensBetweenTwoInt(int a, int b){
        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return
                IntStream.
                        range(a+1,b).
                        filter(t->t%2==0).
                        sum();
    }


    //2.yol
    public static int getSumOfEvensBetweenTwoInt2(int a, int b){
        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return
                IntStream.
                        range(a+1,b).
                        filter(Utils::isNumberEven). //best practice dir utilden alip kullanmak
                        sum();
    }

}
