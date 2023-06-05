package day20statickeywordconstructors;

public class CarRunner {
    public static void main(String[] args) {

        //c1, c2, c3 objectlerini olusturdum hepsi birbirinin aynisi.
        //Siz kendi constructorinizi olusturdugunuzda java default constructori siler
        Car c1 = new Car("BMW", "M4", 2023, false);
        Car c2 = new Car("Audi", "R8", 2022, true);
        Car c3 = new Car("Honda", "Civic", 1999, false);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //console a yazdirmak icin toString methoduna ihtiyacimiz var. Bu sekilde yazdirirsak console da reference gorurur
        // "toString" methodu olmadan objectler console da gorulemezler. Car classinda olusturulur


        Car c4 = new Car("Mercedes","C300");
        System.out.println(c4); //Car{make='Mercedes', model='C300', year=2023, hybrid=true}

    }
}
