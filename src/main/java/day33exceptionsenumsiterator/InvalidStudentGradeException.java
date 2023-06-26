package day33exceptionsenumsiterator;

public class InvalidStudentGradeException extends Exception {


    /*
    1) Custom Exception Class olusturmak icin Exception class a extends etmeliyiz
        Exception Class a extend ederek olusturdugumuz Custom Exception "Compile Time Exception" olur
        Eger Run Time Exception uretmek istersek RunTimeException class a extend etmeliyiz
    2) Custom Exception Class olustururken constructor olusturmaliyiz
        Bu constructor parent taki constructor u cagirmalidir ve mesaj verecek veya vermeyecek sekilde olusturulabilir
    3) Custom Exception Class olusturdugumuzda ismin sonuna Exception kelimesini kullanmalisiniz, (naming convention)

     */
    public InvalidStudentGradeException(String message) { //constructor olusturdum () icine parametre girdim. Const object uretmek icindi
        super(message); //super keyword ile parent'a gonderdim.


        /*
          Class'i kendimiz olusturdugumuz icin ismi "Custom Exception Class" olur.
          Excepsion ile extends yaparsak "Compile Time Exception" olur.
          Run Time Exception uretmek istersek RunTimeException class a extend etmeliyiz
         */
    }
}