package day23datetimevarags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

        //Hem zamani hem tarihi ayni anda almak icin LocalDateTime

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); //2023-06-11T09:25:03.124726  T'den oncesi DATE, sonrasi TIME


        //format yapalim
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy - hh:mm ");
        String formattedLtd = dtf.format(ldt);
        System.out.println(formattedLtd); //06/11/2023

    }
}
