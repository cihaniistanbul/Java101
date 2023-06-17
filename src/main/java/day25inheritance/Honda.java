package day25inheritance;

public class Honda extends Car {

    public Honda(){
        System.out.println("Honda 1");
        System.out.println("this.km = " + this.km); // bir class daki variable'lari sadece this keyword u ile seciyoruz () yok
        System.out.println("this.model = " + this.model); //bu class daki modeli yazdir yani Civic
        System.out.println("super.km = " + super.km);//parent'indaki km ye git
    }

    public Honda(String model, int year){
        System.out.println("Honda 2");
    }

    public String model ="Civic"; //variable

    public int km =10000;
}
