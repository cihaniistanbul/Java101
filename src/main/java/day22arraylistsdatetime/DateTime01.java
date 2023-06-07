package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate= LocalDate.now(); //hangi bolgedeyseniz anlik olarak onu aliyor
        System.out.println(myCurrentDate); //2023-06-07


        //Tarihten istedigimiz bilesenleri nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue); //6

        int yearValue= myCurrentDate.getYear();
        System.out.println(yearValue); //2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue); //7


        //Month bir enum dir
        //Enum java da sabit degerler (Ay isimleri, Gun isimleri, ulkedeki sehir isimleri) depolamak icin kullanilir
        //enum diyince aklimiza "depo" gelsin
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName); //JUNE


        //DayOfWeek enum dir
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName); //WEDNESDAY


        //ileriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(3)); //2026-08-12


        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(20).minusMonths(2).minusDays(5)); //2003-04-02


        //specific bir tarih object i nasil olusturulur?
        LocalDate date1 = LocalDate.of(1990,8,10);
        LocalDate date2 = LocalDate.of(1980,8,10);


        //Bir tarihin bir tarihten sonra olup olmadigi nasil kontrol edilir?
        boolean r1= date1.isAfter(date2);
        System.out.println(r1); //true

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2);


        boolean r3 = date1.equals(date2);
        System.out.println(r3); //false


    }
}




