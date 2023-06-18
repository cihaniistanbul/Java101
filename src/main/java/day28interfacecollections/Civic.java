package day28interfacecollections;

public class Civic implements Ac, Engine, Security{
    //burada eger extends Ac yaparsam hata verir interface'lerde artik implements kullaniyorum
    //notlar "Ac" interface'inde.
    //"public class Civic implements Ac" diyerek Ac interface'ini "Civic"in parent'i yaptik.
    //Ama "Civic" class'imizin baska parent'lari da olacak mesela Engine, Security gibi. Araya virgul koyup yazariz

    //Normal classlar icin birden fazla parent yazamiyorduk. Ama burada parent'larimiz interface old icin implement
    //keyword'unun yanina baska parentlar da yazabiliyoruz


    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Ac runs super");
    }

    //Class'in uzerinde durdugumuz zaman implement yapip otomatik olarak override ediyor.
    //Abstract methodlar zorunlu ders gibiydi. Ayni nedenlerle interface'in icindeki her seyde mecburi ders gibi.
    //Interface'in icinde yazilan her sey child classlar icin mecburidir! Cunku bu bir abstract method. Bu yuzden
    //interfacelere "to-do list" derler.



}
