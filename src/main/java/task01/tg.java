package task01;

import task.PojoUrun;

import java.util.HashMap;
import java.util.Scanner;
/*


public class tg {
    static Scanner input = new Scanner(System.in);
    public static HashMap<String, PojoUrun> listeMap = new HashMap<String,PojoUrun>();



    public Method(String urunIsmi, String uretici, int miktar, String birim, String raf) {

    }

    public static void girisPaneli(){

        String secimOpr="";


        do {

            System.out.println("Yapmak istediginiz islemi seciniz \n" +
                    "Urun tanimlama icin 1'i \n" +
                    "Urun listeleme icin 2'yi \n" +
                    "Urun Girisi icin 3'u \n" +
                    "Urunu rafa koymak icin 4'u \n" +
                    "Urun cikisi icin 5'i \n" +
                    "Sistemden cikis icin 6'yi "
            );
            secimOpr=input.next();
            switch (secimOpr){
                case "1":
                    urunTanimlama();
                    break;
                case "2":
                    urunListele();
                    break;
                case "3":
                    urunGirisi();
                    break;
                case "4":
                    rafaKoy();
                    break;
                case "5":
                    urunCikisi();
                    break;
                case "6":
                    System.out.println("sistemden cıkıs");
                    break;
                //default:
            }
        }while (!secimOpr.equals("6"));



    }
    private static void urunTanimlama(){
        PojoUrun urunYeni= new PojoUrun();

        System.out.println("Lutfen id giriniz");
        String id=input.next();
        urunYeni.setId(id);

        System.out.println("Lutfen urun ismi giriniz");
        String urunIsmi=input.next();
        urunYeni.setUrunIsmi(urunIsmi);

        System.out.println("Lutfen uretici ismi giriniz");
        String ureticiIsmi=input.next();
        urunYeni.setUretici(ureticiIsmi);

        System.out.println("Lutfen urunun birimini giriniz");
        String urununBirimi=input.next();
        urunYeni.setBirim(urununBirimi);

        listeMap.put(id, urunYeni);

        System.out.println(listeMap);}

    private static void urunCikisi() {
        PojoUrun urunYeni= new PojoUrun();

        System.out.println("lütfen cikisini yapmak istediginiz ürünün id sini giriniz");
        urunYeni.setId(input.next());
        System.out.println("elinizde "+urunYeni.getMiktar()+" var ne kadar cıkacaksınız");
        int cikilacakMiktar= input.nextInt();
        if (cikilacakMiktar< urunYeni.getMiktar()){
            urunYeni.setMiktar(urunYeni.getMiktar()-cikilacakMiktar);
            listeMap.put(urunYeni.getId(), urunYeni);
            //System.out.println(listeMap);
        }else {
            System.out.println("çıkmak istediginiz miktar elinizde bulunan miktardan fazladır.");
        }

    }

    private static void rafaKoy() {
        PojoUrun urunYeni= new PojoUrun();
        System.out.println("rafa koymak istediginiz ürünün id sini giriniz");
        urunYeni.setId(input.next());
        System.out.println("koymak istediginiz rafın adını giriniz");
        String raf= input.next();
        if (raf.equalsIgnoreCase("raf1")||raf.equalsIgnoreCase("raf2")||raf.equalsIgnoreCase("raf3")){
            urunYeni.setRaf(raf);
            listeMap.put(urunYeni.getId(), urunYeni);
            System .out.println(listeMap);
        }else {
            System.out.println("girmek istediginiz raf bulunamamıştır");
        }
    }

    private static void urunGirisi() {
        PojoUrun urunYeni= new PojoUrun();

        System.out.println("lütfen girişini yapacağınız ürünün id sini giriniz");
        urunYeni.setId(input.next());
        System.out.println("Ne kadar eklemek istiyorsunuz");
        urunYeni.setMiktar(input.nextInt());
        listeMap.put(urunYeni.getId(), urunYeni);
        System.out.println(listeMap);





    }

    private static void urunListele() {
        PojoUrun urunYeni= new PojoUrun();
        System.out.println("Elinizde bulunan urunler aşagıdaki gibidir");
        System.out.println(listeMap);



    }


}
        */