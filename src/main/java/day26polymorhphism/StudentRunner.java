package day26polymorhphism;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.getStdId()); //AC20230614

        System.out.println(s1.getNotOrt()); //3.53

        System.out.println(s1.isSuccessful()); //false


        System.out.println("----------------------------");


        /*


        s1.setNotOrt(4.99);//get method olusturmasaydik goremezdik burada
                           //set methodu ile icine yeni degeri yazip degistirdim

        System.out.println(s1.getNotOrt()); //4.99
                                            //burada get methodu ile degisip degismedigine bakicam
                                            //3.13 olan ortalamayi 4.99 ile guncelledik
                                            //burada kalibi degil s1 object uzerinde guncelleme yapiyorum. Class sabit. Set method ile object uzerinde degisiklik yapiyoruz

  */


        s1.setStdId("MU1234567");
        s1.setNotOrt(4.99);
        s1.setSuccessful(true);
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccessful());


        System.out.println("---------------------------------");


        s1.setStdId("VH1234567");
        s1.setNotOrt(1.25);
        s1.setSuccessful(false);
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccessful());

        System.out.println("------------------------------------");



        /*
          s1 object'i ile "Alicanın, Mehmetcanın ve Velihanın" degerlerini gordum. Ayri ayri object olusturmadan tek bir
          object uzerinden (s1) hepsine ulasabildim. Okul applicationlarida benzer sekilde calisir. Hepsine ayri ayri
          obejct olustursaydik hafizada cok fazla yer kaplayacakti. 1 object uzerinden degerleri guncelleyerek gittik.
          Encapsulation'ın faydalarindan birisi bu.
         */
    }
}
