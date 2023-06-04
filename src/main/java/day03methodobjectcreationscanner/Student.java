package day03methodobjectcreationscanner;

public class Student {

    //Digital bir ogrenci olusturmak istiyorum ve bunun kalibini actim
    //Aktif ve pasif ozellikler ekleyelim ogrenciye

    //Variable (-->pasif ozellikler )
    public String name ="Ali Can";
    public byte grade = 8;
    public String adress ="Ankara";


    //method (-->aktif ozellikler )
    public void study(){

        System.out.println("Gunluk tekrarlarini asla ihmal etmez");
    }

    public void feed(){
        System.out.println("Saglikli beslenir");
    }

}
