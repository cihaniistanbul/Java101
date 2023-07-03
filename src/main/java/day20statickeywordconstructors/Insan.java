package day20statickeywordconstructors;

public class Insan {
    int age;
    String name;
    int heigth;
    boolean isHonest;
    String job;
    String gender;

    public Insan() { //1.constructor
        System.out.println("Parametresiz");
    }

    public Insan(String name) {//2.const
        this();
        System.out.println("Name parametreli");
    }

    public Insan(String job, String gender) { //3.const
        System.out.println("Job ve Gender parametreli");
        this.job = job;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Insan i1 = new Insan("Ali");//Object --> Burada kullanilan construcor 2.constructor, String parametreli olan
                                          // 2.const gittik. this(); i gordu. Devami asagida

         /*
        this(); --> anlamı bu class daki constructor'i cagir demek(Parantez ici bos oldugundan parametresiz const. cagir).
                    Java parametresiz constructor'a gidiyor. Ekrana "Parametresiz" yazdiriyor
                    this(); ile isi bitti. Java bir sonraki satira geliyor.Ekrana "Name parametreli" yazdirir
     */
    }





}

        /*
           Note:
            1) Constructor icinden baska bir const. cagirmak icin "this();" kullanirsaniz mutlaka ilk satira yazmalisiniz
               Aksi taktirde CTE alirsiniz.

            2) Bir constructor icinden sadece 1 tane cagrisi yapabilirsiniz. Cunku 2 tane cagri yaparsaniz birisi ilk
               satirda olamayacaktir, bu da ilk kuralla celisir.
               Constructor cagrisi -->this();

               this.age=12; --> Bunu cagirabiliriz. Bu const cagrisi degil

        */