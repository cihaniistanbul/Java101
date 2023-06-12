package day23datetimevarags;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        /*
        Kullanicidan alacagim datayla tarih objecti olusturucam. yani tarih objecti olusturmak icin LocalDate.now() veya
        LocalDate.of() kullanabilirim. sadece 2 alternatifim var. datayi kullanicidan alacagim icin specific olarak olusturmaliyim
        o yuzden of() methodunu kullandim. of methodu benden "year mont ve int" istiyor o zaman kullanicidan bunlari almaliyim
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month and day numbers in the given order");

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day); // kullanicinin vermis oldugu year month ve day ile dinamik olarak olusturduk

        if (givenDate.isBefore(LocalDate.now())){
            //kullanicinin verdigi tarihi simdiki zamanla karsilastiriyorum
            System.out.println(givenDate + " invalid date");
        }else {
            System.out.println("Enter time for ticket"); //gelecege aitse zamani girebilirsiniz diyoruz
        }




        //Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.

        System.out.println("Please enter year, month and day numbers in the given order");

        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);

        System.out.println(date.getDayOfWeek()); //dogum gununu veriyor.

    }
}
