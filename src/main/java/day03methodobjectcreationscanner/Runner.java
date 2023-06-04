package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        //Object nasil olusturulur?

        //Constructor java da objeleri olusturmak icin kullanilan ozel bir methodtur
        //new keywordu sifirdan yeni bir obje olusturmak icin kullanilir

        //Class ismi + Object ismi + Assignment Operator + "new" keyword u + Constructor


        Car myCar = new Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket(); // Bunu tekrar sout yapmama gerek yok. Zaten car classinda yazdirmis
        myCar.dur();



        //student kalibindan obje olusturucam

        Student aliCan = new Student();
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);

        aliCan.study();
        aliCan.feed();

        /*
        Homework
        İcinde isim ve yas variable lari ile teach methodu
        bulunan bir teacher object i olusturun ve bu ozellikleri
        kullanin.
        En az 1 aktif ve pasif ozelligi olsun

         */

        Teacher teacher = new Teacher();
        System.out.println("teacher.name = " + teacher.name);
        System.out.println("teacher.age = " + teacher.age);

        teacher.teach();
        teacher.patient();

    }
}
