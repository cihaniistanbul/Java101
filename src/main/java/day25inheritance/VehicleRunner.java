package day25inheritance;

public class VehicleRunner {
    public static void main(String[] args) {
        Honda civic = new Honda(); //calistirmak icin bir object olusturduk


        /*
         Run yapinca console da gordugumuz sey:  Vehicle 1
                                                 Car 1
                                                 Honda 1

         Hondanın dunyaya gelebilmesi icin once parentlerinin dogmasi lazım :D
         Hondanın parenti "Car"  bununda bir parenti var. Yani bu constructorin calisabilmesi icin once bununda parentina gitmem lazim
         Car'in parenti "Vehicle"
         Dolayisiyla Honda Classindan bir tane object urettigimiz zaman calisan ilk code Vehicle - Car -Honda


         */
    }
}
