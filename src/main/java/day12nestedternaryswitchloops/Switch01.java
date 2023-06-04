package day12nestedternaryswitchloops;

public class Switch01 {
    public static void main(String[] args) {

        //NOTE: Java da kodlarimizi yazarken nested yapilardan mumkun oldugunca uzak durmaliyiz. Cunku bu tarz yapilar
        //      uygulamayi yavaslatir.(Time Consuming)
        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7


        //1. Yol if else cozumu
        String dayName = "Thuesday";
        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        } else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }


        //2.yol switch

        switch (dayName.toLowerCase()) {
            case "sunday":               // --> Sunday olma durumunda console a 1 yazdir ve break (isi bitir)
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;                   // Java burada break i gorunce gerisini okumuyor direk console a yaziyor.
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli gun ismi giriniz");

        }

        /*
        NOTE
         Bu soruyu if else ile cozdugumuzde cok fazla kod kalabaligi oluyor. Java 3ten fazla senaryolara sahip bu kod yapılarini,
         cok fazla condition kontrol edilmesi gereken durumlar icin SWİTCH olusturmus.

         Eger break yazmazsak Java true cikan koddan sonra hepsini console a yazdirir

         if else yapisinda hata yapilmasi durumunda en sona "else" kilidi koyup kullaniciya mesaj veriyorduk.
         switch kilidi de "default:" olacak

         Burada equalIgnoreCase i burada calistiramayiz. Cunku bu methodun kullanilma mantigi iki String i kiyaslamak.
         Ama elimde iki String yapi yok. Burada switch sepetinde en yukarida toLowerCase, toUpperCase yapabiliriz


         */

    }
}



