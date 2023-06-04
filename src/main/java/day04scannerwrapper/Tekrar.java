package day04scannerwrapper;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        /*
        Ornek: Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz.



        Scanner scan = new Scanner(System.in);

        System.out.println("ilk isminizi giriniz");
        String name = scan.next();

        System.out.println("soyisminizi giriniz");
        String lastName = scan.next();

        System.out.println(name + " " + lastName);


        //Ornek: Kullanicidan adresini aliniz ve ekrana yazdiririniz

        System.out.println("adres giriniz");
        String adress = scan.nextLine();

        System.out.println(adress);


        //Ornek: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana
        //       yazdiran kodu yaziniz


        System.out.println("2 sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println((sayi1 + sayi2));
        System.out.println((sayi1 * sayi2));
        System.out.println((sayi1 / sayi2));
        System.out.println((sayi1 - sayi2));
*/



        //Kullanicidan bir dikdortgenin iki kenar uzunlugunuz aliniz
        //a)Alaninin hesaplayiniz -->kisa kenar * uzun kenar
        //b)Cevresini hesaplayiniz -->2*kisa kenar + 2*uzun kenar


        Scanner scan = new Scanner(System.in);
        System.out.println("kisa kenari giriniz");
        int kisaKn=scan.nextInt();

        System.out.println("uzun kenari giriniz");
        int uzunKn= scan.nextInt();

        System.out.println("alan " + kisaKn*uzunKn);









    }
}
