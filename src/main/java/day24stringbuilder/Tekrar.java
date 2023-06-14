package day24stringbuilder;

public class Tekrar {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1); //ysae si avaJ

        sb1.deleteCharAt(0);
        System.out.println(sb1); //sae si avaJ

        sb1.delete(2,5);
        System.out.println(sb1);


        sb1.replace(2,5,"XXXX");
        System.out.println(sb1);


        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);

    }
}
