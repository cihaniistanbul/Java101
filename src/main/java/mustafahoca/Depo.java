package mustafahoca;

import java.util.HashMap;
import java.util.Scanner;

public class Depo {


        static Scanner input=new Scanner(System.in);


        static HashMap<Integer, Urun> urunlerMap=new HashMap<>();           //map olusturdukk
        //value kısmına objemizi kullanmak icin Urunlerimiz clasini koyduk

        //normalde teker teker put ile eklerdik fakat main yok bu yuzden cons kullanacagiz
        //sag klik
        public Depo() {
            urunlerMap=new HashMap<>();
        }


        //methodlara gecelimmm

        // -------------------------------------urun tanımlama methodu.........................
        public static void girisPaneli() {

            String secimOpr = "";
            do {
                System.out.println("LUTFEN YAPMAK İSTEDİGİNİZ İSLEMİ SECİNİZ \n" +
                        "1 : URUN TANIMLAMA \n" +
                        "2 : URUN LİSTELEME \n" +
                        "3 : URUN GİRİSİ \n" +
                        "4 : RAFA KOYMA \n" +
                        "5 : URUN CIKISI \n" +
                        "Q : SİSTEMDEN CIKIS "
                );
                secimOpr = input.next();
                switch (secimOpr) {
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
                    case "Q":
                    case "q":
                        System.out.println("tekrar görüşmek üzere");
                }
            } while (!secimOpr.equals("Q"));
        }

        private static void urunCikisi() {
            System.out.println("lütfen cıkış yapmak istenilen ürünün id'sini giriniz");
            int id= input.nextInt();
            System.out.println("lütfen cıkış yapilmak istenen miktari giriniz");
            int cikismiktari= input.nextInt();
            if(urunlerMap.containsKey(id)){
                Urun urun=urunlerMap.get(id);
                int yenimiktarimiz=urun.getMiktar()-cikismiktari;
                if(cikismiktari<= urun.getMiktar()){
                    urun.setMiktar(yenimiktarimiz);
                    System.out.println(id+" nolu üründen " +cikismiktari +" miktari kadar cikis yapildi...");
                }else {
                    System.out.println("cikis yapilan miktar mevcut miktardan az olmalidir...");
                }

            }else {
                System.out.println("girilen id ile eslesen bir urun bulunamadi");
            }
            urunListele();
        }

        private static void rafaKoy() {
            System.out.println("lütfen id giriniz");
            int id= input.nextInt();
            System.out.println("ürünü koymak istediginiz raf numarasini yaziniz");
            int raf= input.nextInt();

            if(urunlerMap.containsKey(id)){
                Urun urun=urunlerMap.get(id);
                urun.setRaf(raf);
                System.out.println("ürününüz "+raf+" numarali rafa koyulmustur...");

            }urunListele();
        }

        private static void urunGirisi() {
            System.out.println("lütfen id giriniz");
            int id= input.nextInt();
            System.out.println("lütfen girmek istediginiz ürün miktarini giriniz...");
            int girisMiktari= input.nextInt();
            if(urunlerMap.containsKey(id)){
                Urun urun=urunlerMap.get(id);
                urun.setMiktar(urun.getMiktar()+girisMiktari);
                System.out.println("urun girisi basarili...");

                int guncelMiktar=0;
                boolean result= true;
                    

            }else {
                System.out.println("girilen id'ye ait ürün bilgisi bulunamadi...");
            }
            urunListele();              //herseferinde urunu listelesin
        }


        public static void urunTanimlama() {
            System.out.println("lütfen id giriniz");
            int id1= input.nextInt();

            System.out.println("lütfen ürün ismi giriniz");
            String isim1= input.next();

            System.out.println("lütfen üretici ismi giriniz");
            String uretici1=input.next();

            System.out.println("lütfen birim giriniz");
            String birim1= input.next();

            if (!urunlerMap.containsKey(id1)) {
                Urun urun = new Urun(id1,isim1,uretici1,0,birim1,0);
                urunlerMap.put(id1, urun);              //key kismina  id leri atadik
            } else {
                System.out.println("Bu ID'ye sahip bir ürün zaten tanımlı.");
            }urunListele();
        }


        public static void urunListele() {
            System.out.println("------------------depomuzda bulunan ürünlerimizin listesi---------------------");
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "id", "isim", "uretici","birim","miktar","raf");
            System.out.println("----------------------------------------------------------------------------------");
            for (Urun w : urunlerMap.values()) {      //value kısmını dolasacak
                //System.out.println(urunlerMap);    //{1=id:1    isim:a     uretici:a   miktar:0      birim:a     raf:-}


                System.out.println(w);

            }
        }


}
