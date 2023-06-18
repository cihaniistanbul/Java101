package day28interfacecollections;

public class Accord implements Ac,Engine,Security {
    //accord class'inin 3 tane parent'i var (Ac, Engine, Security)


    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }
}
