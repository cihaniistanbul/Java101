package day31mapsexceptions;

public class E02 {
    public static void main(String[] args) {

        String s= "1234";
        convertStringToInt(s);

        String t= "123a";
        convertStringToInt(t); //NumberFormatException


    }


    //Icinde rakamlar disinda character olan bir String i sayiya cevirmek isterseniz NumberFormatException alirsiniz
    public static void convertStringToInt(String s){

        try{
            Integer intS= Integer.valueOf(s);
            System.out.println(intS +1);
        }catch (NumberFormatException e){
            System.out.println("Bir String in sayiya donusturulebilmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage()); //teknik mesaj  -->For input string: "123a"
        }



    }
}
