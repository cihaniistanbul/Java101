package day26polymorhphism;

public class Student {
    //Encapsulation -->Kapsulleme
    /*
       Encapsulation nedir? (Data Hiding)
       --> veri saklamak

       Data nasil saklanir?
       -->Access Modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm. Boylece datayi saklarim

       Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz.
       Nasil okuruz? "getmethod" olusturarak Encapsulate edilmis datanin degerini okuyabiliriz


      1) get methodlar public olur
      2) get methodun return typei okudugu variable in return typei ile ayni olur
      3) get methodun boolean bir variable icin olusturulmus ise get method ismi is ile baslar


     */
    private String stdId = "AC20230614";
    public String stdName = "Ali Can";
    public int age = 23;
    private double notOrt = 3.53;
    private boolean successful = false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    //Encapsulation yapilan variable in data type i eger boolean ise get method ismi is ile baslar
    public boolean isSuccessful() {
        return successful;
    }
}
