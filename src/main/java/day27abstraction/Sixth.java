package day27abstraction;

public class Sixth extends Courses {

    @Override
    public void math() {
        System.out.println("6.sinif mufredati");
    }
}

//Eger burada override ettigim methodu silersem hata veriyor.
//Cunku 6.siniflarin math dersini almama gibi bir sanslari yok
//Abstract bir method old icin child classin uygulamama gibi sansi yok
//uzerine tiklayinca "implement" yap secenegini seciyoruz, otomatik olarak getiriyor