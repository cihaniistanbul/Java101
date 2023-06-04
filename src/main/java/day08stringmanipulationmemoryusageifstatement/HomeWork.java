package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        String a = "Ali 10 yasindadir";
        int resultLength = a.replaceAll("[0-9]", "").length();
        System.out.println(resultLength);


        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
        String b = "Ayhan";
        int lastIndex = b.length() - 1;
        String result = b.substring(1, lastIndex).toUpperCase();
        System.out.println(result);


        //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
        String c = "Java is easy";
        int firstIdx = c.charAt(0);
        int lastIdx = c.charAt(c.length() - 1);
        System.out.println(firstIdx + lastIdx);


        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        // console a yazdirin
        String city = "ankara";
        String firstLetter = city.substring(0, 1).toUpperCase();
        String secondLetter = city.substring(1).toLowerCase();
        System.out.println(firstLetter + secondLetter);


        /* 5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz");
        String pwd = input.nextLine();

        boolean c1 = pwd.length() > 5;
        boolean c2 = pwd.replaceAll("[^A-Z]", "").length() > 0;
        boolean c3 = pwd.replaceAll("[^a-z]", "").length() > 0;
        boolean c4 = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println(c1 && c2 && c3 && c4);

    }
}
