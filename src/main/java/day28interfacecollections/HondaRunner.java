package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {

        Civic myCivic = new Civic();
        myCivic.cool(); //Civic cools perfectly
        myCivic.run();  //Ac runs super
        myCivic.eco(); //Uses gas less


        Engine.stop(); //Stops securely


        Accord myAccord = new Accord();
        myAccord.cool(); //Accord cools super
        myAccord.run();  //Engine runs super

        System.out.println("Ac.price = " + Ac.price);//2000
        System.out.println("Engine.price = " + Engine.price); //3000
        System.out.println("Security.price = " + Security.price); //5000


        //biz burada ne yaptik?
        //Ac interface'ine bir method koyduk (cool). Bu method Civic ve Accord objectlerimiz icin bu classlar icin
        //mecburi hale geldi. Onu da kendi ihtiyaclarina gore ozellestirerek object uzerinden bu classta gorduk.


        //Accord ve Civic object'i klimasiz uretilemez. Bu klima fonksiyonunu tum objectlerde mecburi kildik.
        //interface icine bu sekilde fonksiyon koymanin cok faydasi var.

        //Ac interface'inde 1 tane daha method olusturalim (run)
        //Ayni methodu engine ve security'e de koyuyorum.
        //interface'lerimize abstract methodlarimizi(run) koyar koymaz bizim child concrete classlar kirmizi oldu
        //Civic classin uzerinde durunca; parenttaki abstract methodu implement yapmak zorundayim diyor. implemente
        //tiklayinca run methodu geldi. Peki bu hangi parenttan geldi? Hic farketmez.
        //Aynisini accord classta da yapiyoruz. Parentlardan birisinde bir method var. Onu acil implement yapmam gerek
        //diyor.
        //Override da parent classta bulunan methodu, body'sini degistirerek kullaniriz. Gecersiz kiliyorduk. Burada
        //override degil implement diyoruz. Burada parentta gecersiz kilacagimiz bir body'miz yok. Bu yuzden implement
        //keyword'unu kullanmak daha mantiklidir.
    }
}
