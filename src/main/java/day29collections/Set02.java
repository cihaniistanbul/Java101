package day29collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        //Ornek : Ogrenci email adreslerini natural order'a gore siralanmis olarak depolayiniz

        long t1 = System.nanoTime();


        //1.yol
        TreeSet<String> emails = new TreeSet<>();
        emails.add("z@gmail.com");
        emails.add("b@gmail.com");
        emails.add("k@gmail.com");
        emails.add("v@gmail.com");
        emails.add("h@gmail.com");
        emails.add("e@gmail.com");
        emails.add("a@gmail.com");
        emails.add("m@gmail.com");

        System.out.println(emails);//[a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m@gmail.com, v@gmail.com, z@gmail.com]
                                   //natural order'a gore dizdi, ben karisik vermistim.


        //TreeSet cok yavas onun daha hizlisini kullanmak istersek HashSet kullaniriz(2.yol)


        long t2 = System.nanoTime();



        //2.yol tavsiye edilir
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("z@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("k@gmail.com");
        emailsHs.add("v@gmail.com");
        emailsHs.add("h@gmail.com");
        emailsHs.add("e@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("m@gmail.com");

        //Bu olusturgumuz HashSet'i natural order'a koymak icin TreeSet olusturup icine HashSet'i koyuyoruz.



        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs); //[a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m@gmail.com, v@gmail.com, z@gmail.com]

        long t3 = System.nanoTime();
        System.out.println(t2-t1); //2078487
        System.out.println(t3-t2); //182831



        //interview'larda time sorulabiliyor





    }
}
