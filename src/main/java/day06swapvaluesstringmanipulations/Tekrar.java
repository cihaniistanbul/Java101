package day06swapvaluesstringmanipulations;

public class Tekrar {
    public static void main(String[] args) {







        String s = "Learn Java earn money";

        boolean isEnd=s.endsWith("money");
        System.out.println(isEnd);

        //Ornek 2: "s" String inindeki "money" kelimesini "dollar" kelimesine ceviriniz.
        s="Learn Java earn money";
        String s1= s.replace("money", "dollar");
        System.out.println(s1);


        String s2 = s.replace("earn", "win");
        System.out.println(s2);

        String s3= s.replace("a", "*");
        System.out.println(s3);

        String s4 =s.replace("n","XXX");
        System.out.println(s4);

        String s5=s.replace("e", "");
        System.out.println(s5);


        String t ="Ali 13 yasindadir!...";
        String t1=t.replaceAll("[0-9]", "*");
        System.out.println(t1);




















    }


}
