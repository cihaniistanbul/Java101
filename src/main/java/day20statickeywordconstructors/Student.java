package day20statickeywordconstructors;

public class Student {

    /*
    1) Static variable veya static methodlar (class member) tum object'ler icin ortak elemandir.
    2) Static class member lar uzerinde yapilan tum degisiklikler tum objectleri etkiler.
    3) Static class memberlar class'a, non-static class memberlar objectlere monte edilir.
       Mesela; bir class'dan 100 tane object olusturdugunuzda, non-static olanlar 100 kere olusturulur,
       ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur.
    4) Static class memberlara ulasmak icin object olusturmaya gerek duyulmaz.
       Ama non-static class member lara ulasmak icin object olusturmak sarttir.
    5) Static variable'larin diger adi "Class Variable" dir.
       Non-static variable'larin diger adi "Instance Variable" veya "Object Variable" dir.
     */

    public static String stdName = "Tom Hanks"; //memory de bir alan ayirdim ve buna her yerden ulasilabilen static bir variable'a donusturdum

    // String stdName="Tom Hanks";         --> non-static variable olusturdum. Bunu static yapmak istersem basina static koyuyorum
    // static String stdName="Tom Hanks";  -->static variable. Basina static yazarak class variable'a donusturdum

    public int age = 13; //non-static


    public static void staticMethod() {
        System.out.println("Ben static methodum");
    }

    public void nonStaticMethod() {
        System.out.println("Ben static olmayan methodum");
    }


}
