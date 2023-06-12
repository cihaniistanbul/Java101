package day23datetimevarags;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now(); //LocalTime kalibindan bir object old icin LocalTime kavanozuna koymam lazim
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
        hh : mm --> 12 li saat sistemi AM, PM gosterilmez
        hh : mm a --> 12 li saat sistemi AM, PM gosterilir
        HH : mm : ss --> 24 lu saat sistemi AM, PM gosterilir
        HH : MM --> yanlis format MM aylar icin kullanilir
        "mm" minute demektir.  "MM" month demektir


        digit date- month- year
        dd-MM-yyyy --> gun ay yil (rakam olarak veriyor)
        MMM  --> Aug (ayin ilk 3 harfi)
        MMMM  --> August
         */


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");
        dtf1.format(myCurrentTime); // myCurrentTime i formatlamak istiyorum.artik onu saat ve dakika olarak verecek
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime); // 08 : 42  currentTime i formatladik


        //Date formati nasil degistirilir?
        LocalDate myDate = LocalDate.of(2023, 8, 13);
        System.out.println(myDate); //2023-08-13 --> myDate objectimi degistirmek istiyorum ay/gun/yil seklinde

        //Tarihi AY/GUN/YIL sekline ceviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM*dd*yyyy"); //burasi dinamik
        String formattedMydate = dtf2.format(myDate);
        System.out.println(formattedMydate); //08/13/2023

        //Tarihi GUN/Ay isminin ilk 3 harfi / YIL sekline ceviriniz  25/Aug/22
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd / MMM /yy"); //kalip
        String frmt = dtf3.format(myDate);
        System.out.println(frmt); // 13/Ağu/23


        //Tarihi GUN/AY ismi/YIL sekline ceviriniz  25/Aug/2022
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String frmt1 = dtf4.format(myDate);
        System.out.println(frmt1); //13/Ağustos/2023


        //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz?
        LocalDate dateInTokya = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokya); //2023-06-11

        //Amsterdam'da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam); //2023-06-11
        //LocalDate.now() methodunun icine ZoneId ile


        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo); //15:19:34.902693


        //Amsterdam'da saat kac?
        LocalTime timeInAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);//08:20:30.709628


        //Berlin'de saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//08:21:46.111324



        /*
        Yukaridaki formatlari ogrenme sebebimiz bunlari DateTimeFormatter.ofPattern() icinde soyleyecegim
        DateTimeFormatter class i sayesinde bir pattern olusturabiliyorum
        ofPattern() methodunun icerisine String olarak Pattern giriyorum
         */


    }
}
