package day32exceptions;

public class E02 {
    public static void main(String[] args) {

        //Birbirine donusturulemeyecek data type'larini donusturmekte israr ederseniz Java ClassCastException atar.
        Object obj = 70;

        try {
            String str = (String) obj;
            System.out.println(str);

        } catch (ClassCastException e) {

            System.err.println("Her data type'i her data type'ina ceviremezsin");
            //serr yazarsak otomatik olarak geliyor. kirmizi vurgulu cikiyor.
            // Console'da hata kodunu okumayi kolaylastirmak adina "serr" yazdirma yapisini olusturmus.
        }


        /*
        Object obj = 70; object'ini olusturdum
        "String str = obj;" yapmaya calisirsam hata alirim. Buyuk kabi kucuge sigdirmaya calisiyorum. Sorumluluk
        bana ait diyip   "String str = (String) obj;"  obj'nin basina (String) koyuyorum. Ama non-primitive datalarda
        bu sekilde "explicit narrowing" yapmaya calisirsam "ClassCastException" hatasi alirim


        secili tutup "option+cmd+t" yaparsak eger try-catch otomatik secilir
         */

    }
}
