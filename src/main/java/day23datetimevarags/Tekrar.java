package day23datetimevarags;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

/*


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter year, month and day numbers in the given order");
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())) {
            System.out.println("Invalid day");

        } else {
            System.out.println("Enter time for ticket");
        }


        //Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.

        System.out.println("Please enter year, month, day numbers in the given order");
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();

        LocalDate date = LocalDate.of(y, m, d);
        System.out.println(date.getDayOfWeek());
 */

        System.out.println("-----");


        LocalTime myCurrentTime= LocalTime.now();
        System.out.println(myCurrentTime);


        int hour = myCurrentTime.getHour();
        int minute= myCurrentTime.getMinute();
        int second = myCurrentTime.getSecond();
        int nano = myCurrentTime.getNano();


        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nano);

        LocalTime  time= myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);

        System.out.println(time);

        DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("HH : mm");
        String formattedMyCurrentTime  =dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        LocalDate myDate= LocalDate.of(2022,2,1);
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String r2 =dtf2.format(myDate);
        System.out.println(r2);

    }
}
