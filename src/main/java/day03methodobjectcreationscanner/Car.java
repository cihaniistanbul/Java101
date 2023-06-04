package day03methodobjectcreationscanner;

public class Car {

    //Variable'lari olusturalim:
    public String model = "Tesla";

    public int fiyat = 20000;
    //bunlar pasif ozelliklerimiz

    //Car objesi uretmek istiyorum. Markasını tesla, fiyatini 20000 yaptim.

    //Simdi methodlari olusturalim(aktif ozellikler)
    //Note: "return type" void oldugunda method icinde "return" keyword u olusturulmaz

    public void hareket() { //method
        System.out.println("Tesla cok hizli hareket eder..");

    }

    public void dur() {
        System.out.println("Cok guvenli bir sekilde durur..");
        //bunlar aktif ozelliklerimiz
    }


}
