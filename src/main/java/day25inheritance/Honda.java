package day25inheritance;

public class Honda extends Car {

    public Honda(){
        System.out.println("Honda 1");
        System.out.println("this.km = " + this.km); // bir class daki variable'lari sadece this keyword u ile seciyoruz () yok
        System.out.println("this.model = " + this.model);
        System.out.println("super.model = " + super.model);
    }

    public Honda(String model, int year){
        System.out.println("Honda 2");
    }

    public String model ="Civic"; //variable

    public int km =10000;
}
