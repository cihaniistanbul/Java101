package day20statickeywordconstructors;

public class StdRunner {
    public static void main(String[] args) {

        //stdName static oldugundan ona ulasmak icin object olusturmadim
        //sadece class ismini kullanmak yeterlidir. "Student." yazinca ekranda stdName cikiyor.
        //age cikmiyor cunku static degil. non-staticlere ulasmak icin object olusturmamiz gerek
        System.out.println(Student.stdName); //Tom Hanks

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz
        Student std1 = new Student(); // object olusturmak icin gerekli adimlar. Artik non-static uzerinden objectime ulasabilirim
        System.out.println(std1.age); //13  "std1." yazinca non-static olan age'e ulastim

        Student std2= new Student(); //2.objemi olusturdum

        //class name uzerinden staticMethod'a ulastim. Ben static methodum
        Student.staticMethod();

        //non-static old icin object olusturup cagirdim(std2). Ben static olmayan methodum
        std2.nonStaticMethod();


        //object uzerinden de static class memberlara ulasabilirsiniz, tipki gokteki ay gibi
        //object uzerinden static class memberlara ulasmak tavsiye edilmez
        System.out.println(std1.stdName); //Tom Hanks

        std1.staticMethod();//Ben static methodum




    }
}
