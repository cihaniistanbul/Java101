package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {


            /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;----> {OUTER IF}
                60 yasindan buyukse "Emekli Olabilir "yazdirin --->{INNER IF}

               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */


        //Burada 2 tane variable olusturmam lazim.Kullaniciya 2 mesaj vericem yani
        //  1)kadın mı, degil mi?
        //  2)60 mi 65 mi?

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz..");
        String gender = input.next();

        System.out.println("Yasinizi giriniz..");
        int age = input.nextInt();  //buraya kadar kullanicinin hem cinsiyetini hem yasini
                                    //programa dahil ettim


        if(age<0 || age >120){ // buraya sinirlamalari yaziyoruz

            System.out.println("Lutfen yasi 0 ile 120 arasinda giriniz"); //kullaniciyi bilgilendirdim

            //burada iki if i else ile bagladim. yoksa ayri ayri calisir.Sonuc true oldugu zaman asagi gitmemeli
        }else if(gender.equalsIgnoreCase("Kadin")){          //-------Burada kadinsa bir sey yapmamiz lazim, erkekse bir sey.


            if(age>60){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Calismali...");
            }

        } else if (gender.equalsIgnoreCase("Erkek")) {

            if(age>65){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Kesinlikle calismali..");
            }

        }else{
            System.out.println("Tanimli degil...");
        }



        


    }
}