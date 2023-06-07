package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {

        //Ornek 1: Sayi uc basamakli ise ekrana "Sayi uc basamaklidir!" yazdirin
        //99<number<1000 eskiden boyle yapardik.

        int number = -123;
        number = Math.abs(number); //burada kodu biraz daha gelistirmek icin - 123 yazinca da calismasi icin Math.abs class ina aldik

        if(number > 99 && number < 1000) {
            System.out.println("Sayi uc basamaklidir!"); //num 12 olsaydi false olurdu ve console da bir sey yazmadi
                                                         //cunku condition yerine getirilmiyor
        }





        //Ornek 2: Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz
        //abbccdc --> a,d (burada tekrarsiz olanlar a,d)
        //char(at) ile once karakterlere bakicam tek tek. eger indexOf ile lastIndexOf() birbirine esit ise karakter tekrarsiz demektir.

        String str = "aac";

                        //"a"
        char ch1 = str.charAt(0);    //tek tek karakterleri alacagim icin charAt ile yapiyorum

        if(str.indexOf(ch1) == str.lastIndexOf(ch1)){        //a'nin ilk gorunumunun indexi = son gorunumunun indexine esitse console a yazdir

            System.out.println(ch1); //False.console da a yazmaz
        }


        char ch2=str.charAt(1);  //2.karakteri kontrol edicem
        if(str.indexOf(ch2) == str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }


        char ch3= str.charAt(3);
        if(str.indexOf(ch3) == str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }



        //console da sadece c goruyoruz. Zaten bunu istiyoduk. Tekrarsizlari ekrana yazdirdik




    }
}
