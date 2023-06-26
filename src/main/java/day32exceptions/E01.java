package day32exceptions;

public class E01 {
    public static void main(String[] args) {

        String s= "Java";
        getNumberOfChars(s);//methodu buradan cagirdim

        String t= "";
        getNumberOfChars(t);//0

        String u= null;
        getNumberOfChars(u); //NullPointerException

    }

    //String'in degeri "null" oldugunda String classdaki bazi methodlari kullanamaya calisirsaniz
    //Java "NullPointerException" atar
    public static void getNumberOfChars(String s){ //basit bir method olusturup s String'inde kac eleman old bize soylesin


        try {
            int numOfChars=  s.length();
            System.out.println(numOfChars); //4
        } catch (NullPointerException e) {

            System.out.println("null degeri icin bazi methodlar kullanilamaz");
            String t= "";

        }


        /*
        Basit bir method olusturup yukaridaki s String'inin eleman sayisini buldum.
          String t= ""; olusturup run yaparsam console'da 0 gorurum cunku sepet bos.
          String u= null; olusuturup run yaparsam hata veriyor. "NullPointerException" hatasi.
        Coding'de 0 da bir degerdir. Ama "null" koyarsam hata alirim

        Interview'larda exception'larla karsilastin mi diye sorulabilir.

        Bu hatayi handle edebilmemiz icin "try-catch" kullaniriz


         */

    }
}
