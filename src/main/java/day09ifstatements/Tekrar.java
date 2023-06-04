package day09ifstatements;

public class Tekrar {
    public static void main(String[] args) {

        //Ornek 1: Sayi uc basamakli ise ekrana "Sayi uc basamaklidir!" yazdirin

        int number = 12;

        if (number > 99 && number < 1000) {
            System.out.println("Sayi uc basamaklidir");

        }


        //Ornek 2: Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz
        //abbccdc --> a,d (burada tekrarsiz olanlar a,d)

        String str = "aac";
        char ch1 = str.charAt(0);

        if(str.indexOf(ch1) == str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }


        char ch2= str.charAt(1);
        if(str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);

        }

        char ch3 = str.charAt(2);
        if(str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);

        }



    }
}
