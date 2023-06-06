package day20statickeywordconstructors;

public class CarRunner {
    public static void main(String[] args) {

        //c1, c2, c3 objectlerini olusturdum hepsi birbirinin aynisi.(deger atamasi yapmadan onceki halleri)
        //Siz kendi constructorinizi olusturdugunuzda java default constructori siler
        Car c1 = new Car("BMW", "M4", 2023, false);
        Car c2 = new Car("Audi", "R8", 2022, true);
        Car c3 = new Car("Honda", "Civic", 1999, false);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //console a yazdirmak icin toString methoduna ihtiyacimiz var. Bu sekilde yazdirirsak console da reference gorurur
        // "toString" methodu olmadan objectler console a yazdirilamazlar. toString methodu Car classinda olusturulur.
        //Cunku Car classindan urettigim objectleri class'imda gormek istiyorum


        Car c4 = new Car("Mercedes","C300");
        System.out.println(c4); //Car{make='Mercedes', model='C300', year=2023, hybrid=true}


        /*
        Eger ki object olustururken bu   "Car c1=new Car();"  default constructori kullanirsak object'imiz her zaman car class'indaki
        atadigimiz degerler olacak. Cunku objectler classlarin gorunumudur. Class da ne varsa object de o vardir demistik.
        Bu durumda kendi constructorimizi olusturucaz. Car class'ina gidip   "public Car(){   }" olusturarak javanin otomatik olusturdugu
        default constructori gorunur hale getirdim. Daha sonra bunun icine istedigimiz ozellikleri yazdik.
          "public Car (String make, String model, int year, boolean hybrid){ }" seklinde
        Daha sonra markayi, modeli degistirip istedigim gibi bir object uretmek istiyorum. Bunu body icinde constructora soylemeliyim

            this.make= make;  --> bu classdaki make'e assign ediyoruz. yani make="Honda" yi degistiriyoruz
            this.model=model;
            this.year=year;
            this.hybrid=hybrid;

        Bu sekilde yazdiktan sonra artik istedigim gibi olusturabilirim.Constructor'i istedigim gibi olusturabilirim.Ama java hata veriyor.
        Biz class olusturdugumuz zaman java kendisi otomatik olur const. olusturuyordu.Bizde kendi constructorimizi olusturdugumuz zaman
        kendi olusturdugu constructori siliyor. Artik default const. yok.

         */
    }
}
