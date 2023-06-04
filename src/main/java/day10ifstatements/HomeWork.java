package day10ifstatements;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {


        //1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru
        //  olup olmadigini kontrol eden ve kullaniciya uygun mesaj veren kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz..");
        String password = input.nextLine();

        if (password.equalsIgnoreCase("pwd123!")) {
            System.out.println("Password dogru");

        } else {
            System.out.println("Lutfen dogru passwordu giriniz..");
        }


        //2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
        //  Pazar--> 1.gun , Pazartesi-->2.gun...

        Scanner inpuT = new Scanner(System.in);
        System.out.println("Lutfen gun ismi yaziniz..");
        String day = inpuT.next();

        if (day.equalsIgnoreCase("Sunday")) {
            System.out.println(1);

        } else if (day.equalsIgnoreCase("Monday")) {
            System.out.println(2);

        } else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);

        } else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);

        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println(5);

        } else if (day.equalsIgnoreCase("Friday")) {
            System.out.println(6);

        } else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println(7);

        } else {
            System.out.println("Hatali giris yaptiniz..");
        }


        //3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz
        // 1-->January , 2-->February

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen 1 ile 12 arasinda bir sayi giriniz ");
        int monthNum = input2.nextInt();

        if (monthNum == 1) {
            System.out.println("January");

        } else if (monthNum == 2) {
            System.out.println("February");

        } else if (monthNum == 3) {
            System.out.println("March");

        } else if (monthNum == 4) {
            System.out.println("April");

        } else if (monthNum == 5) {
            System.out.println("May");

        } else if (monthNum == 6) {
            System.out.println("June");

        } else if (monthNum == 7) {
            System.out.println("July");

        } else if (monthNum == 8) {
            System.out.println("August");

        } else if (monthNum == 9) {
            System.out.println("September");

        } else if (monthNum == 10) {
            System.out.println("October");

        } else if (monthNum == 11) {
            System.out.println("November");

        } else if (monthNum == 12) {
            System.out.println("December");

        } else {
            System.out.println("Lutfen gecerli bir sayi giriniz!");
        }


    }
}
