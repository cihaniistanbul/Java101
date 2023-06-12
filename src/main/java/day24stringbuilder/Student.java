package day24stringbuilder;

public class Student {

    /*
    Acces Modifier
    1) public
    2) protected
    3) default (Access modifier i default yapmak icin access modifier i yazmayiz)
    4) private

    Note: Access Modifierlari genisten dara dogru siralayiniz
          public > protected > default > private


    Note: public --> olanlar her class dan kullanilabilir
          protected --> olanlar baska package lardan kullanilmaz ama baska package da child class icinden kullanilabilir
          defalt --> olanlar baska package den kullanilamazlar
          private --> olanlar sadece olusturulduklari class icinde kullabilirler


    Note: "protected" ile "default" un farkini soyleyiniz?
           protected olanlar baska package tan kullanilamaz ancak baska package de child class icinden kullanilabilirler
           default olanlar baska package den kullanilamazlar

     */

    //public her class dan kullanilabilir
    public String stdName = "Ali Can";

    //protected olanlar baska package dan sadece child classlardan gorulur
    protected String address = "Istanbul";


    //default olanlar baska package dan kullanilamazlar
    String email = "alican@gmail.com";


    //private olanlar sadece olusturulduklari class icinde kullanilabilirler
    private String SsnId = "123456789";


    /*
    Class'lar için  sadece "public" ve "default" access modifier kullanilir.
    Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.
     */




}
