package day20statickeywordconstructors;

public class Car {

    /*
    Constructor nedir?
    Class'dan object uretmenize yarayan code blocklaridir.

    Class olusturdugumuzdda java bize otomatik olarak bir constructor verir. Ama bu constructor gozle gorulmez ve
    gozle gorulmeyen ama otomatik olarak java tarafindan verilen bu constructorlara default constructor denir

    default constructor -->    "Car(){   }" seklindedir.



    Bir class da farkli parametreler kullanarak istediginiz kadar constructor olusturabilirisiniz.
    Farkli constructorlar sayesinde bir classdan farkli farkli objectler olusturabiliriz.

    1) Constructor nasil olusturulur?
          Access Modifier + Class Ismi + (){}


    2)Method ile constructor arasindaki farklar nelerdir?  INTERVİEW SORUSU
       a) Methodlarda return type olur,
          Constructor larda return type olmaz

       b) Methodlar yaptiklari ise gore isimlendirilirler,
          Constructorlar her zaman CLASS ismi ile isimlendirilirler

       c) Methodlar bir aksiyon yapmak icin olusturulurlar
          Constructorlar ise object olusturmak icindir

       d) Method isimleri kucuk harf ile baslar
          Constructorlarin isimleri class ismi ile ayni oldugu icin her zaman buyuk harf ile baslar


     3) Parametreli constructorlar olusturarak ayni classdan farkli ozelliklere sahip objectler olusturabiliriz


     */





    String make = "Honda";

    String model = "Accord";


    int year =2023;

    boolean hybrid=true;


    public Car (String make, String model, int year, boolean hybrid){  //constructor i gorunur hale getirdim. bundan 3 tane object urettim
       this.make= make;
       this.model=model;
       this.year=year;
       this.hybrid=hybrid;

    }

    public Car(String make, String model){
        this.make=make;
        this.model=model;


    }

    public Car(String make, int year) { //hazir bir sekilde constructor urettik --> generate-constructor-cmd ile sec
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() { //sağ tik-generate-toString-ok
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}

/*
Note: Constructor i gorunur hale getirdim. this. ile yazdigimiz her seyi dinamik yapabiliriz.
      Ama kendi constructorimizi olusturdugumuz zaman java default constructor i siliyor
 */