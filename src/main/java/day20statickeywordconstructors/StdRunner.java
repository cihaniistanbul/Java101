package day20statickeywordconstructors;

public class StdRunner {
    public static void main(String[] args) {

        //stdName static oldugundan ona ulasmak icin object olusturmadim
        //sadece class ismini kullanmak yeterlidir
        System.out.println(Student.stdName); //Tom Hanks

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz
        Student std1 = new Student();
        System.out.println(std1.age); //13

        Student std2= new Student();

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
