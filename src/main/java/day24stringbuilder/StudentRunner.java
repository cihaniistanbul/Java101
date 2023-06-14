package day24stringbuilder;

public class StudentRunner {
    public static void main(String[] args) {

        /*
        Static olmayan class memberlara object olusturmamiz lazim. Student Class indakiler static degil. "Student." yazinca hicbir sey goremiyorum cunku o Classta
        static method yok.
        Object olusturup "Student." yazdıktan sonra "address, email, stdName" e ulastik. (Ayni package farkli class)
         */

        Student aliCan = new Student();

        System.out.println(aliCan.address); //Istanbul --> Adresi gorebildik cunku protected-ayni package icinde
        System.out.println(aliCan.email); //alican@gmail.com -->Access M. i "Default" ayni package dan gorulebilir
        System.out.println(aliCan.stdName);//Ali Can -->public

        //private i object olustursak bile goremiyoruz

        /*
        23.package a gittik diyelim. Object olusturduk --> Student veli = new Student();
        "veli." yazinca stdName i gorduk cunku public
        default u goremedik cunku baska package icinde
        protected i goremedik cunku baska package da ama child degil


        Note: Classlar protected ve private olamaz
         */


    }
}
