package day26polymorhphism;

public class Animal {

    /*
    1) Parent Class daki methodu Child Class icinde ozellestirerek kullanmaya Overriding denir.
    2) Overriding de methodun parantezine, method ismine dokunulmaz (METHOD SIGNATURE) degistirilmez
      methodun body'si degistirilir
    3) private methodlar override edilemezler
    4) Child Classdaki methodun access modifieri Parent Classdaki override edilmis method(Overriden Method) un
      access modifieri
     */
    public void eat(){
        //parenttaki override edilmis eat() methoduna "Overriden Method" denir
        System.out.println("Animal eat ..");
    }


    public void drink(){

        System.out.println("Animal drink ..");
    }

}
