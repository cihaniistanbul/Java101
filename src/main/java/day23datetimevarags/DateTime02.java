package day23datetimevarags;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //21:01:57.328757

        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute); //5

        int second = myCurrentTime.getSecond();
        System.out.println(second); //45

        int nano = myCurrentTime.getNano();
        System.out.println(nano);


       //Gelecek ve gecmise nasil gidilir?
       LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next); //21:12:41.711940



        //Zaman formati nasil degistirilir?
        /*
        DateTime class ta kullanilan tarih saat formatlari
        HH : mm --> 24 lu saat sistemi
        hh : mm --> 12 li saat sistemi
        hh : mm a --> 12 li saat sistemi AM, PM gosterilir
        HH : mm : ss --> 24 lu saat sistemi AM, PM gosterilir
        HH : MM --> yanlis format MM aylar icin kullanilir
        "mm" minute demektir.  "MM" month demektir


        dd-MM-yyyy --> gun ay yil
        MMM  --> Aug (ayin ilk 3 harfi)
        MMMM  --> August
         */

        DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern( "HH : mm" );
        String formattedMyCurrentTime= dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);


        //Date formati nasil degistirilir?
        LocalDate myDate = LocalDate.of(2023,8,13);
        System.out.println(myDate); //2023-08-13

        //Tarihi AY/GUN/YIL sekline ceviriniz
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMydate = dtf2.format(myDate);
        System.out.println(formattedMydate); //08/13/2023







    }
}
