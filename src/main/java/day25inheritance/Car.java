package day25inheritance;

public class Car extends Vehicle{

    public Car(){
        System.out.println("Car 1");
    }

    public Car(String make){
        System.out.println("Car 2"); //Hondanin icinden super(parametre); buraya geldi bunu yazdirdi. ilkini degil
                                     //  cunku parametreli olani yazdik. Buradan da vehicle a gitmemiz lazim.
                                     // car classinda super() methodunu parametreli kullaniyoruz
    }


    public String model ="Accord"; //variable

    public int km =20000;
}
