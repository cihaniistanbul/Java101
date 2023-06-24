package day32exceptions;

public class E01 {
    public static void main(String[] args) {

        String s= "Java";
        getNumberOfChars(s);

        String t= "";
        getNumberOfChars(t);//0

        String u= null;
        getNumberOfChars(u); //NullPointerException

    }

    //String'in degeri "null" oldugunda String classdaki bazi methodlari kullanamaya calisirsaniz
    //Java "NullPointerException" atar
    public static void getNumberOfChars(String s){


        try {
            int numOfChars=  s.length();
            System.out.println(numOfChars); //4
        } catch (NullPointerException e) {

            System.out.println("null degeri icin bazi methodlar kullanilamaz");

        }
    }
}
